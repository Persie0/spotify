package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sac1 {

    /* JADX INFO: renamed from: a */
    public final String f207176a;

    /* JADX INFO: renamed from: b */
    public final boolean f207177b;

    /* JADX INFO: renamed from: c */
    public final int f207178c;

    public sac1(String str, boolean z, int i) {
        this.f207176a = str;
        this.f207177b = z;
        this.f207178c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sac1)) {
            return false;
        }
        sac1 sac1Var = (sac1) obj;
        return wj50.m88271j(this.f207176a, sac1Var.f207176a) && this.f207177b == sac1Var.f207177b && this.f207178c == sac1Var.f207178c;
    }

    public final int hashCode() {
        String str = this.f207176a;
        return edb.m38547C(this.f207178c) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f207177b);
    }
}
