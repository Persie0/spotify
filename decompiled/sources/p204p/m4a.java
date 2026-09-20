package p204p;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import retrofit2.adapter.rxjava3.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class m4a implements Observer {

    /* JADX INFO: renamed from: a */
    public final Observer f139879a;

    /* JADX INFO: renamed from: b */
    public boolean f139880b;

    public m4a(Observer observer) {
        this.f139879a = observer;
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f139880b) {
            return;
        }
        this.f139879a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (!this.f139880b) {
            this.f139879a.onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        RxJavaPlugins.m23782b(assertionError);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        o2x0 o2x0Var = (o2x0) obj;
        boolean z = o2x0Var.f161171a.f149852O0;
        Observer observer = this.f139879a;
        if (z) {
            observer.onNext(o2x0Var.f161172b);
            return;
        }
        this.f139880b = true;
        HttpException httpException = new HttpException(o2x0Var);
        try {
            observer.onError(httpException);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            RxJavaPlugins.m23782b(new CompositeException(httpException, th));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f139879a.onSubscribe(disposable);
    }
}
