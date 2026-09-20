package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ogp0 {

    /* JADX INFO: renamed from: a */
    public final String f165198a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f165199b;

    /* JADX INFO: renamed from: c */
    public final String f165200c;

    public ogp0(String str, lnn0 lnn0Var, String str2) {
        this.f165198a = str;
        this.f165199b = lnn0Var;
        this.f165200c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogp0)) {
            return false;
        }
        ogp0 ogp0Var = (ogp0) obj;
        return wj50.m88271j(this.f165198a, ogp0Var.f165198a) && this.f165199b == ogp0Var.f165199b && wj50.m88271j(this.f165200c, ogp0Var.f165200c);
    }

    public final int hashCode() {
        int iHashCode = (this.f165199b.hashCode() + (this.f165198a.hashCode() * 31)) * 31;
        String str = this.f165200c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
