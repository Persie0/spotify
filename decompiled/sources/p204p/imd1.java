package p204p;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class imd1 {

    /* JADX INFO: renamed from: a */
    public final pzs0 f103692a;

    /* JADX INFO: renamed from: b */
    public kj40 f103693b;

    /* JADX INFO: renamed from: c */
    public final wg61 f103694c;

    public imd1(j7v j7vVar, pzs0 pzs0Var) {
        this.f103692a = pzs0Var;
        this.f103694c = new wg61(new gnb1(24, j7vVar, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m51093a(String str) {
        if (Uri.parse(str).getScheme() == null) {
            str = "https://".concat(str);
        }
        String strM71775m = this.f103692a.m71775m(str);
        kj40 kj40Var = this.f103693b;
        if (kj40Var != null ? kj40Var.m56556h(strM71775m) : false) {
            return;
        }
        if (URLUtil.isNetworkUrl(strM71775m)) {
            ((WebView) this.f103694c.getValue()).loadUrl(strM71775m);
            return;
        }
        kj40 kj40Var2 = this.f103693b;
        if (kj40Var2 != null) {
            kj40Var2.m56554f(strM71775m);
        }
    }
}
