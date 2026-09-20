package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class oa31 {

    /* JADX INFO: renamed from: a */
    public sa31 f163201a;

    /* JADX INFO: renamed from: b */
    public long f163202b;

    /* JADX INFO: renamed from: c */
    public boolean f163203c;

    /* JADX INFO: renamed from: d */
    public int f163204d;

    static {
        new lb5(26);
    }

    public oa31(long j, sa31 sa31Var) {
        int iM82815a;
        int iNumberOfTrailingZeros;
        this.f163201a = sa31Var;
        this.f163202b = j;
        u9y0 u9y0Var = ua31.f228349a;
        if (j != 0) {
            sa31 sa31VarMo28815d = mo28815d();
            long j2 = sa31VarMo28815d.f207128c;
            long[] jArr = sa31VarMo28815d.f207129d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = sa31VarMo28815d.f207127b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = sa31VarMo28815d.f207126a;
                    if (j4 != 0) {
                        j2 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (ua31.f228351c) {
                iM82815a = ua31.f228354f.m82815a(j);
            }
        } else {
            iM82815a = -1;
        }
        this.f163204d = iM82815a;
    }

    /* JADX INFO: renamed from: q */
    public static void m66513q(oa31 oa31Var) {
        ua31.f228350b.m27480p(oa31Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m66514a() {
        synchronized (ua31.f228351c) {
            mo51382b();
            mo51383p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo51382b() {
        ua31.f228352d = ua31.f228352d.m77606b(mo28818g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo28814c();

    /* JADX INFO: renamed from: d */
    public sa31 mo28815d() {
        return this.f163201a;
    }

    /* JADX INFO: renamed from: e */
    public abstract gh00 mo28816e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo28817f();

    /* JADX INFO: renamed from: g */
    public long mo28818g() {
        return this.f163202b;
    }

    /* JADX INFO: renamed from: h */
    public int mo28819h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract gh00 mo28820i();

    /* JADX INFO: renamed from: j */
    public final oa31 m66515j() {
        ay21 ay21Var = ua31.f228350b;
        oa31 oa31Var = (oa31) ay21Var.m27471g();
        ay21Var.m27480p(this);
        return oa31Var;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo28821k();

    /* JADX INFO: renamed from: l */
    public abstract void mo28822l();

    /* JADX INFO: renamed from: m */
    public abstract void mo28823m();

    /* JADX INFO: renamed from: n */
    public abstract void mo28824n(vw41 vw41Var);

    /* JADX INFO: renamed from: o */
    public final void m66516o() {
        int i = this.f163204d;
        if (i >= 0) {
            ua31.f228354f.m82821i(i);
            this.f163204d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo51383p() {
        m66516o();
    }

    /* JADX INFO: renamed from: r */
    public void mo28825r(sa31 sa31Var) {
        this.f163201a = sa31Var;
    }

    /* JADX INFO: renamed from: s */
    public void mo28826s(long j) {
        this.f163202b = j;
    }

    /* JADX INFO: renamed from: t */
    public void mo28827t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract oa31 mo28828u(gh00 gh00Var);
}
