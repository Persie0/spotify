package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class jta1 {

    /* JADX INFO: renamed from: a */
    public final String f115784a;

    /* JADX INFO: renamed from: b */
    public final String f115785b;

    /* JADX INFO: renamed from: c */
    public final Uri f115786c;

    public jta1(Uri uri, String str, String str2) {
        this.f115784a = str;
        this.f115785b = str2;
        this.f115786c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jta1)) {
            return false;
        }
        jta1 jta1Var = (jta1) obj;
        return wj50.m88271j(this.f115784a, jta1Var.f115784a) && wj50.m88271j(this.f115785b, jta1Var.f115785b) && wj50.m88271j(this.f115786c, jta1Var.f115786c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f115784a.hashCode() * 31, 31, this.f115785b);
        Uri uri = this.f115786c;
        return iM77243b + (uri == null ? 0 : uri.hashCode());
    }
}
