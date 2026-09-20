package rxdogtag2;

import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: renamed from: rxdogtag2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC2675d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f288180b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LambdaConsumerIntrospection f288181c;

    public /* synthetic */ RunnableC2675d(LambdaConsumerIntrospection lambdaConsumerIntrospection, Throwable th, int i) {
        this.f288179a = i;
        this.f288181c = lambdaConsumerIntrospection;
        this.f288180b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f288179a) {
            case 0:
                ((DogTagCompletableObserver) this.f288181c).lambda$onError$3(this.f288180b);
                break;
            case 1:
                ((DogTagMaybeObserver) this.f288181c).lambda$onError$5(this.f288180b);
                break;
            case 2:
                ((DogTagObserver) this.f288181c).lambda$onError$5(this.f288180b);
                break;
            case 3:
                ((DogTagSingleObserver) this.f288181c).lambda$onError$5(this.f288180b);
                break;
            default:
                ((DogTagSubscriber) this.f288181c).lambda$onError$5(this.f288180b);
                break;
        }
    }
}
