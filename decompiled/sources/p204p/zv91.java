package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zv91 {

    /* JADX INFO: renamed from: a */
    public final vt91 f286659a;

    /* JADX INFO: renamed from: b */
    public final ou91 f286660b;

    public zv91(vt91 vt91Var, ou91 ou91Var) {
        this.f286659a = vt91Var;
        this.f286660b = ou91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv91)) {
            return false;
        }
        zv91 zv91Var = (zv91) obj;
        return wj50.m88271j(this.f286659a, zv91Var.f286659a) && wj50.m88271j(this.f286660b, zv91Var.f286660b);
    }

    public final int hashCode() {
        return this.f286660b.f170235e.hashCode() + (this.f286659a.hashCode() * 31);
    }
}
