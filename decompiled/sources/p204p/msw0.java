package p204p;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class msw0 {

    /* JADX INFO: renamed from: a */
    public static final Set f146871a = bk5.m29624m1(new String[]{"contentreporting.spotify.com", "accounts.spotify.com", "support.spotify.com"});

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final void m62779a(osw0 osw0Var, jyx0 jyx0Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1285324553);
        int i2 = i | (xq00Var.m91766g(osw0Var) ? 4 : 2) | (xq00Var.m91770i(jyx0Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            fbk fbkVar = null;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = new btw0(osw0Var.f168910d, new y3o0(kqi0Var2, 10));
                xq00Var.m91793t0(objM91750T3);
            }
            Object obj2 = (btw0) objM91750T3;
            int i3 = i2 & 896;
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(kqi0Var2) | (i3 == 256);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i || objM91750T4 == obj) {
                objM91750T4 = new iyc(eh00Var, kqi0Var, kqi0Var2, 1);
                xq00Var.m91793t0(objM91750T4);
            }
            kjg1.m56579b(6, 0, (eh00) objM91750T4, xq00Var, true);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            boolean z = i3 == 256;
            int i4 = i2 & 14;
            boolean zM91770i2 = (i4 == 4) | z | xq00Var.m91770i(obj2) | xq00Var.m91770i(kqi0Var);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T5 == obj) {
                Object eeu0Var = new eeu0(obj2, eh00Var, osw0Var, kqi0Var, 10);
                kqi0Var = kqi0Var;
                xq00Var.m91793t0(eeu0Var);
                objM91750T5 = eeu0Var;
            }
            gh00 gh00Var = (gh00) objM91750T5;
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == obj) {
                objM91750T6 = gkw0.f80926S0;
                xq00Var.m91793t0(objM91750T6);
            }
            gh00 gh00Var2 = (gh00) objM91750T6;
            boolean z2 = false;
            g0b1.m43260a(gh00Var, fxh0VarM61820d, null, gh00Var2, null, xq00Var, 3072, 20);
            WebView webView = (WebView) kqi0Var.getValue();
            boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
            if (i4 == 4) {
                z2 = true;
            }
            boolean zM91770i4 = z2 | zM91770i3 | xq00Var.m91770i(jyx0Var);
            Object objM91750T7 = xq00Var.m91750T();
            if (zM91770i4 || objM91750T7 == obj) {
                Object gjw0Var = new gjw0(osw0Var, jyx0Var, kqi0Var, fbkVar, 2);
                xq00Var.m91793t0(gjw0Var);
                objM91750T7 = gjw0Var;
            }
            hz40.m49237i(webView, (th00) objM91750T7, xq00Var);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0((Object) osw0Var, (Object) jyx0Var, eh00Var, (Object) fxh0Var2, i, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m62780b(WebView webView, Map map) {
        ek60 ek60Var = fk60.f70476d;
        rr60 rr60VarSerializer = nl60.Companion.serializer();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
        }
        webView.evaluateJavascript(xl51.m91377Z("\n    window._reportParams = " + ek60Var.m41881b(rr60VarSerializer, new nl60(linkedHashMap)) + ";\n    window.webkit = window.webkit || {};\n    window.webkit.messageHandlers = window.webkit.messageHandlers || {};\n    window.webkit.messageHandlers.report = {\n      postMessage: function(msg) {\n        ReportBridge.postMessage(JSON.stringify(msg));\n      }\n    };\n    "), null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m62781c(String str) {
        Set set = f146871a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (bm51.m29797h0((String) it.next(), Uri.parse(str).getHost(), true)) {
                return true;
            }
        }
        return false;
    }
}
