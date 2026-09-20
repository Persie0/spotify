package rxdogtag2;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p204p.kep;

/* JADX INFO: loaded from: classes3.dex */
final class DogTagMaybeObserver<T> implements MaybeObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final MaybeObserver<T> delegate;

    /* JADX INFO: renamed from: t */
    private final Throwable f288168t = new Throwable();

    public DogTagMaybeObserver(RxDogTag.Configuration configuration, MaybeObserver<T> maybeObserver) {
        this.config = configuration;
        this.delegate = maybeObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.f288168t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.f288168t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.f288168t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.f288168t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        MaybeObserver<T> maybeObserver = this.delegate;
        return (maybeObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) maybeObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        C2677f c2677f = new C2677f(this, 0);
        MaybeObserver<T> maybeObserver = this.delegate;
        Objects.requireNonNull(maybeObserver);
        RxDogTag.guardedDelegateCall(c2677f, new kep(maybeObserver, 12));
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onError(Throwable th) {
        MaybeObserver<T> maybeObserver = this.delegate;
        if (!(maybeObserver instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.f288168t, th, null);
            return;
        }
        if (maybeObserver instanceof RxDogTagTaggedExceptionReceiver) {
            maybeObserver.onError(RxDogTag.createException(this.config, this.f288168t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2677f(this, 1), new RunnableC2675d(this, th, 1));
        } else {
            maybeObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2676e(this, 1), new RunnableC2673b(this, disposable, 2));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2676e(this, 0), new RunnableC2673b(this, t, 1));
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
