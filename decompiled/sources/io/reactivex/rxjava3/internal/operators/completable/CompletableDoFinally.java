package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDoFinally extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7432a;

    /* JADX INFO: renamed from: b */
    public final Action f7433b;

    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7434a;

        /* JADX INFO: renamed from: b */
        public final Action f7435b;

        /* JADX INFO: renamed from: c */
        public Disposable f7436c;

        public DoFinallyObserver(CompletableObserver completableObserver, Action action) {
            this.f7434a = completableObserver;
            this.f7435b = action;
        }

        /* JADX INFO: renamed from: a */
        public final void m23476a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f7435b.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7436c.dispose();
            m23476a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7436c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7434a.onComplete();
            m23476a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f7434a.onError(th);
            m23476a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f7436c, disposable)) {
                this.f7436c = disposable;
                this.f7434a.onSubscribe(this);
            }
        }
    }

    public CompletableDoFinally(Completable completable, Action action) {
        this.f7432a = completable;
        this.f7433b = action;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7432a.subscribe(new DoFinallyObserver(completableObserver, this.f7433b));
    }
}
