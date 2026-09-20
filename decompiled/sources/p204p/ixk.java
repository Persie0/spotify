package p204p;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class ixk {

    /* JADX INFO: renamed from: a */
    public final Uri f106713a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f106714b;

    /* JADX INFO: renamed from: c */
    public final String f106715c;

    public /* synthetic */ ixk(Uri uri, Bitmap bitmap) {
        this(uri, bitmap, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixk)) {
            return false;
        }
        ixk ixkVar = (ixk) obj;
        return wj50.m88271j(this.f106713a, ixkVar.f106713a) && wj50.m88271j(this.f106715c, ixkVar.f106715c);
    }

    public final int hashCode() {
        return this.f106715c.hashCode() + (this.f106713a.hashCode() * 31);
    }

    public ixk(Uri uri, Bitmap bitmap, String str) {
        this.f106713a = uri;
        this.f106714b = bitmap;
        this.f106715c = str;
    }
}
