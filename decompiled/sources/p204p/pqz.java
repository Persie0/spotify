package p204p;

import android.os.Trace;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class pqz extends exh0 implements osh, eo70, eqk0, hxh0, jlq {

    /* JADX INFO: renamed from: M0 */
    public final boolean f180448M0;

    /* JADX INFO: renamed from: N0 */
    public final th00 f180449N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f180450O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f180451P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f180452Q0;

    public pqz(int i, int i2, th00 th00Var) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        th00Var = (i2 & 4) != 0 ? null : th00Var;
        this.f180448M0 = z;
        this.f180449N0 = th00Var;
        this.f180452Q0 = i;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        int iOrdinal = m70695L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ppz focusOwner = ((oz3) wjg1.m88320J(this)).getFocusOwner();
                pqz pqzVarM70532m = pp91.m70532m(this);
                if (pqzVarM70532m == null || !pqzVarM70532m.f180448M0) {
                    return;
                }
                rpz rpzVar = (rpz) focusOwner;
                rpzVar.f201662a.m68589G();
                rpzVar.f201665d.m57064a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        rpz rpzVar2 = (rpz) ((oz3) wjg1.m88320J(this)).getFocusOwner();
        rpzVar2.m76198d(8, true, false);
        if (this.f180448M0) {
            rpzVar2.f201662a.m68589G();
        }
        rpzVar2.f201665d.m57064a();
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        if (m70695L1().m57129b()) {
            ((rpz) ((oz3) wjg1.m88320J(this)).getFocusOwner()).m76198d(8, true, true);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m70691H1(int i) {
        int iM38547C = edb.m38547C(fag1.m41170s(i, this));
        if (iM38547C == 0) {
            return fag1.m41171t(this);
        }
        if (iM38547C == 1) {
            return false;
        }
        if (iM38547C == 2) {
            return true;
        }
        if (iM38547C == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: I1 */
    public final void m70692I1(kqz kqzVar, kqz kqzVar2) {
        xmj0 xmj0Var;
        th00 th00Var;
        rpz rpzVar = (rpz) ((oz3) wjg1.m88320J(this)).getFocusOwner();
        pqz pqzVarM76202h = rpzVar.m76202h();
        if (!kqzVar.equals(kqzVar2) && (th00Var = this.f180449N0) != null) {
            th00Var.invoke(kqzVar, kqzVar2);
        }
        exh0 exh0Var = this.f63770a;
        if (!exh0Var.f63766L0) {
            mt40.m62791c("visitAncestors called on an unattached node");
        }
        exh0 exh0Var2 = this.f63770a;
        lp70 lp70VarM88319I = wjg1.m88319I(this);
        while (lp70VarM88319I != null) {
            if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 5120) != 0) {
                while (exh0Var2 != null) {
                    int i = exh0Var2.f63772c;
                    if ((i & 5120) != 0) {
                        if (exh0Var2 != exh0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? M88331j = exh0Var2;
                            ?? qqi0Var = 0;
                            while (M88331j != 0) {
                                if (M88331j instanceof toz) {
                                    toz tozVar = (toz) M88331j;
                                    if (pqzVarM76202h == rpzVar.m76202h()) {
                                        tozVar.mo39632i0(kqzVar2);
                                    }
                                } else if ((M88331j.f63772c & 4096) != 0 && (M88331j instanceof xlq)) {
                                    exh0 exh0Var3 = ((xlq) M88331j).f263224N0;
                                    int i2 = 0;
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                    while (exh0Var3 != null) {
                                        if ((exh0Var3.f63772c & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qqi0Var = qqi0Var;
                                                M88331j = exh0Var3;
                                            } else {
                                                if (qqi0Var == 0) {
                                                    qqi0Var = new qqi0(0, new exh0[16]);
                                                }
                                                if (M88331j != 0) {
                                                    qqi0Var.m73556b(M88331j);
                                                    M88331j = 0;
                                                }
                                                qqi0Var.m73556b(exh0Var3);
                                            }
                                        }
                                        exh0Var3 = exh0Var3.f63775f;
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M88331j = wjg1.m88331j(qqi0Var);
                            }
                        }
                    }
                    exh0Var2 = exh0Var2.f63774e;
                }
            }
            lp70VarM88319I = lp70VarM88319I.m59645v();
            exh0Var2 = (lp70VarM88319I == null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: J1 */
    public final upz m70693J1() {
        xmj0 xmj0Var;
        upz upzVar = new upz();
        upzVar.mo67471b(iag1.m50066g(this.f180452Q0, this));
        exh0 exh0Var = this.f63770a;
        if (!exh0Var.f63766L0) {
            mt40.m62791c("visitAncestors called on an unattached node");
        }
        exh0 exh0Var2 = this.f63770a;
        lp70 lp70VarM88319I = wjg1.m88319I(this);
        loop0: while (lp70VarM88319I != null) {
            if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 3072) != 0) {
                while (exh0Var2 != null) {
                    int i = exh0Var2.f63772c;
                    if ((i & 3072) != 0) {
                        if (exh0Var2 != exh0Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            ?? M88331j = exh0Var2;
                            ?? qqi0Var = 0;
                            while (M88331j != 0) {
                                if (M88331j instanceof xpz) {
                                    ((xpz) M88331j).mo39631V0(upzVar);
                                } else if ((M88331j.f63772c & 2048) != 0 && (M88331j instanceof xlq)) {
                                    exh0 exh0Var3 = ((xlq) M88331j).f263224N0;
                                    int i2 = 0;
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                    while (exh0Var3 != null) {
                                        if ((exh0Var3.f63772c & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qqi0Var = qqi0Var;
                                                M88331j = exh0Var3;
                                            } else {
                                                if (qqi0Var == 0) {
                                                    qqi0Var = new qqi0(0, new exh0[16]);
                                                }
                                                if (M88331j != 0) {
                                                    qqi0Var.m73556b(M88331j);
                                                    M88331j = 0;
                                                }
                                                qqi0Var.m73556b(exh0Var3);
                                            }
                                        }
                                        exh0Var3 = exh0Var3.f63775f;
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M88331j = wjg1.m88331j(qqi0Var);
                            }
                        }
                    }
                    exh0Var2 = exh0Var2.f63774e;
                }
            }
            lp70VarM88319I = lp70VarM88319I.m59645v();
            exh0Var2 = (lp70VarM88319I == null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
        }
        return upzVar;
    }

    /* JADX INFO: renamed from: K1 */
    public final tiv0 m70694K1(jo70 jo70Var) {
        tiv0 tiv0VarM83734h = m70693J1().m83734h();
        if (tiv0VarM83734h != jey.f111744f) {
            return jo70Var == null ? tiv0VarM83734h : tiv0VarM83734h.m80941m(jo70Var.mo30033o(wjg1.m88317G(this), 0L, (6 & 4) != 0));
        }
        return jo70Var != null ? jo70Var.mo30001I(wjg1.m88317G(this), false) : q0f1.m71836j(0L, epv0.m39677M(wjg1.m88317G(this).f217324c));
    }

    /* JADX INFO: renamed from: L1 */
    public final kqz m70695L1() {
        pqz pqzVarM76202h;
        xmj0 xmj0Var;
        if (this.f63766L0 && (pqzVarM76202h = ((rpz) ((oz3) wjg1.m88320J(this)).getFocusOwner()).m76202h()) != null) {
            if (this == pqzVarM76202h) {
                return kqz.f125474a;
            }
            if (pqzVarM76202h.f63766L0) {
                if (!pqzVarM76202h.f63770a.f63766L0) {
                    mt40.m62791c("visitAncestors called on an unattached node");
                }
                exh0 exh0Var = pqzVarM76202h.f63770a.f63774e;
                lp70 lp70VarM88319I = wjg1.m88319I(pqzVarM76202h);
                while (lp70VarM88319I != null) {
                    if ((lp70VarM88319I.f135674c1.f263388f.f63773d & 1024) != 0) {
                        while (exh0Var != null) {
                            if ((exh0Var.f63772c & 1024) != 0) {
                                exh0 exh0VarM88331j = exh0Var;
                                qqi0 qqi0Var = null;
                                while (exh0VarM88331j != null) {
                                    if (exh0VarM88331j instanceof pqz) {
                                        if (this == ((pqz) exh0VarM88331j)) {
                                            return kqz.f125475b;
                                        }
                                    } else if ((exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                                        int i = 0;
                                        for (exh0 exh0Var2 = ((xlq) exh0VarM88331j).f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
                                            if ((exh0Var2.f63772c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    exh0VarM88331j = exh0Var2;
                                                } else {
                                                    if (qqi0Var == null) {
                                                        qqi0Var = new qqi0(0, new exh0[16]);
                                                    }
                                                    if (exh0VarM88331j != null) {
                                                        qqi0Var.m73556b(exh0VarM88331j);
                                                        exh0VarM88331j = null;
                                                    }
                                                    qqi0Var.m73556b(exh0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    exh0VarM88331j = wjg1.m88331j(qqi0Var);
                                }
                            }
                            exh0Var = exh0Var.f63774e;
                        }
                    }
                    lp70VarM88319I = lp70VarM88319I.m59645v();
                    exh0Var = (lp70VarM88319I == null || (xmj0Var = lp70VarM88319I.f135674c1) == null) ? null : xmj0Var.f263387e;
                }
            }
        }
        return kqz.f125476c;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m70696M1() {
        int iOrdinal = m70695L1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        rlv0 rlv0Var = new rlv0();
        frz0.m42532q(this, new xcw(27, rlv0Var, this));
        Object obj = rlv0Var.f200373a;
        if (obj == null) {
            wj50.m88260d0("focusProperties");
            throw null;
        }
        if (((spz) obj).mo67472d()) {
            return;
        }
        ((rpz) ((oz3) wjg1.m88320J(this)).getFocusOwner()).m76196b(true);
    }

    /* JADX INFO: renamed from: N1 */
    public final boolean m70697N1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m70693J1().mo67472d() ? m70691H1(i) : x4w0.m89911B(this, i, new le0(i, 28));
        } finally {
            Trace.endSection();
        }
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        m70696M1();
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: w1 */
    public final boolean mo32896w1() {
        return false;
    }

    @Override // p204p.eo70
    /* JADX INFO: renamed from: f1 */
    public final void mo39548f1(jo70 jo70Var) {
    }
}
