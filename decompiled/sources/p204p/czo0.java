package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class czo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f43602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f43603c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f43604d;

    public /* synthetic */ czo0(ozo0 ozo0Var, long j, long j2, int i) {
        this.f43601a = i;
        this.f43602b = ozo0Var;
        this.f43603c = j;
        this.f43604d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43601a) {
            case 0:
                this.f43602b.mo61276z(this.f43603c, this.f43604d);
                break;
            case 1:
                this.f43602b.mo25534H(this.f43603c, this.f43604d);
                break;
            case 2:
                this.f43602b.mo61270A(this.f43603c, this.f43604d);
                break;
            case 3:
                this.f43602b.mo33818j(this.f43603c, this.f43604d);
                break;
            case 4:
                this.f43602b.mo29150M(this.f43603c, this.f43604d);
                break;
            case 5:
                this.f43602b.mo29151R(this.f43603c, this.f43604d);
                break;
            case 6:
                this.f43602b.mo25538m(this.f43603c, this.f43604d);
                break;
            default:
                this.f43602b.mo29149G(this.f43603c, this.f43604d);
                break;
        }
    }

    public czo0(ozo0 ozo0Var, long j, long j2, long j3, long j4) {
        this.f43601a = 0;
        this.f43602b = ozo0Var;
        this.f43603c = j2;
        this.f43604d = j3;
    }
}
