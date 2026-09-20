package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class und extends ckf1 {

    /* JADX INFO: renamed from: j */
    public final Uri f232150j;

    public und(Uri uri) {
        this.f232150j = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof und) && wj50.m88271j(this.f232150j, ((und) obj).f232150j);
    }

    public final int hashCode() {
        return this.f232150j.hashCode();
    }
}
