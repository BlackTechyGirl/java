package tdd;

public class Arithmetic {

    public int addThreeNumbers(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }


    public int averageOfThreeNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;


    }

    public int productOfThreeNumbers(int numOne, int numTwo, int numThree) {
        return numOne * numTwo * numThree;
    }

    public int smallestNumber(int numOne, int numTwo, int numThree) {
        int smallestValue = numOne;

        if (numTwo < smallestValue){
            smallestValue = numTwo;
        }
        if (numThree < smallestValue){
            return numThree;
        }
        return smallestValue;
    }

    public int largestestNumber(int numOne, int numTwo, int numThree) {
        numOne = 3;
        if (numTwo > numOne){
            return numTwo;}
        if (numThree > numOne){
            return numThree;}
        return numOne;
    }
}
