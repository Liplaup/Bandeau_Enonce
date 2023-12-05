
package exemple;

import bandeau.Bandeau; 
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<EffectWrapper> effects;

    public Scenario() {
        this.effects = new ArrayList<>();
    }

    public void addEffect(Effect effect, int repeatCount) {
        effects.add(new EffectWrapper(effect, repeatCount));
    }

    public void play(Bandeau bandeau) {
        for (EffectWrapper effectWrapper : effects) {
            for (int i = 0; i < effectWrapper.getRepeatCount(); i++) {
                effectWrapper.getEffect().play(bandeau);
            }
        }
    }

    private static class EffectWrapper {
        private Effect effect;
        private int repeatCount;

        public EffectWrapper(Effect effect, int repeatCount) {
            this.effect = effect;
            this.repeatCount = repeatCount;
        }

        public Effect getEffect() {
            return effect;
        }

        public int getRepeatCount() {
            return repeatCount;
        }
    }
}
