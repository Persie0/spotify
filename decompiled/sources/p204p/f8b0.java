package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f8b0 implements rv41 {

    /* JADX INFO: renamed from: L0 */
    public final rtq f66935L0;

    /* JADX INFO: renamed from: M0 */
    public final bri0 f66936M0;

    /* JADX INFO: renamed from: X */
    public final yum0 f66937X;

    /* JADX INFO: renamed from: Y */
    public final yum0 f66938Y;

    /* JADX INFO: renamed from: Z */
    public final rtq f66939Z;

    /* JADX INFO: renamed from: a */
    public final yum0 f66940a;

    /* JADX INFO: renamed from: b */
    public final yum0 f66941b;

    /* JADX INFO: renamed from: c */
    public final yum0 f66942c;

    /* JADX INFO: renamed from: d */
    public final yum0 f66943d;

    /* JADX INFO: renamed from: e */
    public final yum0 f66944e;

    /* JADX INFO: renamed from: f */
    public final yum0 f66945f;

    /* JADX INFO: renamed from: g */
    public final yum0 f66946g;

    /* JADX INFO: renamed from: h */
    public final rtq f66947h;

    /* JADX INFO: renamed from: i */
    public final yum0 f66948i;

    /* JADX INFO: renamed from: t */
    public final yum0 f66949t;

    public f8b0() {
        Boolean bool = Boolean.FALSE;
        this.f66940a = sam.m77645B(bool);
        this.f66941b = sam.m77645B(1);
        this.f66942c = sam.m77645B(1);
        this.f66943d = sam.m77645B(bool);
        this.f66944e = sam.m77645B(null);
        this.f66945f = sam.m77645B(Float.valueOf(1.0f));
        this.f66946g = sam.m77645B(bool);
        this.f66947h = sam.m77674m(new ui1(this, 7));
        this.f66948i = sam.m77645B(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.f66949t = sam.m77645B(fValueOf);
        this.f66937X = sam.m77645B(fValueOf);
        this.f66938Y = sam.m77645B(Long.MIN_VALUE);
        this.f66939Z = sam.m77674m(new ui1(this, 6));
        this.f66935L0 = sam.m77674m(new ui1(this, 8));
        this.f66936M0 = new bri0();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m41022a(f8b0 f8b0Var, int i, long j) {
        u8b0 u8b0VarM41025d = f8b0Var.m41025d();
        yum0 yum0Var = f8b0Var.f66949t;
        rtq rtqVar = f8b0Var.f66947h;
        yum0 yum0Var2 = f8b0Var.f66938Y;
        if (u8b0VarM41025d == null) {
            return true;
        }
        long jLongValue = ((Number) yum0Var2.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) yum0Var2.getValue()).longValue();
        yum0Var2.setValue(Long.valueOf(j));
        t8b0 t8b0VarM41024c = f8b0Var.m41024c();
        float fMo74978b = t8b0VarM41024c != null ? t8b0VarM41024c.mo74978b(u8b0VarM41025d) : 0.0f;
        t8b0 t8b0VarM41024c2 = f8b0Var.m41024c();
        float fMo74977a = t8b0VarM41024c2 != null ? t8b0VarM41024c2.mo74977a(u8b0VarM41025d) : 1.0f;
        float fFloatValue = ((Number) rtqVar.getValue()).floatValue() * ((jLongValue / ((long) 1000000)) / u8b0VarM41025d.m82567b());
        float fFloatValue2 = ((Number) rtqVar.getValue()).floatValue() < 0.0f ? fMo74978b - (((Number) yum0Var.getValue()).floatValue() + fFloatValue) : (((Number) yum0Var.getValue()).floatValue() + fFloatValue) - fMo74977a;
        if (fFloatValue2 < 0.0f) {
            f8b0Var.m41032o(n0e1.m63436m(((Number) yum0Var.getValue()).floatValue(), fMo74978b, fMo74977a) + fFloatValue);
            return true;
        }
        float f = fMo74977a - fMo74978b;
        int i2 = (int) (fFloatValue2 / f);
        int i3 = i2 + 1;
        if (f8b0Var.m41027f() + i3 > i) {
            f8b0Var.m41032o(f8b0Var.m41026e());
            f8b0Var.m41031n(i);
            return false;
        }
        f8b0Var.m41031n(f8b0Var.m41027f() + i3);
        float f2 = fFloatValue2 - (i2 * f);
        f8b0Var.m41032o(((Number) rtqVar.getValue()).floatValue() < 0.0f ? fMo74977a - f2 : fMo74978b + f2);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m41023b(f8b0 f8b0Var, boolean z) {
        f8b0Var.f66940a.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public final t8b0 m41024c() {
        return (t8b0) this.f66944e.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final u8b0 m41025d() {
        return (u8b0) this.f66948i.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final float m41026e() {
        return ((Number) this.f66939Z.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m41027f() {
        return ((Number) this.f66941b.getValue()).intValue();
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return Float.valueOf(m41028i());
    }

    /* JADX INFO: renamed from: i */
    public final float m41028i() {
        return ((Number) this.f66937X.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: j */
    public final float m41029j() {
        return ((Number) this.f66945f.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m41030m() {
        return ((Boolean) this.f66935L0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m41031n(int i) {
        this.f66941b.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public final void m41032o(float f) {
        u8b0 u8b0VarM41025d;
        this.f66949t.setValue(Float.valueOf(f));
        if (((Boolean) this.f66946g.getValue()).booleanValue() && (u8b0VarM41025d = m41025d()) != null) {
            f -= f % (1 / u8b0VarM41025d.f227895n);
        }
        this.f66937X.setValue(Float.valueOf(f));
    }
}
