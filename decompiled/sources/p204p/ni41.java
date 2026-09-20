package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class ni41 implements oi41 {

    /* JADX INFO: renamed from: a */
    public final Uri f154175a;

    public ni41(Uri uri) {
        this.f154175a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni41) && wj50.m88271j(this.f154175a, ((ni41) obj).f154175a);
    }

    @Override // p204p.oi41
    public final Uri getUri() {
        return this.f154175a;
    }

    public final int hashCode() {
        return this.f154175a.hashCode();
    }
}
