package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138400a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f138401b;

    public lzo0(ozo0 ozo0Var, int i, long j, long j2) {
        this.f138400a = 1;
        this.f138401b = ozo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f138400a) {
            case 0:
                this.f138401b.getClass();
                break;
            case 1:
                this.f138401b.getClass();
                break;
            case 2:
                this.f138401b.mo40619f();
                break;
            default:
                this.f138401b.mo40621x();
                break;
        }
    }

    public /* synthetic */ lzo0(ozo0 ozo0Var, long j, long j2, int i) {
        this.f138400a = i;
        this.f138401b = ozo0Var;
    }

    public lzo0(ozo0 ozo0Var, kez0 kez0Var, long j) {
        this.f138400a = 0;
        this.f138401b = ozo0Var;
    }
}
