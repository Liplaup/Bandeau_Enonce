package exemple;

import bandeau.Bandeau;

public class RotateEffect implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        String message = "Rotate effect";
        bandeau.setMessage(message);

        // Rotate the message gradually
        for (int i = 0; i < 360; i += 10) {
            bandeau.setRotation(Math.toRadians(i));
            bandeau.sleep(100);
        }
        // Reset rotation to 0 degrees
        bandeau.setRotation(0);
    }
}
