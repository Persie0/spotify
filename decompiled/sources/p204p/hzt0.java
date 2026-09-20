package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hzt0 {

    /* JADX INFO: renamed from: a */
    public final String f97013a;

    /* JADX INFO: renamed from: b */
    public final String f97014b;

    public hzt0(String str, String str2) {
        this.f97013a = str;
        this.f97014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzt0)) {
            return false;
        }
        hzt0 hzt0Var = (hzt0) obj;
        return wj50.m88271j(this.f97013a, hzt0Var.f97013a) && wj50.m88271j(this.f97014b, hzt0Var.f97014b);
    }

    public final int hashCode() {
        int iHashCode = this.f97013a.hashCode() * 31;
        String str = this.f97014b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
