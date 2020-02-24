/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package dev.ksarou.wotif.core.condition.typed.temporal;

import dev.ksarou.wotif.core.Completable;
import dev.ksarou.wotif.core.condition.typed.IComparableCondition;

public interface ITemporalCondition<T extends Comparable<T>, R>
        extends IComparableCondition<T, R> {

    Completable<R> isAfter(String otherAsString);

    Completable<R> isAfter(T other);

    Completable<R> isAfterOrEqualTo(String otherAsString);

    Completable<R> isAfterOrEqualTo(T other);

    Completable<R> isBefore(String otherAsString);

    Completable<R> isBefore(T other);

    Completable<R> isBeforeOrEqualTo(String otherAsString);

    Completable<R> isBeforeOrEqualTo(T other);

    Completable<R> isBetween(String inclusiveStart, String inclusiveEnd);

    Completable<R> isBetween(T inclusiveStart, T inclusiveEnd);

    Completable<R> isStrictlyBetween(String inclusiveStart, String inclusiveEnd);

    Completable<R> isStrictlyBetween(T inclusiveStart, T inclusiveEnd);

    Completable<R> isToday();
}
