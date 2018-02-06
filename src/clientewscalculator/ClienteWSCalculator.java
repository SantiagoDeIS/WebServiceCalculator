/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewscalculator;

/**
 *
 * @author entrar
 */
public class ClienteWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("4 + 3 = " + add(4,3));
        System.out.println("25 / 5 = " + divide(25,5));
        System.out.println("5 * 7 = " + mul(5,7));
        System.out.println("7 - 12 = " + substract(7,12));
    }

    private static int add(int n1, int n2) {
        clientewscalculator.Calc_Service service = new clientewscalculator.Calc_Service();
        clientewscalculator.Calc port = service.getCalcPort();
        return port.add(n1, n2);
    }

    private static int divide(int n1, int n2) {
        clientewscalculator.Calc_Service service = new clientewscalculator.Calc_Service();
        clientewscalculator.Calc port = service.getCalcPort();
        return port.divide(n1, n2);
    }

    private static int mul(int n1, int n2) {
        clientewscalculator.Calc_Service service = new clientewscalculator.Calc_Service();
        clientewscalculator.Calc port = service.getCalcPort();
        return port.mul(n1, n2);
    }

    private static int substract(int n1, int n2) {
        clientewscalculator.Calc_Service service = new clientewscalculator.Calc_Service();
        clientewscalculator.Calc port = service.getCalcPort();
        return port.substract(n1, n2);
    }
    
}
