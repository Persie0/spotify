package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i260 {

    /* JADX INFO: renamed from: a */
    public final boolean f97755a;

    /* JADX INFO: renamed from: b */
    public final String f97756b;

    public i260(boolean z, String str) {
        this.f97755a = z;
        this.f97756b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i260)) {
            return false;
        }
        i260 i260Var = (i260) obj;
        return this.f97755a == i260Var.f97755a && wj50.m88271j(this.f97756b, i260Var.f97756b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f97755a) * 31;
        String str = this.f97756b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
