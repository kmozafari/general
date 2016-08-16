package ir.kmozafari.general.business.security.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * Created by k.mozafari on 8/9/2016.
 */
@Service
public class MapperService {

    private ModelMapper modelMapper = new ModelMapper();

    public <T> T map(Object obj, Class<T> clazz) {
        return modelMapper.map(obj, clazz);
    }
}
