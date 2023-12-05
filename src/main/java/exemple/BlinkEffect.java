package exemple;

import bandeau.Bandeau;

public class BlinkEffect implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        bandeau.setMessage("Blink effect");

        // Make the text blink
        for (int i = 0; i < 5; i++) {
            bandeau.setMessage("");
            bandeau.sleep(200);
            bandeau.setMessage("Blink");
            bandeau.sleep(200);
        }
    }
}
