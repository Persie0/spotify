package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xxo {

    /* JADX INFO: renamed from: a */
    public boolean f267033a;

    /* JADX INFO: renamed from: b */
    public boolean f267034b;

    /* JADX INFO: renamed from: c */
    public final Object f267035c;

    /* JADX INFO: renamed from: d */
    public final Object f267036d;

    /* JADX INFO: renamed from: e */
    public Object f267037e;

    /* JADX INFO: renamed from: f */
    public Object f267038f;

    /* JADX INFO: renamed from: g */
    public Object f267039g;

    /* JADX INFO: renamed from: h */
    public Object f267040h;

    public xxo(voi voiVar, Observable observable, j4p0 j4p0Var, Observable observable2, Scheduler scheduler, Scheduler scheduler2) {
        this.f267035c = voiVar;
        this.f267036d = observable;
        this.f267037e = j4p0Var;
        this.f267038f = observable2;
        this.f267039g = scheduler;
        this.f267040h = scheduler2;
        this.f267034b = true;
    }

    /* JADX INFO: renamed from: a */
    public static final void m92339a(xxo xxoVar, yyx0 yyx0Var) throws Throwable {
        Object c6x0Var;
        d180 d180Var = (d180) xxoVar.f267036d;
        m92341i(yyx0Var);
        dlo dloVar = (dlo) xxoVar.f267035c;
        if (dloVar.f50274g == 3) {
            mif1.m61880o(yyx0Var, "PRAGMA journal_mode = WAL");
        } else {
            mif1.m61880o(yyx0Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (dloVar.f50274g == 3) {
            mif1.m61880o(yyx0Var, "PRAGMA synchronous = NORMAL");
        } else {
            mif1.m61880o(yyx0Var, "PRAGMA synchronous = FULL");
        }
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("PRAGMA user_version");
        try {
            ezx0VarMo63454G1.mo24841E1();
            int i = (int) ezx0VarMo63454G1.getLong(0);
            mif1.m61875i(ezx0VarMo63454G1, null);
            int i2 = d180Var.f44186a;
            if (i != i2) {
                mif1.m61880o(yyx0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        xxoVar.m92356r(yyx0Var);
                    } else {
                        xxoVar.m92357s(yyx0Var, i, i2);
                    }
                    mif1.m61880o(yyx0Var, "PRAGMA user_version = " + i2);
                    c6x0Var = w2a1.f247311a;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (!(c6x0Var instanceof c6x0)) {
                    mif1.m61880o(yyx0Var, "END TRANSACTION");
                }
                Throwable thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    mif1.m61880o(yyx0Var, "ROLLBACK TRANSACTION");
                    throw thM77348a;
                }
            }
            xxoVar.m92358t(yyx0Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mif1.m61875i(ezx0VarMo63454G1, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m92341i(yyx0 yyx0Var) {
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("PRAGMA busy_timeout");
        try {
            ezx0VarMo63454G1.mo24841E1();
            long j = ezx0VarMo63454G1.getLong(0);
            mif1.m61875i(ezx0VarMo63454G1, null);
            if (j < 3000) {
                mif1.m61880o(yyx0Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mif1.m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m92342c(ftq ftqVar, int i, ArrayList arrayList, hux0 hux0Var) {
        lud1 lud1Var = ftqVar.f73268d;
        hux0 hux0Var2 = lud1Var.f137063c;
        ftq ftqVar2 = lud1Var.f137069i;
        ftq ftqVar3 = lud1Var.f137068h;
        if (hux0Var2 == null) {
            w7j w7jVar = (w7j) this.f267035c;
            if (lud1Var == w7jVar.f238232d || lud1Var == w7jVar.f238234e) {
                return;
            }
            if (hux0Var == null) {
                hux0Var = new hux0();
                hux0Var.f95482a = null;
                hux0Var.f95483b = new ArrayList();
                hux0Var.f95482a = lud1Var;
                arrayList.add(hux0Var);
            }
            lud1Var.f137063c = hux0Var;
            hux0Var.f95483b.add(lud1Var);
            for (ctq ctqVar : ftqVar3.f73275k) {
                if (ctqVar instanceof ftq) {
                    m92342c((ftq) ctqVar, i, arrayList, hux0Var);
                }
            }
            for (ctq ctqVar2 : ftqVar2.f73275k) {
                if (ctqVar2 instanceof ftq) {
                    m92342c((ftq) ctqVar2, i, arrayList, hux0Var);
                }
            }
            if (i == 1 && (lud1Var instanceof bhb1)) {
                for (ctq ctqVar3 : ((bhb1) lud1Var).f27132k.f73275k) {
                    if (ctqVar3 instanceof ftq) {
                        m92342c((ftq) ctqVar3, i, arrayList, hux0Var);
                    }
                }
            }
            Iterator it = ftqVar3.f73276l.iterator();
            while (it.hasNext()) {
                m92342c((ftq) it.next(), i, arrayList, hux0Var);
            }
            Iterator it2 = ftqVar2.f73276l.iterator();
            while (it2.hasNext()) {
                m92342c((ftq) it2.next(), i, arrayList, hux0Var);
            }
            if (i == 1 && (lud1Var instanceof bhb1)) {
                Iterator it3 = ((bhb1) lud1Var).f27132k.f73276l.iterator();
                while (it3.hasNext()) {
                    m92342c((ftq) it3.next(), i, arrayList, hux0Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m92343d(w7j w7jVar) {
        Iterator it;
        int iM84882m;
        u7j u7jVar;
        u7j u7jVar2;
        u7j u7jVar3;
        u7j u7jVar4;
        u7j u7jVar5;
        u7j u7jVar6;
        Iterator it2 = w7jVar.f248708u0.iterator();
        while (it2.hasNext()) {
            v7j v7jVar = (v7j) it2.next();
            u7j[] u7jVarArr = v7jVar.f238220U;
            c6j[] c6jVarArr = v7jVar.f238217R;
            c6j c6jVar = v7jVar.f238212M;
            c6j c6jVar2 = v7jVar.f238210K;
            c6j c6jVar3 = v7jVar.f238211L;
            c6j c6jVar4 = v7jVar.f238209J;
            u7j u7jVar7 = u7jVarArr[0];
            u7j u7jVar8 = u7jVarArr[1];
            if (v7jVar.f238243i0 == 8) {
                v7jVar.f238226a = true;
            } else {
                float f = v7jVar.f238269x;
                u7j u7jVar9 = u7j.f227712c;
                if (f < 1.0f && u7jVar7 == u7jVar9) {
                    v7jVar.f238262s = 2;
                }
                float f2 = v7jVar.f238200A;
                if (f2 < 1.0f && u7jVar8 == u7jVar9) {
                    v7jVar.f238264t = 2;
                }
                float f3 = v7jVar.f238224Y;
                u7j u7jVar10 = u7j.f227711b;
                u7j u7jVar11 = u7j.f227710a;
                if (f3 <= 0.0f) {
                    it = it2;
                } else {
                    if (u7jVar7 == u7jVar9 && (u7jVar8 == u7jVar10 || u7jVar8 == u7jVar11)) {
                        v7jVar.f238262s = 3;
                    } else if (u7jVar8 == u7jVar9 && (u7jVar7 == u7jVar10 || u7jVar7 == u7jVar11)) {
                        v7jVar.f238264t = 3;
                    } else if (u7jVar7 == u7jVar9 && u7jVar8 == u7jVar9) {
                        it = it2;
                        if (v7jVar.f238262s == 0) {
                            v7jVar.f238262s = 3;
                        }
                        if (v7jVar.f238264t == 0) {
                            v7jVar.f238264t = 3;
                        }
                    }
                    it = it2;
                }
                if (u7jVar7 == u7jVar9 && v7jVar.f238262s == 1 && (c6jVar4.f34551f == null || c6jVar3.f34551f == null)) {
                    u7jVar7 = u7jVar10;
                }
                if (u7jVar8 == u7jVar9 && v7jVar.f238264t == 1 && (c6jVar2.f34551f == null || c6jVar.f34551f == null)) {
                    u7jVar8 = u7jVar10;
                }
                l730 l730Var = v7jVar.f238232d;
                l730Var.f137064d = u7jVar7;
                int i = v7jVar.f238262s;
                l730Var.f137061a = i;
                bhb1 bhb1Var = v7jVar.f238234e;
                bhb1Var.f137064d = u7jVar8;
                int i2 = v7jVar.f238264t;
                bhb1Var.f137061a = i2;
                u7j u7jVar12 = u7j.f227713d;
                if ((u7jVar7 == u7jVar12 || u7jVar7 == u7jVar11 || u7jVar7 == u7jVar10) && (u7jVar8 == u7jVar12 || u7jVar8 == u7jVar11 || u7jVar8 == u7jVar10)) {
                    u7j u7jVar13 = u7jVar8;
                    int iM84886s = v7jVar.m84886s();
                    if (u7jVar7 == u7jVar12) {
                        iM84886s = (w7jVar.m84886s() - c6jVar4.f34552g) - c6jVar3.f34552g;
                        u7jVar7 = u7jVar11;
                    }
                    int iM84882m2 = v7jVar.m84882m();
                    if (u7jVar13 == u7jVar12) {
                        iM84882m = (w7jVar.m84882m() - c6jVar2.f34552g) - c6jVar.f34552g;
                        u7jVar = u7jVar11;
                    } else {
                        iM84882m = iM84882m2;
                        u7jVar = u7jVar13;
                    }
                    m92354p(v7jVar, u7jVar7, iM84886s, u7jVar, iM84882m);
                    v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                    v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                    v7jVar.f238226a = true;
                } else {
                    if (u7jVar7 != u7jVar9 || (u7jVar8 != u7jVar10 && u7jVar8 != u7jVar11)) {
                        u7jVar2 = u7jVar8;
                        u7jVar3 = u7jVar10;
                    } else if (i == 3) {
                        if (u7jVar8 == u7jVar10) {
                            m92354p(v7jVar, u7jVar10, 0, u7jVar10, 0);
                        }
                        int iM84882m3 = v7jVar.m84882m();
                        m92354p(v7jVar, u7jVar11, (int) ((iM84882m3 * v7jVar.f238224Y) + 0.5f), u7jVar11, iM84882m3);
                        v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                        v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                        v7jVar.f238226a = true;
                    } else if (i == 1) {
                        m92354p(v7jVar, u7jVar10, 0, u7jVar8, 0);
                        v7jVar.f238232d.f137065e.f231081m = v7jVar.m84886s();
                    } else {
                        u7jVar3 = u7jVar10;
                        u7jVar2 = u7jVar8;
                        if (i == 2) {
                            u7j u7jVar14 = w7jVar.f238220U[0];
                            if (u7jVar14 == u7jVar11 || u7jVar14 == u7jVar12) {
                                m92354p(v7jVar, u7jVar11, (int) ((f * w7jVar.m84886s()) + 0.5f), u7jVar2, v7jVar.m84882m());
                                v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                                v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                                v7jVar.f238226a = true;
                            }
                        } else if (c6jVarArr[0].f34551f == null || c6jVarArr[1].f34551f == null) {
                            u7jVar11 = u7jVar11;
                            u7jVar11 = u7jVar11;
                            m92354p(v7jVar, u7jVar3, 0, u7jVar2, 0);
                            v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                            v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                            v7jVar.f238226a = true;
                        }
                    }
                    if (u7jVar2 != u7jVar9 || (u7jVar7 != u7jVar3 && u7jVar7 != u7jVar11)) {
                        u7jVar11 = u7jVar11;
                        u7j u7jVar15 = u7jVar2;
                        u7jVar4 = u7jVar3;
                        u7jVar5 = u7jVar11;
                        u7jVar6 = u7jVar15;
                    } else if (i2 == 3) {
                        if (u7jVar7 == u7jVar3) {
                            m92354p(v7jVar, u7jVar3, 0, u7jVar3, 0);
                        }
                        int iM84886s2 = v7jVar.m84886s();
                        float f4 = v7jVar.f238224Y;
                        if (v7jVar.f238225Z == -1) {
                            f4 = 1.0f / f4;
                        }
                        m92354p(v7jVar, u7jVar11, iM84886s2, u7jVar11, (int) ((iM84886s2 * f4) + 0.5f));
                        v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                        v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                        v7jVar.f238226a = true;
                    } else {
                        u7j u7jVar16 = u7jVar11;
                        if (i2 == 1) {
                            m92354p(v7jVar, u7jVar7, 0, u7jVar3, 0);
                            v7jVar.f238234e.f137065e.f231081m = v7jVar.m84882m();
                        } else {
                            u7j u7jVar17 = u7jVar3;
                            u7j u7jVar18 = u7jVar7;
                            if (i2 == 2) {
                                u7j u7jVar19 = w7jVar.f238220U[1];
                                if (u7jVar19 == u7jVar16 || u7jVar19 == u7jVar12) {
                                    m92354p(v7jVar, u7jVar18, v7jVar.m84886s(), u7jVar16, (int) ((f2 * w7jVar.m84882m()) + 0.5f));
                                    v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                                    v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                                    v7jVar.f238226a = true;
                                } else {
                                    u7jVar6 = u7jVar2;
                                    u7jVar4 = u7jVar17;
                                    u7jVar7 = u7jVar18;
                                    u7jVar5 = u7jVar16;
                                }
                            } else {
                                u7jVar7 = u7jVar18;
                                u7jVar5 = u7jVar16;
                                if (c6jVarArr[2].f34551f == null || c6jVarArr[3].f34551f == null) {
                                    m92354p(v7jVar, u7jVar17, 0, u7jVar2, 0);
                                    v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                                    v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                                    v7jVar.f238226a = true;
                                } else {
                                    u7jVar6 = u7jVar2;
                                    u7jVar4 = u7jVar17;
                                }
                            }
                        }
                    }
                    if (u7jVar7 == u7jVar9 && u7jVar6 == u7jVar9) {
                        if (i == 1 || i2 == 1) {
                            m92354p(v7jVar, u7jVar4, 0, u7jVar4, 0);
                            v7jVar.f238232d.f137065e.f231081m = v7jVar.m84886s();
                            v7jVar.f238234e.f137065e.f231081m = v7jVar.m84882m();
                        } else if (i2 == 2 && i == 2) {
                            u7j[] u7jVarArr2 = w7jVar.f238220U;
                            if (u7jVarArr2[0] == u7jVar5 && u7jVarArr2[1] == u7jVar5) {
                                m92354p(v7jVar, u7jVar5, (int) ((f * w7jVar.m84886s()) + 0.5f), u7jVar5, (int) ((f2 * w7jVar.m84882m()) + 0.5f));
                                v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                                v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                                v7jVar.f238226a = true;
                            }
                        }
                    }
                }
                it2 = it;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public ayo m92344e() {
        Context context = (Context) this.f267035c;
        c95.m31855u(!this.f267034b);
        this.f267034b = true;
        if (((qzn) this.f267037e) == null) {
            this.f267037e = new qzn(new t27[0]);
        }
        if (((l77) this.f267039g) == null) {
            if (((uxo) this.f267040h) == null) {
                this.f267040h = new uxo(context);
            }
            if (((y5i0) this.f267038f) == null) {
                this.f267038f = y5i0.f269450R0;
            }
            k77 k77Var = new k77(context);
            bu6 bu6Var = context != null ? null : (bu6) this.f267036d;
            Context context2 = (Context) k77Var.f119992b;
            if (context2 == null) {
                k77Var.f119995e = bu6Var;
            }
            uxo uxoVar = (uxo) this.f267040h;
            k77Var.f119993c = uxoVar;
            k77Var.f119994d = (y5i0) this.f267038f;
            if (uxoVar == null) {
                k77Var.f119993c = new uxo(context2);
            }
            this.f267039g = new l77(k77Var);
        } else {
            c95.m31855u(((uxo) this.f267040h) == null);
            c95.m31855u(((y5i0) this.f267038f) == null);
        }
        return new ayo(this);
    }

    /* JADX INFO: renamed from: f */
    public void m92345f() {
        w7j w7jVar = (w7j) this.f267035c;
        ArrayList arrayList = (ArrayList) this.f267040h;
        ArrayList<lud1> arrayList2 = (ArrayList) this.f267037e;
        arrayList2.clear();
        w7j w7jVar2 = (w7j) this.f267036d;
        w7jVar2.f238232d.mo29211f();
        w7jVar2.f238234e.mo29211f();
        arrayList2.add(w7jVar2.f238232d);
        arrayList2.add(w7jVar2.f238234e);
        HashSet hashSet = null;
        for (v7j v7jVar : w7jVar2.f248708u0) {
            if (v7jVar instanceof ka20) {
                la20 la20Var = new la20(v7jVar);
                v7jVar.f238232d.mo29211f();
                v7jVar.f238234e.mo29211f();
                la20Var.f137066f = ((ka20) v7jVar).f120764y0;
                arrayList2.add(la20Var);
            } else {
                if (v7jVar.m84893z()) {
                    if (v7jVar.f238228b == null) {
                        v7jVar.f238228b = new ejc(v7jVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(v7jVar.f238228b);
                } else {
                    arrayList2.add(v7jVar.f238232d);
                }
                if (v7jVar.m84857A()) {
                    if (v7jVar.f238230c == null) {
                        v7jVar.f238230c = new ejc(v7jVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(v7jVar.f238230c);
                } else {
                    arrayList2.add(v7jVar.f238234e);
                }
                if (v7jVar instanceof jq20) {
                    arrayList2.add(new iq20(v7jVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((lud1) it.next()).mo29211f();
        }
        for (lud1 lud1Var : arrayList2) {
            if (lud1Var.f137062b != w7jVar2) {
                lud1Var.mo29209d();
            }
        }
        arrayList.clear();
        m92349k(w7jVar.f238232d, 0, arrayList);
        m92349k(w7jVar.f238234e, 1, arrayList);
        this.f267033a = false;
    }

    /* JADX INFO: renamed from: g */
    public void m92346g() {
        ((yyi) this.f267038f).close();
        w561 w561Var = (w561) this.f267039g;
        if (w561Var != null) {
            w561Var.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public int m92347h(w7j w7jVar, int i) {
        ArrayList arrayList;
        int i2;
        long jMo39171j;
        float f;
        long j;
        ArrayList arrayList2 = (ArrayList) this.f267040h;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            lud1 lud1Var = ((hux0) arrayList2.get(i3)).f95482a;
            if (!(lud1Var instanceof ejc) ? !(i != 0 ? (lud1Var instanceof bhb1) : (lud1Var instanceof l730)) : ((ejc) lud1Var).f137066f != i) {
                ftq ftqVar = (i == 0 ? w7jVar.f238232d : w7jVar.f238234e).f137068h;
                ftq ftqVar2 = (i == 0 ? w7jVar.f238232d : w7jVar.f238234e).f137069i;
                ftq ftqVar3 = lud1Var.f137068h;
                ftq ftqVar4 = lud1Var.f137069i;
                boolean zContains = ftqVar3.f73276l.contains(ftqVar);
                boolean zContains2 = ftqVar4.f73276l.contains(ftqVar2);
                long jMo39171j2 = lud1Var.mo39171j();
                if (zContains && zContains2) {
                    long jM48701b = hux0.m48701b(ftqVar3, j2);
                    long jM48700a = hux0.m48700a(ftqVar4, j2);
                    long j3 = jM48701b - jMo39171j2;
                    int i4 = ftqVar4.f73270f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = ftqVar3.f73270f;
                    long j5 = ((-jM48700a) - jMo39171j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    v7j v7jVar = lud1Var.f137062b;
                    if (i == 0) {
                        f = v7jVar.f238237f0;
                    } else if (i == 1) {
                        f = v7jVar.f238239g0;
                    } else {
                        v7jVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jMo39171j = (((long) ftqVar3.f73270f) + ((((long) ((f2 * f) + 0.5f)) + jMo39171j2) + ((long) edb.m38555d(1.0f, f, f2, 0.5f)))) - ((long) ftqVar4.f73270f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        jMo39171j = Math.max(hux0.m48701b(ftqVar3, ftqVar3.f73270f), ((long) ftqVar3.f73270f) + jMo39171j2);
                    } else if (zContains2) {
                        jMo39171j = Math.max(-hux0.m48700a(ftqVar4, ftqVar4.f73270f), ((long) (-ftqVar4.f73270f)) + jMo39171j2);
                    } else {
                        jMo39171j = (lud1Var.mo39171j() + ((long) ftqVar3.f73270f)) - ((long) ftqVar4.f73270f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMo39171j = j2;
            }
            jMax = Math.max(jMax, jMo39171j);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j2 = 0;
        }
        return (int) jMax;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX INFO: renamed from: j */
    public boolean m92348j(int i, boolean z) {
        boolean z2;
        u7j u7jVar;
        ArrayList<lud1> arrayList = (ArrayList) this.f267037e;
        w7j w7jVar = (w7j) this.f267035c;
        boolean z3 = false;
        u7j u7jVarM84881l = w7jVar.m84881l(0);
        u7j u7jVarM84881l2 = w7jVar.m84881l(1);
        int iM84887t = w7jVar.m84887t();
        int iM84888u = w7jVar.m84888u();
        u7j u7jVar2 = u7j.f227710a;
        if (z && (u7jVarM84881l == (u7jVar = u7j.f227711b) || u7jVarM84881l2 == u7jVar)) {
            for (lud1 lud1Var : arrayList) {
                if (lud1Var.f137066f == i && !lud1Var.mo29212k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && u7jVarM84881l == u7jVar) {
                    w7jVar.m84868P(u7jVar2);
                    w7jVar.m84872T(m92347h(w7jVar, 0));
                    w7jVar.f238232d.f137065e.mo42686d(w7jVar.m84886s());
                }
            } else if (z && u7jVarM84881l2 == u7jVar) {
                w7jVar.m84870R(u7jVar2);
                w7jVar.m84867O(m92347h(w7jVar, 1));
                w7jVar.f238234e.f137065e.mo42686d(w7jVar.m84882m());
            }
        }
        u7j u7jVar3 = u7j.f227713d;
        if (i == 0) {
            u7j u7jVar4 = w7jVar.f238220U[0];
            if (u7jVar4 == u7jVar2 || u7jVar4 == u7jVar3) {
                int iM84886s = w7jVar.m84886s() + iM84887t;
                w7jVar.f238232d.f137069i.mo42686d(iM84886s);
                w7jVar.f238232d.f137065e.mo42686d(iM84886s - iM84887t);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            u7j u7jVar5 = w7jVar.f238220U[1];
            if (u7jVar5 == u7jVar2 || u7jVar5 == u7jVar3) {
                int iM84882m = w7jVar.m84882m() + iM84888u;
                w7jVar.f238234e.f137069i.mo42686d(iM84882m);
                w7jVar.f238234e.f137065e.mo42686d(iM84882m - iM84888u);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m92355q();
        for (lud1 lud1Var2 : arrayList) {
            if (lud1Var2.f137066f == i && (lud1Var2.f137062b != w7jVar || lud1Var2.f137067g)) {
                lud1Var2.mo29210e();
            }
        }
        for (lud1 lud1Var3 : arrayList) {
            if (lud1Var3.f137066f == i && (z2 || lud1Var3.f137062b != w7jVar)) {
                if (!lud1Var3.f137068h.f73274j || !lud1Var3.f137069i.f73274j || (!(lud1Var3 instanceof ejc) && !lud1Var3.f137065e.f73274j)) {
                    w7jVar.m84868P(u7jVarM84881l);
                    w7jVar.m84870R(u7jVarM84881l2);
                    return z3;
                }
            }
        }
        z3 = true;
        w7jVar.m84868P(u7jVarM84881l);
        w7jVar.m84870R(u7jVarM84881l2);
        return z3;
    }

    /* JADX INFO: renamed from: k */
    public void m92349k(lud1 lud1Var, int i, ArrayList arrayList) {
        ftq ftqVar = lud1Var.f137068h;
        ftq ftqVar2 = lud1Var.f137069i;
        for (ctq ctqVar : ftqVar.f73275k) {
            if (ctqVar instanceof ftq) {
                m92342c((ftq) ctqVar, i, arrayList, null);
            } else if (ctqVar instanceof lud1) {
                m92342c(((lud1) ctqVar).f137068h, i, arrayList, null);
            }
        }
        for (ctq ctqVar2 : ftqVar2.f73275k) {
            if (ctqVar2 instanceof ftq) {
                m92342c((ftq) ctqVar2, i, arrayList, null);
            } else if (ctqVar2 instanceof lud1) {
                m92342c(((lud1) ctqVar2).f137069i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (ctq ctqVar3 : ((bhb1) lud1Var).f27132k.f73275k) {
                if (ctqVar3 instanceof ftq) {
                    m92342c((ftq) ctqVar3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public w561 m92350l() {
        return (w561) this.f267039g;
    }

    /* JADX INFO: renamed from: m */
    public void m92351m() {
        this.f267033a = true;
    }

    /* JADX INFO: renamed from: n */
    public void m92352n() {
        this.f267034b = true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m92353o() {
        u561 u561Var = (u561) this.f267040h;
        if (u561Var != null) {
            return u561Var.isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m92354p(v7j v7jVar, u7j u7jVar, int i, u7j u7jVar2, int i2) {
        b29 b29Var = (b29) this.f267039g;
        b29Var.f22527a = u7jVar;
        b29Var.f22528b = u7jVar2;
        b29Var.f22529c = i;
        b29Var.f22530d = i2;
        ((c29) this.f267038f).mo31319b(v7jVar, b29Var);
        v7jVar.m84872T(b29Var.f22531e);
        v7jVar.m84867O(b29Var.f22532f);
        v7jVar.f238205F = b29Var.f22534h;
        v7jVar.m84863K(b29Var.f22533g);
    }

    /* JADX INFO: renamed from: q */
    public void m92355q() {
        t19 t19Var;
        for (v7j v7jVar : ((w7j) this.f267035c).f248708u0) {
            if (!v7jVar.f238226a) {
                u7j[] u7jVarArr = v7jVar.f238220U;
                boolean z = false;
                u7j u7jVar = u7jVarArr[0];
                u7j u7jVar2 = u7jVarArr[1];
                int i = v7jVar.f238262s;
                int i2 = v7jVar.f238264t;
                u7j u7jVar3 = u7j.f227712c;
                u7j u7jVar4 = u7j.f227711b;
                boolean z2 = u7jVar == u7jVar4 || (u7jVar == u7jVar3 && i == 1);
                if (u7jVar2 == u7jVar4 || (u7jVar2 == u7jVar3 && i2 == 1)) {
                    z = true;
                }
                ujr ujrVar = v7jVar.f238232d.f137065e;
                boolean z3 = ujrVar.f73274j;
                ujr ujrVar2 = v7jVar.f238234e.f137065e;
                boolean z4 = ujrVar2.f73274j;
                boolean z5 = z2;
                u7j u7jVar5 = u7j.f227710a;
                if (z3 && z4) {
                    m92354p(v7jVar, u7jVar5, ujrVar.f73271g, u7jVar5, ujrVar2.f73271g);
                    v7jVar.f238226a = true;
                } else if (z3 && z) {
                    m92354p(v7jVar, u7jVar5, ujrVar.f73271g, u7jVar4, ujrVar2.f73271g);
                    if (u7jVar2 == u7jVar3) {
                        v7jVar.f238234e.f137065e.f231081m = v7jVar.m84882m();
                    } else {
                        v7jVar.f238234e.f137065e.mo42686d(v7jVar.m84882m());
                        v7jVar.f238226a = true;
                    }
                } else if (z4 && z5) {
                    m92354p(v7jVar, u7jVar4, ujrVar.f73271g, u7jVar5, ujrVar2.f73271g);
                    if (u7jVar == u7jVar3) {
                        v7jVar.f238232d.f137065e.f231081m = v7jVar.m84886s();
                    } else {
                        v7jVar.f238232d.f137065e.mo42686d(v7jVar.m84886s());
                        v7jVar.f238226a = true;
                    }
                }
                if (v7jVar.f238226a && (t19Var = v7jVar.f238234e.f27133l) != null) {
                    t19Var.mo42686d(v7jVar.f238231c0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m92356r(yyx0 yyx0Var) {
        d180 d180Var = (d180) this.f267036d;
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (ezx0VarMo63454G1.mo24841E1() && ezx0VarMo63454G1.getLong(0) == 0) {
                z = true;
            }
            mif1.m61875i(ezx0VarMo63454G1, null);
            d180Var.mo33691a(yyx0Var);
            if (!z) {
                ezo ezoVarMo33697x = d180Var.mo33697x(yyx0Var);
                if (!ezoVarMo33697x.f64423b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ezoVarMo33697x.f64424c).toString());
                }
            }
            mif1.m61880o(yyx0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            mif1.m61880o(yyx0Var, frz0.m42522g((String) d180Var.f44187b));
            d180Var.mo33693s();
            Iterator it = ((List) this.f267037e).iterator();
            while (it.hasNext()) {
                ((jjx0) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mif1.m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m92357s(yyx0 yyx0Var, int i, int i2) {
        d180 d180Var = (d180) this.f267036d;
        dlo dloVar = (dlo) this.f267035c;
        List<xdf0> listM45747i = gue.m45747i(dloVar.f50271d, i, i2);
        if (listM45747i != null) {
            d180Var.mo33696w(yyx0Var);
            for (xdf0 xdf0Var : listM45747i) {
                xdf0Var.getClass();
                if (!(yyx0Var instanceof t561)) {
                    throw new xpj0("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                xdf0Var.mo25720a(((t561) yyx0Var).f217224a);
            }
            ezo ezoVarMo33697x = d180Var.mo33697x(yyx0Var);
            if (!ezoVarMo33697x.f64423b) {
                throw new IllegalStateException(("Migration didn't properly handle: " + ezoVarMo33697x.f64424c).toString());
            }
            d180Var.mo33695v();
            mif1.m61880o(yyx0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            mif1.m61880o(yyx0Var, frz0.m42522g((String) d180Var.f44187b));
            return;
        }
        if (gue.m45753o(dloVar, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (dloVar.f50286s) {
            ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ro80 ro80VarM44508o = geg1.m44508o();
                while (ezx0VarMo63454G1.mo24841E1()) {
                    String strMo24844h1 = ezx0VarMo63454G1.mo24844h1(0);
                    if (!bm51.m29803n0(strMo24844h1, "sqlite_", false) && !strMo24844h1.equals("android_metadata")) {
                        ro80VarM44508o.add(new pqm0(strMo24844h1, Boolean.valueOf(wj50.m88271j(ezx0VarMo63454G1.mo24844h1(1), "view"))));
                    }
                }
                ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                mif1.m61875i(ezx0VarMo63454G1, null);
                ListIterator listIterator = ro80VarM44506m.listIterator(0);
                while (true) {
                    qo80 qo80Var = (qo80) listIterator;
                    if (!qo80Var.hasNext()) {
                        break;
                    }
                    pqm0 pqm0Var = (pqm0) qo80Var.next();
                    String str = (String) pqm0Var.f180350a;
                    if (((Boolean) pqm0Var.f180351b).booleanValue()) {
                        mif1.m61880o(yyx0Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        mif1.m61880o(yyx0Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    mif1.m61875i(ezx0VarMo63454G1, th);
                    throw th2;
                }
            }
        } else {
            d180Var.mo33692c(yyx0Var);
        }
        Iterator it = ((List) this.f267037e).iterator();
        while (it.hasNext()) {
            ((jjx0) it.next()).getClass();
        }
        d180Var.mo33691a(yyx0Var);
    }

    /* JADX INFO: renamed from: t */
    public void m92358t(yyx0 yyx0Var) throws Throwable {
        Object c6x0Var;
        d180 d180Var = (d180) this.f267036d;
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = ezx0VarMo63454G1.mo24841E1() && ezx0VarMo63454G1.getLong(0) != 0;
            mif1.m61875i(ezx0VarMo63454G1, null);
            if (z) {
                ezx0 ezx0VarMo63454G2 = yyx0Var.mo63454G1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo24844h1 = ezx0VarMo63454G2.mo24841E1() ? ezx0VarMo63454G2.mo24844h1(0) : null;
                    mif1.m61875i(ezx0VarMo63454G2, null);
                    if (!((String) d180Var.f44187b).equals(strMo24844h1) && !((String) d180Var.f44188c).equals(strMo24844h1)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) d180Var.f44187b) + ", found: " + strMo24844h1).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        mif1.m61875i(ezx0VarMo63454G2, th);
                        throw th2;
                    }
                }
            } else {
                mif1.m61880o(yyx0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    ezo ezoVarMo33697x = d180Var.mo33697x(yyx0Var);
                    if (!ezoVarMo33697x.f64423b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ezoVarMo33697x.f64424c).toString());
                    }
                    d180Var.mo33695v();
                    mif1.m61880o(yyx0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    mif1.m61880o(yyx0Var, frz0.m42522g((String) d180Var.f44187b));
                    c6x0Var = w2a1.f247311a;
                    if (!(c6x0Var instanceof c6x0)) {
                        mif1.m61880o(yyx0Var, "END TRANSACTION");
                    }
                    Throwable thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a != null) {
                        mif1.m61880o(yyx0Var, "ROLLBACK TRANSACTION");
                        throw thM77348a;
                    }
                } catch (Throwable th3) {
                    c6x0Var = new c6x0(th3);
                }
            }
            d180Var.mo33694u(yyx0Var);
            for (jjx0 jjx0Var : (List) this.f267037e) {
                jjx0Var.getClass();
                if (yyx0Var instanceof t561) {
                    jjx0Var.mo45017a(((t561) yyx0Var).f217224a);
                }
            }
            this.f267033a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                mif1.m61875i(ezx0VarMo63454G1, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m92359u(c29 c29Var) {
        this.f267038f = c29Var;
    }

    /* JADX INFO: renamed from: v */
    public Object m92360v(boolean z, th00 th00Var, ibk ibkVar) {
        return ((yyi) this.f267038f).mo31033j0(z, th00Var, ibkVar);
    }

    public xxo(dlo dloVar, rv70 rv70Var, a1m0 a1m0Var) {
        this.f267035c = dloVar;
        this.f267036d = new ejx0(-1, "", "");
        List list = dloVar.f50272e;
        lau lauVar = lau.f131415a;
        this.f267037e = list == null ? lauVar : list;
        dlo dloVar2 = new dlo(dloVar.f50268a, dloVar.f50269b, dloVar.f50270c, dloVar.f50271d, g6f.m43701O0(new gjx0(new rv70(this, 18)), list == null ? lauVar : list), dloVar.f50273f, dloVar.f50274g, dloVar.f50275h, dloVar.f50276i, dloVar.f50277j, dloVar.f50278k, dloVar.f50279l, dloVar.f50280m, dloVar.f50281n, dloVar.f50282o, dloVar.f50283p, dloVar.f50284q, dloVar.f50285r, dloVar.f50286s, dloVar.f50287t, dloVar.f50288u);
        dloVar2.f50289v = dloVar.f50289v;
        w561 w561VarMo1159h = ((ljx0) rv70Var.f203018b).mo1159h(dloVar2);
        this.f267039g = w561VarMo1159h;
        w221 w221Var = new w221(w561VarMo1159h, 13);
        String str = dloVar.f50269b;
        this.f267038f = new i8n0(w221Var, str == null ? ":memory:" : str, a1m0Var);
        boolean z = dloVar.f50274g == 3;
        if (w561VarMo1159h != null) {
            w561VarMo1159h.setWriteAheadLoggingEnabled(z);
        }
    }

    public xxo(dlo dloVar, d180 d180Var, a1m0 a1m0Var) {
        int i;
        Object bziVar;
        int i2 = dloVar.f50274g;
        String str = dloVar.f50269b;
        v561 v561Var = dloVar.f50270c;
        zyx0 zyx0Var = dloVar.f50287t;
        this.f267035c = dloVar;
        this.f267036d = d180Var;
        Object obj = dloVar.f50272e;
        this.f267037e = obj == null ? lau.f131415a : obj;
        if (zyx0Var != null) {
            this.f267039g = null;
            if (zyx0Var.mo31889l()) {
                bziVar = new i8n0(new c97(this, zyx0Var), str == null ? ":memory:" : str, a1m0Var);
            } else {
                String str2 = dloVar.f50269b;
                if (str2 == null) {
                    bziVar = new bzi(new c97(this, zyx0Var));
                } else {
                    c97 c97Var = new c97(this, zyx0Var);
                    int iM38547C = edb.m38547C(i2);
                    if (iM38547C == 1) {
                        i = 1;
                    } else {
                        if (iM38547C != 2) {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + o7t0.m66401o(i2) + '\'').toString());
                        }
                        i = 4;
                    }
                    int iM38547C2 = edb.m38547C(i2);
                    if (iM38547C2 != 1 && iM38547C2 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + o7t0.m66401o(i2) + '\'').toString());
                    }
                    bziVar = new bzi(c97Var, str2, i);
                }
            }
            this.f267038f = bziVar;
        } else if (v561Var != null) {
            w561 w561VarMo72589e = v561Var.mo72589e(new ey9(dloVar.f50268a, str, (ov50) new fjx0(this, d180Var.f44186a), false, false));
            this.f267039g = w561VarMo72589e;
            this.f267038f = new i8n0(new w221(w561VarMo72589e, 13), str == null ? ":memory:" : str, a1m0Var);
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z = i2 == 3;
        w561 w561Var = (w561) this.f267039g;
        if (w561Var != null) {
            w561Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public xxo(xre xreVar, l4w0 l4w0Var, u4w0 u4w0Var, nbn nbnVar, h1k h1kVar, n011 n011Var, boolean z, boolean z2) {
        this.f267035c = xreVar;
        this.f267036d = l4w0Var;
        this.f267037e = u4w0Var;
        this.f267038f = nbnVar;
        this.f267039g = h1kVar;
        this.f267040h = n011Var;
        this.f267033a = z;
        this.f267034b = z2;
    }

    public xxo(w7j w7jVar) {
        this.f267033a = true;
        this.f267034b = true;
        this.f267037e = new ArrayList();
        new ArrayList();
        this.f267038f = null;
        this.f267039g = new b29();
        this.f267040h = new ArrayList();
        this.f267035c = w7jVar;
        this.f267036d = w7jVar;
    }

    public xxo(Context context) {
        this.f267035c = context;
        this.f267036d = bu6.f31028f;
    }
}
