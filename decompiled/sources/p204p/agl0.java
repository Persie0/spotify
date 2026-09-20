package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class agl0 {

    /* JADX INFO: renamed from: a */
    public final String f15426a;

    /* JADX INFO: renamed from: b */
    public final String f15427b;

    /* JADX INFO: renamed from: c */
    public final String f15428c;

    public agl0(String str, String str2, String str3) {
        this.f15426a = str;
        this.f15427b = str2;
        this.f15428c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agl0)) {
            return false;
        }
        agl0 agl0Var = (agl0) obj;
        return wj50.m88271j(this.f15426a, agl0Var.f15426a) && wj50.m88271j(this.f15427b, agl0Var.f15427b) && wj50.m88271j(this.f15428c, agl0Var.f15428c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f15426a.hashCode() * 31, 31, this.f15427b);
        String str = this.f15428c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
