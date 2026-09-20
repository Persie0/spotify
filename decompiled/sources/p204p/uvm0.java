package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class uvm0 {

    /* JADX INFO: renamed from: a */
    public final String f234471a;

    /* JADX INFO: renamed from: b */
    public final Uri f234472b;

    /* JADX INFO: renamed from: c */
    public final int f234473c;

    public uvm0(int i, Uri uri, String str) {
        this.f234471a = str;
        this.f234472b = uri;
        this.f234473c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvm0)) {
            return false;
        }
        uvm0 uvm0Var = (uvm0) obj;
        return this.f234471a.equals(uvm0Var.f234471a) && this.f234472b.equals(uvm0Var.f234472b) && this.f234473c == uvm0Var.f234473c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f234473c) + nap.m64019l(this.f234472b, this.f234471a.hashCode() * 31, 31);
    }
}
