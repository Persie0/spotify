package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bh1 extends fh1 {

    /* JADX INFO: renamed from: a */
    public final List f27051a;

    /* JADX INFO: renamed from: b */
    public final int f27052b;

    /* JADX INFO: renamed from: c */
    public final pla1 f27053c;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public bh1(List list, int i, pla1 pla1Var) {
        this.f27051a = list;
        this.f27052b = i;
        this.f27053c = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        return wj50.m88271j(this.f27051a, bh1Var.f27051a) && this.f27052b == bh1Var.f27052b && wj50.m88271j(this.f27053c, bh1Var.f27053c);
    }

    public final int hashCode() {
        return this.f27053c.hashCode() + mt60.m62800g(this.f27052b, this.f27051a.hashCode() * 31, 31);
    }
}
