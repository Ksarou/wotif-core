package dev.ksarou.wotif.core.condition.typed.object;

import dev.ksarou.wotif.core.Completable;
import dev.ksarou.wotif.core.condition.ICondition;

public interface IObjectCondition<T, R> extends ICondition<T, R> {

    Completable<R> hasNullProperties();

    Completable<R> doesNotHasNullProperties();

    Completable<R> hasAllNullProperties();

    Completable<R> hasNoNullProperties();

    Completable<R> hasProperty(String name);

    Completable<R> doesNotHasProperty(String name);

    Completable<R> hasPropertyWithValue(String propertyName, Object propertyValue);

    Completable<R> doesNotHasPropertyWithValue(String propertyName, Object propertyValue);

}
