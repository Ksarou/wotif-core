/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package dev.ksarou.wotif.core.condition.typed.booleans;

import dev.ksarou.wotif.core.Completable;
import dev.ksarou.wotif.core.condition.AbstractJoinCondition;
import dev.ksarou.wotif.core.condition.JoinEnum;

import java.util.List;

public class BooleanJoinCondition extends AbstractJoinCondition<Boolean, BooleanCondition>
        implements IBooleanCondition<List<Boolean>> {

    public BooleanJoinCondition(JoinEnum joinType, Boolean... terms) {
        super(joinType, terms);
    }

    @Override
    protected BooleanCondition getInstanceOfCondition(Boolean term) {
        return new BooleanCondition(term);
    }

    @Override
    public Completable<List<Boolean>> isTrue() {
        return this.functionToApply.apply(BooleanCondition::isTrue);
    }

    @Override
    public Completable<List<Boolean>> isFalse() {
        return this.functionToApply.apply(BooleanCondition::isFalse);
    }

}
