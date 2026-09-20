package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d050 {

    /* JADX INFO: renamed from: j */
    public static final fv31 f43763j;

    /* JADX INFO: renamed from: k */
    public static final fv31 f43764k;

    /* JADX INFO: renamed from: l */
    public static final fv31 f43765l;

    /* JADX INFO: renamed from: m */
    public static final fv31 f43766m;

    /* JADX INFO: renamed from: a */
    public final Context f43767a;

    /* JADX INFO: renamed from: b */
    public final String f43768b;

    /* JADX INFO: renamed from: c */
    public final azp0 f43769c;

    /* JADX INFO: renamed from: d */
    public final ugq0 f43770d;

    /* JADX INFO: renamed from: e */
    public final etq f43771e;

    /* JADX INFO: renamed from: f */
    public final t7q f43772f;

    /* JADX INFO: renamed from: g */
    public final xuk f43773g;

    /* JADX INFO: renamed from: h */
    public final soo f43774h;

    /* JADX INFO: renamed from: i */
    public final hv31 f43775i;

    static {
        si5 si5Var = fv31.f73628b;
        f43763j = si5Var.m78182S("install_referrer_read");
        f43764k = si5Var.m78182S("ddl_matching_attempted");
        f43765l = si5Var.m78182S("ddl_referrer_param");
        f43766m = si5Var.m78182S("ddl_match_attempt_count");
    }

    public d050(Context context, wb11 wb11Var, String str, azp0 azp0Var, ugq0 ugq0Var, etq etqVar, t7q t7qVar, xuk xukVar, soo sooVar) {
        this.f43767a = context;
        this.f43768b = str;
        this.f43769c = azp0Var;
        this.f43770d = ugq0Var;
        this.f43771e = etqVar;
        this.f43772f = t7qVar;
        this.f43773g = xukVar;
        this.f43774h = sooVar;
        this.f43775i = wb11Var.mo35843c(context);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[PHI: r1
      0x0060: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:12:0x0033, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static String m34517b(String str) {
        Object next;
        String strM88481e1;
        String strDecode;
        Object next2;
        String str2;
        List listM88476Z0 = wl51.m88476Z0(str, new char[]{'&'}, 6);
        Iterator it = listM88476Z0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str2 = (String) next;
            if (wj50.m88271j(str2, "deep_link")) {
                break;
            }
        } while (!bm51.m29803n0(str2, "deep_link=", false));
        String strM88480d1 = (String) next;
        if (strM88480d1 == null) {
            Iterator it2 = listM88476Z0.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!bm51.m29803n0((String) next2, "?deep_link=", false));
            String str3 = (String) next2;
            strM88480d1 = str3 != null ? wl51.m88480d1('?', str3, str3) : null;
            if (strM88480d1 != null) {
                if (strM88480d1.equals("deep_link")) {
                    strM88481e1 = "";
                } else {
                    strM88481e1 = wl51.m88481e1(strM88480d1, "deep_link=", strM88480d1);
                }
                strDecode = Uri.decode(strM88481e1);
                wj50.m88279p(strDecode);
                if (strDecode.length() > 0) {
                    return strDecode;
                }
            }
        } else {
            if (strM88480d1.equals("deep_link")) {
                strM88481e1 = "";
            } else {
                strM88481e1 = wl51.m88481e1(strM88480d1, "deep_link=", strM88480d1);
            }
            strDecode = Uri.decode(strM88481e1);
            wj50.m88279p(strDecode);
            if (strDecode.length() > 0) {
                return strDecode;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m34518a(String str) {
        hv31 hv31Var = this.f43775i;
        if (hv31Var.mo48713h(f43764k, false)) {
            return;
        }
        fbk fbkVar = null;
        String strM34517b = str != null ? m34517b(str) : hv31Var.mo48710e(f43765l, null);
        if (strM34517b != null) {
            if (this.f43774h.m78833a(this.f43773g, new zmy(this, strM34517b, fbkVar, 5))) {
                return;
            }
            Logger.m3969e("Referrer matching already in flight", new Object[0]);
        } else if (str != null) {
            m34521e(true);
        } else {
            m34519c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m34519c() {
        hv31 hv31Var = this.f43775i;
        fv31 fv31Var = f43764k;
        if (hv31Var.mo48713h(fv31Var, false)) {
            return;
        }
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60048a(fv31Var, true);
        lv31VarEdit.m60053f(f43765l);
        lv31VarEdit.m60053f(f43766m);
        lv31VarEdit.m60055h();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m34520d(String str) {
        hv31 hv31Var = this.f43775i;
        fv31 fv31Var = f43766m;
        int iMo48717l = hv31Var.mo48717l(fv31Var, 0) + 1;
        if (iMo48717l >= 3) {
            Logger.m3966b("Referrer matching: %s failure, giving up after %d attempts", str, Integer.valueOf(iMo48717l));
            return true;
        }
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60049b(fv31Var, iMo48717l);
        lv31VarEdit.m60055h();
        Logger.m3966b("Referrer matching: %s failure on attempt %d, will retry", str, Integer.valueOf(iMo48717l));
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m34521e(boolean z) {
        if (this.f43774h.m78833a(this.f43773g, new c050(this, z, null))) {
            return;
        }
        Logger.m3969e("Referrer matching already in flight", new Object[0]);
    }
}
