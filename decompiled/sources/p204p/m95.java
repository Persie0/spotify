package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.protobuf.Timestamp;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.security.Provider;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class m95 implements wua, Init, uf41, Function, i9v, dn6, vd50, pal0, ddl, fz61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141210a;

    public /* synthetic */ m95(int i) {
        this.f141210a = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #5 {all -> 0x006c, blocks: (B:16:0x003c, B:28:0x005f, B:24:0x0056, B:20:0x0049), top: B:89:0x003c, inners: #2 }] */
    /* JADX INFO: renamed from: f */
    public static final void m61173f(v85 v85Var, C1975id c1975id) {
        boolean z;
        w85 w85Var = b95.f24770a;
        if (!p2l.f173365a.contains(b95.class)) {
            try {
                b95.f24771b.execute(new fr2(5, c1975id, v85Var));
            } catch (Throwable th) {
                p2l.m68953a(b95.class, th);
            }
        }
        boolean z2 = false;
        int i = 1;
        if (hgy.m47481b(fgy.OnDevicePostInstallEventProcessing) && ial0.m50092a()) {
            String str = c1975id.f100905a;
            Set set = p2l.f173365a;
            if (!set.contains(ial0.class)) {
                try {
                    boolean z3 = v85Var.f238384c;
                    ial0 ial0Var = ial0.f100273a;
                    if (!set.contains(ial0Var)) {
                        if (z3) {
                            try {
                                if (ial0.f100274b.contains(v85Var.f238386e)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z3 || z) {
                                    p8y.m69345c().execute(new yp10(str, v85Var, i));
                                }
                            } catch (Throwable th2) {
                                p2l.m68953a(ial0Var, th2);
                            }
                        } else {
                            z = false;
                            if (z3) {
                                p8y.m69345c().execute(new yp10(str, v85Var, i));
                            } else {
                                p8y.m69345c().execute(new yp10(str, v85Var, i));
                            }
                        }
                    }
                } catch (Throwable th3) {
                    p2l.m68953a(ial0.class, th3);
                }
            }
        }
        if (hgy.m47481b(fgy.GPSARATriggers)) {
            aq10.f18053a.m26740d(c1975id.f100905a, v85Var);
        }
        if (hgy.m47481b(fgy.GPSPACAProcessing)) {
            k2m0 k2m0Var = k2m0.f118665a;
            String str2 = c1975id.f100905a;
            if (!p2l.f173365a.contains(k2m0Var)) {
                try {
                    if (!k2m0.f118667c) {
                        k2m0.m55195a();
                    }
                    if (k2m0.f118666b) {
                        String string = null;
                        try {
                            JSONObject jSONObject = v85Var.f238382a;
                            if (jSONObject != null) {
                                string = jSONObject.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                        }
                        k2m0Var.m55196b(str2, string);
                    }
                } catch (Throwable th4) {
                    p2l.m68953a(k2m0Var, th4);
                }
            }
        }
        if (v85Var.f238384c) {
            return;
        }
        if (!p2l.f173365a.contains(n95.class)) {
            try {
                z2 = n95.f151712f;
            } catch (Throwable th5) {
                p2l.m68953a(n95.class, th5);
            }
        }
        if (z2) {
            return;
        }
        if (!wj50.m88271j(v85Var.f238386e, "fb_mobile_activate_app")) {
            iq3 iq3Var = tra0.f223025b;
            synchronized (p8y.f175081b) {
            }
        } else {
            if (p2l.f173365a.contains(n95.class)) {
                return;
            }
            try {
                n95.f151712f = true;
            } catch (Throwable th6) {
                p2l.m68953a(n95.class, th6);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m61174h() {
        iq3 iq3Var = tra0.f223025b;
        synchronized (p8y.f175081b) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static pqm0 m61175i(Bundle bundle, drl0 drl0Var, boolean z) {
        String str = m68.m60950c() ? "1" : "0";
        Map map = drl0.f52355b;
        pqm0 pqm0VarM25231h = aag1.m25231h("is_implicit_purchase_logging_enabled", str, bundle, drl0Var);
        Object objM25234k = aag1.m25234k("fb_iap_product_id", bundle, drl0Var);
        String str2 = objM25234k instanceof String ? (String) objM25234k : null;
        if (!z) {
            if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                pqm0 pqm0VarM25231h2 = aag1.m25231h("fb_content_id", str2, bundle, drl0Var);
                pqm0VarM25231h = aag1.m25231h("android_dynamic_ads_content_id", "client_manual", (Bundle) pqm0VarM25231h2.f180350a, (drl0) pqm0VarM25231h2.f180351b);
            }
        }
        pqm0 pqm0VarM25231h3 = aag1.m25231h("is_autolog_app_events_enabled", dwa1.m37142c() ? "1" : "0", (Bundle) pqm0VarM25231h.f180350a, (drl0) pqm0VarM25231h.f180351b);
        return new pqm0((Bundle) pqm0VarM25231h3.f180350a, (drl0) pqm0VarM25231h3.f180351b);
    }

    /* JADX INFO: renamed from: j */
    public static void m61176j() {
        if (m61178m() != 2) {
            b95.m28453c(6);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m61177l() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: m */
    public static int m61178m() {
        int i;
        synchronized (n95.m63888i()) {
            i = !p2l.f173365a.contains(n95.class) ? 1 : 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static String m61179n() {
        C2162nf c2162nf;
        if (p2l.f173365a.contains(n95.class)) {
            c2162nf = null;
        } else {
            try {
                c2162nf = n95.f151713g;
            } catch (Throwable th) {
                p2l.m68953a(n95.class, th);
                c2162nf = null;
            }
        }
        if (!p8y.m69343a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(p8y.m69343a()).build();
            try {
                installReferrerClientBuild.startConnection(new i5z(17, installReferrerClientBuild, c2162nf));
            } catch (Exception unused) {
            }
        }
        return p8y.m69343a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    /* JADX INFO: renamed from: o */
    public static void m61180o() {
        synchronized (n95.m63888i()) {
            if (n95.m63887h() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!p2l.f173365a.contains(n95.class)) {
                try {
                    n95.f151709c = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    p2l.m68953a(n95.class, th);
                }
            }
            RunnableC2034k runnableC2034k = new RunnableC2034k(7);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM63887h = n95.m63887h();
            if (scheduledThreadPoolExecutorM63887h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutorM63887h.scheduleAtFixedRate(runnableC2034k, 0L, 86400L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: p */
    public static m1b m61181p(fk30 fk30Var) {
        wj30 wj30VarData;
        wj30 wj30VarData2;
        mj30 mj30Var = (mj30) fk30Var.events().get("click");
        String strString = null;
        String strName = mj30Var != null ? mj30Var.name() : null;
        String strString2 = (mj30Var == null || (wj30VarData2 = mj30Var.data()) == null) ? null : wj30VarData2.string("uri");
        if (mj30Var != null && (wj30VarData = mj30Var.data()) != null) {
            strString = wj30VarData.string("checkout_source");
        }
        return new m1b(strName, strString2, strString);
    }

    @Override // p204p.wua
    /* JADX INFO: renamed from: a */
    public byte[] mo58114a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        if (r5.f141968b != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        if (r5.f175906b != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return p204p.j8t0.f110000b;
     */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo98394apply(Object obj) {
        switch (this.f141210a) {
            case 9:
                return Boolean.valueOf(gwg1.m45948t((String) ((Map) obj).get("other-video-disabled"), false));
            case 18:
                return Integer.valueOf(((hv31) obj).mo48717l(rbj0.f197617h, 0));
            case 22:
                qbt0 qbt0Var = (qbt0) obj;
                if (!qbt0Var.equals(lbt0.f131718a) && !qbt0Var.equals(kbt0.f121278a) && !qbt0Var.equals(ibt0.f100669a) && !qbt0Var.equals(obt0.f163718a) && !qbt0Var.equals(nbt0.f152349a)) {
                    if (qbt0Var instanceof jbt0) {
                        jbt0 jbt0Var = (jbt0) qbt0Var;
                        zo20 zo20Var = jbt0Var.f110877a;
                        jsf1 jsf1Var = jbt0Var.f110878b;
                        if (jsf1Var.equals(g7z.f77370d)) {
                            return tfm0.m80688p(zo20Var, false);
                        }
                        if (jsf1Var.equals(d7z.f46304d)) {
                            return tfm0.m80688p(zo20Var, false);
                        }
                        if (jsf1Var instanceof e7z) {
                            return tfm0.m80688p(zo20Var, zo20Var.mo91522b().f12898f || zo20Var.mo91522b().f12895c);
                        }
                        if (!jsf1Var.equals(f7z.f66812d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a6z a6zVarMo91522b = zo20Var.mo91522b();
                        return tfm0.m80688p(zo20Var, a6zVarMo91522b.f12895c || a6zVarMo91522b.f12898f);
                    }
                    if (qbt0Var instanceof mbt0) {
                        mbt0 mbt0Var = (mbt0) qbt0Var;
                        jp20 jp20Var = mbt0Var.f141967a;
                        if (!(jp20Var instanceof hp20)) {
                            if (!(jp20Var instanceof ip20)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return j8t0.f110003e;
                        }
                    } else if (!qbt0Var.equals(hbt0.f89605a)) {
                        if (!(qbt0Var instanceof pbt0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pbt0 pbt0Var = (pbt0) qbt0Var;
                        jp20 jp20Var2 = pbt0Var.f175905a;
                        if (!(jp20Var2 instanceof hp20)) {
                            if (!(jp20Var2 instanceof ip20)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return j8t0.f110003e;
                        }
                    }
                    break;
                }
                return j8t0.f109999a;
            default:
                List list = (List) obj;
                return list.size() > 1 ? new w431(list) : v431.f237037a;
        }
    }

    @Override // p204p.i9v
    /* JADX INFO: renamed from: b */
    public Object mo49992b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        y5f0 y5f0VarM92846a = y5f0.m92846a(i);
        return y5f0VarM92846a == null ? y5f0.AD : y5f0VarM92846a;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f141210a) {
            case 3:
                eae eaeVar = (eae) obj;
                dae daeVar = eaeVar.f57644a;
                boolean z = daeVar instanceof m9e;
                q7e q7eVar = q7e.f186082a;
                if (z) {
                    return First.m15575c(new eae(r9e.f197037a), Collections.singleton(q7eVar));
                }
                if (daeVar instanceof r9e) {
                    return First.m15575c(eaeVar, Collections.singleton(q7eVar));
                }
                if (daeVar instanceof s9e) {
                    f9e f9eVar = ((s9e) daeVar).f206932a;
                    return First.m15575c(eaeVar, Collections.singleton(new r7e(f9eVar.f67233a, f9eVar.f67234b)));
                }
                boolean z2 = daeVar instanceof q9e;
                p7e p7eVar = p7e.f174656a;
                if (z2) {
                    q9e q9eVar = (q9e) daeVar;
                    return q9eVar.f186576c == 1 ? First.m15575c(new eae(new g9e(q9eVar.f186574a, q9eVar.f186575b)), Collections.singleton(p7eVar)) : First.m15574b(eaeVar);
                }
                if (daeVar instanceof v9e) {
                    return First.m15575c(new eae(h9e.f88927a), Collections.singleton(p7eVar));
                }
                if (daeVar instanceof z9e) {
                    return First.m15575c(eaeVar, Collections.singleton(a8e.f13267a));
                }
                if (daeVar instanceof i9e) {
                    return First.m15575c(eaeVar, Collections.singleton(p7eVar));
                }
                if ((daeVar instanceof o9e) || (daeVar instanceof p9e) || (daeVar instanceof t9e) || (daeVar instanceof w9e) || (daeVar instanceof u9e) || (daeVar instanceof cae) || (daeVar instanceof l9e) || (daeVar instanceof n9e)) {
                    return First.m15574b(eaeVar);
                }
                throw new NoWhenBranchMatchedException();
            default:
                return First.m15574b((rvh0) obj);
        }
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        dpl0 dpl0Var = (dpl0) pp91.m70538s(intent, "push_data", dpl0.class);
        String strM35694A = dpl0Var != null ? dpl0Var.f51366d : null;
        if (strM35694A == null) {
            Set set = dd41.f47702f;
            strM35694A = r46.m74726U(String.valueOf(intent.getData())).m35694A();
        }
        if (strM35694A == null) {
            Set set2 = dd41.f47702f;
            return Single.just(new r1j0(r46.m74726U(WidgetInteraction.Background.DESTINATION_HOME)));
        }
        Set set3 = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(strM35694A);
        String strM35694A2 = dd41VarM74726U.m35694A();
        if (strM35694A2 != null) {
            return Single.just(new u1j0(jy90.class, new ox90(strM35694A2, wj50.m88271j(dd41VarM74726U.m35716n("action"), "share") ? 1 : 0), uzq0.f235620a));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: k */
    public String m61182k(Timestamp timestamp) {
        try {
            Locale locale = Locale.getDefault();
            Date date = new Date(timestamp.m1969s() * ((long) 1000));
            DateFormat dateInstance = DateFormat.getDateInstance(1, locale);
            dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str = dateInstance.format(date);
            wj50.m88279p(str);
            return str;
        } catch (Exception unused) {
            na6.m63957e("Received invalid timestamp: " + timestamp);
            return "-";
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        gze1 gze1Var = (gze1) bz61Var.mo26518k(ez61.f64285a);
        return gze1Var != null ? gze1Var : (gze1) bz61Var.mo26518k(ez61.f64289e);
    }

    public /* synthetic */ m95(Object obj, int i) {
        this.f141210a = i;
    }

    public m95(jqz jqzVar, hc80 hc80Var, boolean z, xp4 xp4Var) {
        this.f141210a = 12;
        xp4Var.m91618g();
    }

    public m95(son sonVar, otn otnVar) {
        this.f141210a = 6;
    }

    @Override // p204p.pal0
    /* JADX INFO: renamed from: c */
    public void mo36741c() {
    }

    @Override // p204p.uf41
    /* JADX INFO: renamed from: d */
    public void mo55638d(Intent intent) {
    }
}
