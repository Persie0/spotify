package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class alt {

    /* JADX INFO: renamed from: a */
    public final String f16979a;

    /* JADX INFO: renamed from: b */
    public final Uri f16980b;

    public alt(Uri uri, String str) {
        this.f16979a = str;
        this.f16980b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alt)) {
            return false;
        }
        alt altVar = (alt) obj;
        return wj50.m88271j(this.f16979a, altVar.f16979a) && wj50.m88271j(this.f16980b, altVar.f16980b);
    }

    public final int hashCode() {
        return this.f16980b.hashCode() + (this.f16979a.hashCode() * 31);
    }
}
