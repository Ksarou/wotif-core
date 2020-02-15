package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterable.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

import java.util.List;

public class FloatArraysJoinCondition extends AbstractIterableJoinCondition<Float, float[]>
        implements IIterableCondition<Float, float[], List<float[]>> {

    public FloatArraysJoinCondition(JoinEnum joinType, float[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected FloatArraysCondition getInstanceOfCondition(float[] term) {
        return new FloatArraysCondition(term);
    }

}
