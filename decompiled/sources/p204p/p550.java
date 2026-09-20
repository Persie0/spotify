package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p550 {

    /* JADX INFO: renamed from: a */
    public final String f174076a;

    /* JADX INFO: renamed from: b */
    public final String f174077b;

    /* JADX INFO: renamed from: c */
    public final wwu f174078c;

    /* JADX INFO: renamed from: d */
    public final boolean f174079d;

    public p550(String str, String str2, wwu wwuVar, boolean z) {
        this.f174076a = str;
        this.f174077b = str2;
        this.f174078c = wwuVar;
        this.f174079d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p550)) {
            return false;
        }
        p550 p550Var = (p550) obj;
        return wj50.m88271j(this.f174076a, p550Var.f174076a) && wj50.m88271j(this.f174077b, p550Var.f174077b) && wj50.m88271j(this.f174078c, p550Var.f174078c) && this.f174079d == p550Var.f174079d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f174076a.hashCode() * 31, 31, this.f174077b);
        wwu wwuVar = this.f174078c;
        return Boolean.hashCode(this.f174079d) + ((iM77243b + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31);
    }
}
