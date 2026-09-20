package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sd51 {

    /* JADX INFO: renamed from: a */
    public final String f207893a;

    /* JADX INFO: renamed from: b */
    public final boolean f207894b;

    /* JADX INFO: renamed from: c */
    public final boolean f207895c;

    public sd51(String str, int i, boolean z, boolean z2) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        this.f207893a = str;
        this.f207894b = z;
        this.f207895c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd51)) {
            return false;
        }
        sd51 sd51Var = (sd51) obj;
        return wj50.m88271j(this.f207893a, sd51Var.f207893a) && this.f207894b == sd51Var.f207894b && this.f207895c == sd51Var.f207895c;
    }

    public final int hashCode() {
        String str = this.f207893a;
        return Boolean.hashCode(this.f207895c) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f207894b);
    }
}
