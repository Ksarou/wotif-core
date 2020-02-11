package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterable.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

public class CharArraysJoinCondition extends AbstractIterableJoinCondition<Character, char[]>
        implements IIterableCondition<Character, char[]> {

    public CharArraysJoinCondition(JoinEnum joinType, char[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected CharArraysCondition getInstanceOfCondition(char[] term) {
        return new CharArraysCondition(term);
    }

}
