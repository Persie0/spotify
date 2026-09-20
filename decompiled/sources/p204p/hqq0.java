package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class hqq0 {

    /* JADX INFO: renamed from: a */
    public final e1e f94240a;

    /* JADX INFO: renamed from: b */
    public final String f94241b;

    /* JADX INFO: renamed from: c */
    public final Uri f94242c;

    public hqq0(e1e e1eVar, String str, Uri uri) {
        this.f94240a = e1eVar;
        this.f94241b = str;
        this.f94242c = uri;
        c1e c1eVar = c1e.f33059b;
        if (e1eVar.equals(c1eVar)) {
            na6.m63957e("CheckoutSource must not be " + c1eVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final e1e m48308a() {
        return this.f94240a;
    }

    /* JADX INFO: renamed from: b */
    public final String m48309b() {
        return this.f94241b;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m48310c() {
        return this.f94242c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqq0)) {
            return false;
        }
        hqq0 hqq0Var = (hqq0) obj;
        return wj50.m88271j(this.f94240a, hqq0Var.f94240a) && wj50.m88271j(this.f94241b, hqq0Var.f94241b) && wj50.m88271j(this.f94242c, hqq0Var.f94242c);
    }

    public final int hashCode() {
        int iHashCode = this.f94240a.hashCode() * 31;
        String str = this.f94241b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f94242c;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public /* synthetic */ hqq0(e1e e1eVar, Uri uri) {
        this(e1eVar, null, uri);
    }
}
