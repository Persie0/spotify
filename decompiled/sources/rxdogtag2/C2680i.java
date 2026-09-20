package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2680i implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagSubscriber f288191b;

    public /* synthetic */ C2680i(DogTagSubscriber dogTagSubscriber, int i) {
        this.f288190a = i;
        this.f288191b = dogTagSubscriber;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288190a) {
            case 0:
                this.f288191b.lambda$onComplete$6((Throwable) obj);
                break;
            default:
                this.f288191b.lambda$onError$4((Throwable) obj);
                break;
        }
    }
}
