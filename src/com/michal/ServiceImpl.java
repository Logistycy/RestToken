package com.michal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service("exampleService")
public class ServiceImpl implements IService {
	Map<UUID, Date> mapaUzytkownikow = new HashMap<UUID, Date>();
	

	@Override
	public Uzytkownik getLogin(String l, String h) {
		Uzytkownik uzyt = new Uzytkownik();
		uzyt.setLogin(l);
		uzyt.setHaslo(h);

		Date date = new Date();

		mapaUzytkownikow.put(uzyt.getZeton(), date);

		return uzyt;

	}

	public Boolean sprawdzZeton(UUID zeton) {
		Date dataTeraz = new Date();

		int minuty = dataTeraz.getMinutes();
		int	sekundy = dataTeraz.getSeconds();
		
		Date minuty2 = mapaUzytkownikow.get(zeton);

		if (minuty < minuty2.getMinutes() + 1 || sekundy <= minuty2.getSeconds())
			return true;
		else
			return false;
	}

	@Override
	public String wypiszCos(UUID zeton) {
		if (sprawdzZeton(zeton) == true)
			return "zalogowano";
		else
			return "uplynal czas waznosci tokena zaloguj sie ponownie";
	}

}