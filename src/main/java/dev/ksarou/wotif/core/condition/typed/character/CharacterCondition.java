package dev.ksarou.wotif.core.condition.typed.character;

import dev.ksarou.wotif.core.Completable;
import dev.ksarou.wotif.core.condition.typed.ComparableCondition;

public class CharacterCondition extends ComparableCondition<Character> implements ICharacterCondition<Character> {

    public CharacterCondition(Character term) {
        super(term);
    }

    @Override
    public Completable<Character> isUpperCase() {
        boolean upperCase = Character.isUpperCase(this.term.value());
        return new Completable<>(term, upperCase);
    }

    @Override
    public Completable<Character> isLowerCase() {
        boolean upperCase = Character.isLowerCase(this.term.value());
        return new Completable<>(term, upperCase);
    }

}
