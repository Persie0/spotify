package p204p;

import android.app.Application;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.RavelinError;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class wau0 {

    /* JADX INFO: renamed from: n */
    public static final r46 f249610n = new r46(22);

    /* JADX INFO: renamed from: o */
    public static final String f249611o;

    /* JADX INFO: renamed from: p */
    public static boolean f249612p;

    /* JADX INFO: renamed from: q */
    public static final c9k f249613q;

    /* JADX INFO: renamed from: r */
    public static final w1f1 f249614r;

    /* JADX INFO: renamed from: s */
    public static volatile wau0 f249615s;

    /* JADX INFO: renamed from: a */
    public final Application f249616a;

    /* JADX INFO: renamed from: b */
    public final String f249617b;

    /* JADX INFO: renamed from: c */
    public alk0 f249618c;

    /* JADX INFO: renamed from: d */
    public a2f1 f249619d;

    /* JADX INFO: renamed from: e */
    public d2f1 f249620e;

    /* JADX INFO: renamed from: f */
    public zkk0 f249621f;

    /* JADX INFO: renamed from: g */
    public wue f249622g;

    /* JADX INFO: renamed from: h */
    public vue f249623h;

    /* JADX INFO: renamed from: i */
    public mve f249624i;

    /* JADX INFO: renamed from: j */
    public nab0 f249625j;

    /* JADX INFO: renamed from: k */
    public xd70 f249626k;

    /* JADX INFO: renamed from: l */
    public c9k f249627l;

    /* JADX INFO: renamed from: m */
    public String f249628m = "";

    static {
        String canonicalName = wau0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = wau0.class.getSimpleName();
        }
        f249611o = canonicalName;
        x461 x461VarM64613f = njg1.m64613f();
        n5q n5qVar = xsr.f265651a;
        f249613q = kk40.m56661c(mlg1.m62205A(x461VarM64613f, tlp.f221498c));
        f249614r = new w1f1();
    }

    public wau0(Application application, String str) {
        this.f249616a = application;
        this.f249617b = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: a */
    public static final Object m87613a(wau0 wau0Var, Application application, String str, String str2, m5p m5pVar, ibk ibkVar) {
        qau0 qau0Var;
        Boolean bool;
        boolean zM92160c;
        Long l;
        long j;
        Application application2;
        String str3;
        String str4;
        ArrayList arrayList;
        if (ibkVar instanceof qau0) {
            qau0Var = (qau0) ibkVar;
            int i = qau0Var.f186937i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qau0Var.f186937i = i - Integer.MIN_VALUE;
            } else {
                qau0Var = new qau0(wau0Var, ibkVar);
            }
        } else {
            qau0Var = new qau0(wau0Var, ibkVar);
        }
        qau0 qau0Var2 = qau0Var;
        Object obj = qau0Var2.f186935g;
        int i2 = qau0Var2.f186937i;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                kxq0.m57634e(application, wau0Var.f249617b).m73902g(wau0Var);
                x461 x461VarM64613f = njg1.m64613f();
                alk0 alk0Var = wau0Var.f249618c;
                if (alk0Var == null) {
                    wj50.m88260d0("coroutineContextProvider");
                    throw null;
                }
                wau0Var.f249627l = kk40.m56661c(mlg1.m62205A(x461VarM64613f, alk0Var.m26348a()));
                String str5 = str == null ? "" : str;
                if (x5i0.m90030i(str5)) {
                    wau0Var.f249628m = str5;
                } else {
                    wau0Var.f249628m = "";
                }
                if (m5pVar != null) {
                    Object objM60868b = m5pVar.m60868b("device id sharing group", "device id sharing enabled");
                    if (!(objM60868b instanceof Boolean)) {
                        objM60868b = null;
                    }
                    bool = (Boolean) objM60868b;
                } else {
                    bool = null;
                }
                zM92160c = xue.m92160c(bool);
                if (m5pVar != null) {
                    Object objM60868b2 = m5pVar.m60868b("device id sharing group", "device id sharing timeout");
                    if (!(objM60868b2 instanceof Long)) {
                        objM60868b2 = null;
                    }
                    l = (Long) objM60868b2;
                } else {
                    l = null;
                }
                long jM92158a = xue.m92158a(l);
                wau0Var.m87618f(m5pVar);
                ArrayList arrayListM65739i = ((nve) wau0Var.m87614b()).m65739i(application, qyg1.m74178H(zM92160c));
                Boolean boolM74178H = qyg1.m74178H(zM92160c);
                Long lM74181K = qyg1.m74181K(jM92158a);
                qau0Var2.f186929a = application;
                qau0Var2.f186930b = str;
                qau0Var2.f186931c = str2;
                qau0Var2.f186932d = arrayListM65739i;
                qau0Var2.f186933e = zM92160c;
                qau0Var2.f186934f = jM92158a;
                qau0Var2.f186937i = 1;
                zkk0 zkk0VarM87614b = wau0Var.m87614b();
                j = jM92158a;
                wue wueVar = wau0Var.f249622g;
                if (wueVar == null) {
                    wj50.m88260d0("randomNumbersGenerator");
                    throw null;
                }
                vue vueVar = wau0Var.f249623h;
                if (vueVar == null) {
                    wj50.m88260d0("permissionsManager");
                    throw null;
                }
                Object objM65737g = ((nve) zkk0VarM87614b).m65737g(application, wueVar, vueVar, arrayListM65739i, str2, boolM74178H, lM74181K, qau0Var2);
                yuk yukVar = yuk.f276404a;
                if (objM65737g != yukVar) {
                    objM65737g = w2a1Var;
                }
                if (objM65737g == yukVar) {
                    return yukVar;
                }
                application2 = application;
                str3 = str2;
                str4 = str;
                arrayList = arrayListM65739i;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = qau0Var2.f186934f;
                boolean z = qau0Var2.f186933e;
                ArrayList arrayList2 = qau0Var2.f186932d;
                String str6 = qau0Var2.f186931c;
                String str7 = qau0Var2.f186930b;
                Application application3 = qau0Var2.f186929a;
                bga.m29073P(obj);
                zM92160c = z;
                j = j2;
                arrayList = arrayList2;
                str3 = str6;
                application2 = application3;
                str4 = str7;
            }
            Boolean boolM74178H2 = qyg1.m74178H(zM92160c);
            Long lM74181K2 = qyg1.m74181K(j);
            c9k c9kVar = wau0Var.f249627l;
            if (c9kVar != null) {
                x0h1.m89578u(c9kVar, null, 0, new mau0(wau0Var, application2, str3, arrayList, boolM74178H2, lM74181K2, null), 3);
            }
            d2f1 d2f1Var = wau0Var.f249620e;
            if (d2f1Var == null) {
                wj50.m88260d0("payloadGenerator");
                throw null;
            }
            String strM83979b = ((uue) d2f1Var).m83979b();
            if (wl51.m88460J0(strM83979b) || strM83979b.equals("0")) {
                d2f1 d2f1Var2 = wau0Var.f249620e;
                if (d2f1Var2 == null) {
                    wj50.m88260d0("payloadGenerator");
                    throw null;
                }
                ((uue) d2f1Var2).m83979b();
            }
            Boolean boolM74178H3 = qyg1.m74178H(zM92160c);
            c9k c9kVar2 = wau0Var.f249627l;
            if (c9kVar2 != null) {
                x0h1.m89578u(c9kVar2, null, 0, new uau0(wau0Var, application2, arrayList, boolM74178H3, str4, null), 3);
            }
            f249612p = true;
            return w2a1Var;
        } catch (Exception e) {
            hbg1.m47048s(f249611o, "***Debug error in RavelinSDK initialise " + e.getMessage());
            wau0Var.m87617e(new RavelinError(e.getMessage(), null, 2, null), new ErrorMetadata(104, "Initialization", "An error occurred while initializing the SDK", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), null);
            return w2a1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zkk0 m87614b() {
        zkk0 zkk0Var = this.f249621f;
        if (zkk0Var != null) {
            return zkk0Var;
        }
        wj50.m88260d0("deviceIdWrapper");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m87615c(m5p m5pVar, boolean z, vau0 vau0Var, ibk ibkVar) {
        nau0 nau0Var;
        if (ibkVar instanceof nau0) {
            nau0Var = (nau0) ibkVar;
            int i = nau0Var.f152121d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nau0Var.f152121d = i - Integer.MIN_VALUE;
            } else {
                nau0Var = new nau0(this, ibkVar);
            }
        } else {
            nau0Var = new nau0(this, ibkVar);
        }
        Object objM37094o = nau0Var.f152119b;
        int i2 = nau0Var.f152121d;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM37094o);
                a2f1 a2f1Var = this.f249619d;
                if (a2f1Var == null) {
                    wj50.m88260d0("fingerprintGenerator");
                    throw null;
                }
                nau0Var.f152118a = vau0Var;
                nau0Var.f152121d = 1;
                objM37094o = ((dve) a2f1Var).m37094o(m5pVar, z, 1500L, nau0Var);
                yuk yukVar = yuk.f276404a;
                if (objM37094o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vau0Var = nau0Var.f152118a;
                bga.m29073P(objM37094o);
            }
            Fingerprint fingerprint = (Fingerprint) objM37094o;
            if (vau0Var == null) {
                return null;
            }
            vau0Var.mo50103l(fingerprint);
            return w2a1Var;
        } catch (Exception e) {
            if (vau0Var == null) {
                return null;
            }
            vau0Var.mo50102f(new RavelinError(e.getMessage(), null, 2, null));
            return w2a1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m87616d(boolean z, m5p m5pVar, lau0 lau0Var, fbk fbkVar) {
        rau0 rau0Var;
        if (fbkVar instanceof rau0) {
            rau0Var = (rau0) fbkVar;
            int i = rau0Var.f197387d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rau0Var.f197387d = i - Integer.MIN_VALUE;
            } else {
                rau0Var = new rau0(this, fbkVar);
            }
        } else {
            rau0Var = new rau0(this, fbkVar);
        }
        Object objM87615c = rau0Var.f197385b;
        int i2 = rau0Var.f197387d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87615c);
                d2f1 d2f1Var = this.f249620e;
                if (d2f1Var == null) {
                    wj50.m88260d0("payloadGenerator");
                    throw null;
                }
                String str = this.f249628m;
                String strM65735e = ((nve) m87614b()).m65735e();
                if (strM65735e == null) {
                    strM65735e = "0";
                }
                vau0 vau0Var = new vau0(((uue) d2f1Var).m83978a(str, strM65735e, new pau0(this, lau0Var)), this, lau0Var);
                rau0Var.f197384a = lau0Var;
                rau0Var.f197387d = 1;
                objM87615c = m87615c(m5pVar, z, vau0Var, rau0Var);
                Object obj = yuk.f276404a;
                if (objM87615c == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lau0 lau0Var2 = rau0Var.f197384a;
                bga.m29073P(objM87615c);
            }
            return (w2a1) objM87615c;
        } catch (Exception e) {
            m87617e(new RavelinError(e.getMessage(), null, 2, null), new ErrorMetadata(101, "Tracking", "An error occurred while generating the fingerprint", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), lau0Var);
            return w2a1.f247311a;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m87617e(RavelinError ravelinError, ErrorMetadata errorMetadata, lau0 lau0Var) {
        Application application = this.f249616a;
        if (application != null) {
            ((nve) m87614b()).m65740j(application.getApplicationContext());
            MobileError mobileError = new MobileError(System.currentTimeMillis(), "", "mobile-report", ravelinError.getMessage(), errorMetadata);
            boolean z = this.f249626k != null;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (!z) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                xd70 xd70Var = this.f249626k;
                if (xd70Var == null) {
                    wj50.m88260d0("eventTracker");
                    throw null;
                }
                ((z2f1) xd70Var).m95188a(mobileError);
            }
        }
        if (lau0Var != null) {
            lau0Var.mo46940a(ravelinError);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m87618f(m5p m5pVar) {
        mve mveVar = this.f249624i;
        fbk fbkVar = null;
        if (mveVar == null) {
            wj50.m88260d0("rateLimit");
            throw null;
        }
        mveVar.f147565b.put("fingerprint emitter", new xkk0(j0g1.m52092t(0, 0, 0, 7), new sau0(4, 8, wau0.class, this, "trackFingerprintAction", "trackFingerprintAction(ZLcom/ravelin/core/util/configparameters/ConfigParameters;Lcom/ravelin/core/callback/RavelinRequestCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), m5pVar));
        x0h1.m89578u(mveVar.f147564a, null, 0, new lw2(mveVar, fbkVar, 7), 3);
    }
}
