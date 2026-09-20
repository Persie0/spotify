package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class txy extends exh0 implements kvm0 {

    /* JADX INFO: renamed from: M0 */
    public float f224786M0;

    @Override // p204p.kvm0
    /* JADX INFO: renamed from: e */
    public final Object mo25924e(yqq yqqVar, Object obj) {
        hox0 hox0Var = obj instanceof hox0 ? (hox0) obj : null;
        if (hox0Var == null) {
            hox0Var = new hox0();
        }
        slz slzVar = hox0Var.f93648d;
        if (slzVar == null) {
            float f = this.f224786M0;
            slzVar = new slz();
            slzVar.f210524a = f;
        }
        hox0Var.f93648d = slzVar;
        slzVar.f210524a = this.f224786M0;
        return hox0Var;
    }
}
