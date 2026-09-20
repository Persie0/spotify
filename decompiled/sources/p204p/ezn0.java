package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ezn0 implements fzn0 {

    /* JADX INFO: renamed from: a */
    public final Uri f64421a;

    public ezn0(Uri uri) {
        this.f64421a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezn0) && wj50.m88271j(this.f64421a, ((ezn0) obj).f64421a);
    }

    public final int hashCode() {
        return this.f64421a.hashCode();
    }
}
