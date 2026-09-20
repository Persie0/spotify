package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class j4a0 {

    /* JADX INFO: renamed from: a */
    public final lnu0 f108634a;

    /* JADX INFO: renamed from: b */
    public final epx f108635b;

    /* JADX INFO: renamed from: c */
    public final C1668ai f108636c;

    /* JADX INFO: renamed from: d */
    public final hc80 f108637d;

    /* JADX INFO: renamed from: e */
    public final luk f108638e;

    /* JADX INFO: renamed from: f */
    public final boolean f108639f;

    /* JADX INFO: renamed from: g */
    public final boolean f108640g;

    /* JADX INFO: renamed from: h */
    public final hb11 f108641h;

    /* JADX INFO: renamed from: i */
    public final vjz f108642i;

    public j4a0(lnu0 lnu0Var, epx epxVar, C1668ai c1668ai, hc80 hc80Var, luk lukVar, boolean z, boolean z2) {
        this.f108634a = lnu0Var;
        this.f108635b = epxVar;
        this.f108636c = c1668ai;
        this.f108637d = hc80Var;
        this.f108638e = lukVar;
        this.f108639f = z;
        this.f108640g = z2;
        hb11 hb11VarM52092t = j0g1.m52092t(1, 0, 0, 6);
        this.f108641h = hb11VarM52092t;
        this.f108642i = new vjz(hb11VarM52092t, new f3q(2, 26, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m52332a(String str, ibk ibkVar) {
        h4a0 h4a0Var;
        if (ibkVar instanceof h4a0) {
            h4a0Var = (h4a0) ibkVar;
            int i = h4a0Var.f87479c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4a0Var.f87479c = i - Integer.MIN_VALUE;
            } else {
                h4a0Var = new h4a0(this, ibkVar);
            }
        } else {
            h4a0Var = new h4a0(this, ibkVar);
        }
        Object obj = h4a0Var.f87477a;
        int i2 = h4a0Var.f87479c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable map = ((jpx) this.f108635b).m53978b(new C1668ai("transcript-npv", false, (gh00) new zz70(str, 10))).filter(yby.f271299Y).map(new a470(14, str, this));
        h4a0Var.f87479c = 1;
        Object objM96571q = zn91.m96571q(map, 1, null, h4a0Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        if (r10.emit(r7, r0) == r12) goto L65;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52333b(String str, ibk ibkVar) {
        i4a0 i4a0Var;
        Object c6x0Var;
        vy81 vy81Var;
        int iM38547C;
        if (ibkVar instanceof i4a0) {
            i4a0Var = (i4a0) ibkVar;
            int i = i4a0Var.f98471e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4a0Var.f98471e = i - Integer.MIN_VALUE;
            } else {
                i4a0Var = new i4a0(this, ibkVar);
            }
        } else {
            i4a0Var = new i4a0(this, ibkVar);
        }
        Object objM52332a = i4a0Var.f98469c;
        int i2 = i4a0Var.f98471e;
        w2a1 w2a1Var = w2a1.f247311a;
        Object d4a0Var = c4a0.f33897a;
        hb11 hb11Var = this.f108641h;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM52332a);
                hb11Var.mo46963e();
                i4a0Var.f98467a = str;
                i4a0Var.f98471e = 1;
                objM52332a = m52332a(str, i4a0Var);
                if (objM52332a != obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                str = i4a0Var.f98467a;
                bga.m29073P(objM52332a);
            } else {
                if (i2 == 2) {
                    bga.m29073P(objM52332a);
                    return w2a1Var;
                }
                if (i2 == 3) {
                    bga.m29073P(objM52332a);
                    c6x0Var = (vy81) objM52332a;
                    if (s6x0.m77348a(c6x0Var) == null) {
                        vy81Var = (vy81) c6x0Var;
                    } else {
                        vy81Var = null;
                    }
                    if (vy81Var == null && vy81Var.f246006X == 2 && vy81Var.f246007Y) {
                        i4a0Var.f98467a = null;
                        i4a0Var.f98468b = vy81Var;
                        i4a0Var.f98471e = 4;
                    } else {
                        if (vy81Var != null) {
                            iM38547C = edb.m38547C(vy81Var.f246006X);
                            if (iM38547C != 2 && iM38547C != 3) {
                                vy81Var = null;
                            }
                            if (vy81Var != null) {
                                d4a0Var = new d4a0(vy81Var);
                            }
                        }
                        i4a0Var.f98467a = null;
                        i4a0Var.f98468b = null;
                        i4a0Var.f98471e = 5;
                        if (hb11Var.emit(d4a0Var, i4a0Var) != obj) {
                            return w2a1Var;
                        }
                    }
                    return obj;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM52332a);
                    return w2a1Var;
                }
                vy81Var = i4a0Var.f98468b;
                bga.m29073P(objM52332a);
            }
            x0h1.m89578u(n5h1.m63737m(this.f108637d), this.f108638e, 0, new g3a0(this, vy81Var, fbkVar, 2), 2);
            return w2a1Var;
            if (((Boolean) objM52332a).booleanValue()) {
                lnu0 lnu0Var = this.f108634a;
                i4a0Var.f98467a = null;
                i4a0Var.f98468b = null;
                i4a0Var.f98471e = 3;
                objM52332a = lnu0Var.m59509b(str, i4a0Var, false);
                if (objM52332a != obj) {
                    c6x0Var = (vy81) objM52332a;
                    if (s6x0.m77348a(c6x0Var) == null) {
                        vy81Var = (vy81) c6x0Var;
                    } else {
                        vy81Var = null;
                    }
                    if (vy81Var == null) {
                        if (vy81Var != null) {
                            iM38547C = edb.m38547C(vy81Var.f246006X);
                            if (iM38547C != 2) {
                                vy81Var = null;
                            }
                            if (vy81Var != null) {
                                d4a0Var = new d4a0(vy81Var);
                            }
                        }
                        i4a0Var.f98467a = null;
                        i4a0Var.f98468b = null;
                        i4a0Var.f98471e = 5;
                        if (hb11Var.emit(d4a0Var, i4a0Var) != obj) {
                            return w2a1Var;
                        }
                    } else {
                        if (vy81Var != null) {
                            iM38547C = edb.m38547C(vy81Var.f246006X);
                            if (iM38547C != 2) {
                                vy81Var = null;
                            }
                            if (vy81Var != null) {
                                d4a0Var = new d4a0(vy81Var);
                            }
                        }
                        i4a0Var.f98467a = null;
                        i4a0Var.f98468b = null;
                        i4a0Var.f98471e = 5;
                        if (hb11Var.emit(d4a0Var, i4a0Var) != obj) {
                            return w2a1Var;
                        }
                    }
                }
            } else {
                i4a0Var.f98467a = null;
                i4a0Var.f98471e = 2;
                if (hb11Var.emit(d4a0Var, i4a0Var) != obj) {
                    return w2a1Var;
                }
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return obj;
    }
}
