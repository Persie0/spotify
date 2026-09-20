package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kid1 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ float f122932X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ gh00 f122933Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ rv41 f122934Z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kqi0 f122935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f122936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uum0 f122937c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uum0 f122938d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f122939e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uum0 f122940f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ uum0 f122941g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f122942h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f122943i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ float f122944t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kid1(kqi0 kqi0Var, kqi0 kqi0Var2, uum0 uum0Var, uum0 uum0Var2, uum0 uum0Var3, uum0 uum0Var4, uum0 uum0Var5, float f, int i, float f2, float f3, gh00 gh00Var, rv41 rv41Var) {
        super(3);
        this.f122935a = kqi0Var;
        this.f122936b = kqi0Var2;
        this.f122937c = uum0Var;
        this.f122938d = uum0Var2;
        this.f122939e = uum0Var3;
        this.f122940f = uum0Var4;
        this.f122941g = uum0Var5;
        this.f122942h = f;
        this.f122943i = i;
        this.f122944t = f2;
        this.f122932X = f3;
        this.f122933Y = gh00Var;
        this.f122934Z = rv41Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        uum0 uum0Var = this.f122938d;
        uum0 uum0Var2 = this.f122939e;
        kqi0 kqi0Var = this.f122935a;
        if (zBooleanValue) {
            boolean zBooleanValue2 = ((Boolean) kqi0Var.getValue()).booleanValue();
            uum0 uum0Var3 = this.f122941g;
            uum0 uum0Var4 = this.f122940f;
            uum0 uum0Var5 = this.f122937c;
            if (!zBooleanValue2) {
                Boolean bool = Boolean.TRUE;
                kqi0Var.setValue(bool);
                this.f122936b.setValue(bool);
                uum0Var5.m84032w(((Number) this.f122934Z.getValue()).floatValue() + fFloatValue2);
                uum0Var.m84032w(uum0Var2.m84031v());
                uum0Var4.m84032w(uum0Var3.m84031v());
            }
            float fM63436m = n0e1.m63436m(uum0Var2.m84031v() * fFloatValue, 1.0f, this.f122942h);
            uum0Var2.m84032w(fM63436m);
            float f = this.f122943i;
            float f2 = this.f122944t;
            float f3 = f * f2;
            float f4 = this.f122932X * f2;
            float f5 = (f3 - f4) / 2.0f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            float fM84031v = (((fM63436m / uum0Var.m84031v()) - 1.0f) * (uum0Var5.m84031v() - f5)) + uum0Var4.m84031v();
            float f6 = (((f4 * fM63436m) + f5) + f5) - f3;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            uum0Var3.m84032w(n0e1.m63436m(fM84031v, 0.0f, f6));
        } else {
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                float f7 = 100;
                int iM84031v = (int) (uum0Var.m84031v() * f7);
                int iM84031v2 = (int) (uum0Var2.m84031v() * f7);
                if (iM84031v != iM84031v2) {
                    this.f122933Y.invoke(new m7g0(iM84031v, iM84031v2));
                }
            }
            kqi0Var.setValue(Boolean.FALSE);
        }
        return w2a1.f247311a;
    }
}
