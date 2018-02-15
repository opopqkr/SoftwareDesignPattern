package hansung.designpatterns.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Park Chan mo on 2017-11-06.
 */
public class DouchWithHook extends CaffeineBeverageWithHook {

    @Override
    void readyWater() {
        System.out.println("끓인 물 대신 찬물 준비");
    }

    public void brew() {
        System.out.println("찬 물을 사용하여 장시간에 걸쳐 커피액 추출");
    }

    @Override
    void store() {
        System.out.println("저온 숙성");
    }

    public void addCondiments() {
        System.out.println("첨가물 추가");
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like condiment with your douchCoffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}