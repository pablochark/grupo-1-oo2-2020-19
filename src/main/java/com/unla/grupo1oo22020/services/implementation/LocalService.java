package com.unla.grupo1oo22020.services.implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo1oo22020.converters.LocalConverter;
import com.unla.grupo1oo22020.entities.Local;
import com.unla.grupo1oo22020.models.LocalModel;
import com.unla.grupo1oo22020.repositories.ILocalRepository;
import com.unla.grupo1oo22020.services.ILocalService;


@Service("localService")
public class LocalService implements ILocalService {

	@Autowired
	@Qualifier("localRepository")
	private ILocalRepository localRepository;
	
	@Autowired
	@Qualifier("localConverter")
	private LocalConverter localConverter;
	
	@Override
	public List<Local> getAll() {
		return localRepository.findAll();
	}

	@Override
	public LocalModel insertOrUpdate(LocalModel localModel) {
		Local local = localRepository.save(localConverter.modelToEntity(localModel));
		return localConverter.entityToModel(local);
	}

	@Override
	public boolean remove(long idLocal) {
		try {
			localRepository.deleteById(idLocal);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public LocalModel findById(long idLocal) {
		return localConverter.entityToModel(localRepository.findByIdLocal(idLocal));
	}

}