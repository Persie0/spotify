package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public final class xve {

    /* JADX INFO: renamed from: a */
    public final Uri f266372a;

    /* JADX INFO: renamed from: b */
    public final String f266373b;

    /* JADX INFO: renamed from: c */
    public final boolean f266374c;

    public xve(Uri uri, String str, boolean z) {
        this.f266372a = uri;
        this.f266373b = str;
        this.f266374c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xve)) {
            return false;
        }
        xve xveVar = (xve) obj;
        return wj50.m88271j(this.f266372a, xveVar.f266372a) && wj50.m88271j(this.f266373b, xveVar.f266373b) && this.f266374c == xveVar.f266374c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266374c) + s571.m77243b(this.f266372a.hashCode() * 31, 31, this.f266373b);
    }
}
