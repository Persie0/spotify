package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class gwb implements hwb {

    /* JADX INFO: renamed from: a */
    public final Uri f84964a;

    public gwb(Uri uri) {
        this.f84964a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwb) && wj50.m88271j(this.f84964a, ((gwb) obj).f84964a);
    }

    public final int hashCode() {
        return this.f84964a.hashCode();
    }
}
