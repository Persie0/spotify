package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class iz11 {

    /* JADX INFO: renamed from: a */
    public final String f107103a;

    /* JADX INFO: renamed from: b */
    public final Uri f107104b;

    /* JADX INFO: renamed from: c */
    public final String f107105c;

    /* JADX INFO: renamed from: d */
    public final n6f f107106d;

    /* JADX INFO: renamed from: e */
    public final boolean f107107e;

    /* JADX INFO: renamed from: f */
    public final boolean f107108f;

    /* JADX INFO: renamed from: g */
    public final az11 f107109g;

    /* JADX INFO: renamed from: h */
    public final az11 f107110h;

    /* JADX INFO: renamed from: i */
    public final boolean f107111i;

    /* JADX INFO: renamed from: j */
    public final boolean f107112j;

    public iz11(String str, Uri uri, String str2, n6f n6fVar, boolean z, boolean z2, az11 az11Var, az11 az11Var2) {
        this.f107103a = str;
        this.f107104b = uri;
        this.f107105c = str2;
        this.f107106d = n6fVar;
        this.f107107e = z;
        this.f107108f = z2;
        this.f107109g = az11Var;
        this.f107110h = az11Var2;
        this.f107111i = az11Var != null;
        this.f107112j = az11Var2 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz11)) {
            return false;
        }
        iz11 iz11Var = (iz11) obj;
        return wj50.m88271j(this.f107103a, iz11Var.f107103a) && wj50.m88271j(this.f107104b, iz11Var.f107104b) && wj50.m88271j(this.f107105c, iz11Var.f107105c) && wj50.m88271j(this.f107106d, iz11Var.f107106d) && this.f107107e == iz11Var.f107107e && this.f107108f == iz11Var.f107108f && wj50.m88271j(this.f107109g, iz11Var.f107109g) && wj50.m88271j(this.f107110h, iz11Var.f107110h);
    }

    public final int hashCode() {
        String str = this.f107103a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.f107104b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f107105c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n6f n6fVar = this.f107106d;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode3 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31, 31, this.f107107e), 31, this.f107108f);
        az11 az11Var = this.f107109g;
        int iHashCode4 = (iM77245d + (az11Var == null ? 0 : az11Var.hashCode())) * 31;
        az11 az11Var2 = this.f107110h;
        return iHashCode4 + (az11Var2 != null ? az11Var2.hashCode() : 0);
    }
}
