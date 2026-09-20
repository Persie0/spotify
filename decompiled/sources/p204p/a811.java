package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class a811 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final Uri f13170a;

    public a811(Uri uri) {
        this.f13170a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a811) && wj50.m88271j(this.f13170a, ((a811) obj).f13170a);
    }

    public final int hashCode() {
        return this.f13170a.hashCode();
    }
}
