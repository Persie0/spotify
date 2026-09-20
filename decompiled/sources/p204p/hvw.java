package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class hvw implements a3x {

    /* JADX INFO: renamed from: a */
    public final Uri f95802a;

    public hvw(Uri uri) {
        this.f95802a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvw) && wj50.m88271j(this.f95802a, ((hvw) obj).f95802a);
    }

    public final int hashCode() {
        return this.f95802a.hashCode();
    }
}
