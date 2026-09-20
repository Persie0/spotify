package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class m3d1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final zao f139611a;

    /* JADX INFO: renamed from: b */
    public final zao f139612b;

    /* JADX INFO: renamed from: c */
    public final a531 f139613c;

    /* JADX INFO: renamed from: d */
    public final o3d1 f139614d;

    /* JADX INFO: renamed from: e */
    public final hkh f139615e;

    /* JADX INFO: renamed from: f */
    public final f3d1 f139616f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f139617g;

    public m3d1(zao zaoVar, zao zaoVar2, a531 a531Var, o3d1 o3d1Var, hkh hkhVar, f3d1 f3d1Var) {
        this.f139611a = zaoVar;
        this.f139612b = zaoVar2;
        this.f139613c = a531Var;
        this.f139614d = o3d1Var;
        this.f139615e = hkhVar;
        this.f139616f = f3d1Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f139617g = new pfm0(new qfm0[]{new q040(xgg1.m90764b6(), xoc1.f263904I1, null), new zox(), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m60662c(m3d1 m3d1Var, kqq0 kqq0Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1247912958);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(kqq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(m3d1Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            mif1.m61869b((ry8) m3d1Var.f139612b.get(), new u1d1(2, kqq0Var.getTitle(), kqq0Var.m57121g(), kqq0Var.m57120c(), str), null, null, xq00Var, 8, 12);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(m3d1Var, kqq0Var, str, i, 22);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f139617g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f139615e.m47840a(tky.m81027c(new v4a0[0], new s481(this, null, 11)), rkk.m75763o(new i3d1(this, 1), true, -1744168436), new u5a0(new k3d1(this), nub1.f158575b1, crq0.f41354W0), new hlh(null, null, null, false, 63));
    }
}
