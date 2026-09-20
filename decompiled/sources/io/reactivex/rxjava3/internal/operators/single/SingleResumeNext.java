package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleResumeNext<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10025a;

    /* JADX INFO: renamed from: b */
    public final Function f10026b;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10027a;

        /* JADX INFO: renamed from: b */
        public final Function f10028b;

        public ResumeMainSingleObserver(SingleObserver singleObserver, Function function) {
            this.f10027a = singleObserver;
            this.f10028b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            SingleObserver singleObserver = this.f10027a;
            try {
                Object objMo98394apply = this.f10028b.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The nextFunction returned a null SingleSource.");
                ((SingleSource) objMo98394apply).subscribe(new ResumeSingleObserver(singleObserver, this));
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable)) {
                this.f10027a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10027a.onSuccess(obj);
        }
    }

    public SingleResumeNext(Single single, Function function) {
        this.f10025a = single;
        this.f10026b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.f10025a.subscribe(new ResumeMainSingleObserver(singleObserver, this.f10026b));
    }
}
