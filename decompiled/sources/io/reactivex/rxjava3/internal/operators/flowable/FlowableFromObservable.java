package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Observable f7866b;

    public static final class SubscriberObserver<T> implements Observer<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7867a;

        /* JADX INFO: renamed from: b */
        public Disposable f7868b;

        public SubscriberObserver(ft51 ft51Var) {
            this.f7867a = ft51Var;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7868b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7867a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7867a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f7867a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f7868b = disposable;
            this.f7867a.onSubscribe(this);
        }

        @Override // p204p.ot51
        public final void request(long j) {
        }
    }

    public FlowableFromObservable(Observable observable) {
        this.f7866b = observable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7866b.subscribe(new SubscriberObserver(ft51Var));
    }
}
