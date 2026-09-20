package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ru6 extends wu6 {

    /* JADX INFO: renamed from: a */
    public final String f202760a;

    /* JADX INFO: renamed from: b */
    public final String f202761b;

    /* JADX INFO: renamed from: c */
    public final om01 f202762c;

    public ru6(String str, String str2, om01 om01Var) {
        this.f202760a = str;
        this.f202761b = str2;
        this.f202762c = om01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru6)) {
            return false;
        }
        ru6 ru6Var = (ru6) obj;
        return wj50.m88271j(this.f202760a, ru6Var.f202760a) && wj50.m88271j(this.f202761b, ru6Var.f202761b) && wj50.m88271j(this.f202762c, ru6Var.f202762c);
    }

    public final int hashCode() {
        return this.f202762c.hashCode() + s571.m77243b(this.f202760a.hashCode() * 31, 31, this.f202761b);
    }
}
