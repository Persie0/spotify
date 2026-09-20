package p204p;

import androidx.compose.p002ui.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class fdx0 implements yqq {

    /* JADX INFO: renamed from: L0 */
    public long f68592L0;

    /* JADX INFO: renamed from: M0 */
    public ch01 f68593M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f68594N0;

    /* JADX INFO: renamed from: O0 */
    public int f68595O0;

    /* JADX INFO: renamed from: P0 */
    public long f68596P0;

    /* JADX INFO: renamed from: Q0 */
    public yqq f68597Q0;

    /* JADX INFO: renamed from: R0 */
    public ko70 f68598R0;

    /* JADX INFO: renamed from: S0 */
    public zjw0 f68599S0;

    /* JADX INFO: renamed from: T0 */
    public ColorFilter f68600T0;

    /* JADX INFO: renamed from: U0 */
    public int f68601U0;

    /* JADX INFO: renamed from: V0 */
    public ncg1 f68602V0;

    /* JADX INFO: renamed from: X */
    public float f68603X;

    /* JADX INFO: renamed from: Y */
    public float f68604Y;

    /* JADX INFO: renamed from: Z */
    public float f68605Z;

    /* JADX INFO: renamed from: a */
    public int f68606a;

    /* JADX INFO: renamed from: b */
    public float f68607b = 1.0f;

    /* JADX INFO: renamed from: c */
    public float f68608c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f68609d = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f68610e;

    /* JADX INFO: renamed from: f */
    public float f68611f;

    /* JADX INFO: renamed from: g */
    public float f68612g;

    /* JADX INFO: renamed from: h */
    public long f68613h;

    /* JADX INFO: renamed from: i */
    public long f68614i;

    /* JADX INFO: renamed from: t */
    public float f68615t;

    public fdx0() {
        long j = vx10.f245601a;
        this.f68613h = j;
        this.f68614i = j;
        this.f68605Z = 8.0f;
        int i = i591.f98850c;
        this.f68592L0 = bul.m30569u();
        this.f68593M0 = kxf1.f127485a;
        this.f68595O0 = 0;
        this.f68596P0 = 9205357640488583168L;
        this.f68597Q0 = y85.m93056a(1.0f);
        this.f68598R0 = ko70.f124556a;
        this.f68601U0 = 3;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f68597Q0.mo24617W0();
    }

    /* JADX INFO: renamed from: a */
    public final void m41379a() {
        m41390m(1.0f);
        m41391o(1.0f);
        m41380b(1.0f);
        m41396v(0.0f);
        m41397w(0.0f);
        m41392p(0.0f);
        long j = vx10.f245601a;
        m41381c(j);
        m41394s(j);
        m41387i(0.0f);
        m41388k(0.0f);
        m41389l(0.0f);
        m41383e(8.0f);
        int i = i591.f98850c;
        m41395u(bul.m30569u());
        m41393r(kxf1.f127485a);
        m41384f(false);
        m41386h(null);
        if (!wj50.m88271j(this.f68600T0, null)) {
            this.f68606a |= 262144;
            this.f68600T0 = null;
        }
        m41382d(3);
        m41385g(0);
        this.f68596P0 = 9205357640488583168L;
        this.f68602V0 = null;
        this.f68606a = 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m41380b(float f) {
        if (this.f68609d == f) {
            return;
        }
        this.f68606a |= 4;
        this.f68609d = f;
    }

    /* JADX INFO: renamed from: c */
    public final void m41381c(long j) {
        long j2 = this.f68613h;
        int i = n6f.f150872l;
        if (as91.m27074b(j2, j)) {
            return;
        }
        this.f68606a |= 64;
        this.f68613h = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m41382d(int i) {
        if (ftg1.m42662v(this.f68601U0, i)) {
            return;
        }
        this.f68606a |= 524288;
        this.f68601U0 = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m41383e(float f) {
        if (this.f68605Z == f) {
            return;
        }
        this.f68606a |= 2048;
        this.f68605Z = f;
    }

    /* JADX INFO: renamed from: f */
    public final void m41384f(boolean z) {
        if (this.f68594N0 != z) {
            this.f68606a |= 16384;
            this.f68594N0 = z;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m41385g(int i) {
        if (nqg1.m65438l(this.f68595O0, i)) {
            return;
        }
        this.f68606a |= 32768;
        this.f68595O0 = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m41386h(zjw0 zjw0Var) {
        if (wj50.m88271j(this.f68599S0, zjw0Var)) {
            return;
        }
        this.f68606a |= 131072;
        this.f68599S0 = zjw0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m41387i(float f) {
        if (this.f68615t == f) {
            return;
        }
        this.f68606a |= 256;
        this.f68615t = f;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f68597Q0.mo24619j();
    }

    /* JADX INFO: renamed from: k */
    public final void m41388k(float f) {
        if (this.f68603X == f) {
            return;
        }
        this.f68606a |= 512;
        this.f68603X = f;
    }

    /* JADX INFO: renamed from: l */
    public final void m41389l(float f) {
        if (this.f68604Y == f) {
            return;
        }
        this.f68606a |= 1024;
        this.f68604Y = f;
    }

    /* JADX INFO: renamed from: m */
    public final void m41390m(float f) {
        if (this.f68607b == f) {
            return;
        }
        this.f68606a |= 1;
        this.f68607b = f;
    }

    /* JADX INFO: renamed from: o */
    public final void m41391o(float f) {
        if (this.f68608c == f) {
            return;
        }
        this.f68606a |= 2;
        this.f68608c = f;
    }

    /* JADX INFO: renamed from: p */
    public final void m41392p(float f) {
        if (this.f68612g == f) {
            return;
        }
        this.f68606a |= 32;
        this.f68612g = f;
    }

    /* JADX INFO: renamed from: r */
    public final void m41393r(ch01 ch01Var) {
        if (wj50.m88271j(this.f68593M0, ch01Var)) {
            return;
        }
        this.f68606a |= 8192;
        this.f68593M0 = ch01Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m41394s(long j) {
        long j2 = this.f68614i;
        int i = n6f.f150872l;
        if (as91.m27074b(j2, j)) {
            return;
        }
        this.f68606a |= 128;
        this.f68614i = j;
    }

    /* JADX INFO: renamed from: u */
    public final void m41395u(long j) {
        if (i591.m49768a(this.f68592L0, j)) {
            return;
        }
        this.f68606a |= 4096;
        this.f68592L0 = j;
    }

    /* JADX INFO: renamed from: v */
    public final void m41396v(float f) {
        if (this.f68610e == f) {
            return;
        }
        this.f68606a |= 8;
        this.f68610e = f;
    }

    /* JADX INFO: renamed from: w */
    public final void m41397w(float f) {
        if (this.f68611f == f) {
            return;
        }
        this.f68606a |= 16;
        this.f68611f = f;
    }
}
