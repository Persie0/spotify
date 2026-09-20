package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fbu0 {

    /* JADX INFO: renamed from: a */
    public final String f67899a;

    /* JADX INFO: renamed from: b */
    public final String f67900b;

    /* JADX INFO: renamed from: c */
    public final ks81 f67901c;

    /* JADX INFO: renamed from: d */
    public final List f67902d;

    public fbu0(String str, String str2, ks81 ks81Var, List list) {
        this.f67899a = str;
        this.f67900b = str2;
        this.f67901c = ks81Var;
        this.f67902d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbu0)) {
            return false;
        }
        fbu0 fbu0Var = (fbu0) obj;
        return wj50.m88271j(this.f67899a, fbu0Var.f67899a) && wj50.m88271j(this.f67900b, fbu0Var.f67900b) && wj50.m88271j(this.f67901c, fbu0Var.f67901c) && wj50.m88271j(this.f67902d, fbu0Var.f67902d);
    }

    public final int hashCode() {
        String str = this.f67899a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67900b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ks81 ks81Var = this.f67901c;
        int iHashCode3 = (iHashCode2 + (ks81Var == null ? 0 : ks81Var.hashCode())) * 31;
        List list = this.f67902d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
