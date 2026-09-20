package p204p;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class xwo implements d7p0, ctd0, zs8, fhs {

    /* JADX INFO: renamed from: a */
    public final gh61 f266710a;

    /* JADX INFO: renamed from: b */
    public final bp71 f266711b;

    /* JADX INFO: renamed from: c */
    public final mp71 f266712c;

    /* JADX INFO: renamed from: d */
    public final kcj0 f266713d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f266714e;

    /* JADX INFO: renamed from: f */
    public n890 f266715f;

    /* JADX INFO: renamed from: g */
    public g7p0 f266716g;

    /* JADX INFO: renamed from: h */
    public kh61 f266717h;

    /* JADX INFO: renamed from: i */
    public boolean f266718i;

    public xwo(gh61 gh61Var) {
        gh61Var.getClass();
        this.f266710a = gh61Var;
        this.f266715f = new n890(h0b1.m46276D());
        bp71 bp71Var = new bp71();
        this.f266711b = bp71Var;
        this.f266712c = new mp71();
        this.f266713d = new kcj0(bp71Var);
        this.f266714e = new SparseArray();
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: A */
    public final void mo34730A(tt81 tt81Var) {
        m92297Z(m92292G(), 2, new pwo(1));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: B */
    public final void mo33835B(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var, int i2) {
        m92297Z(m92295R(i, vsd0Var), 1000, new wwo(4));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: C */
    public final void mo33836C(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        np3 np3VarM92295R = m92295R(i, vsd0Var);
        m92297Z(np3VarM92295R, 1004, new m94(12, np3VarM92295R, lhd0Var));
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: D */
    public final void mo40363D(int i, vsd0 vsd0Var, Exception exc) {
        np3 np3VarM92295R = m92295R(i, vsd0Var);
        m92297Z(np3VarM92295R, 1024, new ori(np3VarM92295R, (Object) exc, 16));
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: E */
    public final void mo41680E(int i, vsd0 vsd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1027, new wwo(1));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: F */
    public final void mo34736F(int i) {
        m92297Z(m92292G(), 4, new pwo(4));
    }

    /* JADX INFO: renamed from: G */
    public final np3 m92292G() {
        return m92293O((vsd0) this.f266713d.f121501e);
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: H */
    public final void mo34739H(int i, ufd0 ufd0Var) {
        m92297Z(m92292G(), 1, new i4l(23));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: I */
    public final void mo35207I(boolean z) {
        m92297Z(m92292G(), 9, new pwo(11));
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: J */
    public final void mo40364J(int i, vsd0 vsd0Var, m57 m57Var) {
        m92297Z(m92295R(i, vsd0Var), 1023, new wwo(8));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: K */
    public final void mo35208K(int i, boolean z) {
        m92297Z(m92292G(), 30, new pwo(2));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: L */
    public final void mo35209L(long j) {
        m92297Z(m92292G(), 16, new pwo(24));
    }

    /* JADX INFO: renamed from: O */
    public final np3 m92293O(vsd0 vsd0Var) {
        this.f266716g.getClass();
        qp71 qp71Var = vsd0Var == null ? null : (qp71) ((btv0) this.f266713d.f121500d).get(vsd0Var);
        if (vsd0Var != null && qp71Var != null) {
            return m92294P(qp71Var, qp71Var.mo46978g(vsd0Var.f244408a, this.f266711b).f29345c, vsd0Var);
        }
        int iMo43847M0 = this.f266716g.mo43847M0();
        qp71 qp71VarMo43876b0 = this.f266716g.mo43876b0();
        if (iMo43847M0 >= qp71VarMo43876b0.mo26655o()) {
            qp71VarMo43876b0 = qp71.f191180a;
        }
        return m92294P(qp71VarMo43876b0, iMo43847M0, null);
    }

    /* JADX INFO: renamed from: P */
    public final np3 m92294P(qp71 qp71Var, int i, vsd0 vsd0Var) {
        vsd0 vsd0Var2 = qp71Var.m73436p() ? null : vsd0Var;
        this.f266710a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = qp71Var.equals(this.f266716g.mo43876b0()) && i == this.f266716g.mo43847M0();
        long jM46326n0 = 0;
        if (vsd0Var2 == null || !vsd0Var2.m86309c()) {
            if (z) {
                jM46326n0 = this.f266716g.mo43838H0();
            } else if (!qp71Var.m73436p()) {
                jM46326n0 = h0b1.m46326n0(qp71Var.mo26654n(i, this.f266712c, 0L).f145937l);
            }
        } else if (z && this.f266716g.mo43863V() == vsd0Var2.f244409b && this.f266716g.mo43826A0() == vsd0Var2.f244410c) {
            jM46326n0 = this.f266716g.mo43909u();
        }
        return new np3(jElapsedRealtime, qp71Var, i, vsd0Var2, jM46326n0, this.f266716g.mo43876b0(), this.f266716g.mo43847M0(), (vsd0) this.f266713d.f121501e, this.f266716g.mo43909u(), this.f266716g.mo43903q());
    }

    /* JADX INFO: renamed from: R */
    public final np3 m92295R(int i, vsd0 vsd0Var) {
        this.f266716g.getClass();
        if (vsd0Var != null) {
            return ((qp71) ((btv0) this.f266713d.f121500d).get(vsd0Var)) != null ? m92293O(vsd0Var) : m92294P(qp71.f191180a, i, vsd0Var);
        }
        qp71 qp71VarMo43876b0 = this.f266716g.mo43876b0();
        if (i >= qp71VarMo43876b0.mo26655o()) {
            qp71VarMo43876b0 = qp71.f191180a;
        }
        return m92294P(qp71VarMo43876b0, i, null);
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: S */
    public final void mo40365S(int i, vsd0 vsd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1026, new wwo(10));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: T */
    public final void mo35210T(int i, int i2) {
        m92297Z(m92296Y(), 24, new pwo(12));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: U */
    public final void mo35211U(xs6 xs6Var) {
        m92297Z(m92296Y(), 20, new i4l(26));
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: W */
    public final void mo41681W(int i, vsd0 vsd0Var, int i2) {
        m92297Z(m92295R(i, vsd0Var), 1022, new pwo(25));
    }

    /* JADX INFO: renamed from: Y */
    public final np3 m92296Y() {
        return m92293O((vsd0) this.f266713d.f121503g);
    }

    /* JADX INFO: renamed from: Z */
    public final void m92297Z(np3 np3Var, int i, k890 k890Var) {
        this.f266714e.put(i, np3Var);
        this.f266715f.m63839j(i, k890Var);
    }

    @Override // p204p.zs8
    /* JADX INFO: renamed from: a */
    public final void mo34763a(int i, long j, long j2) {
        kcj0 kcj0Var = this.f266713d;
        np3 np3VarM92293O = m92293O(((pf40) kcj0Var.f121499c).isEmpty() ? null : (vsd0) nhg1.m64500t((pf40) kcj0Var.f121499c));
        m92297Z(np3VarM92293O, 1006, new uwo(np3VarM92293O, i, j, j2));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: a0 */
    public final void mo35213a0(boolean z) {
        m92297Z(m92292G(), 3, new wwo(16));
    }

    @Override // p204p.d7p0, p204p.n5c1
    /* JADX INFO: renamed from: b */
    public final void mo29553b(k9c1 k9c1Var) {
        np3 np3VarM92296Y = m92296Y();
        m92297Z(np3VarM92296Y, 25, new swo(np3VarM92296Y, k9c1Var));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m92298b0(g7p0 g7p0Var, Looper looper) {
        c95.m31855u(this.f266716g == null || ((pf40) this.f266713d.f121499c).isEmpty());
        g7p0Var.getClass();
        this.f266716g = g7p0Var;
        this.f266717h = this.f266710a.m44723a(looper, null);
        n890 n890Var = this.f266715f;
        m94 m94Var = new m94(11, this, g7p0Var);
        n890Var.getClass();
        gh61 gh61Var = this.f266710a;
        c95.m31855u(gh61Var != null);
        this.f266715f = new n890((CopyOnWriteArraySet) n890Var.f151479f, looper, looper.getThread(), gh61Var, m94Var, n890Var.f151475b);
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: c0 */
    public final void mo34765c0(int i, boolean z) {
        m92297Z(m92292G(), 5, new pwo(3));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: d */
    public final void mo33837d(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1001, new wwo(11));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: d0 */
    public final void mo34766d0(float f) {
        m92297Z(m92296Y(), 22, new i4l(24));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: f0 */
    public final void mo34768f0(e7p0 e7p0Var, e7p0 e7p0Var2, int i) {
        if (i == 1) {
            this.f266718i = false;
        }
        g7p0 g7p0Var = this.f266716g;
        g7p0Var.getClass();
        kcj0 kcj0Var = this.f266713d;
        kcj0Var.f121501e = kcj0.m56055A(g7p0Var, (pf40) kcj0Var.f121499c, (vsd0) kcj0Var.f121502f, (bp71) kcj0Var.f121498b);
        np3 np3VarM92292G = m92292G();
        m92297Z(np3VarM92292G, 11, new mc5(np3VarM92292G, i, e7p0Var, e7p0Var2));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: g */
    public final void mo35214g(int i) {
        m92297Z(m92296Y(), 21, new pwo(6));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: i */
    public final void mo35215i(boolean z) {
        m92297Z(m92296Y(), 23, new wwo(5));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: i0 */
    public final void mo35216i0(phd0 phd0Var) {
        m92297Z(m92292G(), 14, new pwo(17));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: j */
    public final void mo35217j(List list) {
        np3 np3VarM92292G = m92292G();
        m92297Z(np3VarM92292G, 27, new qwo(np3VarM92292G, list));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: k */
    public final void mo34772k(PlaybackException playbackException) {
        vsd0 vsd0Var;
        np3 np3VarM92292G = (!(playbackException instanceof ExoPlaybackException) || (vsd0Var = ((ExoPlaybackException) playbackException).f978M0) == null) ? m92292G() : m92293O(vsd0Var);
        m92297Z(np3VarM92292G, 10, new rwo(np3VarM92292G, playbackException));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: k0 */
    public final void mo35218k0(b7p0 b7p0Var) {
        m92297Z(m92292G(), 13, new wwo(17));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: l */
    public final void mo34773l(o0m o0mVar) {
        m92297Z(m92292G(), 27, new pwo(9));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: l0 */
    public final void mo35219l0(x6r x6rVar) {
        m92297Z(m92292G(), 29, new pwo(5));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: m */
    public final void mo33838m(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1002, new wwo(9));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: m0 */
    public final void mo35220m0(h1p0 h1p0Var) {
        m92297Z(m92292G(), 12, new i4l(21));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: o0 */
    public final void mo35221o0(long j) {
        m92297Z(m92292G(), 17, new wwo(15));
    }

    @Override // p204p.d7p0
    public final void onRepeatModeChanged(int i) {
        m92297Z(m92292G(), 8, new pwo(10));
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: p */
    public final void mo40372p(int i, vsd0 vsd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1025, new wwo(12));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: q0 */
    public final void mo35222q0(int i, boolean z) {
        m92297Z(m92292G(), -1, new i4l(25));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: r */
    public final void mo33839r(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var, IOException iOException, boolean z) {
        np3 np3VarM92295R = m92295R(i, vsd0Var);
        m92297Z(np3VarM92295R, 1003, new m94(np3VarM92295R, o0a0Var, lhd0Var, iOException, z));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: s0 */
    public final void mo35224s0(PlaybackException playbackException) {
        vsd0 vsd0Var;
        m92297Z((!(playbackException instanceof ExoPlaybackException) || (vsd0Var = ((ExoPlaybackException) playbackException).f978M0) == null) ? m92292G() : m92293O(vsd0Var), 10, new pwo(0));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: t */
    public final void mo35225t(j6f0 j6f0Var) {
        m92297Z(m92292G(), 28, new i4l(27));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: t0 */
    public final void mo35226t0(long j) {
        m92297Z(m92292G(), 18, new wwo(3));
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: u */
    public final void mo33840u(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        m92297Z(m92295R(i, vsd0Var), 1005, new wwo(0));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: v */
    public final void mo35227v(int i) {
        m92297Z(m92292G(), 6, new i4l(29));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: x0 */
    public final void mo34782x0(qp71 qp71Var, int i) {
        g7p0 g7p0Var = this.f266716g;
        g7p0Var.getClass();
        kcj0 kcj0Var = this.f266713d;
        kcj0Var.f121501e = kcj0.m56055A(g7p0Var, (pf40) kcj0Var.f121499c, (vsd0) kcj0Var.f121502f, (bp71) kcj0Var.f121498b);
        kcj0Var.m56093g0(g7p0Var.mo43876b0());
        m92297Z(m92292G(), 0, new i4l(22));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: y */
    public final void mo35229y(phd0 phd0Var) {
        m92297Z(m92292G(), 15, new pwo(7));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: y0 */
    public final void mo34783y0(boolean z) {
        m92297Z(m92292G(), 7, new i4l(28));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: z */
    public final void mo35230z(dr81 dr81Var) {
        m92297Z(m92292G(), 19, new wwo(13));
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: N */
    public final void mo34747N() {
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: X */
    public final void mo35212X(int i) {
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: r0 */
    public final void mo35223r0(c7p0 c7p0Var) {
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: w */
    public final void mo35228w(boolean z) {
    }
}
