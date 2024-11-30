package tests;

import controller.CalculadoraImc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTests {
    CalculadoraImc calculadoraImc;

    @Before
    public void setup() {
        calculadoraImc = new CalculadoraImc();
    }

    @After
    public void tearDown() {
        calculadoraImc = null;
    }

    // Criança 1
    @Test
    public void testCriancaMasculino2AnosBaixoPeso() {
        String resultado = calculadoraImc.calcularImc(5.1, 0.6, 2, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 2
    @Test
    public void testCriancaMasculino2AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(5.4, 0.6, 2, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 3
    @Test
    public void testeCriancaMasculino2AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(8.9, 0.7, 2, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 4
    @Test
    public void testeCriancaMasculino2AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(10.29, 0.7, 2, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 5
    @Test
    public void testeCriancaMasculino4AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(11.3, 0.9, 4, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 6
    @Test
    public void testeCriancaMasculino4AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(14.4, 1.0, 4, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 7
    @Test
    public void testeCriancaMasculino4AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(17.0, 1.0, 4, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 8
    @Test
    public void testeCriancaMasculino4AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(20, 1.0, 4, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 9
    @Test
    public void testeCriancaMasculino6AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(15.7, 1.1, 6, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 10
    @Test
    public void testeCriancaMasculino6AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(19, 1.1, 6, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 11
    @Test
    public void testeCriancaMasculino6AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(22.1, 1.1, 6, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 12
    @Test
    public void testeCriancaMasculino6AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(24.2, 1.1, 6, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 13
    @Test
    public void testeCriancaMasculino8AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(20.1, 1.2, 8, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 14
    @Test
    public void testeCriancaMasculino8AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(25.6, 1.2, 8, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 15
    @Test
    public void testeCriancaMasculino8AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(28.6, 1.2, 8, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 16
    @Test
    public void testeCriancaMasculino8AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(30.1, 1.2, 8, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 17
    @Test
    public void testeCriancaMasculino10AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(23.6, 1.3, 10, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 18
    @Test
    public void testeCriancaMasculino10AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(27.0, 1.3, 10, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 19
    @Test
    public void testeCriancaMasculino10AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(33.8, 1.3, 10, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 20
    @Test
    public void testeCriancaMasculino10AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(40.5, 1.3, 10, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 21
    @Test
    public void testeCriancaMasculino12AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(29.3, 1.4, 12, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 22
    @Test
    public void testeCriancaMasculino12AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(35.6, 1.4, 12, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 23
    @Test
    public void testeCriancaMasculino12AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(42.0, 1.4, 12, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 24
    @Test
    public void testeCriancaMasculino12AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(50.0, 1.4, 12, "masculino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 25
    @Test
    public void testeCriancaFeminino2AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(4.9, 0.6, 2, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 26
    @Test
    public void testeCriancaFeminino2AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(5.7, 0.6, 2, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 27
    @Test
    public void testeCriancaFeminino2AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(6.6, 0.6, 2, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 28
    @Test
    public void testeCriancaFeminino2AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(7.5, 0.6, 2, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 29
    @Test
    public void testeCriancaFeminino4AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(8.3, 0.8, 4, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 30
    @Test
    public void testeCriancaFeminino4AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(10.5, 0.8, 4, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 31
    @Test
    public void testeCriancaFeminino4AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(11.2, 0.8, 4, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 32
    @Test
    public void testeCriancaFeminino4AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(12.9, 0.8, 4, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 33
    @Test
    public void testeCriancaFeminino6AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(10.1, 1.0, 6, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 34
    @Test
    public void testeCriancaFeminino6AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(15, 1.0, 6, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 35
    @Test
    public void testeCriancaFeminino6AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(17.5, 1.0, 6, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 36
    @Test
    public void testeCriancaFeminino6AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(20.1, 1.0, 6, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 37
    @Test
    public void testeCriancaFeminino8AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(12.1, 1.1, 8, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 38
    @Test
    public void testeCriancaFeminino8AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(17.5, 1.1, 8, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 39
    @Test
    public void testeCriancaFeminino8AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(22.9, 1.1, 8, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 40
    @Test
    public void testeCriancaFeminino8AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(26.1, 1.1, 8, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 41
    @Test
    public void testeCriancaFeminino10AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(15.1, 1.2, 10, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 42
    @Test
    public void testeCriancaFeminino10AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(27, 1.2, 10, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 43
    @Test
    public void testeCriancaFeminino10AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(32.4, 1.2, 10, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 44
    @Test
    public void testeCriancaFeminino10AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(38.4, 1.2, 10, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Criança 45
    @Test
    public void testeCriancaFeminino12AnosBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(18.1, 1.3, 12, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Criança 46
    @Test
    public void testeCriancaFeminino12AnosPesoNormal(){
        String resultado = calculadoraImc.calcularImc(30.1, 1.3, 12, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Criança 47
    @Test
    public void testeCriancaFeminino12AnosSobrepeso(){
        String resultado = calculadoraImc.calcularImc(40, 1.3, 12, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Criança 48
    @Test
    public void testeCriancaFeminino12AnosObesidade(){
        String resultado = calculadoraImc.calcularImc(48, 1.3, 12, "feminino");
        Assert.assertEquals("Obesidade", resultado);
    }

    // Adulto 1
    @Test
    public void testeAdultoBaixoPesoMuitoGrave(){
        String resultado = calculadoraImc.calcularImc(40, 1.7, 20, "masculino");
        Assert.assertEquals("Baixo peso muito grave", resultado);
    }

    // Adulto 2
    @Test
    public void testeAdultoBaixoPesoGraveInferior(){
        String resultado = calculadoraImc.calcularImc(46.3, 1.7, 20, "masculino");
        Assert.assertEquals("Baixo peso grave", resultado);
    }

    // Adulto 3
    @Test
    public void testeAdultoBaixoPesoGraveSuperior(){
        String resultado = calculadoraImc.calcularImc(49.1, 1.7, 20, "masculino");
        Assert.assertEquals("Baixo peso grave", resultado);
    }

    // Adulto 4
    @Test
    public void testeAdultoBaixoPesoInferior(){
        String resultado = calculadoraImc.calcularImc(49.2, 1.7, 20, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Adulto 5
    @Test
    public void testeAdultoBaixoPesoSuperior(){
        String resultado = calculadoraImc.calcularImc(53.4, 1.7, 20, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Adulto 6
    @Test
    public void testeAdultoPesoNormalInferior(){
        String resultado = calculadoraImc.calcularImc(53.5, 1.7, 20, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Adulto 7
    @Test
    public void testeAdultoPesoNormalSuperior(){
        String resultado = calculadoraImc.calcularImc(72.2, 1.7, 20, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Adult 8
    @Test
    public void testeAdultoSobrepesoInferior(){
        String resultado = calculadoraImc.calcularImc(72.3, 1.7, 20, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Adulto 9
    @Test
    public void testeAdultoSobrepesoSuperior(){
        String resultado = calculadoraImc.calcularImc(86.6, 1.7, 20, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Adulto 10
    @Test
    public void testeAdultoObesidadeGrau1Inferior(){
        String resultado = calculadoraImc.calcularImc(86.7, 1.7, 20, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Adulto 11
    @Test
    public void testeAdultoObesidadeGrau1Superior(){
        String resultado = calculadoraImc.calcularImc(101.1, 1.7, 20, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Adulto 12
    @Test
    public void testeAdultoObesidadeGrau2Inferior(){
        String resultado = calculadoraImc.calcularImc(101.2, 1.7, 20, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Adulto 13
    @Test
    public void testeAdultoObesidadeGrau2Superior(){
        String resultado = calculadoraImc.calcularImc(115.5, 1.7, 20, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Adulto 14
    @Test
    public void testeAdultoObesidadeGrau3(){
        String resultado = calculadoraImc.calcularImc(115.7, 1.7, 20, "masculino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    // Idoso 1
    @Test
    public void testeIdosoMasculinoBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(50, 1.6, 70, "masculino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Idoso 2
    @Test
    public void testeIdosoMasculinoPesoNormalInferior(){
        String resultado = calculadoraImc.calcularImc(56.4, 1.6, 70, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Idoso 3
    @Test
    public void testeIdosoMasculinoPesoNormalSuperior(){
        String resultado = calculadoraImc.calcularImc(69.1, 1.6, 70, "masculino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Idoso 4
    @Test
    public void testeIdosoMasculinoSobrepesoInferior(){
        String resultado = calculadoraImc.calcularImc(69.4, 1.6, 70, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Idoso 5
    @Test
    public void testeIdosoMasculinoSobrepesoSuperior(){
        String resultado = calculadoraImc.calcularImc(76.8, 1.6, 70, "masculino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Idoso 6
    @Test
    public void testeIdosoMasculinoObesidadeGrau1Inferior(){
        String resultado = calculadoraImc.calcularImc(77.1, 1.6, 70, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Idoso 7
    @Test
    public void testeIdosoMasculinoObesidadeGrau1Superior(){
        String resultado = calculadoraImc.calcularImc(89.6, 1.6, 70, "masculino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Idoso 8
    @Test
    public void testeIdosoMasculinoObesidadeGrau2Inferior(){
        String resultado = calculadoraImc.calcularImc(89.9, 1.6, 70, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Idoso 9
    @Test
    public void testeIdosoMasculinoObesidadeGrau2Superior(){
        String resultado = calculadoraImc.calcularImc(102.1, 1.6, 70, "masculino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Idoso 10
    @Test
    public void testeIdosoMasculinoObesidadeGrau3(){
        String resultado = calculadoraImc.calcularImc(104.9, 1.6, 70, "masculino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }

    // Idoso 11
    @Test
    public void testeIdosoFemininoBaixoPeso(){
        String resultado = calculadoraImc.calcularImc(45, 1.5, 70, "feminino");
        Assert.assertEquals("Baixo peso", resultado);
    }

    // Idoso 12
    @Test
    public void testeIdosoFemininoPesoNormalInferior(){
        String resultado = calculadoraImc.calcularImc(49.5, 1.5, 70, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Idoso 13
    @Test
    public void testeIdosoFemininoPesoNormalSuperior(){
        String resultado = calculadoraImc.calcularImc(60.7, 1.5, 70, "feminino");
        Assert.assertEquals("Peso normal", resultado);
    }

    // Idoso 14
    @Test
    public void testeIdosoFemininoSobrepesoInferior(){
        String resultado = calculadoraImc.calcularImc(61.0, 1.5, 70, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Idoso 15
    @Test
    public void testeIdosoFemininoSobrepesoSuperior(){
        String resultado = calculadoraImc.calcularImc(72, 1.5, 70, "feminino");
        Assert.assertEquals("Sobrepeso", resultado);
    }

    // Idoso 16
    @Test
    public void testeIdosoFemininoObesidadeGrau1Inferior(){
        String resultado = calculadoraImc.calcularImc(72.3, 1.5, 70, "feminino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Idoso 17
    @Test
    public void testeIdosoFemininoObesidadeGrau1Superior(){
        String resultado = calculadoraImc.calcularImc(83.2, 1.5, 70, "feminino");
        Assert.assertEquals("Obesidade grau I", resultado);
    }

    // Idoso 18
    @Test
    public void testeIdosoFemininoObesidadeGrau2Inferior(){
        String resultado = calculadoraImc.calcularImc(83.5, 1.5, 70, "feminino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Idoso 19
    @Test
    public void testeIdosoFemininoObesidadeGrau2Superior(){
        String resultado = calculadoraImc.calcularImc(94.2, 1.5, 70, "feminino");
        Assert.assertEquals("Obesidade grau II", resultado);
    }

    // Idoso 20
    @Test
    public void testeIdosoFemininoObesidadeGrau3(){
        String resultado = calculadoraImc.calcularImc(96.5, 1.5, 70, "feminino");
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", resultado);
    }













     

}
