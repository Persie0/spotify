package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f93219a;

    /* JADX INFO: renamed from: b */
    public final String f93220b;

    /* JADX INFO: renamed from: c */
    public final boolean f93221c;

    public hn5(String str, String str2, boolean z) {
        this.f93219a = str;
        this.f93220b = str2;
        this.f93221c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn5)) {
            return false;
        }
        hn5 hn5Var = (hn5) obj;
        return wj50.m88271j(this.f93219a, hn5Var.f93219a) && wj50.m88271j(this.f93220b, hn5Var.f93220b) && this.f93221c == hn5Var.f93221c;
    }

    public final int hashCode() {
        int iHashCode = this.f93219a.hashCode() * 31;
        String str = this.f93220b;
        return Boolean.hashCode(this.f93221c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
