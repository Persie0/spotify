package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class nwd0 {

    /* JADX INFO: renamed from: a */
    public final String f159099a;

    /* JADX INFO: renamed from: b */
    public final boolean f159100b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f159101c;

    /* JADX INFO: renamed from: d */
    public final mwd0 f159102d;

    public nwd0(String str, boolean z, ArrayList arrayList, mwd0 mwd0Var) {
        this.f159099a = str;
        this.f159100b = z;
        this.f159101c = arrayList;
        this.f159102d = mwd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwd0)) {
            return false;
        }
        nwd0 nwd0Var = (nwd0) obj;
        return wj50.m88271j(this.f159099a, nwd0Var.f159099a) && this.f159100b == nwd0Var.f159100b && this.f159101c.equals(nwd0Var.f159101c) && wj50.m88271j(this.f159102d, nwd0Var.f159102d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f159101c, s571.m77245d(this.f159099a.hashCode() * 31, 31, this.f159100b), 31);
        mwd0 mwd0Var = this.f159102d;
        return iM59700f + (mwd0Var == null ? 0 : mwd0Var.hashCode());
    }
}
