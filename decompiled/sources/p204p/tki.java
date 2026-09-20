package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class tki implements sli {

    /* JADX INFO: renamed from: a */
    public final Uri f221154a;

    public tki(Uri uri) {
        this.f221154a = uri;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m81021a() {
        return this.f221154a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tki) && wj50.m88271j(this.f221154a, ((tki) obj).f221154a);
    }

    public final int hashCode() {
        return this.f221154a.hashCode();
    }
}
