package p204p;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pdp0 implements g7p0 {

    /* JADX INFO: renamed from: a */
    public final g7p0 f176532a;

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap f176533b = new IdentityHashMap();

    public pdp0(g7p0 g7p0Var) {
        this.f176532a = g7p0Var;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A */
    public final void mo43825A() {
        m69699h1();
        this.f176532a.mo43825A();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A0 */
    public final int mo43826A0() {
        m69699h1();
        return this.f176532a.mo43826A0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B */
    public final void mo43827B(int i) {
        m69699h1();
        this.f176532a.mo43827B(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B0 */
    public final void mo43828B0(dr81 dr81Var) {
        m69699h1();
        this.f176532a.mo43828B0(dr81Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C */
    public final void mo43829C(int i, int i2, List list) {
        m69699h1();
        this.f176532a.mo43829C(i, i2, list);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C0 */
    public final void mo43830C0(ufd0 ufd0Var) {
        m69699h1();
        this.f176532a.mo43830C0(ufd0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D */
    public final boolean mo43831D() {
        return this.f176532a.mo43831D();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D0 */
    public final void mo43832D0(List list, int i, long j) {
        m69699h1();
        this.f176532a.mo43832D0(list, i, j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E */
    public final void mo43833E(int i) {
        m69699h1();
        this.f176532a.mo43833E(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E0 */
    public final void mo43834E0(int i) {
        m69699h1();
        this.f176532a.mo43834E0(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: F0 */
    public final long mo43835F0() {
        m69699h1();
        return this.f176532a.mo43835F0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: G */
    public final void mo43836G(int i, int i2) {
        m69699h1();
        this.f176532a.mo43836G(i, i2);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H */
    public final void mo43837H(SurfaceHolder surfaceHolder) {
        m69699h1();
        this.f176532a.mo43837H(surfaceHolder);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H0 */
    public final long mo43838H0() {
        m69699h1();
        return this.f176532a.mo43838H0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I */
    public final void mo43839I(d7p0 d7p0Var) {
        m69699h1();
        synchronized (this.f176533b) {
            try {
                r400 r400Var = (r400) this.f176533b.get(d7p0Var);
                if (r400Var == null) {
                    r400Var = new r400(this, d7p0Var);
                }
                this.f176532a.mo43839I(r400Var);
                this.f176533b.put(d7p0Var, r400Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I0 */
    public final void mo43840I0(int i, List list) {
        m69699h1();
        this.f176532a.mo43840I0(i, list);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J */
    public final void mo43841J() {
        m69699h1();
        this.f176532a.mo43841J();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J0 */
    public final long mo43842J0() {
        m69699h1();
        return this.f176532a.mo43842J0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K */
    public final PlaybackException mo43843K() {
        m69699h1();
        return this.f176532a.mo43843K();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K0 */
    public final boolean mo43844K0() {
        m69699h1();
        return this.f176532a.mo43844K0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L */
    public final void mo43845L(boolean z) {
        m69699h1();
        this.f176532a.mo43845L(z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L0 */
    public final phd0 mo43846L0() {
        m69699h1();
        return this.f176532a.mo43846L0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: M0 */
    public final int mo43847M0() {
        m69699h1();
        return this.f176532a.mo43847M0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N */
    public final void mo43848N() {
        m69699h1();
        this.f176532a.mo43848N();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N0 */
    public final void mo43849N0(int i, int i2) {
        m69699h1();
        this.f176532a.mo43849N0(i, i2);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O */
    public final void mo43850O(d7p0 d7p0Var) {
        m69699h1();
        synchronized (this.f176533b) {
            d7p0 d7p0Var2 = (d7p0) this.f176533b.remove(d7p0Var);
            g7p0 g7p0Var = this.f176532a;
            if (d7p0Var2 != null) {
                d7p0Var = d7p0Var2;
            }
            g7p0Var.mo43850O(d7p0Var);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O0 */
    public final void mo43851O0(int i, int i2, int i3) {
        m69699h1();
        this.f176532a.mo43851O0(i, i2, i3);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P */
    public final void mo43852P(ufd0 ufd0Var) {
        m69699h1();
        this.f176532a.mo43852P(ufd0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P0 */
    public final void mo43853P0(List list) {
        m69699h1();
        this.f176532a.mo43853P0(list);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q */
    public final void mo43854Q() {
        m69699h1();
        this.f176532a.mo43854Q();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q0 */
    public final boolean mo43855Q0() {
        m69699h1();
        return this.f176532a.mo43855Q0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R */
    public final void mo43856R(int i) {
        m69699h1();
        this.f176532a.mo43856R(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R0 */
    public final boolean mo43857R0() {
        m69699h1();
        return this.f176532a.mo43857R0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: S */
    public final tt81 mo43858S() {
        m69699h1();
        return this.f176532a.mo43858S();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T */
    public final boolean mo43859T() {
        m69699h1();
        return this.f176532a.mo43859T();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T0 */
    public final long mo43860T0() {
        m69699h1();
        return this.f176532a.mo43860T0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U */
    public final o0m mo43861U() {
        m69699h1();
        return this.f176532a.mo43861U();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U0 */
    public final void mo43862U0(int i) {
        m69699h1();
        this.f176532a.mo43862U0(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V */
    public final int mo43863V() {
        m69699h1();
        return this.f176532a.mo43863V();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V0 */
    public final void mo43864V0() {
        m69699h1();
        this.f176532a.mo43864V0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W */
    public final boolean mo43865W(int i) {
        m69699h1();
        return this.f176532a.mo43865W(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W0 */
    public final void mo43866W0() {
        m69699h1();
        this.f176532a.mo43866W0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X */
    public final void mo43867X(boolean z) {
        m69699h1();
        this.f176532a.mo43867X(z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X0 */
    public final phd0 mo43868X0() {
        m69699h1();
        return this.f176532a.mo43868X0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Y0 */
    public final void mo43869Y0(List list) {
        m69699h1();
        this.f176532a.mo43869Y0(list);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z */
    public final boolean mo43870Z() {
        m69699h1();
        return this.f176532a.mo43870Z();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z0 */
    public final long mo43871Z0() {
        m69699h1();
        return this.f176532a.mo43871Z0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a */
    public final void mo43872a() {
        m69699h1();
        this.f176532a.mo43872a();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a0 */
    public final int mo43873a0() {
        m69699h1();
        return this.f176532a.mo43873a0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a1 */
    public final boolean mo43874a1() {
        m69699h1();
        return this.f176532a.mo43874a1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b */
    public final void mo43875b() {
        m69699h1();
        this.f176532a.mo43875b();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b0 */
    public final qp71 mo43876b0() {
        m69699h1();
        return this.f176532a.mo43876b0();
    }

    /* JADX INFO: renamed from: b1 */
    public final e7p0 m69693b1() {
        boolean zMo43865W = mo43865W(16);
        boolean zMo43865W2 = mo43865W(17);
        int iMo43847M0 = zMo43865W2 ? mo43847M0() : 0;
        c95.m31855u(iMo43847M0 >= 0);
        int iMo43908t0 = zMo43865W2 ? mo43908t0() : 0;
        c95.m31855u(iMo43908t0 >= 0);
        if (zMo43865W2) {
            qp71 qp71VarMo43876b0 = mo43876b0();
            if (!qp71VarMo43876b0.m73436p()) {
                c95.m31855u(iMo43847M0 < qp71VarMo43876b0.mo26655o());
                mp71 mp71VarMo26654n = qp71VarMo43876b0.mo26654n(iMo43847M0, new mp71(), 0L);
                c95.m31855u(iMo43908t0 == h0b1.m46317j(iMo43908t0, mp71VarMo26654n.f145939n, mp71VarMo26654n.f145940o));
            }
        }
        long jMo43838H0 = 0;
        ufd0 ufd0VarMo43911v = zMo43865W ? mo43911v() : null;
        long jMo43909u = zMo43865W ? mo43909u() : 0L;
        if (zMo43865W) {
            jMo43838H0 = mo43838H0();
        }
        return new e7p0(null, iMo43847M0, ufd0VarMo43911v, null, iMo43908t0, jMo43909u, jMo43838H0, zMo43865W ? mo43863V() : -1, zMo43865W ? mo43826A0() : -1);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c */
    public final boolean mo43877c() {
        m69699h1();
        return this.f176532a.mo43877c();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c0 */
    public final Looper mo43878c0() {
        return this.f176532a.mo43878c0();
    }

    /* JADX INFO: renamed from: c1 */
    public final n201 m69694c1() {
        boolean zMo43865W = mo43865W(16);
        return new n201(m69693b1(), zMo43865W && mo43901p(), SystemClock.elapsedRealtime(), zMo43865W ? getDuration() : -9223372036854775807L, zMo43865W ? mo43842J0() : 0L, zMo43865W ? mo43913w() : 0, zMo43865W ? mo43903q() : 0L, zMo43865W ? mo43891j0() : -9223372036854775807L, zMo43865W ? mo43906s0() : -9223372036854775807L, zMo43865W ? mo43860T0() : 0L);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d */
    public final float mo43879d() {
        m69699h1();
        return this.f176532a.mo43879d();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d0 */
    public final void mo43880d0() {
        m69699h1();
        this.f176532a.mo43880d0();
    }

    /* JADX INFO: renamed from: d1 */
    public final ufd0 m69695d1() {
        if (mo43865W(16)) {
            return mo43911v();
        }
        return null;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e */
    public final void mo43881e(float f) {
        m69699h1();
        this.f176532a.mo43881e(f);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e0 */
    public final dr81 mo43882e0() {
        m69699h1();
        return this.f176532a.mo43882e0();
    }

    /* JADX INFO: renamed from: e1 */
    public final qp71 m69696e1() {
        if (mo43865W(17)) {
            return mo43876b0();
        }
        return m69695d1() != null ? new odp0(this) : qp71.f191180a;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f */
    public final void mo43883f(long j) {
        m69699h1();
        this.f176532a.mo43883f(j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f0 */
    public final void mo43884f0() {
        m69699h1();
        this.f176532a.mo43884f0();
    }

    /* JADX INFO: renamed from: f1 */
    public final phd0 m69697f1() {
        return mo43865W(18) ? mo43868X0() : phd0.f177558M;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g */
    public final void mo43885g() {
        m69699h1();
        this.f176532a.mo43885g();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g0 */
    public final void mo43886g0(phd0 phd0Var) {
        m69699h1();
        this.f176532a.mo43886g0(phd0Var);
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m69698g1() {
        return mo43865W(23) && mo43855Q0();
    }

    @Override // p204p.g7p0
    public final long getDuration() {
        m69699h1();
        return this.f176532a.getDuration();
    }

    @Override // p204p.g7p0
    public final int getPlaybackState() {
        m69699h1();
        return this.f176532a.getPlaybackState();
    }

    @Override // p204p.g7p0
    public final int getRepeatMode() {
        m69699h1();
        return this.f176532a.getRepeatMode();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: h0 */
    public final int mo43887h0() {
        m69699h1();
        return this.f176532a.mo43887h0();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m69699h1() {
        c95.m31855u(Looper.myLooper() == this.f176532a.mo43878c0());
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i */
    public final boolean mo43888i() {
        m69699h1();
        return this.f176532a.mo43888i();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i0 */
    public final void mo43889i0(ufd0 ufd0Var, long j) {
        m69699h1();
        this.f176532a.mo43889i0(ufd0Var, j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j */
    public final h1p0 mo43890j() {
        m69699h1();
        return this.f176532a.mo43890j();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j0 */
    public final long mo43891j0() {
        m69699h1();
        return this.f176532a.mo43891j0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k */
    public final void mo43892k() {
        m69699h1();
        this.f176532a.mo43892k();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k0 */
    public final void mo43893k0(int i, long j) {
        m69699h1();
        this.f176532a.mo43893k0(i, j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l */
    public final void mo43894l(h1p0 h1p0Var) {
        m69699h1();
        this.f176532a.mo43894l(h1p0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l0 */
    public final b7p0 mo43895l0() {
        m69699h1();
        return this.f176532a.mo43895l0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m */
    public final x6r mo43896m() {
        m69699h1();
        return this.f176532a.mo43896m();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m0 */
    public final void mo43897m0(boolean z) {
        m69699h1();
        this.f176532a.mo43897m0(z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: n */
    public final void mo43898n(Surface surface) {
        m69699h1();
        this.f176532a.mo43898n(surface);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o */
    public final boolean mo43899o() {
        m69699h1();
        return this.f176532a.mo43899o();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o0 */
    public final long mo43900o0() {
        m69699h1();
        return this.f176532a.mo43900o0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p */
    public final boolean mo43901p() {
        m69699h1();
        return this.f176532a.mo43901p();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p0 */
    public final void mo43902p0(int i, ufd0 ufd0Var) {
        m69699h1();
        this.f176532a.mo43902p0(i, ufd0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: q */
    public final long mo43903q() {
        m69699h1();
        return this.f176532a.mo43903q();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: r */
    public final void mo43904r(float f) {
        m69699h1();
        this.f176532a.mo43904r(f);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s */
    public final void mo43905s(xs6 xs6Var, boolean z) {
        this.f176532a.mo43905s(xs6Var, z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s0 */
    public final long mo43906s0() {
        m69699h1();
        return this.f176532a.mo43906s0();
    }

    @Override // p204p.g7p0
    public final void setRepeatMode(int i) {
        m69699h1();
        this.f176532a.setRepeatMode(i);
    }

    @Override // p204p.g7p0
    public final void stop() {
        m69699h1();
        this.f176532a.stop();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t */
    public final void mo43907t() {
        m69699h1();
        this.f176532a.mo43907t();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t0 */
    public final int mo43908t0() {
        m69699h1();
        return this.f176532a.mo43908t0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u */
    public final long mo43909u() {
        m69699h1();
        return this.f176532a.mo43909u();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u0 */
    public final k9c1 mo43910u0() {
        m69699h1();
        return this.f176532a.mo43910u0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v */
    public final ufd0 mo43911v() {
        m69699h1();
        return this.f176532a.mo43911v();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v0 */
    public final xs6 mo43912v0() {
        m69699h1();
        return this.f176532a.mo43912v0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: w */
    public final int mo43913w() {
        m69699h1();
        return this.f176532a.mo43913w();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x */
    public final void mo43914x() {
        m69699h1();
        this.f176532a.mo43914x();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x0 */
    public final void mo43915x0(int i, int i2) {
        m69699h1();
        this.f176532a.mo43915x0(i, i2);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y */
    public final void mo43916y() {
        m69699h1();
        this.f176532a.mo43916y();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y0 */
    public final boolean mo43917y0() {
        m69699h1();
        return this.f176532a.mo43917y0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: z */
    public final void mo43918z(int i, boolean z) {
        m69699h1();
        this.f176532a.mo43918z(i, z);
    }
}
