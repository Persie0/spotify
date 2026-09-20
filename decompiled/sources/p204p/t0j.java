package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0j {

    /* JADX INFO: renamed from: a */
    public static final a6f f215896a = new a6f(false, false);

    /* JADX INFO: renamed from: b */
    public static sd40 f215897b;

    /* JADX INFO: renamed from: a */
    public static final r0j m79820a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && lzj.m60353c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new s0j(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return r0j.f194510a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m79821b(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1805330000);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            epv0.m39685e(str, eh00Var, null, xq00Var, i2 & 1022, 8);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, eh00Var, fxh0Var2, i, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m79822c(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1234575986);
        int i2 = i | 6 | (xq00Var2.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(zsf1.m96830A(mi21.m61820d(1.0f, cxh0Var), ltf1.m59890l(R.dimen.spacer_32, xq00Var2), 0.0f, 2), 0.0f, leu.m58816b(xq00Var2).f117230b.f224769l, 0.0f, 0.0f, 13);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            fxh0 fxh0VarM61814B = mi21.m61814B(cxh0Var, d7f0.f46174i, 2);
            String strM54977L = k0e1.m54977L(R.string.empty_state_title, xq00Var2);
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = e6u.f56748Z;
                xq00Var2.m91793t0(objM91750T);
            }
            ahf1.m25932d(strM54977L, zoz0.m96644b(fxh0VarM61814B, false, (gh00) objM91750T), leu.m58818d(xq00Var2).f64968d, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var2, 0, 0, 2016);
            ahf1.m25932d(k0e1.m54977L(R.string.empty_state_subtitle, xq00Var2), zsf1.m96832C(fxh0VarM61814B, 0.0f, ltf1.m59890l(R.dimen.spacer_20, xq00Var2), 0.0f, 0.0f, 13), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            dyu.m37371c(new peu(u40.f226523c, eh00Var), new tgu(), zsf1.m96832C(cxh0Var, 0.0f, ltf1.m59890l(R.dimen.spacer_20, xq00Var), 0.0f, 0.0f, 13), null, null, null, null, null, null, null, hfg.f90731a, xq00Var, 0, 48, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(fxh0Var2, eh00Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m79823d(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        xq00Var.m91775k0(-1880036028);
        int i2 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var.m91757b0();
        } else if (z) {
            xq00Var.m91771i0(-1779681305);
            y85.m93057b(fwu.f74163c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159603a, fxh0Var), leu.m58815a(xq00Var).f112824b.f138758b, 0L, false, xq00Var, fwu.f74164d | 48, 48);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1779474690);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fl3(z, fxh0Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static j4u m79824e(int i) {
        boolean z = true;
        na6.m63963k(i != 0, "Invalid resource ID provided: %s", Integer.valueOf(i));
        j4u j4uVar = new j4u();
        Integer num = (Integer) j4uVar.f108786e;
        if (num != null && num.intValue() == 0) {
            z = false;
        }
        na6.m63963k(z, "Invalid resource ID provided: %s", num);
        j4uVar.f108786e = Integer.valueOf(i);
        j4uVar.f108783b = false;
        return j4uVar;
    }

    /* JADX INFO: renamed from: f */
    public static j4u m79825f(String str) {
        j4u j4uVar = new j4u();
        j4uVar.f108785d = str;
        j4uVar.f108783b = false;
        return j4uVar;
    }

    /* JADX INFO: renamed from: g */
    public static final kmx m79826g(w2q w2qVar, fiz fizVar) {
        return new kmx(new zux(new ysk(new si9(new s5u(w2qVar.f247409f, qpv0.f191387a.mo54112b(mab.class), 16), 4), 19), fizVar, new ysl(3, 17, (fbk) null), 1), 8);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m79827h(Context context, String str) {
        return m6b.m60990e(context, ReportWebViewActivity.class, "report_webview_url", str);
    }

    /* JADX INFO: renamed from: i */
    public static String m79828i(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static List m79829j() {
        return Collections.singletonList(qpv0.f191387a.mo54112b(kub.class));
    }

    /* JADX INFO: renamed from: k */
    public static final String m79830k(nw80 nw80Var) {
        String str;
        v140 v140Var = (v140) nw80Var.f159062p.mo30169a(v140.class);
        if (v140Var != null && (str = v140Var.f236243a) != null) {
            if (wl51.m88460J0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return nw80Var.f159055i;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m79831l(String str) {
        return wj50.m88271j(str, "com.google.android.projection.gearhead") || wj50.m88271j(str, "com.spotify.auto.mediatest");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m79832m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static final Object m79833n(jdp0 jdp0Var, String str, ibk ibkVar) {
        kdp0 kdp0Var;
        if (ibkVar instanceof kdp0) {
            kdp0Var = (kdp0) ibkVar;
            int i = kdp0Var.f121720c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdp0Var.f121720c = i - Integer.MIN_VALUE;
            } else {
                kdp0Var = new kdp0(ibkVar);
            }
        } else {
            kdp0Var = new kdp0(ibkVar);
        }
        Object objM96567o = kdp0Var.f121719b;
        int i2 = kdp0Var.f121720c;
        boolean z = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM23327A = jdp0Var.mo53041b().m23327A();
                kdp0Var.f121718a = str;
                kdp0Var.f121720c = 1;
                objM96567o = zn91.m96567o(singleM23327A, kdp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = kdp0Var.f121718a;
                bga.m29073P(objM96567o);
            }
            PlayerState playerState = (PlayerState) objM96567o;
            if (wj50.m88271j(playerState.contextUri(), str) && wj50.m88271j(playerState.contextMetadata().get("player.arch"), "3")) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m79834o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: p */
    public static final xuk m79835p(xuk xukVar, eh00 eh00Var) {
        return kk40.m56650L(xukVar) ? xukVar : kk40.m56661c((juk) eh00Var.invoke());
    }

    /* JADX INFO: renamed from: q */
    public static qa30 m79836q(q730 q730Var) {
        String str;
        u730 u730Var = q730Var.f186021a;
        ArrayList arrayList = q730Var.f186022b.f174553a;
        o730 o730Var = (o730) g6f.m43741q0(arrayList);
        String str2 = o730Var.f162456b;
        u730 u730Var2 = o730Var.f162455a;
        if (u730Var2 == null || (str = u730Var2.f227489b) == null) {
            str = str2;
        }
        ua30 ua30Var = new ua30(str2, str, u730Var2 != null ? u730Var2.f227490c : null);
        String str3 = u730Var.f227488a;
        String str4 = u730Var.f227489b;
        if (str4 == null) {
            str4 = str3;
        }
        ua30 ua30Var2 = new ua30(str3, str4, u730Var.f227490c);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str5 = ((o730) it.next()).f162458d;
            if (str5 == null) {
                str5 = "nearby_dialog";
            }
            arrayList2.add(str5);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList2);
        int i = 1;
        if (setM43736n1.size() > 1) {
            i = 3;
        } else if (setM43736n1.contains("listening_activity")) {
            i = 2;
        }
        return new qa30(ua30Var2, ua30Var, size, i);
    }

    /* JADX INFO: renamed from: r */
    public static final ncv m79837r(niv nivVar, int i) {
        jcv jcvVarM65443q = nqg1.m65443q(nivVar.f154358a);
        Boolean bool = nivVar.f154359b;
        int i2 = 1;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        return new ncv(jcvVarM65443q, null, zBooleanValue, i2);
    }
}
