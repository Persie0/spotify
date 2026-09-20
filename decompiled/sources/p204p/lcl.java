package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class lcl {

    /* JADX INFO: renamed from: a */
    public final Uri f131947a;

    /* JADX INFO: renamed from: b */
    public final boolean f131948b;

    public /* synthetic */ lcl() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcl)) {
            return false;
        }
        lcl lclVar = (lcl) obj;
        return wj50.m88271j(this.f131947a, lclVar.f131947a) && this.f131948b == lclVar.f131948b;
    }

    public final int hashCode() {
        Uri uri = this.f131947a;
        return Boolean.hashCode(this.f131948b) + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public lcl(Uri uri, boolean z) {
        this.f131947a = uri;
        this.f131948b = z;
    }
}
