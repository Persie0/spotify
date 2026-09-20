package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class c9q {

    /* JADX INFO: renamed from: a */
    public final Uri f35611a;

    /* JADX INFO: renamed from: b */
    public final n6f f35612b;

    /* JADX INFO: renamed from: c */
    public final mm8 f35613c;

    public c9q(Uri uri, n6f n6fVar, mm8 mm8Var) {
        this.f35611a = uri;
        this.f35612b = n6fVar;
        this.f35613c = mm8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9q)) {
            return false;
        }
        c9q c9qVar = (c9q) obj;
        return wj50.m88271j(this.f35611a, c9qVar.f35611a) && wj50.m88271j(this.f35612b, c9qVar.f35612b) && wj50.m88271j(this.f35613c, c9qVar.f35613c);
    }

    public final int hashCode() {
        int iHashCode = this.f35611a.hashCode() * 31;
        n6f n6fVar = this.f35612b;
        return this.f35613c.hashCode() + ((iHashCode + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31);
    }
}
