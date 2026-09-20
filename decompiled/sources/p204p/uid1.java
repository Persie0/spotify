package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uid1 {

    /* JADX INFO: renamed from: a */
    public final boolean f230669a;

    /* JADX INFO: renamed from: b */
    public final int f230670b;

    public uid1(boolean z, int i) {
        this.f230669a = z;
        this.f230670b = i;
    }

    /* JADX INFO: renamed from: a */
    public static uid1 m83195a(uid1 uid1Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = uid1Var.f230669a;
        }
        if ((i2 & 2) != 0) {
            i = uid1Var.f230670b;
        }
        uid1Var.getClass();
        return new uid1(z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uid1)) {
            return false;
        }
        uid1 uid1Var = (uid1) obj;
        return this.f230669a == uid1Var.f230669a && this.f230670b == uid1Var.f230670b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f230670b) + (Boolean.hashCode(this.f230669a) * 31);
    }
}
