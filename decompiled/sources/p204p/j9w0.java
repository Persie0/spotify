package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j9w0 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f110261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f110262b;

    public j9w0(gh00 gh00Var, kqi0 kqi0Var) {
        this.f110261a = gh00Var;
        this.f110262b = kqi0Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        kqi0 kqi0Var = this.f110262b;
        if (((Boolean) kqi0Var.getValue()).booleanValue()) {
            return 0L;
        }
        Boolean bool = Boolean.TRUE;
        kqi0Var.setValue(bool);
        this.f110261a.invoke(bool);
        return 0L;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        kqi0 kqi0Var = this.f110262b;
        if (((Boolean) kqi0Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            kqi0Var.setValue(bool);
            this.f110261a.invoke(bool);
        }
        return new m5b1(0L);
    }
}
