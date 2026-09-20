package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2677f implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagMaybeObserver f288185b;

    public /* synthetic */ C2677f(DogTagMaybeObserver dogTagMaybeObserver, int i) {
        this.f288184a = i;
        this.f288185b = dogTagMaybeObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288184a) {
            case 0:
                this.f288185b.lambda$onComplete$6((Throwable) obj);
                break;
            default:
                this.f288185b.lambda$onError$4((Throwable) obj);
                break;
        }
    }
}
