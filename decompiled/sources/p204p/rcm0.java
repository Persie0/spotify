package p204p;

import java.io.UnsupportedEncodingException;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes10.dex */
public final class rcm0 {

    /* JADX INFO: renamed from: a */
    public final String f197894a;

    /* JADX INFO: renamed from: b */
    public final String f197895b;

    /* JADX INFO: renamed from: c */
    public final String f197896c;

    /* JADX INFO: renamed from: d */
    public final String f197897d;

    public rcm0(String str, String str2, String str3) {
        this.f197894a = str;
        this.f197895b = str2;
        this.f197896c = str3;
        String strM38564m = "spotify:search";
        if (str3.length() != 0) {
            try {
                strM38564m = URLEncoder.encode(str3, "utf8");
            } catch (UnsupportedEncodingException unused) {
            }
            strM38564m = edb.m38564m("spotify:search:", strM38564m);
        }
        this.f197897d = strM38564m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcm0)) {
            return false;
        }
        rcm0 rcm0Var = (rcm0) obj;
        return wj50.m88271j(this.f197894a, rcm0Var.f197894a) && wj50.m88271j(this.f197895b, rcm0Var.f197895b) && wj50.m88271j(this.f197896c, rcm0Var.f197896c);
    }

    public final int hashCode() {
        return this.f197896c.hashCode() + s571.m77243b(this.f197894a.hashCode() * 31, 31, this.f197895b);
    }
}
