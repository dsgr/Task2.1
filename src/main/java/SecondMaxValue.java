 /**
     *SecondMaxValue1 and SecondMaxValue2 accept a list generated by random
     *numbers and filtered repeated values as input and find the second value from the passed list
     *
     *SecondMaxValue1 and SecondMaxValue2 are checked if null is passed to
     *the input, then it throws NPE (NullPointerException), and it is also
     *checked for the size of the list (size <= 2) - it throws IIE (IllegalInputException).
     *
     *The Finder class contains the main method in which the lists are looking for the second
     *maximum element in two ways
    */
public interface SecondMaxValue {

    Integer findSecondMaxValue(Iterable<Integer> input) throws IllegalInputException;

}
