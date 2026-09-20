package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class mi41 implements oi41 {

    /* JADX INFO: renamed from: a */
    public final Uri f143935a;

    public mi41(Uri uri) {
        this.f143935a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi41) && wj50.m88271j(this.f143935a, ((mi41) obj).f143935a);
    }

    @Override // p204p.oi41
    public final Uri getUri() {
        return this.f143935a;
    }

    public final int hashCode() {
        return this.f143935a.hashCode();
    }
}
