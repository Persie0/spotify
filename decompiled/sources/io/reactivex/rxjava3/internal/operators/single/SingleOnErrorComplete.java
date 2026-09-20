package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleOnErrorComplete<T> extends Maybe<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10018a;

    /* JADX INFO: renamed from: b */
    public final Predicate f10019b;

    public SingleOnErrorComplete(Single single, Predicate predicate) {
        this.f10018a = single;
        this.f10019b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f10018a.subscribe(new MaybeOnErrorComplete.OnErrorCompleteMultiObserver(maybeObserver, this.f10019b));
    }
}
