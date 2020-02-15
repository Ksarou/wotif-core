package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterable.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

import java.util.List;

public class BooleanArraysJoinCondition extends AbstractIterableJoinCondition<Boolean, boolean[]>
        implements IIterableCondition<Boolean, boolean[], List<boolean[]>> {

    public BooleanArraysJoinCondition(JoinEnum joinType, boolean[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected BooleanArraysCondition getInstanceOfCondition(boolean[] term) {
        return new BooleanArraysCondition(term);
    }

}
