package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final i7t0 f9990a;

    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9991a;

        /* JADX INFO: renamed from: b */
        public ot51 f9992b;

        /* JADX INFO: renamed from: c */
        public Object f9993c;

        /* JADX INFO: renamed from: d */
        public boolean f9994d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f9995e;

        public ToSingleObserver(SingleObserver singleObserver) {
            this.f9991a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9995e = true;
            this.f9992b.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9995e;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f9994d) {
                return;
            }
            this.f9994d = true;
            Object obj = this.f9993c;
            this.f9993c = null;
            SingleObserver singleObserver = this.f9991a;
            if (obj == null) {
                singleObserver.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                singleObserver.onSuccess(obj);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f9994d) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f9994d = true;
            this.f9993c = null;
            this.f9991a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f9994d) {
                return;
            }
            if (this.f9993c == null) {
                this.f9993c = obj;
                return;
            }
            this.f9992b.cancel();
            this.f9994d = true;
            this.f9993c = null;
            this.f9991a.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f9992b, ot51Var)) {
                this.f9992b = ot51Var;
                this.f9991a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleFromPublisher(i7t0 i7t0Var) {
        this.f9990a = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f9990a.subscribe(new ToSingleObserver(singleObserver));
    }
}
