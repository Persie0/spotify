package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pt00 {

    /* JADX INFO: renamed from: a */
    public final boolean f181016a;

    /* JADX INFO: renamed from: b */
    public final String f181017b;

    public pt00(boolean z, String str) {
        this.f181016a = z;
        this.f181017b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt00)) {
            return false;
        }
        pt00 pt00Var = (pt00) obj;
        return this.f181016a == pt00Var.f181016a && wj50.m88271j(this.f181017b, pt00Var.f181017b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f181016a) * 31;
        String str = this.f181017b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
