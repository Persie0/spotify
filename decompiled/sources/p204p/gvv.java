package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class gvv extends zug1 {

    /* JADX INFO: renamed from: c */
    public final dwv f84840c;

    /* JADX INFO: renamed from: d */
    public final z0r f84841d;

    /* JADX INFO: renamed from: e */
    public final Uri f84842e;

    /* JADX INFO: renamed from: f */
    public final Uri f84843f;

    /* JADX INFO: renamed from: g */
    public final int f84844g;

    public gvv(dwv dwvVar, z0r z0rVar, Uri uri, Uri uri2, int i) {
        this.f84840c = dwvVar;
        this.f84841d = z0rVar;
        this.f84842e = uri;
        this.f84843f = uri2;
        this.f84844g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvv)) {
            return false;
        }
        gvv gvvVar = (gvv) obj;
        return wj50.m88271j(this.f84840c, gvvVar.f84840c) && wj50.m88271j(this.f84841d, gvvVar.f84841d) && wj50.m88271j(this.f84842e, gvvVar.f84842e) && wj50.m88271j(this.f84843f, gvvVar.f84843f) && this.f84844g == gvvVar.f84844g;
    }

    public final int hashCode() {
        int iHashCode = (this.f84841d.hashCode() + (this.f84840c.hashCode() * 31)) * 31;
        Uri uri = this.f84842e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f84843f;
        return Integer.hashCode(this.f84844g) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
