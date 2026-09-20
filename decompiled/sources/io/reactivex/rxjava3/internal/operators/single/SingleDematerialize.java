package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: a */
    public final Single f9871a;

    /* JADX INFO: renamed from: b */
    public final Function f9872b;

    public static final class DematerializeObserver<T, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f9873a;

        /* JADX INFO: renamed from: b */
        public final Function f9874b;

        /* JADX INFO: renamed from: c */
        public Disposable f9875c;

        public DematerializeObserver(MaybeObserver maybeObserver, Function function) {
            this.f9873a = maybeObserver;
            this.f9874b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f9875c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9875c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f9873a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f9875c, disposable)) {
                this.f9875c = disposable;
                this.f9873a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.f9873a;
            try {
                Object objMo98394apply = this.f9874b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The selector returned a null Notification");
                Notification notification = (Notification) objMo98394apply;
                if (notification.m23381e()) {
                    maybeObserver.onSuccess(notification.m23380d());
                } else if (notification.f7194a == null) {
                    maybeObserver.onComplete();
                } else {
                    maybeObserver.onError(notification.m23379c());
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                maybeObserver.onError(th);
            }
        }
    }

    public SingleDematerialize(Single single, Function function) {
        this.f9871a = single;
        this.f9872b = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        this.f9871a.subscribe(new DematerializeObserver(maybeObserver, this.f9872b));
    }
}
