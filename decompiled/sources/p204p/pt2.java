package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pt2 {

    /* JADX INFO: renamed from: a */
    public final String f181025a;

    /* JADX INFO: renamed from: b */
    public final String f181026b;

    public pt2(String str, String str2) {
        this.f181025a = str;
        this.f181026b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt2)) {
            return false;
        }
        pt2 pt2Var = (pt2) obj;
        return wj50.m88271j(this.f181025a, pt2Var.f181025a) && wj50.m88271j(this.f181026b, pt2Var.f181026b);
    }

    public final int hashCode() {
        return this.f181026b.hashCode() + (this.f181025a.hashCode() * 31);
    }
}
