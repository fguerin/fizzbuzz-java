package fr.kata.fizzbuzz;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * User: florian
 * Date: 23/09/11
 * Time: 11:33
 */
public class FizzBuzzer {

    public FizzBuzzer() {
    }

    public List<String> generateFizzBuzz() {
        final ArrayList<String> resultat = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            if (i%15 == 0) {
                resultat.add("fizzbuzz");
            } else if (i%3 == 0) {
                resultat.add("fizz");
            }  else if (i%5 == 0) {
                resultat.add("buzz");
            } else {
                resultat.add(String.valueOf(i));
            }
        }
        return resultat;
    }
}
