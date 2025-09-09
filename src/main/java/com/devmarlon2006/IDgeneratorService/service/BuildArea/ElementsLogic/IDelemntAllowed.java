package com.devmarlon2006.IDgeneratorService.service.BuildArea.ElementsLogic;

public class IDelemntAllowed {

    public static Character AllowedCharacter(String IDElement1) {

        if(IDElement1 == null)
            return null;

        String allowedCharacters;

        char idchar1 = IDElement1.toUpperCase().charAt( 0 );

        idchar1 = switch (idchar1) {
            case 'A' -> {
                allowedCharacters = "8574359rufda";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'B' -> {
                allowedCharacters = "8759521laker";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'C' -> {
                allowedCharacters = "75200523trwtrw";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'D' -> {
                allowedCharacters = "nfshj721242";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'E' -> {
                allowedCharacters = "word3241fds";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'F' -> {
                allowedCharacters = "32426bbfsd224";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'G' -> {
                allowedCharacters = "mfsy727842kv";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'H' -> {
                allowedCharacters = "08328hjnksdçpuq";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'I' -> {
                allowedCharacters = "nbgfggywtwqwzxcv5890923";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'J' -> {
                allowedCharacters = "ad3554019ofs";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'K' -> {
                allowedCharacters = "nfhjsui24327561";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'L' -> {
                allowedCharacters = "8574359rufdfsd";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'M' -> {
                allowedCharacters = "005432919jkfsa";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'N' -> {
                allowedCharacters = "bvvnbxczbmbn8671244322006";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'O' -> {
                allowedCharacters = "88783jfdvburwkiy";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'P' -> {
                allowedCharacters = "mlkavggf36428600653";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'Q' -> {
                allowedCharacters = "mnjf762avfrsvmybvd";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'R' -> {
                allowedCharacters = "hkj543sdg";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'S' -> {
                allowedCharacters = "74280efsd";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'T' -> {
                allowedCharacters = "knfsk2432";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'U' -> {
                allowedCharacters = "inbv82145";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'V' -> {
                allowedCharacters = "813879qfv";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'W' -> {
                allowedCharacters = "85743584429rufda";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'X' -> {
                allowedCharacters = "nna224145fdsf";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'Y' -> {
                allowedCharacters = "091345hkqr";
                yield randomElements.elementRandom( allowedCharacters );
            }
            case 'Z' -> {
                allowedCharacters = "23432807adhvf642";
                yield randomElements.elementRandom( allowedCharacters );
            }
            default -> '0';
        };

        return idchar1 ;
    }

}