package exemple;

import bandeau.Bandeau;

public class TestScenario {

    public static void main(String[] args) {
        new TestScenario().testAllEffects();
    }

    public void testAllEffects() {
        Bandeau monBandeau = new Bandeau();

        Scenario scenario = new Scenario();
        scenario.addEffect(new SlideEffect(), 1);
        scenario.addEffect(new ColorChangeEffect(), 1);
        scenario.addEffect(new RotateEffect(), 1);
        scenario.addEffect(new BlinkEffect(), 1);

        scenario.play(monBandeau);

        monBandeau.close();
    }
}
