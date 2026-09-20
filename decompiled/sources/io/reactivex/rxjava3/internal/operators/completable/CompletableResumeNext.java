package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableResumeNext extends Completable {

    /* JADX INFO: renamed from: a */
    public final Completable f7488a;

    /* JADX INFO: renamed from: b */
    public final Function f7489b;

    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7490a;

        /* JADX INFO: renamed from: b */
        public final Function f7491b;

        /* JADX INFO: renamed from: c */
        public boolean f7492c;

        public ResumeNextObserver(CompletableObserver completableObserver, Function function) {
            this.f7490a = completableObserver;
            this.f7491b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f7490a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            boolean z = this.f7492c;
            CompletableObserver completableObserver = this.f7490a;
            if (z) {
                completableObserver.onError(th);
                return;
            }
            this.f7492c = true;
            try {
                Object objMo98394apply = this.f7491b.mo98394apply(th);
                Objects.requireNonNull(objMo98394apply, "The errorMapper returned a null CompletableSource");
                ((CompletableSource) objMo98394apply).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23416c(this, disposable);
        }
    }

    public CompletableResumeNext(Completable completable, Function function) {
        this.f7488a = completable;
        this.f7489b = function;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(completableObserver, this.f7489b);
        completableObserver.onSubscribe(resumeNextObserver);
        this.f7488a.subscribe(resumeNextObserver);
    }
}
