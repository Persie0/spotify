package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class tft {

    /* JADX INFO: renamed from: a */
    public final Uri f220045a;

    public tft(Uri uri) {
        this.f220045a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tft) && wj50.m88271j(this.f220045a, ((tft) obj).f220045a);
    }

    public final int hashCode() {
        return this.f220045a.hashCode();
    }
}
