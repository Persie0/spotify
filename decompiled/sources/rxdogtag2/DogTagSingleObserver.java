package rxdogtag2;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: loaded from: classes3.dex */
final class DogTagSingleObserver<T> implements SingleObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final SingleObserver<T> delegate;

    /* JADX INFO: renamed from: t */
    private final Throwable f288170t = new Throwable();

    public DogTagSingleObserver(RxDogTag.Configuration configuration, SingleObserver<T> singleObserver) {
        this.config = configuration;
        this.delegate = singleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.f288170t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.f288170t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.f288170t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        SingleObserver<T> singleObserver = this.delegate;
        return (singleObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) singleObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onError(Throwable th) {
        SingleObserver<T> singleObserver = this.delegate;
        if (!(singleObserver instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.f288170t, th, null);
            return;
        }
        if (singleObserver instanceof RxDogTagTaggedExceptionReceiver) {
            singleObserver.onError(RxDogTag.createException(this.config, this.f288170t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2674c(this, 2), new RunnableC2675d(this, th, 3));
        } else {
            singleObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2679h(this, 1), new RunnableC2673b(this, disposable, 6));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2679h(this, 0), new RunnableC2673b(this, t, 5));
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
