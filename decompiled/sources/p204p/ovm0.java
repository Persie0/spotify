package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class ovm0 implements pvm0 {

    /* JADX INFO: renamed from: a */
    public final String f170530a;

    /* JADX INFO: renamed from: b */
    public final Uri f170531b;

    /* JADX INFO: renamed from: c */
    public final long f170532c;

    public ovm0(String str, Uri uri, long j) {
        this.f170530a = str;
        this.f170531b = uri;
        this.f170532c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovm0)) {
            return false;
        }
        ovm0 ovm0Var = (ovm0) obj;
        if (!this.f170530a.equals(ovm0Var.f170530a) || !this.f170531b.equals(ovm0Var.f170531b)) {
            return false;
        }
        long j = ovm0Var.f170532c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f170532c, j);
    }

    public final int hashCode() {
        int iM64019l = nap.m64019l(this.f170531b, this.f170530a.hashCode() * 31, 31);
        int i = n6f.f150872l;
        return Long.hashCode(this.f170532c) + iM64019l;
    }
}
