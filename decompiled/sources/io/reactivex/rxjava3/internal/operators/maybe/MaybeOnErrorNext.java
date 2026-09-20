package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Function f8317b;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8318a;

        /* JADX INFO: renamed from: b */
        public final Function f8319b;

        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: a */
            public final MaybeObserver f8320a;

            /* JADX INFO: renamed from: b */
            public final AtomicReference f8321b;

            public NextMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
                this.f8320a = maybeObserver;
                this.f8321b = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                this.f8320a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f8320a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this.f8321b, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f8320a.onSuccess(obj);
            }
        }

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f8318a = maybeObserver;
            this.f8319b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8318a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            MaybeObserver maybeObserver = this.f8318a;
            try {
                Object objMo98394apply = this.f8319b.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The resumeFunction returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objMo98394apply;
                DisposableHelper.m23416c(this, null);
                maybeSource.subscribe(new NextMaybeObserver(maybeObserver, this));
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f8318a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8318a.onSuccess(obj);
        }
    }

    public MaybeOnErrorNext(Maybe maybe, Function function) {
        super(maybe);
        this.f8317b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new OnErrorNextMaybeObserver(maybeObserver, this.f8317b));
    }
}
