package rxdogtag2;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p204p.ft51;
import p204p.kep;
import p204p.ot51;

/* JADX INFO: loaded from: classes3.dex */
final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final ft51 delegate;

    /* JADX INFO: renamed from: t */
    private final Throwable f288171t = new Throwable();

    public DogTagSubscriber(RxDogTag.Configuration configuration, ft51 ft51Var) {
        this.config = configuration;
        this.delegate = ft51Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.f288171t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.f288171t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.f288171t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.f288171t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(ot51 ot51Var) {
        this.delegate.onSubscribe(ot51Var);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        ft51 ft51Var = this.delegate;
        return (ft51Var instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) ft51Var).hasCustomOnError();
    }

    @Override // p204p.ft51
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        C2680i c2680i = new C2680i(this, 0);
        ft51 ft51Var = this.delegate;
        Objects.requireNonNull(ft51Var);
        RxDogTag.guardedDelegateCall(c2680i, new kep(ft51Var, 13));
    }

    @Override // p204p.ft51
    public void onError(Throwable th) {
        ft51 ft51Var = this.delegate;
        if (!(ft51Var instanceof RxDogTagErrorReceiver)) {
            RxDogTag.reportError(this.config, this.f288171t, th, null);
            return;
        }
        if (ft51Var instanceof RxDogTagTaggedExceptionReceiver) {
            ft51Var.onError(RxDogTag.createException(this.config, this.f288171t, th, null));
        } else if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2680i(this, 1), new RunnableC2675d(this, th, 4));
        } else {
            ft51Var.onError(th);
        }
    }

    @Override // p204p.ft51
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2681j(this, 0), new RunnableC2673b(this, t, 7));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // p204p.ft51
    public void onSubscribe(ot51 ot51Var) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new C2681j(this, 1), new RunnableC2673b(this, ot51Var, 8));
        } else {
            this.delegate.onSubscribe(ot51Var);
        }
    }
}
