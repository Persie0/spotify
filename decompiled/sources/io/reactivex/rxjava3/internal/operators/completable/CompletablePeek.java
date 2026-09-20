package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletablePeek extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7478a;

    /* JADX INFO: renamed from: b */
    public final Consumer f7479b;

    /* JADX INFO: renamed from: c */
    public final Consumer f7480c;

    /* JADX INFO: renamed from: d */
    public final Action f7481d;

    /* JADX INFO: renamed from: e */
    public final Action f7482e;

    /* JADX INFO: renamed from: f */
    public final Action f7483f;

    /* JADX INFO: renamed from: g */
    public final Action f7484g;

    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7485a;

        /* JADX INFO: renamed from: b */
        public Disposable f7486b;

        public CompletableObserverImplementation(CompletableObserver completableObserver) {
            this.f7485a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            try {
                CompletablePeek.this.f7484g.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
            this.f7486b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7486b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.f7485a;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f7486b == DisposableHelper.f7218a) {
                return;
            }
            try {
                completablePeek.f7481d.run();
                completablePeek.f7482e.run();
                completableObserver.onComplete();
                try {
                    completablePeek.f7483f.run();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.f7486b == DisposableHelper.f7218a) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            try {
                completablePeek.f7480c.accept(th);
                completablePeek.f7482e.run();
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                th = new CompositeException(th, th2);
            }
            this.f7485a.onError(th);
            try {
                completablePeek.f7483f.run();
            } catch (Throwable th3) {
                Exceptions.m23404a(th3);
                RxJavaPlugins.m23782b(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            CompletableObserver completableObserver = this.f7485a;
            try {
                CompletablePeek.this.f7479b.accept(disposable);
                if (DisposableHelper.m23419h(this.f7486b, disposable)) {
                    this.f7486b = disposable;
                    completableObserver.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                disposable.dispose();
                this.f7486b = DisposableHelper.f7218a;
                completableObserver.onSubscribe(EmptyDisposable.f7220a);
                completableObserver.onError(th);
            }
        }
    }

    public CompletablePeek(Completable completable, Consumer consumer, Consumer consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f7478a = completable;
        this.f7479b = consumer;
        this.f7480c = consumer2;
        this.f7481d = action;
        this.f7482e = action2;
        this.f7483f = action3;
        this.f7484g = action4;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7478a.subscribe(new CompletableObserverImplementation(completableObserver));
    }
}
