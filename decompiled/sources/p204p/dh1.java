package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dh1 extends fh1 {

    /* JADX INFO: renamed from: a */
    public final pla1 f48949a;

    /* JADX INFO: renamed from: b */
    public final int f48950b;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public dh1(int i, pla1 pla1Var) {
        this.f48949a = pla1Var;
        this.f48950b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh1)) {
            return false;
        }
        dh1 dh1Var = (dh1) obj;
        return wj50.m88271j(this.f48949a, dh1Var.f48949a) && this.f48950b == dh1Var.f48950b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48950b) + (this.f48949a.hashCode() * 31);
    }
}
