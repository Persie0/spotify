package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2679h implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagSingleObserver f288189b;

    public /* synthetic */ C2679h(DogTagSingleObserver dogTagSingleObserver, int i) {
        this.f288188a = i;
        this.f288189b = dogTagSingleObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288188a) {
            case 0:
                this.f288189b.lambda$onSuccess$2((Throwable) obj);
                break;
            default:
                this.f288189b.lambda$onSubscribe$0((Throwable) obj);
                break;
        }
    }
}
