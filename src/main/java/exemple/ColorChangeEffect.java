package exemple;

import bandeau.Bandeau;

import java.awt.Color;

public class ColorChangeEffect implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        bandeau.setMessage("Color change effect");

        // Change the text color
        for (int i = 0; i < 255; i += 10) {
            bandeau.setForeground(new Color(i, 255 - i, i));
            bandeau.sleep(100);
        }
    }
}
