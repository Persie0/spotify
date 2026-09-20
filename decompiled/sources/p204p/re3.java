package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class re3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f198261a;

    /* JADX INFO: renamed from: b */
    public final d850 f198262b;

    /* JADX INFO: renamed from: c */
    public final String f198263c;

    /* JADX INFO: renamed from: d */
    public final jev f198264d;

    public re3(String str, d850 d850Var, String str2, jev jevVar) {
        this.f198261a = str;
        this.f198262b = d850Var;
        this.f198263c = str2;
        this.f198264d = jevVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re3)) {
            return false;
        }
        re3 re3Var = (re3) obj;
        return wj50.m88271j(this.f198261a, re3Var.f198261a) && wj50.m88271j(this.f198262b, re3Var.f198262b) && wj50.m88271j(this.f198263c, re3Var.f198263c) && this.f198264d == re3Var.f198264d;
    }

    public final int hashCode() {
        int iHashCode = (this.f198262b.hashCode() + (this.f198261a.hashCode() * 31)) * 31;
        String str = this.f198263c;
        return this.f198264d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
