package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bhb1 extends lud1 {

    /* JADX INFO: renamed from: k */
    public ftq f27132k;

    /* JADX INFO: renamed from: l */
    public t19 f27133l;

    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (edb.m38547C(this.f137070j) == 3) {
            v7j v7jVar = this.f137062b;
            m59949l(v7jVar.f238210K, v7jVar.f238212M, 1);
            return;
        }
        ujr ujrVar = this.f137065e;
        boolean z = ujrVar.f73267c;
        u7j u7jVar = u7j.f227712c;
        if (z && !ujrVar.f73274j && this.f137064d == u7jVar) {
            v7j v7jVar2 = this.f137062b;
            int i2 = v7jVar2.f238264t;
            if (i2 == 2) {
                v7j v7jVar3 = v7jVar2.f238221V;
                if (v7jVar3 != null) {
                    ujr ujrVar2 = v7jVar3.f238234e.f137065e;
                    if (ujrVar2.f73274j) {
                        ujrVar.mo42686d((int) ((ujrVar2.f73271g * v7jVar2.f238200A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                ujr ujrVar3 = v7jVar2.f238232d.f137065e;
                if (ujrVar3.f73274j) {
                    int i3 = v7jVar2.f238225Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = ujrVar3.f73271g * v7jVar2.f238224Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = ujrVar3.f73271g;
                            f2 = v7jVar2.f238224Y;
                        }
                        ujrVar.mo42686d(i);
                    } else {
                        f = ujrVar3.f73271g;
                        f2 = v7jVar2.f238224Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    ujrVar.mo42686d(i);
                }
            }
        }
        ftq ftqVar = this.f137068h;
        boolean z2 = ftqVar.f73267c;
        ArrayList arrayList = ftqVar.f73276l;
        if (z2) {
            ftq ftqVar2 = this.f137069i;
            boolean z3 = ftqVar2.f73267c;
            ArrayList arrayList2 = ftqVar2.f73276l;
            if (z3) {
                if (ftqVar.f73274j && ftqVar2.f73274j && ujrVar.f73274j) {
                    return;
                }
                if (!ujrVar.f73274j && this.f137064d == u7jVar) {
                    v7j v7jVar4 = this.f137062b;
                    if (v7jVar4.f238262s == 0 && !v7jVar4.m84857A()) {
                        ftq ftqVar3 = (ftq) arrayList.get(0);
                        ftq ftqVar4 = (ftq) arrayList2.get(0);
                        int i4 = ftqVar3.f73271g + ftqVar.f73270f;
                        int i5 = ftqVar4.f73271g + ftqVar2.f73270f;
                        ftqVar.mo42686d(i4);
                        ftqVar2.mo42686d(i5);
                        ujrVar.mo42686d(i5 - i4);
                        return;
                    }
                }
                if (!ujrVar.f73274j && this.f137064d == u7jVar && this.f137061a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ftq ftqVar5 = (ftq) arrayList.get(0);
                    int i6 = (((ftq) arrayList2.get(0)).f73271g + ftqVar2.f73270f) - (ftqVar5.f73271g + ftqVar.f73270f);
                    int i7 = ujrVar.f231081m;
                    if (i6 < i7) {
                        ujrVar.mo42686d(i6);
                    } else {
                        ujrVar.mo42686d(i7);
                    }
                }
                if (ujrVar.f73274j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ftq ftqVar6 = (ftq) arrayList.get(0);
                    ftq ftqVar7 = (ftq) arrayList2.get(0);
                    int i8 = ftqVar6.f73271g;
                    int i9 = ftqVar.f73270f + i8;
                    int i10 = ftqVar7.f73271g;
                    int i11 = ftqVar2.f73270f + i10;
                    float f4 = this.f137062b.f238239g0;
                    if (ftqVar6 == ftqVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    ftqVar.mo42686d((int) ((((i10 - i8) - ujrVar.f73271g) * f4) + i8 + 0.5f));
                    ftqVar2.mo42686d(ftqVar.f73271g + ujrVar.f73271g);
                }
            }
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: d */
    public final void mo29209d() {
        v7j v7jVar;
        v7j v7jVar2;
        v7j v7jVar3;
        v7j v7jVar4;
        ftq ftqVar = this.f27132k;
        v7j v7jVar5 = this.f137062b;
        boolean z = v7jVar5.f238226a;
        ujr ujrVar = this.f137065e;
        if (z) {
            ujrVar.mo42686d(v7jVar5.m84882m());
        }
        boolean z2 = ujrVar.f73274j;
        ArrayList arrayList = ujrVar.f73275k;
        ArrayList arrayList2 = ujrVar.f73276l;
        u7j u7jVar = u7j.f227713d;
        u7j u7jVar2 = u7j.f227710a;
        u7j u7jVar3 = u7j.f227712c;
        ftq ftqVar2 = this.f137069i;
        ftq ftqVar3 = this.f137068h;
        if (!z2) {
            v7j v7jVar6 = this.f137062b;
            this.f137064d = v7jVar6.f238220U[1];
            if (v7jVar6.f238205F) {
                this.f27133l = new t19(this);
            }
            u7j u7jVar4 = this.f137064d;
            if (u7jVar4 != u7jVar3) {
                if (u7jVar4 == u7jVar && (v7jVar4 = this.f137062b.f238221V) != null && v7jVar4.f238220U[1] == u7jVar2) {
                    int iM84882m = (v7jVar4.m84882m() - this.f137062b.f238210K.m31571e()) - this.f137062b.f238212M.m31571e();
                    lud1.m59944b(ftqVar3, v7jVar4.f238234e.f137068h, this.f137062b.f238210K.m31571e());
                    lud1.m59944b(ftqVar2, v7jVar4.f238234e.f137069i, -this.f137062b.f238212M.m31571e());
                    ujrVar.mo42686d(iM84882m);
                    return;
                }
                if (u7jVar4 == u7jVar2) {
                    ujrVar.mo42686d(this.f137062b.m84882m());
                }
            }
        } else if (this.f137064d == u7jVar && (v7jVar2 = (v7jVar = this.f137062b).f238221V) != null && v7jVar2.f238220U[1] == u7jVar2) {
            lud1.m59944b(ftqVar3, v7jVar2.f238234e.f137068h, v7jVar.f238210K.m31571e());
            lud1.m59944b(ftqVar2, v7jVar2.f238234e.f137069i, -this.f137062b.f238212M.m31571e());
            return;
        }
        boolean z3 = ujrVar.f73274j;
        if (z3) {
            v7j v7jVar7 = this.f137062b;
            if (v7jVar7.f238226a) {
                c6j[] c6jVarArr = v7jVar7.f238217R;
                c6j c6jVar = c6jVarArr[2];
                c6j c6jVar2 = c6jVar.f34551f;
                if (c6jVar2 != null && c6jVarArr[3].f34551f != null) {
                    if (v7jVar7.m84857A()) {
                        ftqVar3.f73270f = this.f137062b.f238217R[2].m31571e();
                        ftqVar2.f73270f = -this.f137062b.f238217R[3].m31571e();
                    } else {
                        ftq ftqVarM59945h = lud1.m59945h(this.f137062b.f238217R[2]);
                        if (ftqVarM59945h != null) {
                            lud1.m59944b(ftqVar3, ftqVarM59945h, this.f137062b.f238217R[2].m31571e());
                        }
                        ftq ftqVarM59945h2 = lud1.m59945h(this.f137062b.f238217R[3]);
                        if (ftqVarM59945h2 != null) {
                            lud1.m59944b(ftqVar2, ftqVarM59945h2, -this.f137062b.f238217R[3].m31571e());
                        }
                        ftqVar3.f73266b = true;
                        ftqVar2.f73266b = true;
                    }
                    v7j v7jVar8 = this.f137062b;
                    if (v7jVar8.f238205F) {
                        lud1.m59944b(ftqVar, ftqVar3, v7jVar8.f238231c0);
                        return;
                    }
                    return;
                }
                if (c6jVar2 != null) {
                    ftq ftqVarM59945h3 = lud1.m59945h(c6jVar);
                    if (ftqVarM59945h3 != null) {
                        lud1.m59944b(ftqVar3, ftqVarM59945h3, this.f137062b.f238217R[2].m31571e());
                        lud1.m59944b(ftqVar2, ftqVar3, ujrVar.f73271g);
                        v7j v7jVar9 = this.f137062b;
                        if (v7jVar9.f238205F) {
                            lud1.m59944b(ftqVar, ftqVar3, v7jVar9.f238231c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c6j c6jVar3 = c6jVarArr[3];
                if (c6jVar3.f34551f != null) {
                    ftq ftqVarM59945h4 = lud1.m59945h(c6jVar3);
                    if (ftqVarM59945h4 != null) {
                        lud1.m59944b(ftqVar2, ftqVarM59945h4, -this.f137062b.f238217R[3].m31571e());
                        lud1.m59944b(ftqVar3, ftqVar2, -ujrVar.f73271g);
                    }
                    v7j v7jVar10 = this.f137062b;
                    if (v7jVar10.f238205F) {
                        lud1.m59944b(ftqVar, ftqVar3, v7jVar10.f238231c0);
                        return;
                    }
                    return;
                }
                c6j c6jVar4 = c6jVarArr[4];
                if (c6jVar4.f34551f != null) {
                    ftq ftqVarM59945h5 = lud1.m59945h(c6jVar4);
                    if (ftqVarM59945h5 != null) {
                        lud1.m59944b(ftqVar, ftqVarM59945h5, 0);
                        lud1.m59944b(ftqVar3, ftqVar, -this.f137062b.f238231c0);
                        lud1.m59944b(ftqVar2, ftqVar3, ujrVar.f73271g);
                        return;
                    }
                    return;
                }
                if ((v7jVar7 instanceof jq20) || v7jVar7.f238221V == null || v7jVar7.mo55866k(7).f34551f != null) {
                    return;
                }
                v7j v7jVar11 = this.f137062b;
                lud1.m59944b(ftqVar3, v7jVar11.f238221V.f238234e.f137068h, v7jVar11.m84888u());
                lud1.m59944b(ftqVar2, ftqVar3, ujrVar.f73271g);
                v7j v7jVar12 = this.f137062b;
                if (v7jVar12.f238205F) {
                    lud1.m59944b(ftqVar, ftqVar3, v7jVar12.f238231c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f137064d != u7jVar3) {
            ujrVar.m42684b(this);
        } else {
            v7j v7jVar13 = this.f137062b;
            int i = v7jVar13.f238264t;
            if (i == 2) {
                v7j v7jVar14 = v7jVar13.f238221V;
                if (v7jVar14 != null) {
                    ujr ujrVar2 = v7jVar14.f238234e.f137065e;
                    arrayList2.add(ujrVar2);
                    ujrVar2.f73275k.add(ujrVar);
                    ujrVar.f73266b = true;
                    arrayList.add(ftqVar3);
                    arrayList.add(ftqVar2);
                }
            } else if (i == 3 && !v7jVar13.m84857A()) {
                v7j v7jVar15 = this.f137062b;
                if (v7jVar15.f238262s != 3) {
                    ujr ujrVar3 = v7jVar15.f238232d.f137065e;
                    arrayList2.add(ujrVar3);
                    ujrVar3.f73275k.add(ujrVar);
                    ujrVar.f73266b = true;
                    arrayList.add(ftqVar3);
                    arrayList.add(ftqVar2);
                }
            }
        }
        v7j v7jVar16 = this.f137062b;
        c6j[] c6jVarArr2 = v7jVar16.f238217R;
        c6j c6jVar5 = c6jVarArr2[2];
        c6j c6jVar6 = c6jVar5.f34551f;
        if (c6jVar6 != null && c6jVarArr2[3].f34551f != null) {
            if (v7jVar16.m84857A()) {
                ftqVar3.f73270f = this.f137062b.f238217R[2].m31571e();
                ftqVar2.f73270f = -this.f137062b.f238217R[3].m31571e();
            } else {
                ftq ftqVarM59945h6 = lud1.m59945h(this.f137062b.f238217R[2]);
                ftq ftqVarM59945h7 = lud1.m59945h(this.f137062b.f238217R[3]);
                if (ftqVarM59945h6 != null) {
                    ftqVarM59945h6.m42684b(this);
                }
                if (ftqVarM59945h7 != null) {
                    ftqVarM59945h7.m42684b(this);
                }
                this.f137070j = 4;
            }
            if (this.f137062b.f238205F) {
                m59947c(ftqVar, ftqVar3, 1, this.f27133l);
            }
        } else if (c6jVar6 != null) {
            ftq ftqVarM59945h8 = lud1.m59945h(c6jVar5);
            if (ftqVarM59945h8 != null) {
                lud1.m59944b(ftqVar3, ftqVarM59945h8, this.f137062b.f238217R[2].m31571e());
                m59947c(ftqVar2, ftqVar3, 1, ujrVar);
                if (this.f137062b.f238205F) {
                    m59947c(ftqVar, ftqVar3, 1, this.f27133l);
                }
                if (this.f137064d == u7jVar3) {
                    v7j v7jVar17 = this.f137062b;
                    if (v7jVar17.f238224Y > 0.0f) {
                        l730 l730Var = v7jVar17.f238232d;
                        if (l730Var.f137064d == u7jVar3) {
                            l730Var.f137065e.f73275k.add(ujrVar);
                            arrayList2.add(this.f137062b.f238232d.f137065e);
                            ujrVar.f73265a = this;
                        }
                    }
                }
            }
        } else {
            c6j c6jVar7 = c6jVarArr2[3];
            if (c6jVar7.f34551f != null) {
                ftq ftqVarM59945h9 = lud1.m59945h(c6jVar7);
                if (ftqVarM59945h9 != null) {
                    lud1.m59944b(ftqVar2, ftqVarM59945h9, -this.f137062b.f238217R[3].m31571e());
                    m59947c(ftqVar3, ftqVar2, -1, ujrVar);
                    if (this.f137062b.f238205F) {
                        m59947c(ftqVar, ftqVar3, 1, this.f27133l);
                    }
                }
            } else {
                c6j c6jVar8 = c6jVarArr2[4];
                if (c6jVar8.f34551f != null) {
                    ftq ftqVarM59945h10 = lud1.m59945h(c6jVar8);
                    if (ftqVarM59945h10 != null) {
                        lud1.m59944b(ftqVar, ftqVarM59945h10, 0);
                        m59947c(ftqVar3, ftqVar, -1, this.f27133l);
                        m59947c(ftqVar2, ftqVar3, 1, ujrVar);
                    }
                } else if (!(v7jVar16 instanceof jq20) && (v7jVar3 = v7jVar16.f238221V) != null) {
                    lud1.m59944b(ftqVar3, v7jVar3.f238234e.f137068h, v7jVar16.m84888u());
                    m59947c(ftqVar2, ftqVar3, 1, ujrVar);
                    if (this.f137062b.f238205F) {
                        m59947c(ftqVar, ftqVar3, 1, this.f27133l);
                    }
                    if (this.f137064d == u7jVar3) {
                        v7j v7jVar18 = this.f137062b;
                        if (v7jVar18.f238224Y > 0.0f) {
                            l730 l730Var2 = v7jVar18.f238232d;
                            if (l730Var2.f137064d == u7jVar3) {
                                l730Var2.f137065e.f73275k.add(ujrVar);
                                arrayList2.add(this.f137062b.f238232d.f137065e);
                                ujrVar.f73265a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            ujrVar.f73267c = true;
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: e */
    public final void mo29210e() {
        ftq ftqVar = this.f137068h;
        if (ftqVar.f73274j) {
            this.f137062b.f238229b0 = ftqVar.f73271g;
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: f */
    public final void mo29211f() {
        this.f137063c = null;
        this.f137068h.m42685c();
        this.f137069i.m42685c();
        this.f27132k.m42685c();
        this.f137065e.m42685c();
        this.f137067g = false;
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: k */
    public final boolean mo29212k() {
        return this.f137064d != u7j.f227712c || this.f137062b.f238264t == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m29213m() {
        this.f137067g = false;
        ftq ftqVar = this.f137068h;
        ftqVar.m42685c();
        ftqVar.f73274j = false;
        ftq ftqVar2 = this.f137069i;
        ftqVar2.m42685c();
        ftqVar2.f73274j = false;
        ftq ftqVar3 = this.f27132k;
        ftqVar3.m42685c();
        ftqVar3.f73274j = false;
        this.f137065e.f73274j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f137062b.f238247k0;
    }
}
