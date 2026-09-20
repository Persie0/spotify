package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f1y {

    /* JADX INFO: renamed from: a */
    public final boolean f65001a;

    /* JADX INFO: renamed from: b */
    public final fq01 f65002b;

    /* JADX INFO: renamed from: c */
    public final String f65003c;

    /* JADX INFO: renamed from: d */
    public final boolean f65004d;

    public f1y(boolean z, fq01 fq01Var, String str, boolean z2) {
        this.f65001a = z;
        this.f65002b = fq01Var;
        this.f65003c = str;
        this.f65004d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1y)) {
            return false;
        }
        f1y f1yVar = (f1y) obj;
        return this.f65001a == f1yVar.f65001a && wj50.m88271j(this.f65002b, f1yVar.f65002b) && wj50.m88271j(this.f65003c, f1yVar.f65003c) && this.f65004d == f1yVar.f65004d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f65001a) * 31;
        fq01 fq01Var = this.f65002b;
        int iHashCode2 = (iHashCode + (fq01Var == null ? 0 : fq01Var.hashCode())) * 31;
        String str = this.f65003c;
        return Boolean.hashCode(this.f65004d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
