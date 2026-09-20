package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class wki0 extends bli0 {

    /* JADX INFO: renamed from: a */
    public final z0r f252247a;

    /* JADX INFO: renamed from: b */
    public final Uri f252248b;

    /* JADX INFO: renamed from: c */
    public final Uri f252249c;

    /* JADX INFO: renamed from: d */
    public final int f252250d;

    public wki0(z0r z0rVar, Uri uri, Uri uri2, int i) {
        this.f252247a = z0rVar;
        this.f252248b = uri;
        this.f252249c = uri2;
        this.f252250d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wki0)) {
            return false;
        }
        wki0 wki0Var = (wki0) obj;
        return wj50.m88271j(this.f252247a, wki0Var.f252247a) && wj50.m88271j(this.f252248b, wki0Var.f252248b) && wj50.m88271j(this.f252249c, wki0Var.f252249c) && this.f252250d == wki0Var.f252250d;
    }

    public final int hashCode() {
        int iHashCode = this.f252247a.hashCode() * 31;
        Uri uri = this.f252248b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f252249c;
        return Integer.hashCode(this.f252250d) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
