package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l730 extends lud1 {

    /* JADX INFO: renamed from: k */
    public static final int[] f130554k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m58389m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        float f;
        int iM59948g;
        int i;
        int iM59948g2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (edb.m38547C(this.f137070j) == 3) {
            v7j v7jVar = this.f137062b;
            m59949l(v7jVar.f238209J, v7jVar.f238211L, 0);
            return;
        }
        ujr ujrVar = this.f137065e;
        boolean z = ujrVar.f73274j;
        u7j u7jVar = u7j.f227712c;
        ftq ftqVar = this.f137068h;
        ftq ftqVar2 = this.f137069i;
        if (z || this.f137064d != u7jVar) {
            f = 0.5f;
        } else {
            v7j v7jVar2 = this.f137062b;
            int i3 = v7jVar2.f238262s;
            if (i3 == 2) {
                f = 0.5f;
                v7j v7jVar3 = v7jVar2.f238221V;
                if (v7jVar3 != null) {
                    ujr ujrVar2 = v7jVar3.f238232d.f137065e;
                    if (ujrVar2.f73274j) {
                        ujrVar.mo42686d((int) ((ujrVar2.f73271g * v7jVar2.f238269x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = v7jVar2.f238264t;
                if (i4 == 0 || i4 == 3) {
                    bhb1 bhb1Var = v7jVar2.f238234e;
                    ftq ftqVar3 = bhb1Var.f137068h;
                    ftq ftqVar4 = bhb1Var.f137069i;
                    boolean z2 = v7jVar2.f238209J.f34551f != null;
                    boolean z3 = v7jVar2.f238210K.f34551f != null;
                    boolean z4 = v7jVar2.f238211L.f34551f != null;
                    boolean z5 = v7jVar2.f238212M.f34551f != null;
                    f = 0.5f;
                    int i5 = v7jVar2.f238225Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = v7jVar2.f238224Y;
                        boolean z6 = ftqVar3.f73274j;
                        ArrayList arrayList = ftqVar3.f73276l;
                        int[] iArr = f130554k;
                        if (z6 && ftqVar4.f73274j) {
                            if (ftqVar.f73267c && ftqVar2.f73267c) {
                                m58389m(iArr, ((ftq) ftqVar.f73276l.get(0)).f73271g + ftqVar.f73270f, ((ftq) ftqVar2.f73276l.get(0)).f73271g - ftqVar2.f73270f, ftqVar3.f73271g + ftqVar3.f73270f, ftqVar4.f73271g - ftqVar4.f73270f, f5, i5);
                                ujrVar.mo42686d(iArr[0]);
                                this.f137062b.f238234e.f137065e.mo42686d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (ftqVar.f73274j && ftqVar2.f73274j) {
                            if (!ftqVar3.f73267c || !ftqVar4.f73267c) {
                                return;
                            }
                            m58389m(iArr, ftqVar.f73271g + ftqVar.f73270f, ftqVar2.f73271g - ftqVar2.f73270f, ((ftq) arrayList.get(0)).f73271g + ftqVar3.f73270f, ((ftq) ftqVar4.f73276l.get(0)).f73271g - ftqVar4.f73270f, f5, i5);
                            ujrVar.mo42686d(iArr[0]);
                            this.f137062b.f238234e.f137065e.mo42686d(iArr[1]);
                        }
                        if (!ftqVar.f73267c || !ftqVar2.f73267c || !ftqVar3.f73267c || !ftqVar4.f73267c) {
                            return;
                        }
                        m58389m(iArr, ((ftq) ftqVar.f73276l.get(0)).f73271g + ftqVar.f73270f, ((ftq) ftqVar2.f73276l.get(0)).f73271g - ftqVar2.f73270f, ((ftq) arrayList.get(0)).f73271g + ftqVar3.f73270f, ((ftq) ftqVar4.f73276l.get(0)).f73271g - ftqVar4.f73270f, f5, i5);
                        ujrVar.mo42686d(iArr[0]);
                        this.f137062b.f238234e.f137065e.mo42686d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!ftqVar.f73267c || !ftqVar2.f73267c) {
                            return;
                        }
                        float f6 = v7jVar2.f238224Y;
                        int i6 = ((ftq) ftqVar.f73276l.get(0)).f73271g + ftqVar.f73270f;
                        int i7 = ((ftq) ftqVar2.f73276l.get(0)).f73271g - ftqVar2.f73270f;
                        if (i5 == -1 || i5 == 0) {
                            int iM59948g3 = m59948g(i7 - i6, 0);
                            int i8 = (int) ((iM59948g3 * f6) + 0.5f);
                            int iM59948g4 = m59948g(i8, 1);
                            if (i8 != iM59948g4) {
                                iM59948g3 = (int) ((iM59948g4 / f6) + 0.5f);
                            }
                            ujrVar.mo42686d(iM59948g3);
                            this.f137062b.f238234e.f137065e.mo42686d(iM59948g4);
                        } else if (i5 == 1) {
                            int iM59948g5 = m59948g(i7 - i6, 0);
                            int i9 = (int) ((iM59948g5 / f6) + 0.5f);
                            int iM59948g6 = m59948g(i9, 1);
                            if (i9 != iM59948g6) {
                                iM59948g5 = (int) ((iM59948g6 * f6) + 0.5f);
                            }
                            ujrVar.mo42686d(iM59948g5);
                            this.f137062b.f238234e.f137065e.mo42686d(iM59948g6);
                        }
                    } else if (z3 && z5) {
                        if (!ftqVar3.f73267c || !ftqVar4.f73267c) {
                            return;
                        }
                        float f7 = v7jVar2.f238224Y;
                        int i10 = ((ftq) ftqVar3.f73276l.get(0)).f73271g + ftqVar3.f73270f;
                        int i11 = ((ftq) ftqVar4.f73276l.get(0)).f73271g - ftqVar4.f73270f;
                        if (i5 == -1) {
                            iM59948g = m59948g(i11 - i10, 1);
                            i = (int) ((iM59948g / f7) + 0.5f);
                            iM59948g2 = m59948g(i, 0);
                            if (i != iM59948g2) {
                                iM59948g = (int) ((iM59948g2 * f7) + 0.5f);
                            }
                            ujrVar.mo42686d(iM59948g2);
                            this.f137062b.f238234e.f137065e.mo42686d(iM59948g);
                        } else if (i5 == 0) {
                            int iM59948g7 = m59948g(i11 - i10, 1);
                            int i12 = (int) ((iM59948g7 * f7) + 0.5f);
                            int iM59948g8 = m59948g(i12, 0);
                            if (i12 != iM59948g8) {
                                iM59948g7 = (int) ((iM59948g8 / f7) + 0.5f);
                            }
                            ujrVar.mo42686d(iM59948g8);
                            this.f137062b.f238234e.f137065e.mo42686d(iM59948g7);
                        } else if (i5 == 1) {
                            iM59948g = m59948g(i11 - i10, 1);
                            i = (int) ((iM59948g / f7) + 0.5f);
                            iM59948g2 = m59948g(i, 0);
                            if (i != iM59948g2) {
                                iM59948g = (int) ((iM59948g2 * f7) + 0.5f);
                            }
                            ujrVar.mo42686d(iM59948g2);
                            this.f137062b.f238234e.f137065e.mo42686d(iM59948g);
                        }
                    }
                } else {
                    int i13 = v7jVar2.f238225Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = v7jVar2.f238234e.f137065e.f73271g / v7jVar2.f238224Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = v7jVar2.f238234e.f137065e.f73271g;
                            f3 = v7jVar2.f238224Y;
                        }
                        ujrVar.mo42686d(i2);
                        f = 0.5f;
                    } else {
                        f2 = v7jVar2.f238234e.f137065e.f73271g;
                        f3 = v7jVar2.f238224Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    ujrVar.mo42686d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = ftqVar.f73267c;
        ArrayList arrayList2 = ftqVar.f73276l;
        if (z7) {
            boolean z8 = ftqVar2.f73267c;
            ArrayList arrayList3 = ftqVar2.f73276l;
            if (z8) {
                if (ftqVar.f73274j && ftqVar2.f73274j && ujrVar.f73274j) {
                    return;
                }
                if (!ujrVar.f73274j && this.f137064d == u7jVar) {
                    v7j v7jVar4 = this.f137062b;
                    if (v7jVar4.f238262s == 0 && !v7jVar4.m84893z()) {
                        ftq ftqVar5 = (ftq) arrayList2.get(0);
                        ftq ftqVar6 = (ftq) arrayList3.get(0);
                        int i14 = ftqVar5.f73271g + ftqVar.f73270f;
                        int i15 = ftqVar6.f73271g + ftqVar2.f73270f;
                        ftqVar.mo42686d(i14);
                        ftqVar2.mo42686d(i15);
                        ujrVar.mo42686d(i15 - i14);
                        return;
                    }
                }
                if (!ujrVar.f73274j && this.f137064d == u7jVar && this.f137061a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((ftq) arrayList3.get(0)).f73271g + ftqVar2.f73270f) - (((ftq) arrayList2.get(0)).f73271g + ftqVar.f73270f), ujrVar.f231081m);
                    v7j v7jVar5 = this.f137062b;
                    int i16 = v7jVar5.f238268w;
                    int iMax = Math.max(v7jVar5.f238267v, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    ujrVar.mo42686d(iMax);
                }
                if (ujrVar.f73274j) {
                    ftq ftqVar7 = (ftq) arrayList2.get(0);
                    ftq ftqVar8 = (ftq) arrayList3.get(0);
                    int i17 = ftqVar7.f73271g;
                    int i18 = ftqVar.f73270f + i17;
                    int i19 = ftqVar8.f73271g;
                    int i20 = ftqVar2.f73270f + i19;
                    float f8 = this.f137062b.f238237f0;
                    if (ftqVar7 == ftqVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    ftqVar.mo42686d((int) ((((i19 - i17) - ujrVar.f73271g) * f8) + i17 + f));
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
        u7j u7jVar;
        v7j v7jVar3;
        v7j v7jVar4;
        u7j u7jVar2;
        v7j v7jVar5 = this.f137062b;
        boolean z = v7jVar5.f238226a;
        ujr ujrVar = this.f137065e;
        if (z) {
            ujrVar.mo42686d(v7jVar5.m84886s());
        }
        boolean z2 = ujrVar.f73274j;
        ArrayList arrayList = ujrVar.f73275k;
        ArrayList arrayList2 = ujrVar.f73276l;
        u7j u7jVar3 = u7j.f227713d;
        u7j u7jVar4 = u7j.f227712c;
        u7j u7jVar5 = u7j.f227710a;
        ftq ftqVar = this.f137069i;
        ftq ftqVar2 = this.f137068h;
        if (!z2) {
            v7j v7jVar6 = this.f137062b;
            u7j u7jVar6 = v7jVar6.f238220U[0];
            this.f137064d = u7jVar6;
            if (u7jVar6 != u7jVar4) {
                if (u7jVar6 == u7jVar3 && (v7jVar4 = v7jVar6.f238221V) != null && ((u7jVar2 = v7jVar4.f238220U[0]) == u7jVar5 || u7jVar2 == u7jVar3)) {
                    int iM84886s = (v7jVar4.m84886s() - this.f137062b.f238209J.m31571e()) - this.f137062b.f238211L.m31571e();
                    lud1.m59944b(ftqVar2, v7jVar4.f238232d.f137068h, this.f137062b.f238209J.m31571e());
                    lud1.m59944b(ftqVar, v7jVar4.f238232d.f137069i, -this.f137062b.f238211L.m31571e());
                    ujrVar.mo42686d(iM84886s);
                    return;
                }
                if (u7jVar6 == u7jVar5) {
                    ujrVar.mo42686d(v7jVar6.m84886s());
                }
            }
        } else if (this.f137064d == u7jVar3 && (v7jVar2 = (v7jVar = this.f137062b).f238221V) != null && ((u7jVar = v7jVar2.f238220U[0]) == u7jVar5 || u7jVar == u7jVar3)) {
            lud1.m59944b(ftqVar2, v7jVar2.f238232d.f137068h, v7jVar.f238209J.m31571e());
            lud1.m59944b(ftqVar, v7jVar2.f238232d.f137069i, -this.f137062b.f238211L.m31571e());
            return;
        }
        if (ujrVar.f73274j) {
            v7j v7jVar7 = this.f137062b;
            if (v7jVar7.f238226a) {
                c6j[] c6jVarArr = v7jVar7.f238217R;
                c6j c6jVar = c6jVarArr[0];
                c6j c6jVar2 = c6jVar.f34551f;
                if (c6jVar2 != null && c6jVarArr[1].f34551f != null) {
                    if (v7jVar7.m84893z()) {
                        ftqVar2.f73270f = this.f137062b.f238217R[0].m31571e();
                        ftqVar.f73270f = -this.f137062b.f238217R[1].m31571e();
                        return;
                    }
                    ftq ftqVarM59945h = lud1.m59945h(this.f137062b.f238217R[0]);
                    if (ftqVarM59945h != null) {
                        lud1.m59944b(ftqVar2, ftqVarM59945h, this.f137062b.f238217R[0].m31571e());
                    }
                    ftq ftqVarM59945h2 = lud1.m59945h(this.f137062b.f238217R[1]);
                    if (ftqVarM59945h2 != null) {
                        lud1.m59944b(ftqVar, ftqVarM59945h2, -this.f137062b.f238217R[1].m31571e());
                    }
                    ftqVar2.f73266b = true;
                    ftqVar.f73266b = true;
                    return;
                }
                if (c6jVar2 != null) {
                    ftq ftqVarM59945h3 = lud1.m59945h(c6jVar);
                    if (ftqVarM59945h3 != null) {
                        lud1.m59944b(ftqVar2, ftqVarM59945h3, this.f137062b.f238217R[0].m31571e());
                        lud1.m59944b(ftqVar, ftqVar2, ujrVar.f73271g);
                        return;
                    }
                    return;
                }
                c6j c6jVar3 = c6jVarArr[1];
                if (c6jVar3.f34551f != null) {
                    ftq ftqVarM59945h4 = lud1.m59945h(c6jVar3);
                    if (ftqVarM59945h4 != null) {
                        lud1.m59944b(ftqVar, ftqVarM59945h4, -this.f137062b.f238217R[1].m31571e());
                        lud1.m59944b(ftqVar2, ftqVar, -ujrVar.f73271g);
                        return;
                    }
                    return;
                }
                if ((v7jVar7 instanceof jq20) || v7jVar7.f238221V == null || v7jVar7.mo55866k(7).f34551f != null) {
                    return;
                }
                v7j v7jVar8 = this.f137062b;
                lud1.m59944b(ftqVar2, v7jVar8.f238221V.f238232d.f137068h, v7jVar8.m84887t());
                lud1.m59944b(ftqVar, ftqVar2, ujrVar.f73271g);
                return;
            }
        }
        if (this.f137064d == u7jVar4) {
            v7j v7jVar9 = this.f137062b;
            int i = v7jVar9.f238262s;
            if (i == 2) {
                v7j v7jVar10 = v7jVar9.f238221V;
                if (v7jVar10 != null) {
                    ujr ujrVar2 = v7jVar10.f238234e.f137065e;
                    arrayList2.add(ujrVar2);
                    ujrVar2.f73275k.add(ujrVar);
                    ujrVar.f73266b = true;
                    arrayList.add(ftqVar2);
                    arrayList.add(ftqVar);
                }
            } else if (i == 3) {
                if (v7jVar9.f238264t == 3) {
                    ftqVar2.f73265a = this;
                    ftqVar.f73265a = this;
                    bhb1 bhb1Var = v7jVar9.f238234e;
                    bhb1Var.f137068h.f73265a = this;
                    bhb1Var.f137069i.f73265a = this;
                    ujrVar.f73265a = this;
                    if (v7jVar9.m84857A()) {
                        arrayList2.add(this.f137062b.f238234e.f137065e);
                        this.f137062b.f238234e.f137065e.f73275k.add(ujrVar);
                        bhb1 bhb1Var2 = this.f137062b.f238234e;
                        bhb1Var2.f137065e.f73265a = this;
                        arrayList2.add(bhb1Var2.f137068h);
                        arrayList2.add(this.f137062b.f238234e.f137069i);
                        this.f137062b.f238234e.f137068h.f73275k.add(ujrVar);
                        this.f137062b.f238234e.f137069i.f73275k.add(ujrVar);
                    } else if (this.f137062b.m84893z()) {
                        this.f137062b.f238234e.f137065e.f73276l.add(ujrVar);
                        arrayList.add(this.f137062b.f238234e.f137065e);
                    } else {
                        this.f137062b.f238234e.f137065e.f73276l.add(ujrVar);
                    }
                } else {
                    ujr ujrVar3 = v7jVar9.f238234e.f137065e;
                    arrayList2.add(ujrVar3);
                    ujrVar3.f73275k.add(ujrVar);
                    this.f137062b.f238234e.f137068h.f73275k.add(ujrVar);
                    this.f137062b.f238234e.f137069i.f73275k.add(ujrVar);
                    ujrVar.f73266b = true;
                    arrayList.add(ftqVar2);
                    arrayList.add(ftqVar);
                    ftqVar2.f73276l.add(ujrVar);
                    ftqVar.f73276l.add(ujrVar);
                }
            }
        }
        v7j v7jVar11 = this.f137062b;
        c6j[] c6jVarArr2 = v7jVar11.f238217R;
        c6j c6jVar4 = c6jVarArr2[0];
        c6j c6jVar5 = c6jVar4.f34551f;
        if (c6jVar5 != null && c6jVarArr2[1].f34551f != null) {
            if (v7jVar11.m84893z()) {
                ftqVar2.f73270f = this.f137062b.f238217R[0].m31571e();
                ftqVar.f73270f = -this.f137062b.f238217R[1].m31571e();
                return;
            }
            ftq ftqVarM59945h5 = lud1.m59945h(this.f137062b.f238217R[0]);
            ftq ftqVarM59945h6 = lud1.m59945h(this.f137062b.f238217R[1]);
            if (ftqVarM59945h5 != null) {
                ftqVarM59945h5.m42684b(this);
            }
            if (ftqVarM59945h6 != null) {
                ftqVarM59945h6.m42684b(this);
            }
            this.f137070j = 4;
            return;
        }
        if (c6jVar5 != null) {
            ftq ftqVarM59945h7 = lud1.m59945h(c6jVar4);
            if (ftqVarM59945h7 != null) {
                lud1.m59944b(ftqVar2, ftqVarM59945h7, this.f137062b.f238217R[0].m31571e());
                m59947c(ftqVar, ftqVar2, 1, ujrVar);
                return;
            }
            return;
        }
        c6j c6jVar6 = c6jVarArr2[1];
        if (c6jVar6.f34551f != null) {
            ftq ftqVarM59945h8 = lud1.m59945h(c6jVar6);
            if (ftqVarM59945h8 != null) {
                lud1.m59944b(ftqVar, ftqVarM59945h8, -this.f137062b.f238217R[1].m31571e());
                m59947c(ftqVar2, ftqVar, -1, ujrVar);
                return;
            }
            return;
        }
        if ((v7jVar11 instanceof jq20) || (v7jVar3 = v7jVar11.f238221V) == null) {
            return;
        }
        lud1.m59944b(ftqVar2, v7jVar3.f238232d.f137068h, v7jVar11.m84887t());
        m59947c(ftqVar, ftqVar2, 1, ujrVar);
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: e */
    public final void mo29210e() {
        ftq ftqVar = this.f137068h;
        if (ftqVar.f73274j) {
            this.f137062b.f238227a0 = ftqVar.f73271g;
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: f */
    public final void mo29211f() {
        this.f137063c = null;
        this.f137068h.m42685c();
        this.f137069i.m42685c();
        this.f137065e.m42685c();
        this.f137067g = false;
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: k */
    public final boolean mo29212k() {
        return this.f137064d != u7j.f227712c || this.f137062b.f238262s == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m58390n() {
        this.f137067g = false;
        ftq ftqVar = this.f137068h;
        ftqVar.m42685c();
        ftqVar.f73274j = false;
        ftq ftqVar2 = this.f137069i;
        ftqVar2.m42685c();
        ftqVar2.f73274j = false;
        this.f137065e.f73274j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f137062b.f238247k0;
    }
}
