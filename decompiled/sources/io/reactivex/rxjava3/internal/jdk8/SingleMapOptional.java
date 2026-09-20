package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleMapOptional<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: a */
    public final Single f7335a;

    /* JADX INFO: renamed from: b */
    public final Function f7336b;

    public static final class MapOptionalSingleObserver<T, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f7337a;

        /* JADX INFO: renamed from: b */
        public final Function f7338b;

        /* JADX INFO: renamed from: c */
        public Disposable f7339c;

        public MapOptionalSingleObserver(MaybeObserver maybeObserver, Function function) {
            this.f7337a = maybeObserver;
            this.f7338b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f7339c;
            this.f7339c = DisposableHelper.f7218a;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7339c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f7337a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f7339c, disposable)) {
                this.f7339c = disposable;
                this.f7337a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.f7337a;
            try {
                Object objMo98394apply = this.f7338b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null item");
                Optional optional = (Optional) objMo98394apply;
                if (optional.isPresent()) {
                    maybeObserver.onSuccess(optional.get());
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public SingleMapOptional(Single single, Function function) {
        this.f7335a = single;
        this.f7336b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f7335a.subscribe(new MapOptionalSingleObserver(maybeObserver, this.f7336b));
    }
}
