package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2672a implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagCompletableObserver f288173b;

    public /* synthetic */ C2672a(DogTagCompletableObserver dogTagCompletableObserver, int i) {
        this.f288172a = i;
        this.f288173b = dogTagCompletableObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288172a) {
            case 0:
                this.f288173b.lambda$onSubscribe$0((Throwable) obj);
                break;
            default:
                this.f288173b.lambda$onComplete$4((Throwable) obj);
                break;
        }
    }
}
