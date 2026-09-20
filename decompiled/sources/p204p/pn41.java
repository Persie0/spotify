package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class pn41 {

    /* JADX INFO: renamed from: a */
    public final ao41 f179307a;

    /* JADX INFO: renamed from: b */
    public final z0r f179308b;

    /* JADX INFO: renamed from: c */
    public final Uri f179309c;

    /* JADX INFO: renamed from: d */
    public final Uri f179310d;

    public pn41(ao41 ao41Var, z0r z0rVar, Uri uri, Uri uri2) {
        this.f179307a = ao41Var;
        this.f179308b = z0rVar;
        this.f179309c = uri;
        this.f179310d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn41)) {
            return false;
        }
        pn41 pn41Var = (pn41) obj;
        return wj50.m88271j(this.f179307a, pn41Var.f179307a) && wj50.m88271j(this.f179308b, pn41Var.f179308b) && wj50.m88271j(this.f179309c, pn41Var.f179309c) && wj50.m88271j(this.f179310d, pn41Var.f179310d);
    }

    public final int hashCode() {
        int iHashCode = (this.f179308b.hashCode() + (this.f179307a.hashCode() * 31)) * 31;
        Uri uri = this.f179309c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f179310d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
