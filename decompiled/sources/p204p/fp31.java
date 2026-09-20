package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class fp31 {

    /* JADX INFO: renamed from: a */
    public final String f71723a;

    /* JADX INFO: renamed from: b */
    public final Uri f71724b;

    /* JADX INFO: renamed from: c */
    public final Uri f71725c;

    /* JADX INFO: renamed from: d */
    public final Uri f71726d;

    public fp31(String str, Uri uri, Uri uri2, Uri uri3) {
        this.f71723a = str;
        this.f71724b = uri;
        this.f71725c = uri2;
        this.f71726d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp31)) {
            return false;
        }
        fp31 fp31Var = (fp31) obj;
        return wj50.m88271j(this.f71723a, fp31Var.f71723a) && wj50.m88271j(this.f71724b, fp31Var.f71724b) && wj50.m88271j(this.f71725c, fp31Var.f71725c) && wj50.m88271j(this.f71726d, fp31Var.f71726d);
    }

    public final int hashCode() {
        int iM64019l = nap.m64019l(this.f71724b, this.f71723a.hashCode() * 31, 31);
        Uri uri = this.f71725c;
        int iHashCode = (iM64019l + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f71726d;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }
}
