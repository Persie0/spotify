package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class rv40 {

    /* JADX INFO: renamed from: a */
    public final boolean f202996a;

    /* JADX INFO: renamed from: b */
    public final Uri f202997b;

    public rv40(Uri uri, boolean z) {
        this.f202996a = z;
        this.f202997b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv40)) {
            return false;
        }
        rv40 rv40Var = (rv40) obj;
        return this.f202996a == rv40Var.f202996a && wj50.m88271j(this.f202997b, rv40Var.f202997b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f202996a) * 31;
        Uri uri = this.f202997b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
