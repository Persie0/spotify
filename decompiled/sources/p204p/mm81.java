package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mm81 {

    /* JADX INFO: renamed from: a */
    public final boolean f145075a;

    /* JADX INFO: renamed from: b */
    public final boolean f145076b;

    /* JADX INFO: renamed from: c */
    public final boolean f145077c;

    public mm81(boolean z, boolean z2, boolean z3) {
        this.f145075a = z;
        this.f145076b = z2;
        this.f145077c = z3;
    }

    /* JADX INFO: renamed from: a */
    public static mm81 m62273a(mm81 mm81Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = mm81Var.f145075a;
        }
        if ((i & 2) != 0) {
            z2 = mm81Var.f145076b;
        }
        if ((i & 4) != 0) {
            z3 = mm81Var.f145077c;
        }
        return new mm81(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm81)) {
            return false;
        }
        mm81 mm81Var = (mm81) obj;
        return this.f145075a == mm81Var.f145075a && this.f145076b == mm81Var.f145076b && this.f145077c == mm81Var.f145077c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145077c) + s571.m77245d(Boolean.hashCode(this.f145075a) * 31, 31, this.f145076b);
    }
}
