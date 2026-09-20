package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class sbc1 extends bcc1 {

    /* JADX INFO: renamed from: a */
    public final Uri f207419a;

    /* JADX INFO: renamed from: b */
    public final z0r f207420b;

    /* JADX INFO: renamed from: c */
    public final Uri f207421c;

    /* JADX INFO: renamed from: d */
    public final Uri f207422d;

    public sbc1(Uri uri, Uri uri2, Uri uri3, z0r z0rVar) {
        this.f207419a = uri;
        this.f207420b = z0rVar;
        this.f207421c = uri2;
        this.f207422d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbc1)) {
            return false;
        }
        sbc1 sbc1Var = (sbc1) obj;
        return wj50.m88271j(this.f207419a, sbc1Var.f207419a) && wj50.m88271j(this.f207420b, sbc1Var.f207420b) && wj50.m88271j(this.f207421c, sbc1Var.f207421c) && wj50.m88271j(this.f207422d, sbc1Var.f207422d);
    }

    public final int hashCode() {
        int iHashCode = (this.f207420b.hashCode() + (this.f207419a.hashCode() * 31)) * 31;
        Uri uri = this.f207421c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f207422d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
