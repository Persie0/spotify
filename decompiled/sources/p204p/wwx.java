package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class wwx {

    /* JADX INFO: renamed from: a */
    public final boolean f255843a;

    /* JADX INFO: renamed from: b */
    public final String f255844b;

    /* JADX INFO: renamed from: c */
    public final String f255845c;

    /* JADX INFO: renamed from: d */
    public final String f255846d;

    /* JADX INFO: renamed from: e */
    public final Uri f255847e;

    /* JADX INFO: renamed from: f */
    public final Double f255848f;

    /* JADX INFO: renamed from: g */
    public final String f255849g;

    /* JADX INFO: renamed from: h */
    public final boolean f255850h;

    public wwx(boolean z, String str, String str2, String str3, Uri uri, Double d, String str4, boolean z2) {
        this.f255843a = z;
        this.f255844b = str;
        this.f255845c = str2;
        this.f255846d = str3;
        this.f255847e = uri;
        this.f255848f = d;
        this.f255849g = str4;
        this.f255850h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwx)) {
            return false;
        }
        wwx wwxVar = (wwx) obj;
        return this.f255843a == wwxVar.f255843a && wj50.m88271j(this.f255844b, wwxVar.f255844b) && wj50.m88271j(this.f255845c, wwxVar.f255845c) && wj50.m88271j(this.f255846d, wwxVar.f255846d) && wj50.m88271j(this.f255847e, wwxVar.f255847e) && wj50.m88271j(this.f255848f, wwxVar.f255848f) && wj50.m88271j(this.f255849g, wwxVar.f255849g) && this.f255850h == wwxVar.f255850h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Boolean.hashCode(this.f255843a) * 31, 31, this.f255844b), 31, this.f255845c);
        String str = this.f255846d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f255847e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Double d = this.f255848f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f255849g;
        return Boolean.hashCode(this.f255850h) + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
