package p204p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class j8d0 {

    /* JADX INFO: renamed from: a */
    public final String f109906a;

    /* JADX INFO: renamed from: b */
    public final String f109907b;

    /* JADX INFO: renamed from: c */
    public final String f109908c;

    /* JADX INFO: renamed from: d */
    public final Uri f109909d;

    /* JADX INFO: renamed from: e */
    public final Uri f109910e;

    /* JADX INFO: renamed from: f */
    public final Bundle f109911f;

    /* JADX INFO: renamed from: g */
    public final int f109912g;

    public j8d0(String str, String str2, String str3, Uri uri, Uri uri2, Bundle bundle, int i) {
        this.f109906a = str;
        this.f109907b = str2;
        this.f109908c = str3;
        this.f109909d = uri;
        this.f109910e = uri2;
        this.f109911f = bundle;
        this.f109912g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8d0)) {
            return false;
        }
        j8d0 j8d0Var = (j8d0) obj;
        return wj50.m88271j(this.f109906a, j8d0Var.f109906a) && wj50.m88271j(this.f109907b, j8d0Var.f109907b) && wj50.m88271j(this.f109908c, j8d0Var.f109908c) && wj50.m88271j(this.f109909d, j8d0Var.f109909d) && wj50.m88271j(this.f109910e, j8d0Var.f109910e) && wj50.m88271j(this.f109911f, j8d0Var.f109911f) && this.f109912g == j8d0Var.f109912g;
    }

    public final int hashCode() {
        String str = this.f109906a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f109907b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f109908c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.f109909d;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f109910e;
        int iHashCode5 = (iHashCode4 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Bundle bundle = this.f109911f;
        return Integer.hashCode(this.f109912g) + ((iHashCode5 + (bundle != null ? bundle.hashCode() : 0)) * 31);
    }
}
