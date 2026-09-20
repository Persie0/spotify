package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class lg71 {

    /* JADX INFO: renamed from: a */
    public final String f133108a;

    /* JADX INFO: renamed from: b */
    public final Uri f133109b;

    /* JADX INFO: renamed from: c */
    public final Uri f133110c;

    public lg71(String str, Uri uri, Uri uri2) {
        this.f133108a = str;
        this.f133109b = uri;
        this.f133110c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg71)) {
            return false;
        }
        lg71 lg71Var = (lg71) obj;
        return wj50.m88271j(this.f133108a, lg71Var.f133108a) && wj50.m88271j(this.f133109b, lg71Var.f133109b) && wj50.m88271j(this.f133110c, lg71Var.f133110c);
    }

    public final int hashCode() {
        return this.f133110c.hashCode() + nap.m64019l(this.f133109b, this.f133108a.hashCode() * 31, 31);
    }
}
