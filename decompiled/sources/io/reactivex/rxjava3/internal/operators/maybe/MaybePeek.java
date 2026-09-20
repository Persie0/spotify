package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Consumer f8326b;

    /* JADX INFO: renamed from: c */
    public final Consumer f8327c;

    /* JADX INFO: renamed from: d */
    public final Consumer f8328d;

    /* JADX INFO: renamed from: e */
    public final Action f8329e;

    /* JADX INFO: renamed from: f */
    public final Action f8330f;

    /* JADX INFO: renamed from: g */
    public final Action f8331g;

    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8332a;

        /* JADX INFO: renamed from: b */
        public final MaybePeek f8333b;

        /* JADX INFO: renamed from: c */
        public Disposable f8334c;

        public MaybePeekObserver(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.f8332a = maybeObserver;
            this.f8333b = maybePeek;
        }

        /* JADX INFO: renamed from: a */
        public final void m23571a() {
            try {
                this.f8333b.f8330f.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m23572b(Throwable th) {
            try {
                this.f8333b.f8328d.accept(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                th = new CompositeException(th, th2);
            }
            this.f8334c = DisposableHelper.f7218a;
            this.f8332a.onError(th);
            m23571a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            try {
                this.f8333b.f8331g.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
            this.f8334c.dispose();
            this.f8334c = DisposableHelper.f7218a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8334c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Disposable disposable = this.f8334c;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f8333b.f8329e.run();
                this.f8334c = disposableHelper;
                this.f8332a.onComplete();
                m23571a();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                m23572b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            if (this.f8334c == DisposableHelper.f7218a) {
                RxJavaPlugins.m23782b(th);
            } else {
                m23572b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            MaybeObserver maybeObserver = this.f8332a;
            if (DisposableHelper.m23419h(this.f8334c, disposable)) {
                try {
                    this.f8333b.f8326b.accept(disposable);
                    this.f8334c = disposable;
                    maybeObserver.onSubscribe(this);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    disposable.dispose();
                    this.f8334c = DisposableHelper.f7218a;
                    maybeObserver.onSubscribe(EmptyDisposable.f7220a);
                    maybeObserver.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = this.f8334c;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.f8333b.f8327c.accept(obj);
                this.f8334c = disposableHelper;
                this.f8332a.onSuccess(obj);
                m23571a();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                m23572b(th);
            }
        }
    }

    public MaybePeek(Maybe maybe, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action, Action action2, Action action3) {
        super(maybe);
        this.f8326b = consumer;
        this.f8327c = consumer2;
        this.f8328d = consumer3;
        this.f8329e = action;
        this.f8330f = action2;
        this.f8331g = action3;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new MaybePeekObserver(maybeObserver, this));
    }
}
