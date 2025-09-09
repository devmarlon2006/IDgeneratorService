package com.devmarlon2006.IDgeneratorService.service.Intermediary;

import com.devmarlon2006.IDgeneratorService.service.BuildArea.Build;
import com.devmarlon2006.IDgeneratorService.service.Config.GenerationPath;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.BarberArea.Barber;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.BarberShopArea.BarbeShop;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.ClientArea.Client;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.HairCutArea.HairCut;
import com.devmarlon2006.IDgeneratorService.service.model.POJO.SSUID;

public class ControllerForService<S> {

    public String generateID(S object, GenerationPath path){

        switch (path){
            case PATH_1 -> {
                HairCut hairCut = (HairCut) object;

                SSUID<String> id = new SSUID<>(Build.idNameBuild(
                        hairCut.getName(),
                        "null",
                        "null",
                        hairCut.getAleatoryNumber(), path));
                return id.getId();
            }
            case PATH_2 -> {
                BarbeShop barbershop = (BarbeShop) object;

                SSUID<String> id = new SSUID<>( Build.idNameBuild(
                        barbershop.getName(),
                        barbershop.getState(),
                        barbershop.getCountry(),
                        10, path
                ));
                return id.getId();
            }
            case PATH_3 -> {
                Client client = (Client) object;
                SSUID<String> id = new SSUID<>( Build.idNameBuild(
                        client.getName(),
                        client.getState(),
                        client.getCountry(),
                        10,path
                ));
                return id.getId();
            }
        }

        return null;
    }

}

