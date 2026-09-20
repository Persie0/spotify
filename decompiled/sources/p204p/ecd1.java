package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ecd1 {

    /* JADX INFO: renamed from: a */
    public final boolean f58313a;

    /* JADX INFO: renamed from: b */
    public final boolean f58314b;

    /* JADX INFO: renamed from: c */
    public final boolean f58315c;

    /* JADX INFO: renamed from: d */
    public final dcd1 f58316d;

    public ecd1(boolean z, boolean z2, boolean z3, dcd1 dcd1Var) {
        this.f58313a = z;
        this.f58314b = z2;
        this.f58315c = z3;
        this.f58316d = dcd1Var;
    }

    /* JADX INFO: renamed from: a */
    public static ecd1 m38491a(ecd1 ecd1Var, boolean z, boolean z2, boolean z3, dcd1 dcd1Var, int i) {
        if ((i & 1) != 0) {
            z = ecd1Var.f58313a;
        }
        if ((i & 2) != 0) {
            z2 = ecd1Var.f58314b;
        }
        if ((i & 4) != 0) {
            z3 = ecd1Var.f58315c;
        }
        if ((i & 8) != 0) {
            dcd1Var = ecd1Var.f58316d;
        }
        ecd1Var.getClass();
        return new ecd1(z, z2, z3, dcd1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecd1)) {
            return false;
        }
        ecd1 ecd1Var = (ecd1) obj;
        return this.f58313a == ecd1Var.f58313a && this.f58314b == ecd1Var.f58314b && this.f58315c == ecd1Var.f58315c && wj50.m88271j(this.f58316d, ecd1Var.f58316d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f58313a) * 31, 31, this.f58314b), 31, this.f58315c);
        dcd1 dcd1Var = this.f58316d;
        return iM77245d + (dcd1Var == null ? 0 : dcd1Var.hashCode());
    }
}
