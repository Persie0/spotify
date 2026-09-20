package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ejc extends lud1 {

    /* JADX INFO: renamed from: k */
    public final ArrayList f60185k;

    /* JADX INFO: renamed from: l */
    public int f60186l;

    public ejc(v7j v7jVar, int i) {
        v7j v7jVar2;
        super(v7jVar);
        ArrayList<lud1> arrayList = new ArrayList();
        this.f60185k = arrayList;
        this.f137066f = i;
        v7j v7jVar3 = this.f137062b;
        v7j v7jVarM84884o = v7jVar3.m84884o(i);
        while (true) {
            v7jVar2 = v7jVar3;
            v7jVar3 = v7jVarM84884o;
            if (v7jVar3 == null) {
                break;
            } else {
                v7jVarM84884o = v7jVar3.m84884o(this.f137066f);
            }
        }
        this.f137062b = v7jVar2;
        int i2 = this.f137066f;
        arrayList.add(i2 == 0 ? v7jVar2.f238232d : i2 == 1 ? v7jVar2.f238234e : null);
        v7j v7jVarM84883n = v7jVar2.m84883n(this.f137066f);
        while (v7jVarM84883n != null) {
            int i3 = this.f137066f;
            arrayList.add(i3 == 0 ? v7jVarM84883n.f238232d : i3 == 1 ? v7jVarM84883n.f238234e : null);
            v7jVarM84883n = v7jVarM84883n.m84883n(this.f137066f);
        }
        for (lud1 lud1Var : arrayList) {
            int i4 = this.f137066f;
            if (i4 == 0) {
                lud1Var.f137062b.f238228b = this;
            } else if (i4 == 1) {
                lud1Var.f137062b.f238230c = this;
            }
        }
        if (this.f137066f == 0 && ((w7j) this.f137062b.f238221V).f248713z0 && arrayList.size() > 1) {
            this.f137062b = ((lud1) edb.m38559h(1, arrayList)).f137062b;
        }
        this.f60186l = this.f137066f == 0 ? this.f137062b.f238249l0 : this.f137062b.f238251m0;
    }

    /* JADX WARN: Code duplicated, block: B:294:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
    @Override // p204p.ctq
    /* JADX INFO: renamed from: a */
    public final void mo29208a(ctq ctqVar) {
        int i;
        int i2;
        u7j u7jVar;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f3;
        ftq ftqVar = this.f137068h;
        if (ftqVar.f73274j) {
            ftq ftqVar2 = this.f137069i;
            if (ftqVar2.f73274j) {
                v7j v7jVar = this.f137062b.f238221V;
                boolean z2 = v7jVar instanceof w7j ? ((w7j) v7jVar).f248713z0 : false;
                int i14 = ftqVar2.f73271g - ftqVar.f73271g;
                ArrayList arrayList = this.f60185k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((lud1) arrayList.get(i15)).f137062b.f238243i0 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                for (int i17 = i16; i17 >= 0; i17--) {
                    if (((lud1) arrayList.get(i17)).f137062b.f238243i0 != 8) {
                        i = i17;
                        break;
                    }
                }
                int i18 = 0;
                while (true) {
                    u7jVar = u7j.f227712c;
                    if (i18 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        lud1 lud1Var = (lud1) arrayList.get(i19);
                        boolean z3 = z2;
                        v7j v7jVar2 = lud1Var.f137062b;
                        int i22 = i18;
                        if (v7jVar2.f238243i0 != i2) {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += lud1Var.f137068h.f73270f;
                            }
                            ujr ujrVar = lud1Var.f137065e;
                            int i23 = ujrVar.f73271g;
                            boolean z4 = lud1Var.f137064d != u7jVar;
                            if (z4) {
                                int i24 = this.f137066f;
                                if (i24 == 0 && !v7jVar2.f238232d.f137065e.f73274j) {
                                    return;
                                }
                                if (i24 == 1 && !v7jVar2.f238234e.f137065e.f73274j) {
                                    return;
                                } else {
                                    i12 = i5;
                                }
                            } else {
                                i12 = i5;
                                if (lud1Var.f137061a == 1 && i22 == 0) {
                                    i13 = ujrVar.f231081m;
                                    i20++;
                                } else {
                                    if (ujrVar.f73274j) {
                                        i13 = i23;
                                    }
                                    if (z4) {
                                        i5 = i12 + i13;
                                    } else {
                                        i20++;
                                        f3 = v7jVar2.f238253n0[this.f137066f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i12;
                                    }
                                    if (i19 >= i16 && i19 < i) {
                                        i5 += -lud1Var.f137069i.f73270f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i20++;
                                    f3 = v7jVar2.f238253n0[this.f137066f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i12;
                                } else {
                                    i5 = i12 + i13;
                                }
                                if (i19 >= i16) {
                                }
                            }
                            i13 = i23;
                            if (z4) {
                                i20++;
                                f3 = v7jVar2.f238253n0[this.f137066f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i12;
                            } else {
                                i5 = i12 + i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i19++;
                        z2 = z3;
                        i18 = i22;
                        i2 = 8;
                    }
                    z = z2;
                    int i25 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i25 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i26 = ftqVar.f73271g;
                if (z) {
                    i26 = ftqVar2.f73271g;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i26 = z ? i26 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i26 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i27 = (int) ((f5 / i3) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        float f6 = f4;
                        lud1 lud1Var2 = (lud1) arrayList.get(i28);
                        int i30 = i26;
                        v7j v7jVar3 = lud1Var2.f137062b;
                        int i31 = i3;
                        ujr ujrVar2 = lud1Var2.f137065e;
                        float f7 = f5;
                        int i32 = i27;
                        if (v7jVar3.f238243i0 != 8 && lud1Var2.f137064d == u7jVar && !ujrVar2.f73274j) {
                            int i33 = f > 0.0f ? (int) (((v7jVar3.f238253n0[this.f137066f] * f7) / f) + f6) : i32;
                            if (this.f137066f == 0) {
                                i10 = v7jVar3.f238268w;
                                i11 = v7jVar3.f238267v;
                            } else {
                                i10 = v7jVar3.f238271z;
                                i11 = v7jVar3.f238270y;
                            }
                            int iMax = Math.max(i11, lud1Var2.f137061a == 1 ? Math.min(i33, ujrVar2.f231081m) : i33);
                            if (i10 > 0) {
                                iMax = Math.min(i10, iMax);
                            }
                            if (iMax != i33) {
                                i29++;
                                i33 = iMax;
                            }
                            ujrVar2.mo42686d(i33);
                        }
                        i28++;
                        i26 = i30;
                        f4 = f6;
                        i3 = i31;
                        f5 = f7;
                        i27 = i32;
                    }
                    i6 = i26;
                    f2 = f4;
                    int i34 = i3;
                    if (i29 > 0) {
                        i3 = i34 - i29;
                        i5 = 0;
                        for (int i35 = 0; i35 < size; i35++) {
                            lud1 lud1Var3 = (lud1) arrayList.get(i35);
                            if (lud1Var3.f137062b.f238243i0 != 8) {
                                if (i35 > 0 && i35 >= i15) {
                                    i5 += lud1Var3.f137068h.f73270f;
                                }
                                i5 += lud1Var3.f137065e.f73271g;
                                if (i35 < i16 && i35 < i) {
                                    i5 += -lud1Var3.f137069i.f73270f;
                                }
                            }
                        }
                    } else {
                        i3 = i34;
                    }
                    i8 = 2;
                    if (this.f60186l == 2 && i29 == 0) {
                        i7 = 0;
                        this.f60186l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i26;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.f60186l = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.f60186l = i8;
                }
                int i36 = this.f60186l;
                if (i36 == 1) {
                    int i37 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i37 = i7;
                    }
                    int i38 = i6;
                    for (int i39 = i7; i39 < size; i39++) {
                        lud1 lud1Var4 = (lud1) arrayList.get(z ? size - (i39 + 1) : i39);
                        v7j v7jVar4 = lud1Var4.f137062b;
                        ftq ftqVar3 = lud1Var4.f137069i;
                        ftq ftqVar4 = lud1Var4.f137068h;
                        if (v7jVar4.f238243i0 == 8) {
                            ftqVar4.mo42686d(i38);
                            ftqVar3.mo42686d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i15) {
                                i38 = z ? i38 - ftqVar4.f73270f : i38 + ftqVar4.f73270f;
                            }
                            if (z) {
                                ftqVar3.mo42686d(i38);
                            } else {
                                ftqVar4.mo42686d(i38);
                            }
                            ujr ujrVar3 = lud1Var4.f137065e;
                            int i40 = ujrVar3.f73271g;
                            if (lud1Var4.f137064d == u7jVar) {
                                i9 = i38;
                                if (lud1Var4.f137061a == 1) {
                                    i40 = ujrVar3.f231081m;
                                }
                            } else {
                                i9 = i38;
                            }
                            i38 = z ? i9 - i40 : i9 + i40;
                            if (z) {
                                ftqVar4.mo42686d(i38);
                            } else {
                                ftqVar3.mo42686d(i38);
                            }
                            lud1Var4.f137067g = true;
                            if (i39 < i16 && i39 < i) {
                                i38 = z ? i38 - (-ftqVar3.f73270f) : i38 + (-ftqVar3.f73270f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i41 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i41 = i7;
                    }
                    int i42 = i6;
                    for (int i43 = i7; i43 < size; i43++) {
                        lud1 lud1Var5 = (lud1) arrayList.get(z ? size - (i43 + 1) : i43);
                        v7j v7jVar5 = lud1Var5.f137062b;
                        ftq ftqVar5 = lud1Var5.f137069i;
                        ftq ftqVar6 = lud1Var5.f137068h;
                        if (v7jVar5.f238243i0 == 8) {
                            ftqVar6.mo42686d(i42);
                            ftqVar5.mo42686d(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i15) {
                                i44 = z ? i44 - ftqVar6.f73270f : i44 + ftqVar6.f73270f;
                            }
                            if (z) {
                                ftqVar5.mo42686d(i44);
                            } else {
                                ftqVar6.mo42686d(i44);
                            }
                            ujr ujrVar4 = lud1Var5.f137065e;
                            int iMin = ujrVar4.f73271g;
                            if (lud1Var5.f137064d == u7jVar && lud1Var5.f137061a == 1) {
                                iMin = Math.min(iMin, ujrVar4.f231081m);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                ftqVar6.mo42686d(i42);
                            } else {
                                ftqVar5.mo42686d(i42);
                            }
                            if (i43 < i16 && i43 < i) {
                                i42 = z ? i42 - (-ftqVar5.f73270f) : i42 + (-ftqVar5.f73270f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f8 = this.f137066f == 0 ? this.f137062b.f238237f0 : this.f137062b.f238239g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i14 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        lud1 lud1Var6 = (lud1) arrayList.get(z ? size - (i47 + 1) : i47);
                        v7j v7jVar6 = lud1Var6.f137062b;
                        ftq ftqVar7 = lud1Var6.f137069i;
                        ftq ftqVar8 = lud1Var6.f137068h;
                        if (v7jVar6.f238243i0 == 8) {
                            ftqVar8.mo42686d(i46);
                            ftqVar7.mo42686d(i46);
                        } else {
                            if (i47 > 0 && i47 >= i15) {
                                i46 = z ? i46 - ftqVar8.f73270f : i46 + ftqVar8.f73270f;
                            }
                            if (z) {
                                ftqVar7.mo42686d(i46);
                            } else {
                                ftqVar8.mo42686d(i46);
                            }
                            ujr ujrVar5 = lud1Var6.f137065e;
                            int i48 = ujrVar5.f73271g;
                            if (lud1Var6.f137064d == u7jVar && lud1Var6.f137061a == 1) {
                                i48 = ujrVar5.f231081m;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                ftqVar8.mo42686d(i46);
                            } else {
                                ftqVar7.mo42686d(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                i46 = z ? i46 - (-ftqVar7.f73270f) : i46 + (-ftqVar7.f73270f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: d */
    public final void mo29209d() {
        ArrayList arrayList = this.f60185k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lud1) it.next()).mo29209d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        v7j v7jVar = ((lud1) arrayList.get(0)).f137062b;
        v7j v7jVar2 = ((lud1) arrayList.get(size - 1)).f137062b;
        int i = this.f137066f;
        ftq ftqVar = this.f137069i;
        ftq ftqVar2 = this.f137068h;
        if (i == 0) {
            c6j c6jVar = v7jVar.f238209J;
            c6j c6jVar2 = v7jVar2.f238211L;
            ftq ftqVarM59946i = lud1.m59946i(c6jVar, 0);
            int iM31571e = c6jVar.m31571e();
            v7j v7jVarM39172m = m39172m();
            if (v7jVarM39172m != null) {
                iM31571e = v7jVarM39172m.f238209J.m31571e();
            }
            if (ftqVarM59946i != null) {
                lud1.m59944b(ftqVar2, ftqVarM59946i, iM31571e);
            }
            ftq ftqVarM59946i2 = lud1.m59946i(c6jVar2, 0);
            int iM31571e2 = c6jVar2.m31571e();
            v7j v7jVarM39173n = m39173n();
            if (v7jVarM39173n != null) {
                iM31571e2 = v7jVarM39173n.f238211L.m31571e();
            }
            if (ftqVarM59946i2 != null) {
                lud1.m59944b(ftqVar, ftqVarM59946i2, -iM31571e2);
            }
        } else {
            c6j c6jVar3 = v7jVar.f238210K;
            c6j c6jVar4 = v7jVar2.f238212M;
            ftq ftqVarM59946i3 = lud1.m59946i(c6jVar3, 1);
            int iM31571e3 = c6jVar3.m31571e();
            v7j v7jVarM39172m2 = m39172m();
            if (v7jVarM39172m2 != null) {
                iM31571e3 = v7jVarM39172m2.f238210K.m31571e();
            }
            if (ftqVarM59946i3 != null) {
                lud1.m59944b(ftqVar2, ftqVarM59946i3, iM31571e3);
            }
            ftq ftqVarM59946i4 = lud1.m59946i(c6jVar4, 1);
            int iM31571e4 = c6jVar4.m31571e();
            v7j v7jVarM39173n2 = m39173n();
            if (v7jVarM39173n2 != null) {
                iM31571e4 = v7jVarM39173n2.f238212M.m31571e();
            }
            if (ftqVarM59946i4 != null) {
                lud1.m59944b(ftqVar, ftqVarM59946i4, -iM31571e4);
            }
        }
        ftqVar2.f73265a = this;
        ftqVar.f73265a = this;
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: e */
    public final void mo29210e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f60185k;
            if (i >= arrayList.size()) {
                return;
            }
            ((lud1) arrayList.get(i)).mo29210e();
            i++;
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: f */
    public final void mo29211f() {
        this.f137063c = null;
        Iterator it = this.f60185k.iterator();
        while (it.hasNext()) {
            ((lud1) it.next()).mo29211f();
        }
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: j */
    public final long mo39171j() {
        ArrayList arrayList = this.f60185k;
        int size = arrayList.size();
        long jMo39171j = 0;
        for (int i = 0; i < size; i++) {
            lud1 lud1Var = (lud1) arrayList.get(i);
            jMo39171j = ((long) lud1Var.f137069i.f73270f) + lud1Var.mo39171j() + jMo39171j + ((long) lud1Var.f137068h.f73270f);
        }
        return jMo39171j;
    }

    @Override // p204p.lud1
    /* JADX INFO: renamed from: k */
    public final boolean mo29212k() {
        ArrayList arrayList = this.f60185k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((lud1) arrayList.get(i)).mo29212k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final v7j m39172m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f60185k;
            if (i >= arrayList.size()) {
                return null;
            }
            v7j v7jVar = ((lud1) arrayList.get(i)).f137062b;
            if (v7jVar.f238243i0 != 8) {
                return v7jVar;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final v7j m39173n() {
        ArrayList arrayList = this.f60185k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v7j v7jVar = ((lud1) arrayList.get(size)).f137062b;
            if (v7jVar.f238243i0 != 8) {
                return v7jVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f137066f == 0 ? "horizontal : " : "vertical : ");
        for (lud1 lud1Var : this.f60185k) {
            sb.append("<");
            sb.append(lud1Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
