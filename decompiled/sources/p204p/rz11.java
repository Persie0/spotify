package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class rz11 {

    /* JADX INFO: renamed from: a */
    public final String f204029a;

    /* JADX INFO: renamed from: b */
    public final Uri f204030b;

    /* JADX INFO: renamed from: c */
    public final String f204031c;

    /* JADX INFO: renamed from: d */
    public final n6f f204032d;

    /* JADX INFO: renamed from: e */
    public final zy11 f204033e;

    /* JADX INFO: renamed from: f */
    public final az11 f204034f;

    public /* synthetic */ rz11(String str, Uri uri, String str2, n6f n6fVar, zy11 zy11Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : n6fVar, zy11Var, (az11) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz11)) {
            return false;
        }
        rz11 rz11Var = (rz11) obj;
        return wj50.m88271j(this.f204029a, rz11Var.f204029a) && wj50.m88271j(this.f204030b, rz11Var.f204030b) && wj50.m88271j(this.f204031c, rz11Var.f204031c) && wj50.m88271j(this.f204032d, rz11Var.f204032d) && wj50.m88271j(this.f204033e, rz11Var.f204033e) && wj50.m88271j(this.f204034f, rz11Var.f204034f);
    }

    public final int hashCode() {
        String str = this.f204029a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.f204030b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f204031c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n6f n6fVar = this.f204032d;
        int iHashCode4 = (this.f204033e.hashCode() + ((iHashCode3 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31)) * 31;
        az11 az11Var = this.f204034f;
        return iHashCode4 + (az11Var != null ? az11Var.hashCode() : 0);
    }

    public rz11(String str, Uri uri, String str2, n6f n6fVar, zy11 zy11Var, az11 az11Var) {
        this.f204029a = str;
        this.f204030b = uri;
        this.f204031c = str2;
        this.f204032d = n6fVar;
        this.f204033e = zy11Var;
        this.f204034f = az11Var;
    }
}
