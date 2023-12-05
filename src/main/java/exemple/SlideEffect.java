package exemple;

import bandeau.Bandeau;

public class SlideEffect implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        String message = "Slide effect";
        bandeau.setMessage(message);

        // Move the message from left to right
        for (int i = 0; i <= message.length(); i++) {
            bandeau.setMessage(message.substring(i));
            bandeau.sleep(100);
        }
    }
}
