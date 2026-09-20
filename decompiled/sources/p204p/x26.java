package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x26 {

    /* JADX INFO: renamed from: a */
    public final String f257364a;

    /* JADX INFO: renamed from: b */
    public final String f257365b;

    /* JADX INFO: renamed from: c */
    public final boolean f257366c;

    public x26(String str, String str2, boolean z) {
        this.f257364a = str;
        this.f257365b = str2;
        this.f257366c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x26)) {
            return false;
        }
        x26 x26Var = (x26) obj;
        return wj50.m88271j(this.f257364a, x26Var.f257364a) && wj50.m88271j(this.f257365b, x26Var.f257365b) && this.f257366c == x26Var.f257366c;
    }

    public final int hashCode() {
        int iHashCode = this.f257364a.hashCode() * 31;
        String str = this.f257365b;
        return Boolean.hashCode(this.f257366c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
