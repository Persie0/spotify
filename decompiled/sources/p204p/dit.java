package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class dit extends w1h1 {

    /* JADX INFO: renamed from: b */
    public final zkb0 f49473b;

    /* JADX INFO: renamed from: c */
    public final z0r f49474c;

    /* JADX INFO: renamed from: d */
    public final Uri f49475d;

    public dit(zkb0 zkb0Var, z0r z0rVar, Uri uri) {
        this.f49473b = zkb0Var;
        this.f49474c = z0rVar;
        this.f49475d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dit)) {
            return false;
        }
        dit ditVar = (dit) obj;
        return wj50.m88271j(this.f49473b, ditVar.f49473b) && wj50.m88271j(this.f49474c, ditVar.f49474c) && wj50.m88271j(this.f49475d, ditVar.f49475d);
    }

    public final int hashCode() {
        int iHashCode = (this.f49474c.hashCode() + (this.f49473b.hashCode() * 31)) * 31;
        Uri uri = this.f49475d;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
