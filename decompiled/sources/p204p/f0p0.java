package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0p0 extends ma9 {

    /* JADX INFO: renamed from: r1 */
    public static final /* synthetic */ qr60[] f64695r1 = {new spi0(f0p0.class, "hasStarted", "getHasStarted()Z", 0)};

    /* JADX INFO: renamed from: n1 */
    public final et0 f64696n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f64697o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f64698p1;

    /* JADX INFO: renamed from: q1 */
    public final pc0 f64699q1;

    public f0p0(et0 et0Var) {
        super(et0Var.f62535a, et0Var.f62536b);
        this.f64696n1 = et0Var;
        this.f64699q1 = new pc0(this);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m40496W(f0p0 f0p0Var, om0 om0Var, qm0 qm0Var, String str, Long l, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        f0p0Var.m40499V(om0Var, qm0Var, str, l, str2, str3);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public void mo29149G(long j, long j2) {
        this.f141517Y0 = true;
        qr60[] qr60VarArr = f64695r1;
        qr60 qr60Var = qr60VarArr[0];
        pc0 pc0Var = this.f64699q1;
        if (!((Boolean) pc0Var.f61172a).booleanValue()) {
            pc0Var.m39516c(qr60VarArr[0], this, Boolean.TRUE);
            mo40498U(m40497T());
        }
        this.f64697o1 = false;
    }

    @Override // p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: M */
    public void mo29150M(long j, long j2) {
        super.mo29150M(j, j2);
        this.f64697o1 = true;
    }

    @Override // p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public void mo25537Q(clq clqVar, int i, long j, long j2) {
        super.mo25537Q(clqVar, i, j, j2);
        this.f64699q1.m39516c(f64695r1[0], this, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: T */
    public final long m40497T() {
        d5u0 d5u0Var = (d5u0) g6f.m43689C0(this.f141531f1);
        if (d5u0Var != null) {
            return d5u0Var.f45495f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: V */
    public final void m40499V(om0 om0Var, qm0 qm0Var, String str, Long l, String str2, String str3) {
        if (this.f64698p1) {
            om0.m67311c(om0Var, qm0Var, str, l, str2, null, null, str3, 16);
        }
    }

    @Override // p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: m */
    public final void mo25538m(long j, long j2) {
        super.mo25538m(j, j2);
        qr60[] qr60VarArr = f64695r1;
        qr60 qr60Var = qr60VarArr[0];
        pc0 pc0Var = this.f64699q1;
        if (((Boolean) pc0Var.f61172a).booleanValue() || !this.f64696n1.f62536b.f156768c) {
            return;
        }
        pc0Var.m39516c(qr60VarArr[0], this, Boolean.TRUE);
        mo40498U(j);
    }

    /* JADX INFO: renamed from: U */
    public void mo40498U(long j) {
    }
}
