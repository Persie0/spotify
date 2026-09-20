package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2678g implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagObserver f288187b;

    public /* synthetic */ C2678g(DogTagObserver dogTagObserver, int i) {
        this.f288186a = i;
        this.f288187b = dogTagObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288186a) {
            case 0:
                this.f288187b.lambda$onSubscribe$0((Throwable) obj);
                break;
            case 1:
                this.f288187b.lambda$onNext$2((Throwable) obj);
                break;
            default:
                this.f288187b.lambda$onComplete$6((Throwable) obj);
                break;
        }
    }
}
