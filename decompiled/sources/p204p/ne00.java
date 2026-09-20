package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ne00 extends pe00 {

    /* JADX INFO: renamed from: a */
    public final Uri f152888a;

    /* JADX INFO: renamed from: b */
    public final z0r f152889b;

    public ne00(Uri uri, z0r z0rVar) {
        this.f152888a = uri;
        this.f152889b = z0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne00)) {
            return false;
        }
        ne00 ne00Var = (ne00) obj;
        return wj50.m88271j(this.f152888a, ne00Var.f152888a) && wj50.m88271j(this.f152889b, ne00Var.f152889b);
    }

    public final int hashCode() {
        Uri uri = this.f152888a;
        return this.f152889b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }
}
