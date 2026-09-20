package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yd5 implements g261 {

    /* JADX INFO: renamed from: L0 */
    public sr31 f271671L0;

    /* JADX INFO: renamed from: M0 */
    public final zv41 f271672M0;

    /* JADX INFO: renamed from: X */
    public final c9k f271673X;

    /* JADX INFO: renamed from: Y */
    public final zv41 f271674Y;

    /* JADX INFO: renamed from: Z */
    public final zv41 f271675Z;

    /* JADX INFO: renamed from: a */
    public final uer f271676a;

    /* JADX INFO: renamed from: b */
    public final dxo f271677b;

    /* JADX INFO: renamed from: c */
    public final mb80 f271678c;

    /* JADX INFO: renamed from: d */
    public final zcp f271679d;

    /* JADX INFO: renamed from: e */
    public final efk0 f271680e;

    /* JADX INFO: renamed from: f */
    public final lvb0 f271681f;

    /* JADX INFO: renamed from: g */
    public final Flowable f271682g;

    /* JADX INFO: renamed from: h */
    public final v14 f271683h;

    /* JADX INFO: renamed from: i */
    public final b161 f271684i;

    /* JADX INFO: renamed from: t */
    public final b141 f271685t;

    public yd5(uer uerVar, dxo dxoVar, mb80 mb80Var, zcp zcpVar, efk0 efk0Var, lvb0 lvb0Var, Flowable flowable, v14 v14Var, b161 b161Var, b141 b141Var, luk lukVar) {
        this.f271676a = uerVar;
        this.f271677b = dxoVar;
        this.f271678c = mb80Var;
        this.f271679d = zcpVar;
        this.f271680e = efk0Var;
        this.f271681f = lvb0Var;
        this.f271682g = flowable;
        this.f271683h = v14Var;
        this.f271684i = b161Var;
        this.f271685t = b141Var;
        this.f271673X = edb.m38577z(lukVar);
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f271674Y = zv41VarM52819d;
        this.f271675Z = jag1.m52819d(null);
        this.f271672M0 = zv41VarM52819d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0211  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0217  */
    /* JADX INFO: renamed from: c */
    public static final Object m93397c(yd5 yd5Var, ibk ibkVar) {
        rd5 rd5Var;
        String str;
        String str2;
        String str3;
        Object obj;
        Object objM82914g;
        sg5 sg5Var;
        sg5 sg5Var2;
        String str4;
        qcr qcrVar;
        Object objM86755t;
        String str5;
        qcr qcrVar2;
        int iM38547C;
        s14 s14Var;
        boolean zContains;
        Object objM93398d;
        String str6;
        int iOrdinal;
        pqm0 pqm0VarM69840u;
        v14 v14Var = yd5Var.f271683h;
        b141 b141Var = yd5Var.f271685t;
        if (ibkVar instanceof rd5) {
            rd5Var = (rd5) ibkVar;
            int i = rd5Var.f198037e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd5Var.f198037e = i - Integer.MIN_VALUE;
            } else {
                rd5Var = new rd5(yd5Var, ibkVar);
            }
        } else {
            rd5Var = new rd5(yd5Var, ibkVar);
        }
        rd5 rd5Var2 = rd5Var;
        Object obj2 = rd5Var2.f198035c;
        int i2 = rd5Var2.f198037e;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            v14Var.m84442a();
            int iOrdinal2 = v14Var.m84446e().ordinal();
            if (iOrdinal2 == 0) {
                str = "smart_control_nudge";
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "bottom_sheet_nudge";
            }
            str2 = str;
            b141Var.m27884q(new o161("app_startup", str2));
            try {
                uer uerVar = yd5Var.f271676a;
                obj = obj3;
                Long lM74181K = qyg1.m74181K(v14Var.m84442a());
                k23 k23Var = new k23(yd5Var, 26);
                rd5Var2.f198033a = str2;
                rd5Var2.f198037e = 1;
                str3 = "app_startup";
                try {
                    objM82914g = uerVar.m82914g("app_startup_trigger", ddr.f47852a, lM74181K, k23Var, rd5Var2);
                    if (objM82914g != obj) {
                        qcrVar = (qcr) objM82914g;
                        if (qcrVar == null) {
                            b141Var.m27884q(new n161(str3, str2, null, "BACKEND_NO_SUGGESTION"));
                            return w2a1Var;
                        }
                        zux zuxVarM43299d = g0g1.m43299d(vqg1.m86217B(yd5Var.f271680e.f59061a).mo26211a(), yd5Var.f271681f.f137270b, new w30(yd5Var, fbkVar, 1));
                        rd5Var2.f198033a = str2;
                        rd5Var2.f198034b = qcrVar;
                        rd5Var2.f198037e = 2;
                        objM86755t = vyf1.m86755t(zuxVarM43299d, rd5Var2);
                        if (objM86755t != obj) {
                            str5 = str2;
                            qcrVar2 = qcrVar;
                            if (!((Boolean) objM86755t).booleanValue()) {
                                qcrVar2.getClass();
                                b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "VIEW_NOT_READY"));
                                return w2a1Var;
                            }
                            iM38547C = edb.m38547C(qcrVar2.mo66722a());
                            s14Var = s14.LOW;
                            zContains = false;
                            if (iM38547C != 0) {
                                if (iM38547C == 1) {
                                    zContains = h6f.m46715L(s14Var, s14.MID).contains(v14Var.m84444c());
                                } else if (iM38547C == 2) {
                                    zContains = true;
                                } else if (iM38547C != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (v14Var.m84444c() == s14Var) {
                                zContains = true;
                            }
                            if (!zContains) {
                                Objects.toString(v14Var.m84444c());
                                b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "BELOW_CONFIDENCE_THRESHOLD"));
                                return w2a1Var;
                            }
                            rd5Var2.f198033a = str5;
                            rd5Var2.f198034b = qcrVar2;
                            rd5Var2.f198037e = 3;
                            objM93398d = yd5Var.m93398d(rd5Var2);
                            if (objM93398d != obj) {
                                obj2 = objM93398d;
                                str6 = str5;
                                if (!((Boolean) obj2).booleanValue()) {
                                    qcrVar2.getClass();
                                    b141Var.m27884q(new n161(str3, str6, qcrVar2.mo66725d(), "INELIGIBLE"));
                                    return w2a1Var;
                                }
                                iOrdinal = v14Var.m84446e().ordinal();
                                if (iOrdinal != 0) {
                                    pqm0VarM69840u = pft0.m69840u(nw21.f159008a, kkc0.m56695h0(pft0.m69840u("instrumentationId", wgg0.APP_STARTUP_DEVICE_PREDICTABILITY), pft0.m69840u("dismissTimeout", Long.valueOf(v14Var.m84445d()))));
                                } else {
                                    if (iOrdinal == 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pqm0VarM69840u = pft0.m69840u(gea.f79065a, c95.m31821M(pft0.m69840u("instrumentationId", ymg0.APP_STARTUP_DEVICE_PREDICTABILITY)));
                                }
                                d061 d061Var = new d061(qcrVar2, (Map) pqm0VarM69840u.f180351b, (f261) pqm0VarM69840u.f180350a);
                                d061Var.m34526b().getClass();
                                b141Var.m27884q(new k161(str3, d061Var.m34526b().mo40579a(), qcrVar2.mo66725d(), qhg1.m72835z(qcrVar2.mo66722a())));
                                zv41 zv41Var = yd5Var.f271674Y;
                                zv41Var.getClass();
                                zv41Var.m97091m(null, d061Var);
                                return w2a1Var;
                            }
                        }
                    }
                    return obj;
                } catch (CancellationException e) {
                    e = e;
                    sg5Var = (sg5) yd5Var.f271677b.f54036b.m23798h();
                    sg5Var2 = sg5.f208721b;
                    if (sg5Var == null) {
                        sg5Var = sg5Var2;
                    }
                    if (sg5Var == sg5Var2) {
                        str4 = "APP_BACKGROUNDED";
                    } else {
                        str4 = "TRIGGER_STOPPED";
                    }
                    b141Var.m27884q(new h161(str3, str2, str4));
                    throw e;
                }
            } catch (CancellationException e2) {
                e = e2;
                str3 = "app_startup";
                sg5Var = (sg5) yd5Var.f271677b.f54036b.m23798h();
                sg5Var2 = sg5.f208721b;
                if (sg5Var == null) {
                    sg5Var = sg5Var2;
                }
                if (sg5Var == sg5Var2) {
                    str4 = "APP_BACKGROUNDED";
                } else {
                    str4 = "TRIGGER_STOPPED";
                }
                b141Var.m27884q(new h161(str3, str2, str4));
                throw e;
            }
        }
        if (i2 == 1) {
            str2 = rd5Var2.f198033a;
            try {
                bga.m29073P(obj2);
                str3 = "app_startup";
                objM82914g = obj2;
                obj = obj3;
                qcrVar = (qcr) objM82914g;
                if (qcrVar == null) {
                    b141Var.m27884q(new n161(str3, str2, null, "BACKEND_NO_SUGGESTION"));
                    return w2a1Var;
                }
                zux zuxVarM43299d2 = g0g1.m43299d(vqg1.m86217B(yd5Var.f271680e.f59061a).mo26211a(), yd5Var.f271681f.f137270b, new w30(yd5Var, fbkVar, 1));
                rd5Var2.f198033a = str2;
                rd5Var2.f198034b = qcrVar;
                rd5Var2.f198037e = 2;
                objM86755t = vyf1.m86755t(zuxVarM43299d2, rd5Var2);
                if (objM86755t != obj) {
                    str5 = str2;
                    qcrVar2 = qcrVar;
                    if (!((Boolean) objM86755t).booleanValue()) {
                        qcrVar2.getClass();
                        b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "VIEW_NOT_READY"));
                        return w2a1Var;
                    }
                    iM38547C = edb.m38547C(qcrVar2.mo66722a());
                    s14Var = s14.LOW;
                    zContains = false;
                    if (iM38547C != 0) {
                        if (iM38547C == 1) {
                            zContains = h6f.m46715L(s14Var, s14.MID).contains(v14Var.m84444c());
                        } else if (iM38547C == 2) {
                            zContains = true;
                        } else if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (v14Var.m84444c() == s14Var) {
                        zContains = true;
                    }
                    if (!zContains) {
                        Objects.toString(v14Var.m84444c());
                        b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "BELOW_CONFIDENCE_THRESHOLD"));
                        return w2a1Var;
                    }
                    rd5Var2.f198033a = str5;
                    rd5Var2.f198034b = qcrVar2;
                    rd5Var2.f198037e = 3;
                    objM93398d = yd5Var.m93398d(rd5Var2);
                    if (objM93398d != obj) {
                        obj2 = objM93398d;
                        str6 = str5;
                    }
                }
                return obj;
            } catch (CancellationException e3) {
                e = e3;
                str3 = "app_startup";
                sg5Var = (sg5) yd5Var.f271677b.f54036b.m23798h();
                sg5Var2 = sg5.f208721b;
                if (sg5Var == null) {
                    sg5Var = sg5Var2;
                }
                if (sg5Var == sg5Var2) {
                    str4 = "APP_BACKGROUNDED";
                } else {
                    str4 = "TRIGGER_STOPPED";
                }
                b141Var.m27884q(new h161(str3, str2, str4));
                throw e;
            }
        }
        if (i2 == 2) {
            qcrVar2 = rd5Var2.f198034b;
            str5 = rd5Var2.f198033a;
            bga.m29073P(obj2);
            objM86755t = obj2;
            obj = obj3;
            str3 = "app_startup";
            if (!((Boolean) objM86755t).booleanValue()) {
                qcrVar2.getClass();
                b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "VIEW_NOT_READY"));
                return w2a1Var;
            }
            iM38547C = edb.m38547C(qcrVar2.mo66722a());
            s14Var = s14.LOW;
            zContains = false;
            if (iM38547C != 0) {
                if (iM38547C == 1) {
                    zContains = h6f.m46715L(s14Var, s14.MID).contains(v14Var.m84444c());
                } else if (iM38547C == 2) {
                    zContains = true;
                } else if (iM38547C != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (v14Var.m84444c() == s14Var) {
                zContains = true;
            }
            if (!zContains) {
                Objects.toString(v14Var.m84444c());
                b141Var.m27884q(new n161(str3, str5, qcrVar2.mo66725d(), "BELOW_CONFIDENCE_THRESHOLD"));
                return w2a1Var;
            }
            rd5Var2.f198033a = str5;
            rd5Var2.f198034b = qcrVar2;
            rd5Var2.f198037e = 3;
            objM93398d = yd5Var.m93398d(rd5Var2);
            if (objM93398d != obj) {
                obj2 = objM93398d;
                str6 = str5;
            }
            return obj;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qcrVar2 = rd5Var2.f198034b;
        str6 = rd5Var2.f198033a;
        bga.m29073P(obj2);
        str3 = "app_startup";
        if (!((Boolean) obj2).booleanValue()) {
            qcrVar2.getClass();
            b141Var.m27884q(new n161(str3, str6, qcrVar2.mo66725d(), "INELIGIBLE"));
            return w2a1Var;
        }
        iOrdinal = v14Var.m84446e().ordinal();
        if (iOrdinal != 0) {
            pqm0VarM69840u = pft0.m69840u(nw21.f159008a, kkc0.m56695h0(pft0.m69840u("instrumentationId", wgg0.APP_STARTUP_DEVICE_PREDICTABILITY), pft0.m69840u("dismissTimeout", Long.valueOf(v14Var.m84445d()))));
        } else {
            if (iOrdinal == 1) {
                throw new NoWhenBranchMatchedException();
            }
            pqm0VarM69840u = pft0.m69840u(gea.f79065a, c95.m31821M(pft0.m69840u("instrumentationId", ymg0.APP_STARTUP_DEVICE_PREDICTABILITY)));
        }
        d061 d061Var2 = new d061(qcrVar2, (Map) pqm0VarM69840u.f180351b, (f261) pqm0VarM69840u.f180350a);
        d061Var2.m34526b().getClass();
        b141Var.m27884q(new k161(str3, d061Var2.m34526b().mo40579a(), qcrVar2.mo66725d(), qhg1.m72835z(qcrVar2.mo66722a())));
        zv41 zv41Var2 = yd5Var.f271674Y;
        zv41Var2.getClass();
        zv41Var2.m97091m(null, d061Var2);
        return w2a1Var;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        qlg1.m73215t(this.f271673X.f35578a);
        this.f271674Y.m97090l(null);
        this.f271675Z.m97090l(null);
        sr31 sr31Var = this.f271671L0;
        if (sr31Var != null) {
            sr31Var.m78990d();
        }
        this.f271671L0 = null;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (this.f271683h.m84443b()) {
            this.f271671L0 = this.f271684i.m27891c(this);
            fbk fbkVar = null;
            xd5 xd5Var = new xd5(this, fbkVar, 0);
            c9k c9kVar = this.f271673X;
            x0h1.m89578u(c9kVar, null, 0, xd5Var, 3);
            x0h1.m89578u(c9kVar, null, 0, new xd5(this, fbkVar, 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m93398d(ibk ibkVar) {
        ud5 ud5Var;
        if (ibkVar instanceof ud5) {
            ud5Var = (ud5) ibkVar;
            int i = ud5Var.f229173c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud5Var.f229173c = i - Integer.MIN_VALUE;
            } else {
                ud5Var = new ud5(this, ibkVar);
            }
        } else {
            ud5Var = new ud5(this, ibkVar);
        }
        Object objM86755t = ud5Var.f229171a;
        int i2 = ud5Var.f229173c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            kmx kmxVarM27791m = b0g1.m27791m(this.f271675Z);
            ud5Var.f229173c = 1;
            objM86755t = vyf1.m86755t(kmxVarM27791m, ud5Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        if (((Boolean) objM86755t).booleanValue()) {
            return qyg1.m74178H(false);
        }
        if (this.f271678c.f141817b.current().getValue() != null) {
            return qyg1.m74178H(false);
        }
        return ((Boolean) this.f271679d.f281556b.getValue()).booleanValue() ? qyg1.m74178H(false) : qyg1.m74178H(true);
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: e */
    public final String mo43371e() {
        return "app_startup";
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: f */
    public final zv41 mo43372f() {
        return this.f271672M0;
    }

    @Override // p204p.g261
    /* JADX INFO: renamed from: h */
    public final void mo43373h(a161 a161Var) {
        a161Var.toString();
        if ((a161Var instanceof w061) || (a161Var instanceof y061)) {
            this.f271674Y.m97090l(null);
        } else if (!(a161Var instanceof x061) && !(a161Var instanceof z061)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
