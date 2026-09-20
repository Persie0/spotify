package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class l3d1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final zao f129296a;

    /* JADX INFO: renamed from: b */
    public final zao f129297b;

    /* JADX INFO: renamed from: c */
    public final a531 f129298c;

    /* JADX INFO: renamed from: d */
    public final n3d1 f129299d;

    /* JADX INFO: renamed from: e */
    public final hkh f129300e;

    /* JADX INFO: renamed from: f */
    public final f3d1 f129301f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f129302g;

    public l3d1(zao zaoVar, zao zaoVar2, a531 a531Var, n3d1 n3d1Var, hkh hkhVar, f3d1 f3d1Var) {
        this.f129296a = zaoVar;
        this.f129297b = zaoVar2;
        this.f129298c = a531Var;
        this.f129299d = n3d1Var;
        this.f129300e = hkhVar;
        this.f129301f = f3d1Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f129302g = new pfm0(new qfm0[]{new q040(xgg1.m90764b6(), xoc1.f263904I1, null), new zox(), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m58002c(l3d1 l3d1Var, kqq0 kqq0Var, String str, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(969844995);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(kqq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(l3d1Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            mif1.m61869b((ry8) l3d1Var.f129297b.get(), new u1d1(2, kqq0Var.getTitle(), kqq0Var.m57121g(), kqq0Var.m57120c(), str), null, null, xq00Var, 8, 12);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(l3d1Var, kqq0Var, str, i, 21);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f129302g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f129300e.m47840a(tky.m81027c(new v4a0[0], new s481(this, null, 10)), rkk.m75763o(new h3d1(this, 1), true, 473589517), new u5a0(new j3d1(this), nub1.f158573a1, pqq0.f180379X0), new hlh(null, null, null, false, 63));
    }
}
