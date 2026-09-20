package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: a */
    public final MaybeSource f8233a;

    public AbstractMaybeWithUpstream(MaybeSource maybeSource) {
        this.f8233a = maybeSource;
    }
}
