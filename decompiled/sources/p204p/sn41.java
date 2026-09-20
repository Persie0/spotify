package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class sn41 extends wn41 {

    /* JADX INFO: renamed from: a */
    public final z0r f210801a;

    /* JADX INFO: renamed from: b */
    public final Uri f210802b;

    /* JADX INFO: renamed from: c */
    public final Uri f210803c;

    public sn41(z0r z0rVar, Uri uri, Uri uri2) {
        this.f210801a = z0rVar;
        this.f210802b = uri;
        this.f210803c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn41)) {
            return false;
        }
        sn41 sn41Var = (sn41) obj;
        return wj50.m88271j(this.f210801a, sn41Var.f210801a) && wj50.m88271j(this.f210802b, sn41Var.f210802b) && wj50.m88271j(this.f210803c, sn41Var.f210803c);
    }

    public final int hashCode() {
        int iHashCode = this.f210801a.hashCode() * 31;
        Uri uri = this.f210802b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f210803c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
