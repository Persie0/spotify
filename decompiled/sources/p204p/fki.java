package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class fki {

    /* JADX INFO: renamed from: a */
    public final Uri f70548a;

    public fki(Uri uri) {
        this.f70548a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fki) && wj50.m88271j(this.f70548a, ((fki) obj).f70548a);
    }

    public final int hashCode() {
        return this.f70548a.hashCode();
    }
}
