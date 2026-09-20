package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k46 {

    /* JADX INFO: renamed from: a */
    public final String f119109a;

    /* JADX INFO: renamed from: b */
    public final String f119110b;

    /* JADX INFO: renamed from: c */
    public final int f119111c;

    /* JADX INFO: renamed from: d */
    public final String f119112d;

    public k46(String str, String str2, int i, String str3) {
        this.f119109a = str;
        this.f119110b = str2;
        this.f119111c = i;
        this.f119112d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k46)) {
            return false;
        }
        k46 k46Var = (k46) obj;
        return wj50.m88271j(this.f119109a, k46Var.f119109a) && wj50.m88271j(this.f119110b, k46Var.f119110b) && this.f119111c == k46Var.f119111c && wj50.m88271j(this.f119112d, k46Var.f119112d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f119111c, s571.m77243b(this.f119109a.hashCode() * 31, 31, this.f119110b), 31);
        String str = this.f119112d;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
