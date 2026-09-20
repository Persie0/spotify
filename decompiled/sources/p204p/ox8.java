package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ox8 implements g7p0 {

    /* JADX INFO: renamed from: a */
    public Object f170906a;

    public /* synthetic */ ox8(Object obj) {
        this.f170906a = obj;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C0 */
    public void mo43830C0(ufd0 ufd0Var) {
        mo43869Y0(pf40.m69794t(ufd0Var));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D */
    public boolean mo43831D() {
        return true;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E */
    public void mo43833E(int i) {
        mo43836G(i, i + 1);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E0 */
    public void mo43834E0(int i) {
        mo44997c1(i, 10, -9223372036854775807L, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J */
    public void mo43841J() {
        if (mo43876b0().m73436p() || mo43901p()) {
            m68196b1(7);
            return;
        }
        boolean zMo43917y0 = mo43917y0();
        if (mo43874a1() && !mo43844K0()) {
            if (zMo43917y0) {
                m68198e1(7);
                return;
            } else {
                m68196b1(7);
                return;
            }
        }
        if (!zMo43917y0 || mo43909u() > mo43900o0()) {
            m68197d1(7, 0L);
        } else {
            m68198e1(7);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K0 */
    public boolean mo43844K0() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.m73435m(mo43847M0(), (mp71) this.f170906a).f145933h;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N0 */
    public void mo43849N0(int i, int i2) {
        if (i != i2) {
            mo43851O0(i, i + 1, i2);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P */
    public void mo43852P(ufd0 ufd0Var) {
        mo43869Y0(pf40.m69794t(ufd0Var));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P0 */
    public void mo43853P0(List list) {
        mo43840I0(Alert.DURATION_SHOW_INDEFINITELY, list);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q */
    public void mo43854Q() {
        int iMo33544e;
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            iMo33544e = -1;
        } else {
            int iMo43847M0 = mo43847M0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iMo33544e = qp71VarMo43876b0.mo33544e(iMo43847M0, repeatMode, mo43857R0());
        }
        if (iMo33544e == -1) {
            m68196b1(8);
        } else if (iMo33544e == mo43847M0()) {
            mo44997c1(mo43847M0(), 8, -9223372036854775807L, true);
        } else {
            mo44997c1(iMo33544e, 8, -9223372036854775807L, false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T */
    public boolean mo43859T() {
        int iMo33544e;
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            iMo33544e = -1;
        } else {
            int iMo43847M0 = mo43847M0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iMo33544e = qp71VarMo43876b0.mo33544e(iMo43847M0, repeatMode, mo43857R0());
        }
        return iMo33544e != -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V0 */
    public void mo43864V0() {
        long jMo43909u = mo43909u() + mo43835F0();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jMo43909u = Math.min(jMo43909u, duration);
        }
        m68197d1(12, Math.max(jMo43909u, 0L));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W */
    public boolean mo43865W(int i) {
        return mo43895l0().m28393a(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W0 */
    public void mo43866W0() {
        long jMo43909u = mo43909u() + (-mo43871Z0());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jMo43909u = Math.min(jMo43909u, duration);
        }
        m68197d1(11, Math.max(jMo43909u, 0L));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z */
    public boolean mo43870Z() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.m73435m(mo43847M0(), (mp71) this.f170906a).f145934i;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a */
    public void mo43872a() {
        mo43845L(false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a1 */
    public boolean mo43874a1() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.m73435m(mo43847M0(), (mp71) this.f170906a).m62446c();
    }

    /* JADX INFO: renamed from: b1 */
    public void m68196b1(int i) {
        mo44997c1(-1, i, -9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: c1 */
    public abstract void mo44997c1(int i, int i2, long j, boolean z);

    /* JADX INFO: renamed from: d1 */
    public void m68197d1(int i, long j) {
        mo44997c1(mo43847M0(), i, j, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e */
    public void mo43881e(float f) {
        mo43894l(mo43890j().m46464b(f));
    }

    /* JADX INFO: renamed from: e1 */
    public void m68198e1(int i) {
        int iMo33545k;
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            iMo33545k = -1;
        } else {
            int iMo43847M0 = mo43847M0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iMo33545k = qp71VarMo43876b0.mo33545k(iMo43847M0, repeatMode, mo43857R0());
        }
        if (iMo33545k == -1) {
            m68196b1(i);
        } else if (iMo33545k == mo43847M0()) {
            mo44997c1(mo43847M0(), i, -9223372036854775807L, true);
        } else {
            mo44997c1(iMo33545k, i, -9223372036854775807L, false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f */
    public void mo43883f(long j) {
        m68197d1(5, j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f0 */
    public void mo43884f0() {
        int iMo33544e;
        if (mo43876b0().m73436p() || mo43901p()) {
            m68196b1(9);
            return;
        }
        if (!mo43859T()) {
            if (mo43874a1() && mo43870Z()) {
                mo44997c1(mo43847M0(), 9, -9223372036854775807L, false);
                return;
            } else {
                m68196b1(9);
                return;
            }
        }
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            iMo33544e = -1;
        } else {
            int iMo43847M0 = mo43847M0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iMo33544e = qp71VarMo43876b0.mo33544e(iMo43847M0, repeatMode, mo43857R0());
        }
        if (iMo33544e == -1) {
            m68196b1(9);
        } else if (iMo33544e == mo43847M0()) {
            mo44997c1(mo43847M0(), 9, -9223372036854775807L, true);
        } else {
            mo44997c1(iMo33544e, 9, -9223372036854775807L, false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g */
    public void mo43885g() {
        mo43845L(true);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i */
    public boolean mo43888i() {
        return getPlaybackState() == 3 && mo43899o() && mo43873a0() == 0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i0 */
    public void mo43889i0(ufd0 ufd0Var, long j) {
        mo43832D0(pf40.m69794t(ufd0Var), 0, j);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j0 */
    public long mo43891j0() {
        mp71 mp71Var = (mp71) this.f170906a;
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p() || qp71VarMo43876b0.m73435m(mo43847M0(), mp71Var).f145931f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (mp71Var.m62444a() - mp71Var.f145931f) - mo43838H0();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k0 */
    public void mo43893k0(int i, long j) {
        mo44997c1(i, 10, j, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p0 */
    public void mo43902p0(int i, ufd0 ufd0Var) {
        mo43829C(i, i + 1, pf40.m69794t(ufd0Var));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s0 */
    public long mo43906s0() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            return -9223372036854775807L;
        }
        return qp71VarMo43876b0.m73435m(mo43847M0(), (mp71) this.f170906a).m62445b();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t */
    public void mo43907t() {
        mo43836G(0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v */
    public ufd0 mo43911v() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            return null;
        }
        return qp71VarMo43876b0.m73435m(mo43847M0(), (mp71) this.f170906a).f145928c;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: w */
    public int mo43913w() {
        if (!mo43865W(16)) {
            return 0;
        }
        long jMo43842J0 = mo43842J0();
        long duration = getDuration();
        if (jMo43842J0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return h0b1.m46317j(h0b1.m46302b0(jMo43842J0, duration), 0, 100);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x */
    public void mo43914x() {
        m68198e1(6);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y */
    public void mo43916y() {
        mo44997c1(mo43847M0(), 4, -9223372036854775807L, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y0 */
    public boolean mo43917y0() {
        int iMo33545k;
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            iMo33545k = -1;
        } else {
            int iMo43847M0 = mo43847M0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iMo33545k = qp71VarMo43876b0.mo33545k(iMo43847M0, repeatMode, mo43857R0());
        }
        return iMo33545k != -1;
    }

    public ox8() {
        this.f170906a = new mp71();
    }
}
