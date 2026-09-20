package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f148744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f148745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f148746d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f148747e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f148748f;

    public /* synthetic */ mzo0(ozo0 ozo0Var, long j, long j2, boolean z, long j3, int i) {
        this.f148743a = i;
        this.f148744b = ozo0Var;
        this.f148745c = j;
        this.f148746d = j2;
        this.f148747e = z;
        this.f148748f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f148743a) {
            case 0:
                boolean z = this.f148747e;
                this.f148744b.mo36174l(this.f148745c, this.f148746d, this.f148748f, z);
                break;
            default:
                boolean z2 = this.f148747e;
                this.f148744b.mo36175p(this.f148745c, this.f148746d, this.f148748f, z2);
                break;
        }
    }
}
