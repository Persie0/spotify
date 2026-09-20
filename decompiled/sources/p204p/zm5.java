package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zm5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final boolean f284158a;

    /* JADX INFO: renamed from: b */
    public final boolean f284159b;

    /* JADX INFO: renamed from: c */
    public final xu00 f284160c;

    public zm5(boolean z, boolean z2, xu00 xu00Var) {
        this.f284158a = z;
        this.f284159b = z2;
        this.f284160c = xu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm5)) {
            return false;
        }
        zm5 zm5Var = (zm5) obj;
        return this.f284158a == zm5Var.f284158a && this.f284159b == zm5Var.f284159b && wj50.m88271j(this.f284160c, zm5Var.f284160c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f284158a) * 31, 31, this.f284159b);
        xu00 xu00Var = this.f284160c;
        return iM77245d + (xu00Var == null ? 0 : xu00Var.hashCode());
    }
}
