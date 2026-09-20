package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class c550 implements e550 {

    /* JADX INFO: renamed from: a */
    public final Uri f34090a;

    public c550(Uri uri) {
        this.f34090a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c550) && wj50.m88271j(this.f34090a, ((c550) obj).f34090a);
    }

    public final int hashCode() {
        return this.f34090a.hashCode();
    }
}
