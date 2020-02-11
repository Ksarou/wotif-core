package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterable.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

public class ByteArraysJoinCondition extends AbstractIterableJoinCondition<Byte, byte[]>
        implements IIterableCondition<Byte, byte[]> {

    public ByteArraysJoinCondition(JoinEnum joinType, byte[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected ByteArraysCondition getInstanceOfCondition(byte[] term) {
        return new ByteArraysCondition(term);
    }

}
