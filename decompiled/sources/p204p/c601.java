package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class c601 implements d601 {

    /* JADX INFO: renamed from: a */
    public final Uri f34328a;

    /* JADX INFO: renamed from: b */
    public final String f34329b;

    public c601(Uri uri, String str) {
        this.f34328a = uri;
        this.f34329b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c601)) {
            return false;
        }
        c601 c601Var = (c601) obj;
        return wj50.m88271j(this.f34328a, c601Var.f34328a) && wj50.m88271j(this.f34329b, c601Var.f34329b);
    }

    public final int hashCode() {
        Uri uri = this.f34328a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f34329b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
