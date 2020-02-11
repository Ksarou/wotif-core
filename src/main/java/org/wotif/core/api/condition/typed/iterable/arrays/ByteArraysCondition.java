package org.wotif.core.api.condition.typed.iterable.arrays;

import org.wotif.core.api.condition.typed.iterable.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterable.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class ByteArraysCondition extends AbstractIterableCondition<Byte, byte[]>
        implements IIterableCondition<Byte, byte[]> {

    public ByteArraysCondition(byte[] term) {
        super(term);
    }

    @Override
    protected Iterable<Byte> iterable() {
        List<Byte> bytes = new ArrayList<>();
        for (byte b : this.term.value()) {
            bytes.add(b);
        }
        return bytes;
    }

}
