package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l370 {

    /* JADX INFO: renamed from: a */
    public final String f129219a;

    /* JADX INFO: renamed from: b */
    public final String f129220b;

    public l370(String str, String str2) {
        this.f129219a = str;
        this.f129220b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l370)) {
            return false;
        }
        l370 l370Var = (l370) obj;
        return wj50.m88271j(this.f129219a, l370Var.f129219a) && wj50.m88271j(this.f129220b, l370Var.f129220b);
    }

    public final int hashCode() {
        int iHashCode = this.f129219a.hashCode() * 31;
        String str = this.f129220b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
