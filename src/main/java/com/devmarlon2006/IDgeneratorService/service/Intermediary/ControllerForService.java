package com.devmarlon2006.IDgeneratorService.service.Intermediary;

import com.devmarlon2006.IDgeneratorService.service.BuildArea.Build;
import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.Bytes;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.SSUID;
import org.springframework.stereotype.Service;

@Service
public class ControllerForService<S> {

    public String Generation(S object , GenerationPath path){
        return generateID(object, path);
    }

    public String generateID(S object, GenerationPath path){

        if (object == null){
            return null;
        }

        if(!(object instanceof Bytes ID_BYTES)){
            return null;
        }

        SSUID<String> id = new SSUID<>(Build.idNameBuild(
                ID_BYTES.getBYTE_1(),
                ID_BYTES.getBYTE_2(),
                ID_BYTES.getBYTE_3(),
                ID_BYTES.getBYTE_4(), path));
        return id.getId();

    }
}

