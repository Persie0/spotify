package p204p;

import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o09 implements iap0 {

    /* JADX INFO: renamed from: L0 */
    public boolean f160278L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f160279M0;

    /* JADX INFO: renamed from: O0 */
    public vsd0 f160281O0;

    /* JADX INFO: renamed from: Q0 */
    public req f160283Q0;

    /* JADX INFO: renamed from: X */
    public long f160284X;

    /* JADX INFO: renamed from: Y */
    public long f160285Y;

    /* JADX INFO: renamed from: b */
    public final int f160288b;

    /* JADX INFO: renamed from: d */
    public qkw0 f160290d;

    /* JADX INFO: renamed from: e */
    public int f160291e;

    /* JADX INFO: renamed from: f */
    public w9p0 f160292f;

    /* JADX INFO: renamed from: g */
    public gh61 f160293g;

    /* JADX INFO: renamed from: h */
    public int f160294h;

    /* JADX INFO: renamed from: i */
    public p1y0 f160295i;

    /* JADX INFO: renamed from: t */
    public r300[] f160296t;

    /* JADX INFO: renamed from: a */
    public final Object f160287a = new Object();

    /* JADX INFO: renamed from: c */
    public final xyx f160289c = new xyx(7);

    /* JADX INFO: renamed from: Z */
    public long f160286Z = Long.MIN_VALUE;

    /* JADX INFO: renamed from: N0 */
    public qp71 f160280N0 = qp71.f191180a;

    /* JADX INFO: renamed from: P0 */
    public long f160282P0 = -9223372036854775807L;

    public o09(int i) {
        this.f160288b = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m65984a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m65985u(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final int m65987G(xyx xyxVar, iro iroVar, int i) {
        boolean z = (i & 1) != 0;
        p1y0 p1y0Var = this.f160295i;
        p1y0Var.getClass();
        int iMo41643a = p1y0Var.mo41643a(xyxVar, iroVar, i);
        if (iMo41643a == -4) {
            if (iroVar.m67519d(4)) {
                if (!z) {
                    this.f160286Z = Long.MIN_VALUE;
                }
                return this.f160278L0 ? -4 : -3;
            }
            long j = iroVar.f105020f + this.f160284X;
            iroVar.f105020f = j;
            if (!z) {
                this.f160286Z = Math.max(this.f160286Z, j);
                return iMo41643a;
            }
        } else if (iMo41643a == -5) {
            r300 r300Var = (r300) xyxVar.f267437c;
            r300Var.getClass();
            long j2 = r300Var.f195392u;
            if (j2 != Long.MAX_VALUE) {
                p300 p300VarM74564a = r300Var.m74564a();
                p300VarM74564a.f173532t = j2 + this.f160284X;
                xyxVar.f267437c = new r300(p300VarM74564a);
            }
        }
        return iMo41643a;
    }

    /* JADX INFO: renamed from: H */
    public final void m65988H() {
        c95.m31855u(this.f160294h == 0);
        mo804A();
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo813I(long j, long j2);

    /* JADX INFO: renamed from: J */
    public final void m65989J(r300[] r300VarArr, p1y0 p1y0Var, long j, long j2, vsd0 vsd0Var) {
        c95.m31855u(!this.f160278L0);
        this.f160295i = p1y0Var;
        this.f160281O0 = vsd0Var;
        m65997U();
        if (this.f160286Z == Long.MIN_VALUE) {
            this.f160286Z = j;
        }
        this.f160296t = r300VarArr;
        this.f160284X = j2;
        mo810E(r300VarArr, j, j2, vsd0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m65990K() {
        c95.m31855u(this.f160294h == 0);
        this.f160289c.m92431i();
        mo806B();
    }

    /* JADX INFO: renamed from: L */
    public final void m65991L(long j, boolean z) {
        this.f160278L0 = false;
        this.f160285Y = j;
        this.f160286Z = j;
        if (!z) {
            p1y0 p1y0Var = this.f160295i;
            p1y0Var.getClass();
            z = p1y0Var.mo41646s(j - this.f160284X) != 0;
        }
        mo856z(j, false, z);
    }

    /* JADX INFO: renamed from: M */
    public final void m65992M() {
        this.f160278L0 = true;
    }

    /* JADX INFO: renamed from: O */
    public final void m65993O(qp71 qp71Var) {
        if (Objects.equals(this.f160280N0, qp71Var)) {
            return;
        }
        this.f160280N0 = qp71Var;
        m65997U();
        mo65986F();
    }

    /* JADX INFO: renamed from: P */
    public final void m65994P() {
        c95.m31855u(this.f160294h == 1);
        this.f160294h = 2;
        mo807C();
    }

    /* JADX INFO: renamed from: Q */
    public final void m65995Q() {
        c95.m31855u(this.f160294h == 2);
        this.f160294h = 1;
        mo809D();
    }

    /* JADX INFO: renamed from: R */
    public abstract int mo38840R(r300 r300Var);

    /* JADX INFO: renamed from: S */
    public int mo65996S() {
        return 0;
    }

    /* JADX INFO: renamed from: T */
    public boolean mo820T(long j) {
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final void m65997U() {
        vsd0 vsd0Var;
        if (this.f160280N0.m73436p() || (vsd0Var = this.f160281O0) == null) {
            this.f160282P0 = -9223372036854775807L;
            return;
        }
        int iMo26650b = this.f160280N0.mo26650b(vsd0Var.f244408a);
        if (iMo26650b == -1) {
            this.f160282P0 = -9223372036854775807L;
            return;
        }
        bp71 bp71VarMo26651f = this.f160280N0.mo26651f(iMo26650b, new bp71(), false);
        this.f160282P0 = bp71VarMo26651f.f29346d;
        int i = vsd0Var.f244409b;
        if (i != -1) {
            this.f160282P0 = bp71VarMo26651f.f29349g.m57289a(i).f94884g[vsd0Var.f244410c];
            return;
        }
        int i2 = vsd0Var.f244412e;
        if (i2 != -1) {
            long j = bp71VarMo26651f.f29349g.m57289a(i2).f94878a;
            if (j != Long.MIN_VALUE) {
                this.f160282P0 = j;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ExoPlaybackException m65998b(Exception exc, r300 r300Var, boolean z, int i) {
        int iMo38840R;
        if (r300Var == null || this.f160279M0) {
            iMo38840R = 4;
        } else {
            this.f160279M0 = true;
            try {
                iMo38840R = mo38840R(r300Var) & 7;
                this.f160279M0 = false;
            } catch (ExoPlaybackException unused) {
                this.f160279M0 = false;
                iMo38840R = 4;
            } catch (Throwable th) {
                this.f160279M0 = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, i, mo838i(), this.f160291e, r300Var, r300Var == null ? 4 : iMo38840R, this.f160281O0, z);
    }

    /* JADX INFO: renamed from: d */
    public final void m65999d() {
        c95.m31855u(this.f160294h == 1);
        this.f160289c.m92431i();
        this.f160294h = 0;
        this.f160295i = null;
        this.f160296t = null;
        this.f160278L0 = false;
        mo853x();
        this.f160281O0 = null;
        this.f160282P0 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: e */
    public final void m66000e(qkw0 qkw0Var, r300[] r300VarArr, p1y0 p1y0Var, boolean z, boolean z2, long j, long j2, vsd0 vsd0Var) {
        c95.m31855u(this.f160294h == 0);
        this.f160290d = qkw0Var;
        this.f160281O0 = vsd0Var;
        this.f160294h = 1;
        mo854y(z, z2);
        m65989J(r300VarArr, p1y0Var, j, j2, vsd0Var);
        this.f160278L0 = false;
        this.f160285Y = j;
        this.f160286Z = j;
        mo856z(j, z, true);
    }

    /* JADX INFO: renamed from: g */
    public long mo41777g(long j, long j2) {
        if (this.f160294h == 1) {
            return (mo850v() || mo847t()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    /* JADX INFO: renamed from: h */
    public oad0 mo39148h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo838i();

    /* JADX INFO: renamed from: k */
    public final long m66001k() {
        return this.f160286Z;
    }

    /* JADX INFO: renamed from: n */
    public final int m66002n() {
        return this.f160294h;
    }

    /* JADX INFO: renamed from: o */
    public final p1y0 m66003o() {
        return this.f160295i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m66004p() {
        return this.f160286Z == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: r */
    public final void m66005r(int i, w9p0 w9p0Var, gh61 gh61Var) {
        this.f160291e = i;
        this.f160292f = w9p0Var;
        this.f160293g = gh61Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m66006s() {
        return this.f160278L0;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo847t() {
        return m66004p();
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo850v();

    /* JADX INFO: renamed from: w */
    public final void m66007w() {
        p1y0 p1y0Var = this.f160295i;
        p1y0Var.getClass();
        p1y0Var.mo41645d();
    }

    /* JADX INFO: renamed from: A */
    public void mo804A() {
    }

    /* JADX INFO: renamed from: B */
    public void mo806B() {
    }

    /* JADX INFO: renamed from: C */
    public void mo807C() {
    }

    /* JADX INFO: renamed from: D */
    public void mo809D() {
    }

    /* JADX INFO: renamed from: F */
    public void mo65986F() {
    }

    /* JADX INFO: renamed from: f */
    public void mo831f() {
    }

    /* JADX INFO: renamed from: x */
    public void mo853x() {
    }

    /* JADX INFO: renamed from: N */
    public void mo816N(float f, float f2) {
    }

    @Override // p204p.iap0
    /* JADX INFO: renamed from: c */
    public void mo827c(int i, Object obj) {
    }

    /* JADX INFO: renamed from: y */
    public void mo854y(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: z */
    public void mo856z(long j, boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: E */
    public void mo810E(r300[] r300VarArr, long j, long j2, vsd0 vsd0Var) {
    }
}
