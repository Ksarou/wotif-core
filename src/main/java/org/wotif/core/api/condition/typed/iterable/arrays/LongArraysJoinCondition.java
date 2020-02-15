package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterable.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

import java.util.List;

public class LongArraysJoinCondition extends AbstractIterableJoinCondition<Long, long[]>
        implements IIterableCondition<Long, long[], List<long[]>> {

    public LongArraysJoinCondition(JoinEnum joinType, long[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected LongArraysCondition getInstanceOfCondition(long[] term) {
        return new LongArraysCondition(term);
    }

}
