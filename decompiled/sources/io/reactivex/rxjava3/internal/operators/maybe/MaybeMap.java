package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: renamed from: b */
    public final Function f8303b;

    public static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8304a;

        /* JADX INFO: renamed from: b */
        public final Function f8305b;

        /* JADX INFO: renamed from: c */
        public Disposable f8306c;

        public MapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.f8304a = maybeObserver;
            this.f8305b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f8306c;
            this.f8306c = DisposableHelper.f7218a;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8306c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8304a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8304a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8306c, disposable)) {
                this.f8306c = disposable;
                this.f8304a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.f8304a;
            try {
                Object objMo98394apply = this.f8305b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null item");
                maybeObserver.onSuccess(objMo98394apply);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public MaybeMap(Maybe maybe, Function function) {
        super(maybe);
        this.f8303b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f8233a.subscribe(new MapMaybeObserver(maybeObserver, this.f8303b));
    }
}
