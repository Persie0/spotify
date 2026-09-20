package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class iki implements sli {

    /* JADX INFO: renamed from: a */
    public final Uri f103124a;

    public iki(Uri uri) {
        this.f103124a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iki) && wj50.m88271j(this.f103124a, ((iki) obj).f103124a);
    }

    public final int hashCode() {
        return this.f103124a.hashCode();
    }
}
