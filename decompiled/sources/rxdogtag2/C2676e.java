package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2676e implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagMaybeObserver f288183b;

    public /* synthetic */ C2676e(DogTagMaybeObserver dogTagMaybeObserver, int i) {
        this.f288182a = i;
        this.f288183b = dogTagMaybeObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288182a) {
            case 0:
                this.f288183b.lambda$onSuccess$2((Throwable) obj);
                break;
            default:
                this.f288183b.lambda$onSubscribe$0((Throwable) obj);
                break;
        }
    }
}
