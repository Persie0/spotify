package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yz8 {

    /* JADX INFO: renamed from: a */
    public final zam0 f277727a;

    /* JADX INFO: renamed from: b */
    public final fnm0 f277728b;

    /* JADX INFO: renamed from: c */
    public final kbm0 f277729c;

    public yz8(zam0 zam0Var, fnm0 fnm0Var, kbm0 kbm0Var) {
        this.f277727a = zam0Var;
        this.f277728b = fnm0Var;
        this.f277729c = kbm0Var;
    }

    /* JADX INFO: renamed from: a */
    public static yz8 m94971a(yz8 yz8Var, gbu0 gbu0Var, kbm0 kbm0Var, int i) {
        zam0 zam0Var = gbu0Var;
        if ((i & 1) != 0) {
            zam0Var = yz8Var.f277727a;
        }
        fnm0 fnm0Var = yz8Var.f277728b;
        if ((i & 4) != 0) {
            kbm0Var = yz8Var.f277729c;
        }
        yz8Var.getClass();
        return new yz8(zam0Var, fnm0Var, kbm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz8)) {
            return false;
        }
        yz8 yz8Var = (yz8) obj;
        return wj50.m88271j(this.f277727a, yz8Var.f277727a) && wj50.m88271j(this.f277728b, yz8Var.f277728b) && wj50.m88271j(this.f277729c, yz8Var.f277729c);
    }

    public final int hashCode() {
        int iHashCode = this.f277727a.hashCode() * 31;
        fnm0 fnm0Var = this.f277728b;
        return this.f277729c.f121231a.hashCode() + ((iHashCode + (fnm0Var == null ? 0 : fnm0Var.f71323a.hashCode())) * 31);
    }
}
