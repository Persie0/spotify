package rxdogtag2;

/* JADX INFO: renamed from: rxdogtag2.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2681j implements RxDogTag.NonCheckingConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DogTagSubscriber f288193b;

    public /* synthetic */ C2681j(DogTagSubscriber dogTagSubscriber, int i) {
        this.f288192a = i;
        this.f288193b = dogTagSubscriber;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        switch (this.f288192a) {
            case 0:
                this.f288193b.lambda$onNext$2((Throwable) obj);
                break;
            default:
                this.f288193b.lambda$onSubscribe$0((Throwable) obj);
                break;
        }
    }
}
