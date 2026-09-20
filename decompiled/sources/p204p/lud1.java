package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class lud1 implements ctq {

    /* JADX INFO: renamed from: a */
    public int f137061a;

    /* JADX INFO: renamed from: b */
    public v7j f137062b;

    /* JADX INFO: renamed from: c */
    public hux0 f137063c;

    /* JADX INFO: renamed from: d */
    public u7j f137064d;

    /* JADX INFO: renamed from: e */
    public final ujr f137065e = new ujr(this);

    /* JADX INFO: renamed from: f */
    public int f137066f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f137067g = false;

    /* JADX INFO: renamed from: h */
    public final ftq f137068h = new ftq(this);

    /* JADX INFO: renamed from: i */
    public final ftq f137069i = new ftq(this);

    /* JADX INFO: renamed from: j */
    public int f137070j = 1;

    public lud1(v7j v7jVar) {
        this.f137062b = v7jVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m59944b(ftq ftqVar, ftq ftqVar2, int i) {
        ftqVar.f73276l.add(ftqVar2);
        ftqVar.f73270f = i;
        ftqVar2.f73275k.add(ftqVar);
    }

    /* JADX INFO: renamed from: h */
    public static ftq m59945h(c6j c6jVar) {
        c6j c6jVar2 = c6jVar.f34551f;
        if (c6jVar2 == null) {
            return null;
        }
        v7j v7jVar = c6jVar2.f34549d;
        int iM38547C = edb.m38547C(c6jVar2.f34550e);
        if (iM38547C == 1) {
            return v7jVar.f238232d.f137068h;
        }
        if (iM38547C == 2) {
            return v7jVar.f238234e.f137068h;
        }
        if (iM38547C == 3) {
            return v7jVar.f238232d.f137069i;
        }
        if (iM38547C == 4) {
            return v7jVar.f238234e.f137069i;
        }
        if (iM38547C != 5) {
            return null;
        }
        return v7jVar.f238234e.f27132k;
    }

    /* JADX INFO: renamed from: i */
    public static ftq m59946i(c6j c6jVar, int i) {
        c6j c6jVar2 = c6jVar.f34551f;
        if (c6jVar2 == null) {
            return null;
        }
        v7j v7jVar = c6jVar2.f34549d;
        lud1 lud1Var = i == 0 ? v7jVar.f238232d : v7jVar.f238234e;
        int iM38547C = edb.m38547C(c6jVar2.f34550e);
        if (iM38547C == 1 || iM38547C == 2) {
            return lud1Var.f137068h;
        }
        if (iM38547C == 3 || iM38547C == 4) {
            return lud1Var.f137069i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m59947c(ftq ftqVar, ftq ftqVar2, int i, ujr ujrVar) {
        ftqVar.f73276l.add(ftqVar2);
        ftqVar.f73276l.add(this.f137065e);
        ftqVar.f73272h = i;
        ftqVar.f73273i = ujrVar;
        ftqVar2.f73275k.add(ftqVar);
        ujrVar.f73275k.add(ftqVar);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo29209d();

    /* JADX INFO: renamed from: e */
    public abstract void mo29210e();

    /* JADX INFO: renamed from: f */
    public abstract void mo29211f();

    /* JADX INFO: renamed from: g */
    public final int m59948g(int i, int i2) {
        if (i2 == 0) {
            v7j v7jVar = this.f137062b;
            int i3 = v7jVar.f238268w;
            int iMax = Math.max(v7jVar.f238267v, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            v7j v7jVar2 = this.f137062b;
            int i4 = v7jVar2.f238271z;
            int iMax2 = Math.max(v7jVar2.f238270y, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo39171j() {
        ujr ujrVar = this.f137065e;
        if (ujrVar.f73274j) {
            return ujrVar.f73271g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo29212k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX INFO: renamed from: l */
    public final void m59949l(c6j c6jVar, c6j c6jVar2, int i) {
        ujr ujrVar;
        float f;
        int i2;
        ftq ftqVarM59945h = m59945h(c6jVar);
        ftq ftqVarM59945h2 = m59945h(c6jVar2);
        if (ftqVarM59945h.f73274j && ftqVarM59945h2.f73274j) {
            int iM31571e = c6jVar.m31571e() + ftqVarM59945h.f73271g;
            int iM31571e2 = ftqVarM59945h2.f73271g - c6jVar2.m31571e();
            int i3 = iM31571e2 - iM31571e;
            ujr ujrVar2 = this.f137065e;
            if (!ujrVar2.f73274j) {
                u7j u7jVar = this.f137064d;
                u7j u7jVar2 = u7j.f227712c;
                if (u7jVar == u7jVar2) {
                    int i4 = this.f137061a;
                    if (i4 == 0) {
                        ujrVar2.mo42686d(m59948g(i3, i));
                    } else if (i4 == 1) {
                        ujrVar2.mo42686d(Math.min(m59948g(ujrVar2.f231081m, i), i3));
                    } else if (i4 == 2) {
                        v7j v7jVar = this.f137062b;
                        v7j v7jVar2 = v7jVar.f238221V;
                        if (v7jVar2 != null) {
                            ujr ujrVar3 = (i == 0 ? v7jVar2.f238232d : v7jVar2.f238234e).f137065e;
                            if (ujrVar3.f73274j) {
                                ujrVar2.mo42686d(m59948g((int) ((ujrVar3.f73271g * (i == 0 ? v7jVar.f238269x : v7jVar.f238200A)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        v7j v7jVar3 = this.f137062b;
                        lud1 lud1Var = v7jVar3.f238232d;
                        if (lud1Var.f137064d == u7jVar2 && lud1Var.f137061a == 3) {
                            bhb1 bhb1Var = v7jVar3.f238234e;
                            if (bhb1Var.f137064d != u7jVar2 || bhb1Var.f137061a != 3) {
                                if (i == 0) {
                                    lud1Var = v7jVar3.f238234e;
                                }
                                ujrVar = lud1Var.f137065e;
                                if (ujrVar.f73274j) {
                                    f = v7jVar3.f238224Y;
                                    if (i == 1) {
                                        i2 = (int) ((ujrVar.f73271g / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * ujrVar.f73271g) + 0.5f);
                                    }
                                    ujrVar2.mo42686d(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                lud1Var = v7jVar3.f238234e;
                            }
                            ujrVar = lud1Var.f137065e;
                            if (ujrVar.f73274j) {
                                f = v7jVar3.f238224Y;
                                if (i == 1) {
                                    i2 = (int) ((ujrVar.f73271g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * ujrVar.f73271g) + 0.5f);
                                }
                                ujrVar2.mo42686d(i2);
                            }
                        }
                    }
                }
            }
            if (ujrVar2.f73274j) {
                int i5 = ujrVar2.f73271g;
                ftq ftqVar = this.f137069i;
                ftq ftqVar2 = this.f137068h;
                if (i5 == i3) {
                    ftqVar2.mo42686d(iM31571e);
                    ftqVar.mo42686d(iM31571e2);
                    return;
                }
                float f2 = i == 0 ? this.f137062b.f238237f0 : this.f137062b.f238239g0;
                if (ftqVarM59945h == ftqVarM59945h2) {
                    iM31571e = ftqVarM59945h.f73271g;
                    iM31571e2 = ftqVarM59945h2.f73271g;
                    f2 = 0.5f;
                }
                ftqVar2.mo42686d((int) ((((iM31571e2 - iM31571e) - i5) * f2) + iM31571e + 0.5f));
                ftqVar.mo42686d(ftqVar2.f73271g + ujrVar2.f73271g);
            }
        }
    }
}
