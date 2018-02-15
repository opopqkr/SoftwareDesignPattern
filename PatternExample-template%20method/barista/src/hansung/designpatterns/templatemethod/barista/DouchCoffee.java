package hansung.designpatterns.templatemethod.barista;

/**
 * Created by Park Chan mo on 2017-11-06.
 */
public class DouchCoffee extends CaffeineBeverage {

    @Override
    void readyWater() {
        System.out.println("끓인 물 대신 찬물 준비");
    }

    @Override
    void brew() {
        System.out.println("찬 물을 사용하여 장시간에 걸쳐 커피액 추출");
    }

    @Override
    void addCondiments() {
        System.out.println("첨가물 추가");
    }

}
