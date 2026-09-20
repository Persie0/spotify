package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class m8c implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f141015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f141016b;

    public m8c(gh00 gh00Var, kqi0 kqi0Var) {
        this.f141015a = gh00Var;
        this.f141016b = kqi0Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        kqi0 kqi0Var = this.f141016b;
        if (((Boolean) kqi0Var.getValue()).booleanValue()) {
            return 0L;
        }
        Boolean bool = Boolean.TRUE;
        this.f141015a.invoke(bool);
        kqi0Var.setValue(bool);
        return 0L;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        this.f141015a.invoke(Boolean.FALSE);
        return new m5b1(0L);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) {
        this.f141016b.setValue(Boolean.FALSE);
        return new m5b1(0L);
    }
}
