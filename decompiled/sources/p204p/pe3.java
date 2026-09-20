package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pe3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f176617a;

    /* JADX INFO: renamed from: b */
    public final String f176618b;

    /* JADX INFO: renamed from: c */
    public final jev f176619c;

    /* JADX INFO: renamed from: d */
    public final d850 f176620d;

    /* JADX INFO: renamed from: e */
    public final boolean f176621e;

    public pe3(String str, String str2, jev jevVar, d850 d850Var, boolean z) {
        this.f176617a = str;
        this.f176618b = str2;
        this.f176619c = jevVar;
        this.f176620d = d850Var;
        this.f176621e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe3)) {
            return false;
        }
        pe3 pe3Var = (pe3) obj;
        return wj50.m88271j(this.f176617a, pe3Var.f176617a) && wj50.m88271j(this.f176618b, pe3Var.f176618b) && this.f176619c == pe3Var.f176619c && wj50.m88271j(this.f176620d, pe3Var.f176620d) && this.f176621e == pe3Var.f176621e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176621e) + ((this.f176620d.hashCode() + ((this.f176619c.hashCode() + s571.m77243b(this.f176617a.hashCode() * 31, 31, this.f176618b)) * 31)) * 31);
    }
}
