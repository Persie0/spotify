package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class tyc0 implements uyc0 {

    /* JADX INFO: renamed from: a */
    public final String f224913a;

    /* JADX INFO: renamed from: b */
    public final String f224914b;

    /* JADX INFO: renamed from: c */
    public final Uri f224915c;

    public tyc0(Uri uri, String str, String str2) {
        this.f224913a = str;
        this.f224914b = str2;
        this.f224915c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyc0)) {
            return false;
        }
        tyc0 tyc0Var = (tyc0) obj;
        return wj50.m88271j(this.f224913a, tyc0Var.f224913a) && wj50.m88271j(this.f224914b, tyc0Var.f224914b) && wj50.m88271j(this.f224915c, tyc0Var.f224915c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f224913a.hashCode() * 31, 31, this.f224914b);
        Uri uri = this.f224915c;
        return iM77243b + (uri == null ? 0 : uri.hashCode());
    }
}
