package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class v371 extends c471 {

    /* JADX INFO: renamed from: a */
    public final z0r f236805a;

    /* JADX INFO: renamed from: b */
    public final Uri f236806b;

    public v371(Uri uri, z0r z0rVar) {
        this.f236805a = z0rVar;
        this.f236806b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v371)) {
            return false;
        }
        v371 v371Var = (v371) obj;
        return wj50.m88271j(this.f236805a, v371Var.f236805a) && wj50.m88271j(this.f236806b, v371Var.f236806b);
    }

    public final int hashCode() {
        int iHashCode = this.f236805a.hashCode() * 31;
        Uri uri = this.f236806b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
