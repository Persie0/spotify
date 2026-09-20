package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tl2 {

    /* JADX INFO: renamed from: a */
    public final List f221306a;

    /* JADX INFO: renamed from: b */
    public final String f221307b;

    public tl2(String str, ae50 ae50Var) {
        this.f221306a = ae50Var;
        this.f221307b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl2)) {
            return false;
        }
        tl2 tl2Var = (tl2) obj;
        return wj50.m88271j(this.f221306a, tl2Var.f221306a) && wj50.m88271j(this.f221307b, tl2Var.f221307b);
    }

    public final int hashCode() {
        int iHashCode = this.f221306a.hashCode() * 31;
        String str = this.f221307b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
