package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class t3k extends z2h1 {

    /* JADX INFO: renamed from: b */
    public final Uri f216797b;

    /* JADX INFO: renamed from: c */
    public final b3h1 f216798c;

    public t3k(Uri uri, b3h1 b3h1Var) {
        this.f216797b = uri;
        this.f216798c = b3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3k)) {
            return false;
        }
        t3k t3kVar = (t3k) obj;
        return wj50.m88271j(this.f216797b, t3kVar.f216797b) && wj50.m88271j(this.f216798c, t3kVar.f216798c);
    }

    public final int hashCode() {
        return this.f216798c.hashCode() + (this.f216797b.hashCode() * 31);
    }

    public /* synthetic */ t3k(Uri uri) {
        this(uri, y3k.f268958b);
    }
}
