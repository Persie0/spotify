package p204p;

import android.net.Uri;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import spotify.ubi.UbiContext$UbiContextProto;

/* JADX INFO: loaded from: classes2.dex */
public final class iv91 {

    /* JADX INFO: renamed from: a */
    public final lbm0 f106175a;

    /* JADX INFO: renamed from: b */
    public final w6j0 f106176b;

    public iv91(lbm0 lbm0Var, w6j0 w6j0Var, xre xreVar) {
        this.f106175a = lbm0Var;
        this.f106176b = w6j0Var;
    }

    /* JADX INFO: renamed from: b */
    public static ck60 m51738b(Uri uri) {
        int iM88457G0;
        String queryParameter;
        kbm0 kbm0Var;
        if (uri.isHierarchical()) {
            queryParameter = uri.getQueryParameter("ubi");
        } else {
            String schemeSpecificPart = uri.getSchemeSpecificPart();
            queryParameter = (schemeSpecificPart != null && (iM88457G0 = wl51.m88457G0(schemeSpecificPart, '?', 0, 6)) >= 0) ? Uri.parse("_://_?".concat(schemeSpecificPart.substring(iM88457G0 + 1))).getQueryParameter("ubi") : null;
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = null;
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            UbiContext$UbiContextProto ubiContext$UbiContextProtoM98096D = UbiContext$UbiContextProto.m98096D(Base64.decode(queryParameter, 11));
            String strM98111z = ubiContext$UbiContextProtoM98096D.m98111z();
            wj50.m88279p(strM98111z);
            if (strM98111z.length() <= 0) {
                strM98111z = null;
            }
            if (strM98111z != null) {
                kbm0.Companion.getClass();
                kbm0Var = new kbm0(strM98111z);
            } else {
                kbm0Var = null;
            }
            long jM98105A = ubiContext$UbiContextProtoM98096D.m98105A();
            String strM98108w = ubiContext$UbiContextProtoM98096D.m98108w();
            wj50.m88279p(strM98108w);
            String str = strM98108w.length() > 0 ? strM98108w : null;
            String strM98110y = ubiContext$UbiContextProtoM98096D.m98110y();
            wj50.m88279p(strM98110y);
            String str2 = strM98110y.length() > 0 ? strM98110y : null;
            String strM98109x = ubiContext$UbiContextProtoM98096D.m98106B() ? ubiContext$UbiContextProtoM98096D.m98109x() : null;
            String strM98107v = ubiContext$UbiContextProtoM98096D.m98107v();
            wj50.m88279p(strM98107v);
            return new ck60(kbm0Var, jM98105A, str, str2, strM98109x, strM98107v.length() > 0 ? strM98107v : null);
        } catch (Exception e) {
            Logger.m3967c(e, "Failed to decode UBI journey token: ".concat(wl51.m88489m1(300, queryParameter)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Uri m51739a(Uri uri, o6j0 o6j0Var) {
        try {
            Uri uriBuild = uri.buildUpon().appendQueryParameter("ubi", m51741d(o6j0Var)).build();
            wj50.m88279p(uriBuild);
            return uriBuild;
        } catch (Exception e) {
            Logger.m3967c(e, "Failed to encode UBI journey token for URI: " + uri, new Object[0]);
            return uri;
        }
    }

    /* JADX INFO: renamed from: c */
    public hv91 m51740c(Uri uri, d850 d850Var) {
        return new hv91(m51739a(uri, d850Var != null ? new n6j0(d850Var) : null), this);
    }

    /* JADX INFO: renamed from: d */
    public final String m51741d(o6j0 o6j0Var) {
        kbm0 kbm0Var;
        Integer num;
        dt91 dt91VarM98095C = UbiContext$UbiContextProto.m98095C();
        dt91VarM98095C.m36845w();
        dt91VarM98095C.m36844v(System.currentTimeMillis() + 300000);
        boolean z = o6j0Var instanceof n6j0;
        n6j0 n6j0Var = z ? (n6j0) o6j0Var : null;
        d850 d850VarM63780a = n6j0Var != null ? n6j0Var.m63780a() : null;
        if (d850VarM63780a == null || (kbm0Var = d850VarM63780a.f46381b) == null) {
            kbm0Var = (kbm0) this.f106175a.f131690a.f174322a.get();
        }
        if (kbm0Var != null) {
            String str = kbm0Var.f121231a;
            dt91VarM98095C.m36842t(str);
            dt91VarM98095C.m36838m(str);
        }
        if (d850VarM63780a != null && (num = d850VarM63780a.f46385f) != null) {
            dt91VarM98095C.m36843u(num.intValue());
        }
        if (o6j0Var instanceof m6j0) {
            String str2 = ((m6j0) o6j0Var).m61020a().f279709a;
            dt91VarM98095C.m36839q(str2);
            dt91VarM98095C.m36840r(str2);
            dt91VarM98095C.m36841s("user_interaction");
        } else if (z) {
            String str3 = ((n6j0) o6j0Var).m63780a().f46380a.f279709a;
            dt91VarM98095C.m36839q(str3);
            dt91VarM98095C.m36840r(str3);
            dt91VarM98095C.m36841s("user_interaction");
        } else if (o6j0Var instanceof j6j0) {
            dt91VarM98095C.m36840r(((j6j0) o6j0Var).m52577a().f121231a);
            dt91VarM98095C.m36841s("cross_user_handoff");
        }
        return Base64.encodeToString(((UbiContext$UbiContextProto) dt91VarM98095C.build()).toByteArray(), 11);
    }
}
