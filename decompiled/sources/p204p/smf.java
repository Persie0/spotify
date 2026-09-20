package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class smf implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tmf f210645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw70 f210646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f210647c;

    public smf(tmf tmfVar, yw70 yw70Var, kqi0 kqi0Var) {
        this.f210645a = tmfVar;
        this.f210646b = yw70Var;
        this.f210647c = kqi0Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        tmf tmfVar = this.f210645a;
        boolean zBooleanValue = ((Boolean) tmfVar.f221680a.getValue()).booleanValue();
        boolean zMo28417d = this.f210646b.mo28417d();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        boolean z = i == 1;
        if (!zBooleanValue || zMo28417d || fIntBitsToFloat >= 0.0f || !z) {
            return 0L;
        }
        tmfVar.f221680a.setValue(Boolean.FALSE);
        ((eh00) this.f210647c.getValue()).invoke();
        return 0L;
    }
}
