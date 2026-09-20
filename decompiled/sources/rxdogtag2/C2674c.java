package rxdogtag2;

import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: renamed from: rxdogtag2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2674c implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LambdaConsumerIntrospection f288178b;

    public /* synthetic */ C2674c(LambdaConsumerIntrospection lambdaConsumerIntrospection, int i) {
        this.f288177a = i;
        this.f288178b = lambdaConsumerIntrospection;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288177a) {
            case 0:
                ((DogTagCompletableObserver) this.f288178b).lambda$onError$2((Throwable) obj);
                break;
            case 1:
                ((DogTagObserver) this.f288178b).lambda$onError$4((Throwable) obj);
                break;
            default:
                ((DogTagSingleObserver) this.f288178b).lambda$onError$4((Throwable) obj);
                break;
        }
    }
}
