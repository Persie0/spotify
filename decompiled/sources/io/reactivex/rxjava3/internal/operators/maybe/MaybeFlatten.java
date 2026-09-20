package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFlatten<T, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: renamed from: b */
    public final Function f8285b;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8286a;

        /* JADX INFO: renamed from: b */
        public final Function f8287b;

        /* JADX INFO: renamed from: c */
        public Disposable f8288c;

        public final class InnerObserver implements MaybeObserver<R> {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                FlatMapMaybeObserver.this.f8286a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                FlatMapMaybeObserver.this.f8286a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                FlatMapMaybeObserver.this.f8286a.onSuccess(obj);
            }
        }

        public FlatMapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f8286a = maybeObserver;
            this.f8287b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            this.f8288c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8286a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8286a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8288c, disposable)) {
                this.f8288c = disposable;
                this.f8286a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo98394apply = this.f8287b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objMo98394apply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f8286a.onError(th);
            }
        }
    }

    public MaybeFlatten(Maybe maybe, Function function) {
        super(maybe);
        this.f8285b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new FlatMapMaybeObserver(maybeObserver, this.f8285b));
    }
}
