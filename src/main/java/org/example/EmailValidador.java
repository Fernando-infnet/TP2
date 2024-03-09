package org.example;

public class EmailValidador {
    private static String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static boolean validar(String email) {
       // if(endereco == null || endereco.isEmpty()){
         //   return false;
       // }

        if(!email.contains("@")||!email.contains(".")){
            return false;
        }

        int arrobaIndex = email.indexOf("@");
        int pontoIndex = email.indexOf(".");

        if (arrobaIndex == -1 || arrobaIndex == 0 || arrobaIndex == email.length() - 1) {
            return false;
        }

        if (pontoIndex == -1 || pontoIndex == 0 || pontoIndex == email.length() - 1 || pontoIndex - arrobaIndex == 1) {
            return false;
        }

        return true;
    }
}