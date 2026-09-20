package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ih71 {

    /* JADX INFO: renamed from: a */
    public final int f102191a;

    /* JADX INFO: renamed from: b */
    public final long f102192b;

    /* JADX INFO: renamed from: c */
    public final long f102193c;

    /* JADX INFO: renamed from: d */
    public final exh0 f102194d;

    /* JADX INFO: renamed from: e */
    public final gh00 f102195e;

    /* JADX INFO: renamed from: f */
    public ih71 f102196f;

    /* JADX INFO: renamed from: g */
    public long f102197g;

    /* JADX INFO: renamed from: h */
    public long f102198h;

    /* JADX INFO: renamed from: i */
    public long f102199i = Long.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public long f102200j = -1;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ jh71 f102201k;

    public ih71(jh71 jh71Var, int i, long j, long j2, exh0 exh0Var, gh00 gh00Var) {
        this.f102201k = jh71Var;
        this.f102191a = i;
        this.f102192b = j;
        this.f102193c = j2;
        this.f102194d = exh0Var;
        this.f102195e = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m50585a(long j, long j2, long j3, long j4, float[] fArr) {
        o0w0 o0w0VarM68222o = oxg1.m68222o(j, j2, j3, j4, this.f102201k.f112353f, this.f102194d, fArr);
        if (o0w0VarM68222o == null) {
            return;
        }
        this.f102195e.invoke(o0w0VarM68222o);
    }

    /* JADX INFO: renamed from: b */
    public final void m50586b() {
        jh71 jh71Var = this.f102201k;
        toi0 toi0Var = jh71Var.f112348a;
        int i = this.f102191a;
        ih71 ih71Var = (ih71) toi0Var.m81199g(i);
        if (ih71Var != null) {
            if (ih71Var.equals(this)) {
                ih71 ih71Var2 = this.f102196f;
                this.f102196f = null;
                if (ih71Var2 == null) {
                    lp70 lp70VarM88319I = wjg1.m88319I(this.f102194d.f63770a);
                    if (lp70VarM88319I.f135681g) {
                        ((oz3) op70.m67517a(lp70VarM88319I)).getRectManager().f251756b.m86283g(lp70VarM88319I.f135671b, false);
                        return;
                    }
                    return;
                }
                int iM81196d = toi0Var.m81196d(i);
                Object[] objArr = toi0Var.f247488c;
                Object obj = objArr[iM81196d];
                toi0Var.f247487b[iM81196d] = i;
                objArr[iM81196d] = ih71Var2;
                return;
            }
            int iM81196d2 = toi0Var.m81196d(i);
            Object[] objArr2 = toi0Var.f247488c;
            Object obj2 = objArr2[iM81196d2];
            toi0Var.f247487b[iM81196d2] = i;
            objArr2[iM81196d2] = ih71Var;
            while (true) {
                ih71 ih71Var3 = ih71Var.f102196f;
                if (ih71Var3 == null) {
                    break;
                }
                if (ih71Var3 == this) {
                    ih71Var.f102196f = this.f102196f;
                    this.f102196f = null;
                    return;
                }
                ih71Var = ih71Var3;
            }
        }
        ih71 ih71Var4 = jh71Var.f112349b;
        if (ih71Var4 == this) {
            jh71Var.f112349b = ih71Var4.f102196f;
            this.f102196f = null;
            return;
        }
        ih71 ih71Var5 = ih71Var4 != null ? ih71Var4.f102196f : null;
        while (true) {
            ih71 ih71Var6 = ih71Var4;
            ih71Var4 = ih71Var5;
            if (ih71Var4 == null) {
                return;
            }
            if (ih71Var4 == this) {
                if (ih71Var6 != null) {
                    ih71Var6.f102196f = ih71Var4.f102196f;
                }
                this.f102196f = null;
                return;
            }
            ih71Var5 = ih71Var4.f102196f;
        }
    }
}
