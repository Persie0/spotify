package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class m981 extends n981 {

    /* JADX INFO: renamed from: a */
    public final Uri f141229a;

    public m981(Uri uri) {
        this.f141229a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m981) && wj50.m88271j(this.f141229a, ((m981) obj).f141229a);
    }

    public final int hashCode() {
        return this.f141229a.hashCode();
    }
}
