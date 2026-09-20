package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nzo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ozo0 f160128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f160129b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f160130c;

    public nzo0(ozo0 ozo0Var, float f, long j, long j2) {
        this.f160128a = ozo0Var;
        this.f160129b = f;
        this.f160130c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.f160129b;
        this.f160128a.mo49979J(this.f160130c, f);
    }
}
