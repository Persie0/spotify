package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cpz0 {

    /* JADX INFO: renamed from: a */
    public final exh0 f40686a;

    /* JADX INFO: renamed from: b */
    public final boolean f40687b;

    /* JADX INFO: renamed from: c */
    public final lp70 f40688c;

    /* JADX INFO: renamed from: d */
    public final voz0 f40689d;

    /* JADX INFO: renamed from: e */
    public cpz0 f40690e;

    /* JADX INFO: renamed from: f */
    public final int f40691f;

    public cpz0(exh0 exh0Var, boolean z, lp70 lp70Var, voz0 voz0Var) {
        this.f40686a = exh0Var;
        this.f40687b = z;
        this.f40688c = lp70Var;
        this.f40689d = voz0Var;
        this.f40691f = lp70Var.f135671b;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m33569j(int i, cpz0 cpz0Var) {
        return cpz0Var.m33578i((i & 1) != 0 ? !cpz0Var.f40687b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: a */
    public final tiv0 m33570a(bnj0 bnj0Var) {
        ?? M88331j;
        cpz0 cpz0VarM33580l = m33580l();
        if (cpz0VarM33580l == null) {
            return tiv0.f220750e;
        }
        exh0 exh0Var = cpz0VarM33580l.f40688c.f135674c1.f263388f;
        if ((exh0Var.f63773d & 8) == 0) {
            M88331j = 0;
            break;
        }
        loop0: while (true) {
            if (exh0Var != null) {
                if ((exh0Var.f63772c & 8) != 0) {
                    M88331j = exh0Var;
                    ?? qqi0Var = 0;
                    while (M88331j != 0) {
                        if (M88331j instanceof apz0) {
                            if (((apz0) M88331j).mo26733o()) {
                                break loop0;
                            }
                        } else if ((M88331j.f63772c & 8) != 0 && (M88331j instanceof xlq)) {
                            exh0 exh0Var2 = ((xlq) M88331j).f263224N0;
                            int i = 0;
                            while (exh0Var2 != null) {
                                if ((exh0Var2.f63772c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                        qqi0Var = qqi0Var;
                                        M88331j = exh0Var2;
                                    } else {
                                        if (qqi0Var == 0) {
                                            qqi0Var = new qqi0(0, new exh0[16]);
                                        }
                                        if (M88331j != 0) {
                                            qqi0Var.m73556b(M88331j);
                                            M88331j = 0;
                                        }
                                        qqi0Var.m73556b(exh0Var2);
                                    }
                                } else {
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                }
                                exh0Var2 = exh0Var2.f63775f;
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            }
                            if (i == 1) {
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            } else {
                                M88331j = M88331j;
                                qqi0Var = qqi0Var;
                            }
                        }
                        M88331j = wjg1.m88331j(qqi0Var);
                    }
                }
                if ((exh0Var.f63773d & 8) != 0) {
                    exh0Var = exh0Var.f63775f;
                }
            }
            M88331j = 0;
            break;
        }
        apz0 apz0Var = (apz0) M88331j;
        bnj0 bnj0VarM88314D = apz0Var != null ? wjg1.m88314D(apz0Var, 8) : null;
        return bnj0VarM88314D == null ? cpz0VarM33580l.m33570a(bnj0Var) : bnj0VarM88314D.mo30001I(bnj0Var, true);
    }

    /* JADX INFO: renamed from: b */
    public final cpz0 m33571b(tix0 tix0Var, gh00 gh00Var) {
        voz0 voz0Var = new voz0();
        voz0Var.f243557c = false;
        voz0Var.f243558d = false;
        gh00Var.invoke(voz0Var);
        cpz0 cpz0Var = new cpz0(new bpz0(gh00Var), false, new lp70(true, this.f40691f + (tix0Var != null ? 1000000000 : 2000000000)), voz0Var);
        cpz0Var.f40690e = this;
        return cpz0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m33572c(lp70 lp70Var, ArrayList arrayList) {
        qqi0 qqi0VarM59648y = lp70Var.m59648y();
        Object[] objArr = qqi0VarM59648y.f191608a;
        int i = qqi0VarM59648y.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            lp70 lp70Var2 = (lp70) objArr[i2];
            if (lp70Var2.m59606H() && !lp70Var2.f135691n1) {
                if (lp70Var2.f135674c1.m91466d(8)) {
                    arrayList.add(pp91.m70522c(lp70Var2, this.f40687b));
                } else {
                    m33572c(lp70Var2, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final bnj0 m33573d() {
        if (!m33583o()) {
            apz0 apz0VarM33575f = m33575f();
            return apz0VarM33575f != null ? wjg1.m88314D(apz0VarM33575f, 8) : this.f40688c.f135674c1.f263385c;
        }
        cpz0 cpz0VarM33580l = m33580l();
        if (cpz0VarM33580l != null) {
            return cpz0VarM33580l.m33573d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m33574e(ArrayList arrayList, ArrayList arrayList2) {
        m33587s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            cpz0 cpz0Var = (cpz0) arrayList.get(size2);
            if (cpz0Var.m33584p()) {
                arrayList2.add(cpz0Var);
            } else if (!cpz0Var.f40689d.f243558d) {
                cpz0Var.m33574e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: f */
    public final apz0 m33575f() {
        ?? M88331j;
        boolean z;
        ?? r2;
        boolean z2 = this.f40689d.f243557c;
        lp70 lp70Var = this.f40688c;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (!z2) {
            exh0 exh0Var = lp70Var.f135674c1.f263388f;
            if ((exh0Var.f63773d & 8) != 0) {
                loop3: while (exh0Var != null) {
                    if ((exh0Var.f63772c & 8) != 0) {
                        M88331j = exh0Var;
                        ?? qqi0Var = 0;
                        while (true) {
                            if (M88331j != 0) {
                                if (M88331j instanceof apz0) {
                                    if (((apz0) M88331j).mo26733o()) {
                                        r5 = M88331j;
                                    }
                                } else if ((M88331j.f63772c & 8) != 0 && (M88331j instanceof xlq)) {
                                    exh0 exh0Var2 = ((xlq) M88331j).f263224N0;
                                    int i = 0;
                                    while (exh0Var2 != null) {
                                        if ((exh0Var2.f63772c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M88331j = M88331j;
                                                qqi0Var = qqi0Var;
                                                qqi0Var = qqi0Var;
                                                M88331j = exh0Var2;
                                            } else {
                                                if (qqi0Var == 0) {
                                                    qqi0Var = new qqi0(0, new exh0[16]);
                                                }
                                                if (M88331j != 0) {
                                                    qqi0Var.m73556b(M88331j);
                                                    M88331j = 0;
                                                }
                                                qqi0Var.m73556b(exh0Var2);
                                            }
                                        } else {
                                            M88331j = M88331j;
                                            qqi0Var = qqi0Var;
                                        }
                                        exh0Var2 = exh0Var2.f63775f;
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                    if (i == 1) {
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    } else {
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                }
                                M88331j = wjg1.m88331j(qqi0Var);
                            }
                        }
                    }
                    if ((exh0Var.f63773d & 8) == 0) {
                        break;
                    }
                    exh0Var = exh0Var.f63775f;
                }
            }
        } else {
            exh0 exh0Var3 = lp70Var.f135674c1.f263388f;
            if ((exh0Var3.f63773d & 8) != 0) {
                M88331j = 0;
                while (exh0Var3 != null) {
                    if ((exh0Var3.f63772c & 8) != 0) {
                        exh0 exh0VarM88331j = exh0Var3;
                        qqi0 qqi0Var2 = null;
                        while (exh0VarM88331j != null) {
                            if (exh0VarM88331j instanceof apz0) {
                                apz0 apz0Var = (apz0) exh0VarM88331j;
                                if (apz0Var.mo26733o()) {
                                    if (apz0Var.mo26734q1()) {
                                        r2 = M88331j;
                                        r2 = M88331j;
                                        return apz0Var;
                                    }
                                    if (M88331j == 0) {
                                        r2 = apz0Var;
                                    }
                                }
                                r2 = M88331j;
                                z = false;
                                M88331j = r2;
                            } else {
                                z = true;
                            }
                            if (z) {
                                M88331j = M88331j;
                                if ((exh0VarM88331j.f63772c & 8) != 0 && (exh0VarM88331j instanceof xlq)) {
                                    int i2 = 0;
                                    for (exh0 exh0Var4 = ((xlq) exh0VarM88331j).f263224N0; exh0Var4 != null; exh0Var4 = exh0Var4.f63775f) {
                                        if ((exh0Var4.f63772c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                exh0VarM88331j = exh0Var4;
                                            } else {
                                                if (qqi0Var2 == null) {
                                                    qqi0Var2 = new qqi0(0, new exh0[16]);
                                                }
                                                if (exh0VarM88331j != null) {
                                                    qqi0Var2.m73556b(exh0VarM88331j);
                                                    exh0VarM88331j = null;
                                                }
                                                qqi0Var2.m73556b(exh0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                M88331j = M88331j;
                            }
                            exh0VarM88331j = wjg1.m88331j(qqi0Var2);
                        }
                    }
                    if ((exh0Var3.f63773d & 8) == 0) {
                        break;
                    }
                    exh0Var3 = exh0Var3.f63775f;
                    M88331j = M88331j;
                }
                r5 = M88331j;
            }
        }
        return (apz0) r5;
    }

    /* JADX INFO: renamed from: g */
    public final tiv0 m33576g() {
        bnj0 bnj0VarM33573d = m33573d();
        if (bnj0VarM33573d != null) {
            if (!bnj0VarM33573d.mo30020b1().f63766L0) {
                bnj0VarM33573d = null;
            }
            if (bnj0VarM33573d != null) {
                return pwg1.m71275j(bnj0VarM33573d);
            }
        }
        return tiv0.f220750e;
    }

    /* JADX INFO: renamed from: h */
    public final tiv0 m33577h() {
        bnj0 bnj0VarM33573d = m33573d();
        if (bnj0VarM33573d != null) {
            if (!bnj0VarM33573d.mo30020b1().f63766L0) {
                bnj0VarM33573d = null;
            }
            if (bnj0VarM33573d != null) {
                return pwg1.m71276k(bnj0VarM33573d, true);
            }
        }
        return tiv0.f220750e;
    }

    /* JADX INFO: renamed from: i */
    public final List m33578i(boolean z, boolean z2) {
        if (!z && this.f40689d.f243558d) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m33584p()) {
            return m33587s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m33574e(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final voz0 m33579k() {
        boolean zM33584p = m33584p();
        voz0 voz0Var = this.f40689d;
        if (!zM33584p) {
            return voz0Var;
        }
        voz0 voz0VarM86109b = voz0Var.m86109b();
        m33586r(new ArrayList(), voz0VarM86109b);
        return voz0VarM86109b;
    }

    /* JADX INFO: renamed from: l */
    public final cpz0 m33580l() {
        lp70 lp70VarM59645v;
        cpz0 cpz0Var = this.f40690e;
        if (cpz0Var != null) {
            return cpz0Var;
        }
        lp70 lp70Var = this.f40688c;
        boolean z = this.f40687b;
        if (!z) {
            lp70VarM59645v = null;
            break;
        }
        lp70VarM59645v = lp70Var.m59645v();
        while (true) {
            if (lp70VarM59645v == null) {
                lp70VarM59645v = null;
                break;
            }
            voz0 voz0VarM59647x = lp70VarM59645v.m59647x();
            if (voz0VarM59647x != null && voz0VarM59647x.f243557c) {
                break;
            }
            lp70VarM59645v = lp70VarM59645v.m59645v();
        }
        if (lp70VarM59645v == null) {
            for (lp70 lp70VarM59645v2 = lp70Var.m59645v(); lp70VarM59645v2 != null; lp70VarM59645v2 = lp70VarM59645v2.m59645v()) {
                if (lp70VarM59645v2.f135674c1.m91466d(8)) {
                    lp70VarM59645v = lp70VarM59645v2;
                }
            }
            lp70VarM59645v = null;
        }
        if (lp70VarM59645v == null) {
            return null;
        }
        return pp91.m70522c(lp70VarM59645v, z);
    }

    /* JADX INFO: renamed from: m */
    public final tiv0 m33581m() {
        jlq jlqVarM33575f = m33575f();
        return jlqVarM33575f == null ? this.f40688c.f135674c1.f263385c.m29995E1() : iig1.m50724k(((exh0) jlqVarM33575f).f63770a, iig1.m50727n(this.f40689d), true);
    }

    /* JADX INFO: renamed from: n */
    public final voz0 m33582n() {
        return this.f40689d;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33583o() {
        return this.f40690e != null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m33584p() {
        return this.f40687b && this.f40689d.f243557c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m33585q() {
        if (m33583o() || !m33569j(4, this).isEmpty()) {
            return false;
        }
        lp70 lp70VarM59645v = this.f40688c.m59645v();
        while (lp70VarM59645v != null) {
            voz0 voz0VarM59647x = lp70VarM59645v.m59647x();
            if (voz0VarM59647x != null && voz0VarM59647x.f243557c) {
                if (lp70VarM59645v == null) {
                    return true;
                }
                return false;
            }
            lp70VarM59645v = lp70VarM59645v.m59645v();
        }
        lp70VarM59645v = null;
        if (lp70VarM59645v == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m33586r(ArrayList arrayList, voz0 voz0Var) {
        if (this.f40689d.f243558d) {
            return;
        }
        m33587s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            cpz0 cpz0Var = (cpz0) arrayList.get(size2);
            if (!cpz0Var.m33584p()) {
                voz0Var.m86111e(cpz0Var.f40689d);
                cpz0Var.m33586r(arrayList, voz0Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final List m33587s(ArrayList arrayList, boolean z) {
        if (m33583o()) {
            return lau.f131415a;
        }
        m33572c(this.f40688c, arrayList);
        if (z) {
            lpz0 lpz0Var = hpz0.f93969z;
            voz0 voz0Var = this.f40689d;
            tix0 tix0Var = (tix0) whg1.m88143p(voz0Var, lpz0Var);
            if (tix0Var != null && voz0Var.f243557c && !arrayList.isEmpty()) {
                arrayList.add(m33571b(tix0Var, new nnz0(tix0Var, 1)));
            }
            lpz0 lpz0Var2 = hpz0.f93944a;
            if (voz0Var.f243555a.m33619c(lpz0Var2) && !arrayList.isEmpty() && voz0Var.f243557c) {
                List list = (List) whg1.m88143p(voz0Var, lpz0Var2);
                String str = list != null ? (String) g6f.m43745s0(list) : null;
                if (str != null) {
                    arrayList.add(0, m33571b(null, new p9v0(str, 29)));
                }
            }
        }
        return arrayList;
    }
}
