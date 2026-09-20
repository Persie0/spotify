package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ru51 {

    /* JADX INFO: renamed from: a */
    public final String f202756a;

    /* JADX INFO: renamed from: b */
    public final int f202757b;

    /* JADX INFO: renamed from: c */
    public final aaz0 f202758c;

    /* JADX INFO: renamed from: d */
    public final sn61 f202759d;

    public ru51(String str, int i, aaz0 aaz0Var, sn61 sn61Var, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        i = (i2 & 2) != 0 ? 1 : i;
        aaz0Var = (i2 & 4) != 0 ? new aaz0(7, null, false) : aaz0Var;
        sn61Var = (i2 & 8) != 0 ? new sn61(7, null, false) : sn61Var;
        this.f202756a = str;
        this.f202757b = i;
        this.f202758c = aaz0Var;
        this.f202759d = sn61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru51)) {
            return false;
        }
        ru51 ru51Var = (ru51) obj;
        return wj50.m88271j(this.f202756a, ru51Var.f202756a) && this.f202757b == ru51Var.f202757b && wj50.m88271j(this.f202758c, ru51Var.f202758c) && wj50.m88271j(this.f202759d, ru51Var.f202759d);
    }

    public final int hashCode() {
        return this.f202759d.hashCode() + ((this.f202758c.hashCode() + f710.m40938f(this.f202757b, this.f202756a.hashCode() * 31, 31)) * 31);
    }
}
