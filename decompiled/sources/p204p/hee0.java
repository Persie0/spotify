package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hee0 {

    /* JADX INFO: renamed from: a */
    public final String f90416a;

    /* JADX INFO: renamed from: b */
    public final xce0 f90417b;

    /* JADX INFO: renamed from: c */
    public final pee0 f90418c;

    /* JADX INFO: renamed from: d */
    public final k8j0 f90419d;

    public hee0(String str, xce0 xce0Var, pee0 pee0Var, k8j0 k8j0Var) {
        this.f90416a = str;
        this.f90417b = xce0Var;
        this.f90418c = pee0Var;
        this.f90419d = k8j0Var;
    }

    /* JADX INFO: renamed from: a */
    public static hee0 m47304a(hee0 hee0Var, pee0 pee0Var) {
        String str = hee0Var.f90416a;
        xce0 xce0Var = hee0Var.f90417b;
        k8j0 k8j0Var = hee0Var.f90419d;
        hee0Var.getClass();
        return new hee0(str, xce0Var, pee0Var, k8j0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hee0)) {
            return false;
        }
        hee0 hee0Var = (hee0) obj;
        return wj50.m88271j(this.f90416a, hee0Var.f90416a) && wj50.m88271j(this.f90417b, hee0Var.f90417b) && wj50.m88271j(this.f90418c, hee0Var.f90418c) && this.f90419d == hee0Var.f90419d;
    }

    public final int hashCode() {
        return this.f90419d.hashCode() + ((this.f90418c.hashCode() + ((this.f90417b.hashCode() + (this.f90416a.hashCode() * 31)) * 31)) * 31);
    }
}
