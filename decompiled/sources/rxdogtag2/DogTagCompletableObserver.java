package rxdogtag2;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p204p.RunnableC2364s6;

/* JADX INFO: loaded from: classes3.dex */
final class DogTagCompletableObserver implements CompletableObserver, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final CompletableObserver delegate;

    /* JADX INFO: renamed from: t */
    private final Throwable f288167t = new Throwable();

    public DogTagCompletableObserver(RxDogTag.Configuration configuration, CompletableObserver completableObserver) {
        this.config = configuration;
        this.delegate = completableObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$4(Throwable th) {
        RxDogTag.reportError(this.config, this.f288167t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(Throwable th) {
        RxDogTag.reportError(this.config, this.f288167t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$3(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.f288167t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        CompletableObserver completableObserver = this.delegate;
        return (completableObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) completableObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        C2672a c2672a = new C2672a(this, 1);
        CompletableObserver completableObserver = this.delegate;
        Objects.requireNonNull(completableObserver);
        RxDogTag.guardedDelegateCall(c2672a, new RunnableC2364s6(completableObserver, 3));
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th) {
        CompletableObserver completableObserver = this.delegate;
        if (!(completableObserver instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.f288167t, th, null);
            return;
        }
        if (completableObserver instanceof RxDogTagTaggedExceptionReceiver) {
            completableObserver.onError(RxDogTag.createException(this.config, this.f288167t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2674c(this, 0), new RunnableC2675d(this, th, 0));
        } else {
            completableObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2672a(this, 0), new RunnableC2673b(this, disposable, 0));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }
}
