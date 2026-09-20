package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j160 implements m160 {

    /* JADX INFO: renamed from: a */
    public final p860 f107650a;

    /* JADX INFO: renamed from: b */
    public final String f107651b;

    /* JADX INFO: renamed from: c */
    public final aej0 f107652c;

    /* JADX INFO: renamed from: d */
    public final lx50 f107653d;

    public j160(p860 p860Var, String str, aej0 aej0Var, lx50 lx50Var) {
        this.f107650a = p860Var;
        this.f107651b = str;
        this.f107652c = aej0Var;
        this.f107653d = lx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j160)) {
            return false;
        }
        j160 j160Var = (j160) obj;
        return wj50.m88271j(this.f107650a, j160Var.f107650a) && wj50.m88271j(this.f107651b, j160Var.f107651b) && wj50.m88271j(this.f107652c, j160Var.f107652c) && wj50.m88271j(this.f107653d, j160Var.f107653d);
    }

    public final int hashCode() {
        return this.f107653d.hashCode() + ((this.f107652c.hashCode() + s571.m77243b(this.f107650a.hashCode() * 31, 31, this.f107651b)) * 31);
    }
}
