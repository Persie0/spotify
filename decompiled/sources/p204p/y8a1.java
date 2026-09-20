package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y8a1 {

    /* JADX INFO: renamed from: a */
    public final vda1 f270261a;

    /* JADX INFO: renamed from: b */
    public final boolean f270262b;

    /* JADX INFO: renamed from: c */
    public final eh00 f270263c;

    public y8a1(vda1 vda1Var, boolean z, eh00 eh00Var) {
        this.f270261a = vda1Var;
        this.f270262b = z;
        this.f270263c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8a1)) {
            return false;
        }
        y8a1 y8a1Var = (y8a1) obj;
        return wj50.m88271j(this.f270261a, y8a1Var.f270261a) && this.f270262b == y8a1Var.f270262b && wj50.m88271j(this.f270263c, y8a1Var.f270263c);
    }

    public final int hashCode() {
        return this.f270263c.hashCode() + s571.m77245d(this.f270261a.hashCode() * 31, 31, this.f270262b);
    }
}
