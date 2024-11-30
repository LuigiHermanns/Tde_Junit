package controller;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);
        
        // Cálculo criança
        if( idade < 20){
            if(sexo == "masculino"){
                if(idade == 2){
                    if(imc < 15.0){
                        return "Baixo peso";
                    } else if(imc >= 15.0 && imc < 18.0){
                        return "Peso normal";
                    } else if(imc >= 18.0 && imc < 20.2){
                        return "Sobrepeso";
                    } else if(imc >= 20.20){
                        return "Obesidade";
                    }
                } else if(idade == 4){
                    if(imc < 14.4){
                        return "Baixo peso";
                    } else if(imc >= 14.4 && imc < 17.0){
                        return "Peso normal";
                    } else if(imc >= 17.0 && imc < 17.8){
                        return "Sobrepeso";
                    } else if(imc >= 17.8){
                        return "Obesidade";
                    }
                } else if(idade == 6){
                    if(imc < 14.0){
                        return "Baixo peso";
                    } else if(imc >= 14.0 && imc < 17.0){
                        return "Peso normal";
                    } else if(imc >= 17.0 && imc < 18.4){
                        return "Sobrepeso";
                    } else if(imc >= 18.4){
                        return "Obesidade";
                    }
                } else if(idade == 8){
                    if(imc < 14.2){
                        return "Baixo peso";
                    } else if(imc >= 14.2 && imc < 17.8){
                        return "Peso normal";
                    } else if(imc >= 17.8 && imc < 20.0){
                        return "Sobrepeso";
                    } else if(imc >= 20.0){
                        return "Obesidade";
                    }
                } else if(idade == 10){
                    if(imc < 14.4){
                        return "Baixo peso";
                    } else if(imc >= 14.4 && imc < 19.2){
                        return "Peso normal";
                    } else if(imc >= 19.2 && imc < 22.0){
                        return "Sobrepeso";
                    } else if(imc >= 22.0){
                        return "Obesidade";
                    }
                } else if(idade == 12){
                    if(imc < 15.4){
                        return "Baixo peso";
                    } else if(imc >= 15.4 && imc < 21.0){
                        return "Peso normal";
                    } else if(imc >= 21.0 && imc < 24.0){
                        return "Sobrepeso";
                    } else if(imc >= 24.0){
                        return "Obesidade";
                    }
                } else{
                    return "Idade inválida";
                }
        
            } else if(sexo == "feminino"){
                if(idade == 2){
                    if(imc < 14.8){
                        return "Baixo peso";
                    } else if(imc >= 14.8 && imc < 18.0){
                        return "Peso normal";
                    } else if(imc >= 18.0 && imc < 19.0){
                        return "Sobrepeso";
                    } else if(imc >= 19.0){
                        return "Obesidade";
                    }
                } else if(idade == 4){
                    if(imc < 14.0){
                        return "Baixo peso";
                    } else if(imc >= 14.0 && imc < 16.8){
                        return "Peso normal";
                    } else if(imc >= 16.8 && imc < 18.0){
                        return "Sobrepeso";
                    } else if(imc >= 18.0){
                        return "Obesidade";
                    }
                } else if(idade == 6){
                    if(imc < 13.8){
                        return "Baixo peso";
                    } else if(imc >= 13.8 && imc < 17.0){
                        return "Peso normal";
                    } else if(imc >= 17.0 && imc < 18.8){
                        return "Sobrepeso";
                    } else if(imc >= 18.8){
                        return "Obesidade";
                    }
                } else if(idade == 8){
                    if(imc < 14.0){
                        return "Baixo peso";
                    } else if(imc >= 14.0 && imc < 18.2){
                        return "Peso normal";
                    } else if(imc >= 18.2 && imc < 20.6){
                        return "Sobrepeso";
                    } else if(imc >= 20.6){
                        return "Obesidade";
                    }
                } else if(idade == 10){
                    if(imc < 14.4){
                        return "Baixo peso";
                    } else if(imc >= 14.4 && imc < 20.0){
                        return "Peso normal";
                    } else if(imc >= 20.0 && imc < 23.0){
                        return "Sobrepeso";
                    } else if(imc >= 23.0){
                        return "Obesidade";
                    }
                } else if(idade == 12){
                    if(imc < 15.4){
                        return "Baixo peso";
                    } else if(imc >= 15.4 && imc < 21.8){
                        return "Peso normal";
                    } else if(imc >= 21.8 && imc < 25.0){
                        return "Sobrepeso";
                    } else if(imc >= 25.0){
                        return "Obesidade";
                    }
                } else{
                    return "Idade inválida";
                }
            } else{
                return "Sexo inválido";
            }
        }

        // Cálculo adulto
        else if(idade >= 20 && idade <= 65){

            if(imc < 16){ {
                return "Baixo peso muito grave";
            }
            } else if(imc >= 16 && imc <= 16.99){
                return "Baixo peso grave";
            } else if(imc >= 17 && imc <= 18.49){
                return "Baixo peso";
            } else if(imc >= 18.5 && imc <= 24.99){
                return "Peso normal";
            } else if(imc >= 25 && imc <= 29.99){
                return "Sobrepeso";
            } else if(imc >= 30 && imc <= 34.99){
                return "Obesidade grau I";
            } else if(imc >= 35 && imc <= 39.99){
                return "Obesidade grau II";
            } else if(imc >= 40){
                return "Obesidade grau III (obesidade mórbida)";
            }

        }

        // Cálculo idoso
        else if(idade > 65){

            if(sexo == "masculino"){

                if(imc < 21.9){
                    return "Baixo peso";
                } else if(imc >= 22 && imc <= 27){
                    return "Peso normal";
                } else if(imc >= 27.1 && imc <= 30){
                    return "Sobrepeso";
                } else if(imc >= 30.1 && imc <= 35){
                    return "Obesidade grau I";
                } else if(imc >= 35.1 && imc <= 39.9){
                    return "Obesidade grau II";
                } else if(imc >= 40){
                    return "Obesidade grau III (obesidade mórbida)";
                }

            } else if(sexo == "feminino"){
                if(imc < 21.9){
                    return "Baixo peso";
                } else if(imc >= 22 && imc <= 27){
                    return "Peso normal";
                } else if(imc >= 27.1 && imc <= 32){
                    return "Sobrepeso";
                } else if(imc >= 32.1 && imc <= 37){
                    return "Obesidade grau I";
                } else if(imc >= 37.1 && imc <= 41.9){
                    return "Obesidade grau II";
                } else if(imc >= 42){
                    return "Obesidade grau III (obesidade mórbida)";
                }
            }

            else{
                return "Sexo inválido";
            }

        }
        else{
            return "Idade inválida";
        }
        return "IMC: " + imc;
    }
}