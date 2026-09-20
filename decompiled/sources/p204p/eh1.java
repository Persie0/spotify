package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class eh1 extends fh1 {

    /* JADX INFO: renamed from: a */
    public final pla1 f59440a;

    /* JADX INFO: renamed from: b */
    public final boolean f59441b;

    /* JADX INFO: renamed from: c */
    public final boolean f59442c;

    /* JADX INFO: renamed from: d */
    public final int f59443d;

    /* JADX INFO: renamed from: e */
    public final String f59444e;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public eh1(int i, String str, pla1 pla1Var, boolean z, boolean z2) {
        this.f59440a = pla1Var;
        this.f59441b = z;
        this.f59442c = z2;
        this.f59443d = i;
        this.f59444e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh1)) {
            return false;
        }
        eh1 eh1Var = (eh1) obj;
        return wj50.m88271j(this.f59440a, eh1Var.f59440a) && this.f59441b == eh1Var.f59441b && this.f59442c == eh1Var.f59442c && this.f59443d == eh1Var.f59443d && this.f59444e.equals(eh1Var.f59444e);
    }

    public final int hashCode() {
        return this.f59444e.hashCode() + mt60.m62800g(this.f59443d, s571.m77245d(s571.m77245d(this.f59440a.hashCode() * 31, 31, this.f59441b), 31, this.f59442c), 31);
    }
}
