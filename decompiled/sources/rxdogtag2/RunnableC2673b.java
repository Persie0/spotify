package rxdogtag2;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import p204p.ot51;

/* JADX INFO: renamed from: rxdogtag2.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2673b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LambdaConsumerIntrospection f288175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f288176c;

    public /* synthetic */ RunnableC2673b(LambdaConsumerIntrospection lambdaConsumerIntrospection, Object obj, int i) {
        this.f288174a = i;
        this.f288175b = lambdaConsumerIntrospection;
        this.f288176c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f288174a) {
            case 0:
                ((DogTagCompletableObserver) this.f288175b).lambda$onSubscribe$1((Disposable) this.f288176c);
                break;
            case 1:
                ((DogTagMaybeObserver) this.f288175b).lambda$onSuccess$3(this.f288176c);
                break;
            case 2:
                ((DogTagMaybeObserver) this.f288175b).lambda$onSubscribe$1((Disposable) this.f288176c);
                break;
            case 3:
                ((DogTagObserver) this.f288175b).lambda$onSubscribe$1((Disposable) this.f288176c);
                break;
            case 4:
                ((DogTagObserver) this.f288175b).lambda$onNext$3(this.f288176c);
                break;
            case 5:
                ((DogTagSingleObserver) this.f288175b).lambda$onSuccess$3(this.f288176c);
                break;
            case 6:
                ((DogTagSingleObserver) this.f288175b).lambda$onSubscribe$1((Disposable) this.f288176c);
                break;
            case 7:
                ((DogTagSubscriber) this.f288175b).lambda$onNext$3(this.f288176c);
                break;
            default:
                ((DogTagSubscriber) this.f288175b).lambda$onSubscribe$1((ot51) this.f288176c);
                break;
        }
    }
}
