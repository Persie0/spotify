package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class apq0 {

    /* JADX INFO: renamed from: a */
    public final smq0 f17997a;

    /* JADX INFO: renamed from: b */
    public final int f17998b;

    public apq0(smq0 smq0Var, int i) {
        this.f17997a = smq0Var;
        this.f17998b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apq0)) {
            return false;
        }
        apq0 apq0Var = (apq0) obj;
        return wj50.m88271j(this.f17997a, apq0Var.f17997a) && this.f17998b == apq0Var.f17998b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17998b) + (this.f17997a.hashCode() * 31);
    }
}
