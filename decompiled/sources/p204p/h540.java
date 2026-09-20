package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes9.dex */
public final class h540 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f87720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f87721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f87722c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f87723d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f87724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f87725f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ uum0 f87726g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ uum0 f87727h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ uum0 f87728i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h540(eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, float f, float f2, float f3, uum0 uum0Var, uum0 uum0Var2, uum0 uum0Var3) {
        super(4);
        this.f87720a = eh00Var;
        this.f87721b = eh00Var2;
        this.f87722c = eh00Var3;
        this.f87723d = f;
        this.f87724e = f2;
        this.f87725f = f3;
        this.f87726g = uum0Var;
        this.f87727h = uum0Var2;
        this.f87728i = uum0Var3;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        long j = ((Offset) obj).f493a;
        long j2 = ((Offset) obj2).f493a;
        float fFloatValue = ((Number) obj3).floatValue();
        ((Number) obj4).floatValue();
        uum0 uum0Var = this.f87726g;
        float fM63436m = n0e1.m63436m(uum0Var.m84031v() * fFloatValue, 1.0f, 5.0f);
        if (fM63436m > uum0Var.m84031v()) {
            this.f87720a.invoke();
        } else if (fM63436m < uum0Var.m84031v()) {
            this.f87721b.invoke();
        } else if (!Offset.m253c(j2, 0L)) {
            this.f87722c.invoke();
        }
        float fM84031v = fM63436m / uum0Var.m84031v();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        uum0 uum0Var2 = this.f87727h;
        float f = 1 - fM84031v;
        float fM84031v2 = (fIntBitsToFloat - uum0Var2.m84031v()) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        uum0 uum0Var3 = this.f87728i;
        float fM84031v3 = (fIntBitsToFloat2 - uum0Var3.m84031v()) * f;
        float f2 = this.f87723d * fM63436m;
        float f3 = this.f87724e;
        float f4 = f2 - f3;
        float f5 = (this.f87725f * fM63436m) - f3;
        uum0Var.m84032w(fM63436m);
        uum0Var2.m84032w(n0e1.m63436m(Float.intBitsToFloat((int) (j2 >> 32)) + uum0Var2.m84031v() + fM84031v2, Math.min(-f4, f4), 0.0f));
        uum0Var3.m84032w(n0e1.m63436m(Float.intBitsToFloat((int) (j2 & 4294967295L)) + uum0Var3.m84031v() + fM84031v3, Math.min(-f5, f5), 0.0f));
        return w2a1.f247311a;
    }
}
