package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleDelayWithCompletable<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final SingleSource f9852a;

    /* JADX INFO: renamed from: b */
    public final CompletableSource f9853b;

    public static final class OtherObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9854a;

        /* JADX INFO: renamed from: b */
        public final SingleSource f9855b;

        public OtherObserver(SingleObserver singleObserver, SingleSource singleSource) {
            this.f9854a = singleObserver;
            this.f9855b = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f9855b.subscribe(new ResumeSingleObserver(this.f9854a, this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f9854a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f9854a.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(SingleSource singleSource, CompletableSource completableSource) {
        this.f9852a = singleSource;
        this.f9853b = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9853b.subscribe(new OtherObserver(singleObserver, this.f9852a));
    }
}
