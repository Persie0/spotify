package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes9.dex */
public final class tmk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g9t f221737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f221738b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f221739c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f221740d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nx4 f221741e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f221742f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ c9m f221743g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ uum0 f221744h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ jc20 f221745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(g9t g9tVar, int i, float f, float f2, nx4 nx4Var, boolean z, c9m c9mVar, uum0 uum0Var, jc20 jc20Var) {
        super(1);
        this.f221737a = g9tVar;
        this.f221738b = i;
        this.f221739c = f;
        this.f221740d = f2;
        this.f221741e = nx4Var;
        this.f221742f = z;
        this.f221743g = c9mVar;
        this.f221744h = uum0Var;
        this.f221745i = jc20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j = ((Offset) obj).f493a;
        g9t g9tVarM44134c = this.f221737a.m44134c(this.f221739c, this.f221740d, j, this.f221738b);
        this.f221741e.m65817c(g9tVarM44134c);
        if (this.f221742f && this.f221743g.m31961a()) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (((rp3) g9tVarM44134c.f77870a.get(this.f221738b)).f201408a & 4294967295L));
            uum0 uum0Var = this.f221744h;
            float fM84031v = uum0Var.m84031v();
            if (!Float.isNaN(fM84031v) && fM84031v != fIntBitsToFloat) {
                float fMin = Math.min(fM84031v, fIntBitsToFloat);
                float fMax = Math.max(fM84031v, fIntBitsToFloat);
                if (0.5f > fMin && 0.5f < fMax) {
                    ((ado0) this.f221745i).m25615a(9);
                }
            }
            uum0Var.m84032w(fIntBitsToFloat);
        }
        return w2a1.f247311a;
    }
}
