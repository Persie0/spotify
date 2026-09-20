package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class vrd1 implements ssi {

    /* JADX INFO: renamed from: X */
    public final c9k f244182X;

    /* JADX INFO: renamed from: Y */
    public final zv41 f244183Y = jag1.m52819d(new qrd1());

    /* JADX INFO: renamed from: Z */
    public di41 f244184Z;

    /* JADX INFO: renamed from: a */
    public final jfr f244185a;

    /* JADX INFO: renamed from: b */
    public final xrd1 f244186b;

    /* JADX INFO: renamed from: c */
    public final voi f244187c;

    /* JADX INFO: renamed from: d */
    public final cdp f244188d;

    /* JADX INFO: renamed from: e */
    public final arm f244189e;

    /* JADX INFO: renamed from: f */
    public final ddp f244190f;

    /* JADX INFO: renamed from: g */
    public final xi70 f244191g;

    /* JADX INFO: renamed from: h */
    public final xre f244192h;

    /* JADX INFO: renamed from: i */
    public final e24 f244193i;

    /* JADX INFO: renamed from: t */
    public final luk f244194t;

    public vrd1(jfr jfrVar, xrd1 xrd1Var, voi voiVar, cdp cdpVar, arm armVar, ddp ddpVar, xi70 xi70Var, xre xreVar, e24 e24Var, luk lukVar) {
        this.f244185a = jfrVar;
        this.f244186b = xrd1Var;
        this.f244187c = voiVar;
        this.f244188d = cdpVar;
        this.f244189e = armVar;
        this.f244190f = ddpVar;
        this.f244191g = xi70Var;
        this.f244192h = xreVar;
        this.f244193i = e24Var;
        this.f244194t = lukVar;
        this.f244182X = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d A[Catch: Exception -> 0x003e, CancellationException -> 0x01b3, TryCatch #2 {CancellationException -> 0x01b3, Exception -> 0x003e, blocks: (B:15:0x0039, B:61:0x0150, B:63:0x015b, B:65:0x0187, B:22:0x0053, B:54:0x0102, B:56:0x010d, B:58:0x0116, B:26:0x0065, B:50:0x00da, B:29:0x0070, B:46:0x00c0, B:32:0x0078, B:38:0x0096, B:40:0x009a, B:42:0x00aa, B:35:0x0086), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r1 == r12) goto L60;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m86293c(vrd1 vrd1Var, boolean z, String str, ibk ibkVar) {
        urd1 urd1Var;
        String str2;
        boolean z2;
        Object objM86296d;
        String str3;
        List list;
        String str4;
        Object objM91087a;
        String str5;
        boolean z3;
        List list2;
        String str6;
        List list3;
        Object objM96567o;
        List list4;
        String str7;
        api apiVar;
        String strMo26689e;
        jfr jfrVar = vrd1Var.f244185a;
        xi70 xi70Var = vrd1Var.f244191g;
        xre xreVar = vrd1Var.f244192h;
        if (ibkVar instanceof urd1) {
            urd1Var = (urd1) ibkVar;
            int i = urd1Var.f233340h;
            if ((i & Integer.MIN_VALUE) != 0) {
                urd1Var.f233340h = i - Integer.MIN_VALUE;
            } else {
                urd1Var = new urd1(vrd1Var, ibkVar);
            }
        } else {
            urd1Var = new urd1(vrd1Var, ibkVar);
        }
        Object objM91934b = urd1Var.f233338f;
        int i2 = urd1Var.f233340h;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM91934b);
                str2 = str;
                urd1Var.f233334b = str2;
                z2 = z;
                urd1Var.f233333a = z2;
                urd1Var.f233340h = 1;
                objM86296d = vrd1Var.m86296d(urd1Var);
                if (objM86296d == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                z2 = urd1Var.f233333a;
                String str8 = urd1Var.f233334b;
                bga.m29073P(objM91934b);
                objM86296d = objM91934b;
                str2 = str8;
            } else {
                if (i2 == 2) {
                    z2 = urd1Var.f233333a;
                    list = urd1Var.f233335c;
                    str3 = urd1Var.f233334b;
                    bga.m29073P(objM91934b);
                    str4 = (String) objM91934b;
                    urd1Var.f233334b = str3;
                    urd1Var.f233335c = list;
                    urd1Var.f233336d = str4;
                    urd1Var.f233333a = z2;
                    urd1Var.f233340h = 3;
                    objM91087a = xi70Var.m91087a(urd1Var);
                    if (objM91087a == obj) {
                        boolean z4 = z2;
                        str5 = str4;
                        objM91934b = objM91087a;
                        z3 = z4;
                        list2 = list;
                        str6 = str3;
                        list3 = (List) objM91934b;
                        Single singleFirstOrError = ((s5p) vrd1Var.f244187c).m77297d().firstOrError();
                        urd1Var.f233334b = str6;
                        urd1Var.f233335c = list2;
                        urd1Var.f233336d = str5;
                        urd1Var.f233337e = list3;
                        urd1Var.f233333a = z3;
                        urd1Var.f233340h = 4;
                        objM96567o = zn91.m96567o(singleFirstOrError, urd1Var);
                        if (objM96567o != obj) {
                            list4 = list3;
                            str7 = str5;
                            objM91934b = objM96567o;
                            List list5 = list2;
                            apiVar = (api) ((xul0) objM91934b).mo49283h();
                            if (apiVar != null) {
                                strMo26689e = apiVar.mo26689e();
                            } else {
                                strMo26689e = null;
                            }
                            lba0 lba0Var = lba0.f131608f;
                            nfr nfrVar = new nfr(list5, lba0.m58640u6(yre.m94418a()).m58652p6(bno.f28899h), str7, strMo26689e, new hme(z3), list4);
                            list5.size();
                            list5.size();
                            jfrVar.getClass();
                            xrd1 xrd1Var = vrd1Var.f244186b;
                            urd1Var.f233334b = null;
                            urd1Var.f233335c = null;
                            urd1Var.f233336d = null;
                            urd1Var.f233337e = null;
                            urd1Var.f233333a = z3;
                            urd1Var.f233340h = 5;
                            objM91934b = xrd1Var.m91934b(nfrVar, str6, urd1Var);
                        }
                    }
                    return obj;
                }
                if (i2 == 3) {
                    z3 = urd1Var.f233333a;
                    str5 = urd1Var.f233336d;
                    list2 = urd1Var.f233335c;
                    str6 = urd1Var.f233334b;
                    bga.m29073P(objM91934b);
                    list3 = (List) objM91934b;
                    Single singleFirstOrError2 = ((s5p) vrd1Var.f244187c).m77297d().firstOrError();
                    urd1Var.f233334b = str6;
                    urd1Var.f233335c = list2;
                    urd1Var.f233336d = str5;
                    urd1Var.f233337e = list3;
                    urd1Var.f233333a = z3;
                    urd1Var.f233340h = 4;
                    objM96567o = zn91.m96567o(singleFirstOrError2, urd1Var);
                    if (objM96567o != obj) {
                        list4 = list3;
                        str7 = str5;
                        objM91934b = objM96567o;
                        List list6 = list2;
                        apiVar = (api) ((xul0) objM91934b).mo49283h();
                        if (apiVar != null) {
                            strMo26689e = apiVar.mo26689e();
                        } else {
                            strMo26689e = null;
                        }
                        lba0 lba0Var2 = lba0.f131608f;
                        nfr nfrVar2 = new nfr(list6, lba0.m58640u6(yre.m94418a()).m58652p6(bno.f28899h), str7, strMo26689e, new hme(z3), list4);
                        list6.size();
                        list6.size();
                        jfrVar.getClass();
                        xrd1 xrd1Var2 = vrd1Var.f244186b;
                        urd1Var.f233334b = null;
                        urd1Var.f233335c = null;
                        urd1Var.f233336d = null;
                        urd1Var.f233337e = null;
                        urd1Var.f233333a = z3;
                        urd1Var.f233340h = 5;
                        objM91934b = xrd1Var2.m91934b(nfrVar2, str6, urd1Var);
                    }
                    return obj;
                }
                if (i2 == 4) {
                    z3 = urd1Var.f233333a;
                    List list7 = urd1Var.f233337e;
                    String str9 = urd1Var.f233336d;
                    list2 = urd1Var.f233335c;
                    str6 = urd1Var.f233334b;
                    bga.m29073P(objM91934b);
                    list4 = list7;
                    str7 = str9;
                    List list8 = list2;
                    apiVar = (api) ((xul0) objM91934b).mo49283h();
                    if (apiVar != null) {
                        strMo26689e = apiVar.mo26689e();
                    } else {
                        strMo26689e = null;
                    }
                    lba0 lba0Var3 = lba0.f131608f;
                    nfr nfrVar3 = new nfr(list8, lba0.m58640u6(yre.m94418a()).m58652p6(bno.f28899h), str7, strMo26689e, new hme(z3), list4);
                    list8.size();
                    list8.size();
                    jfrVar.getClass();
                    xrd1 xrd1Var3 = vrd1Var.f244186b;
                    urd1Var.f233334b = null;
                    urd1Var.f233335c = null;
                    urd1Var.f233336d = null;
                    urd1Var.f233337e = null;
                    urd1Var.f233333a = z3;
                    urd1Var.f233340h = 5;
                    objM91934b = xrd1Var3.m91934b(nfrVar3, str6, urd1Var);
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM91934b);
                }
            }
            jfrVar.getClass();
            m061 m061VarM72722a = ((qfr) objM91934b).m72722a();
            if (m061VarM72722a == null) {
                ((wy3) xreVar).getClass();
                return new qrd1(System.currentTimeMillis());
            }
            String strM60412b = m061VarM72722a.m60412b();
            int iM86294g = m86294g(m061VarM72722a.m60411a());
            String strM60414d = m061VarM72722a.m60414d();
            int iM86295i = m86295i(m061VarM72722a.m60415e());
            boolean zM60413c = m061VarM72722a.m60413c();
            ((wy3) xreVar).getClass();
            return new rrd1(strM60412b, iM86294g, strM60414d, iM86295i, zM60413c, System.currentTimeMillis());
            List list9 = (List) objM86296d;
            if (list9 == null) {
                ((wy3) xreVar).getClass();
                return new qrd1(System.currentTimeMillis());
            }
            urd1Var.f233334b = str2;
            urd1Var.f233335c = list9;
            urd1Var.f233333a = z2;
            urd1Var.f233340h = 2;
            Object objM91088b = xi70Var.m91088b(urd1Var);
            if (objM91088b != obj) {
                str3 = str2;
                objM91934b = objM91088b;
                list = list9;
                str4 = (String) objM91934b;
                urd1Var.f233334b = str3;
                urd1Var.f233335c = list;
                urd1Var.f233336d = str4;
                urd1Var.f233333a = z2;
                urd1Var.f233340h = 3;
                objM91087a = xi70Var.m91087a(urd1Var);
                if (objM91087a == obj) {
                    boolean z5 = z2;
                    str5 = str4;
                    objM91934b = objM91087a;
                    z3 = z5;
                    list2 = list;
                    str6 = str3;
                    list3 = (List) objM91934b;
                    Single singleFirstOrError3 = ((s5p) vrd1Var.f244187c).m77297d().firstOrError();
                    urd1Var.f233334b = str6;
                    urd1Var.f233335c = list2;
                    urd1Var.f233336d = str5;
                    urd1Var.f233337e = list3;
                    urd1Var.f233333a = z3;
                    urd1Var.f233340h = 4;
                    objM96567o = zn91.m96567o(singleFirstOrError3, urd1Var);
                    if (objM96567o != obj) {
                        list4 = list3;
                        str7 = str5;
                        objM91934b = objM96567o;
                        List list10 = list2;
                        apiVar = (api) ((xul0) objM91934b).mo49283h();
                        if (apiVar != null) {
                            strMo26689e = apiVar.mo26689e();
                        } else {
                            strMo26689e = null;
                        }
                        lba0 lba0Var4 = lba0.f131608f;
                        nfr nfrVar4 = new nfr(list10, lba0.m58640u6(yre.m94418a()).m58652p6(bno.f28899h), str7, strMo26689e, new hme(z3), list4);
                        list10.size();
                        list10.size();
                        jfrVar.getClass();
                        xrd1 xrd1Var4 = vrd1Var.f244186b;
                        urd1Var.f233334b = null;
                        urd1Var.f233335c = null;
                        urd1Var.f233336d = null;
                        urd1Var.f233337e = null;
                        urd1Var.f233333a = z3;
                        urd1Var.f233340h = 5;
                        objM91934b = xrd1Var4.m91934b(nfrVar4, str6, urd1Var);
                    }
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b(tfe.m80650h(e2, "DevicePredictability: WhereToPlay request failed "), e2);
            ((wy3) xreVar).getClass();
            return new qrd1(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m86294g(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -2024701067) {
            if (iHashCode != 75572) {
                if (iHashCode == 2217378 && upperCase.equals("HIGH")) {
                    return 3;
                }
            } else if (upperCase.equals("LOW")) {
                return 1;
            }
        } else if (upperCase.equals("MEDIUM")) {
            return 2;
        }
        Logger.m3973i("DevicePredictability: Unknown confidence score: ".concat(str), new Object[0]);
        return 4;
    }

    /* JADX INFO: renamed from: i */
    public static int m86295i(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (upperCase.equals("CONTINUE")) {
            return 1;
        }
        if (upperCase.equals("PREDICTION")) {
            return 2;
        }
        Logger.m3973i("DevicePredictability: Unknown suggestion type: ".concat(str), new Object[0]);
        return 3;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        synchronized (this) {
            try {
                di41 di41Var = this.f244184Z;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                this.f244184Z = null;
                zv41 zv41Var = this.f244183Y;
                qrd1 qrd1Var = new qrd1();
                zv41Var.getClass();
                zv41Var.m97091m(null, qrd1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r8 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r8 == r6) goto L26;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m86296d(ibk ibkVar) {
        trd1 trd1Var;
        if (ibkVar instanceof trd1) {
            trd1Var = (trd1) ibkVar;
            int i = trd1Var.f223052c;
            if ((i & Integer.MIN_VALUE) != 0) {
                trd1Var.f223052c = i - Integer.MIN_VALUE;
            } else {
                trd1Var = new trd1(this, ibkVar);
            }
        } else {
            trd1Var = new trd1(this, ibkVar);
        }
        Object objM96567o = trd1Var.f223050a;
        int i2 = trd1Var.f223052c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objM96567o);
                    return (List) objM96567o;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
                return (List) objM96567o;
            }
            bga.m29073P(objM96567o);
            e24 e24Var = this.f244193i;
            boolean zM37579d = e24Var.m37579d();
            cdp cdpVar = this.f244188d;
            voi voiVar = this.f244187c;
            yuk yukVar = yuk.f276404a;
            if (zM37579d) {
                Single singleFirstOrError = Observable.combineLatest(((s5p) voiVar).m77299i(), cdpVar.m32458d(), new kkc1(this, 5)).firstOrError();
                trd1Var.f223052c = 1;
                objM96567o = zn91.m96567o(singleFirstOrError, trd1Var);
            } else {
                Observable observableFilter = Observable.combineLatest(((s5p) voiVar).m77299i(), cdpVar.m32458d(), new kkc1(this, 5)).filter(a7j0.f13070Q0);
                long jM37577b = e24Var.m37577b();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Single singleFirstOrError2 = observableFilter.debounce(jM37577b, timeUnit).timeout(e24Var.m37580e(), timeUnit).firstOrError();
                trd1Var.f223052c = 2;
                objM96567o = zn91.m96567o(singleFirstOrError2, trd1Var);
            }
            return yukVar;
        } catch (TimeoutException unused) {
            return null;
        }
    }
}
