package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class u401 {

    /* JADX INFO: renamed from: a */
    public final Uri f226525a;

    public u401(Uri uri) {
        this.f226525a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u401) && wj50.m88271j(this.f226525a, ((u401) obj).f226525a);
    }

    public final int hashCode() {
        return this.f226525a.hashCode();
    }
}
