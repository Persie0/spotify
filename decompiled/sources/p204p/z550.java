package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z550 {

    /* JADX INFO: renamed from: a */
    public final String f279473a;

    /* JADX INFO: renamed from: b */
    public final String f279474b;

    /* JADX INFO: renamed from: c */
    public final String f279475c;

    /* JADX INFO: renamed from: d */
    public final String f279476d;

    /* JADX INFO: renamed from: e */
    public final int f279477e;

    public z550(int i, String str, String str2, String str3, String str4) {
        this.f279473a = str;
        this.f279474b = str2;
        this.f279475c = str3;
        this.f279476d = str4;
        this.f279477e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z550)) {
            return false;
        }
        z550 z550Var = (z550) obj;
        return wj50.m88271j(this.f279473a, z550Var.f279473a) && wj50.m88271j(this.f279474b, z550Var.f279474b) && wj50.m88271j(this.f279475c, z550Var.f279475c) && wj50.m88271j(this.f279476d, z550Var.f279476d) && this.f279477e == z550Var.f279477e;
    }

    public final int hashCode() {
        int iHashCode = this.f279473a.hashCode() * 31;
        String str = this.f279474b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f279475c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f279476d;
        return Integer.hashCode(this.f279477e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
