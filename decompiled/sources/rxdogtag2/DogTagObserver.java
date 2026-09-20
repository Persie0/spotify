package rxdogtag2;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p204p.RunnableC2364s6;

/* JADX INFO: loaded from: classes3.dex */
final class DogTagObserver<T> implements Observer<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final Observer<T> delegate;

    /* JADX INFO: renamed from: t */
    private final Throwable f288169t = new Throwable();

    public DogTagObserver(RxDogTag.Configuration configuration, Observer<T> observer) {
        this.config = configuration;
        this.delegate = observer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.f288169t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.f288169t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.f288169t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.f288169t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        Observer<T> observer = this.delegate;
        return (observer instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) observer).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        C2678g c2678g = new C2678g(this, 2);
        Observer<T> observer = this.delegate;
        Objects.requireNonNull(observer);
        RxDogTag.guardedDelegateCall(c2678g, new RunnableC2364s6(observer, 4));
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th) {
        Observer<T> observer = this.delegate;
        if (!(observer instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.f288169t, th, null);
            return;
        }
        if (observer instanceof RxDogTagTaggedExceptionReceiver) {
            observer.onError(RxDogTag.createException(this.config, this.f288169t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2674c(this, 1), new RunnableC2675d(this, th, 2));
        } else {
            observer.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2678g(this, 1), new RunnableC2673b(this, t, 4));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2678g(this, 0), new RunnableC2673b(this, disposable, 3));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }
}
