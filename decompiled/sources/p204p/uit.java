package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class uit {

    /* JADX INFO: renamed from: a */
    public final sr01 f230804a;

    /* JADX INFO: renamed from: b */
    public final z0r f230805b;

    /* JADX INFO: renamed from: c */
    public final c3r f230806c;

    /* JADX INFO: renamed from: d */
    public final Uri f230807d;

    public uit(sr01 sr01Var, z0r z0rVar, c3r c3rVar, Uri uri) {
        this.f230804a = sr01Var;
        this.f230805b = z0rVar;
        this.f230806c = c3rVar;
        this.f230807d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uit)) {
            return false;
        }
        uit uitVar = (uit) obj;
        return wj50.m88271j(this.f230804a, uitVar.f230804a) && wj50.m88271j(this.f230805b, uitVar.f230805b) && this.f230806c.equals(uitVar.f230806c) && wj50.m88271j(this.f230807d, uitVar.f230807d);
    }

    public final int hashCode() {
        int iHashCode = (this.f230806c.hashCode() + ((this.f230805b.hashCode() + (this.f230804a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.f230807d;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
