package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f54703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f54704c;

    public /* synthetic */ dzo0(ozo0 ozo0Var, long j, int i) {
        this.f54702a = i;
        this.f54703b = ozo0Var;
        this.f54704c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54702a) {
            case 0:
                this.f54703b.mo61274g(this.f54704c);
                break;
            case 1:
                this.f54703b.mo40616D(this.f54704c);
                break;
            default:
                this.f54703b.mo40618b(this.f54704c);
                break;
        }
    }

    public dzo0(ozo0 ozo0Var, long j, long j2) {
        this.f54702a = 0;
        this.f54703b = ozo0Var;
        this.f54704c = j;
    }
}
