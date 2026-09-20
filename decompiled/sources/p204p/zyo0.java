package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zyo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f287642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f287643c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f287644d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f287645e;

    public /* synthetic */ zyo0(ozo0 ozo0Var, boolean z, long j, long j2, int i) {
        this.f287641a = i;
        this.f287642b = ozo0Var;
        this.f287643c = z;
        this.f287644d = j;
        this.f287645e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f287641a) {
            case 0:
                this.f287642b.mo36164P(this.f287644d, this.f287645e, this.f287643c);
                break;
            case 1:
                this.f287642b.mo28577d(this.f287644d, this.f287645e, this.f287643c);
                break;
            default:
                this.f287642b.mo28578n(this.f287644d, this.f287645e, this.f287643c);
                break;
        }
    }
}
