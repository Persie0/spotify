package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i291 {

    /* JADX INFO: renamed from: a */
    public final int f97779a;

    /* JADX INFO: renamed from: b */
    public final int f97780b;

    /* JADX INFO: renamed from: c */
    public final wb71 f97781c;

    public i291(int i, int i2, wb71 wb71Var) {
        this.f97779a = i;
        this.f97780b = i2;
        this.f97781c = wb71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i291)) {
            return false;
        }
        i291 i291Var = (i291) obj;
        return this.f97779a == i291Var.f97779a && this.f97780b == i291Var.f97780b && wj50.m88271j(this.f97781c, i291Var.f97781c);
    }

    public final int hashCode() {
        return this.f97781c.hashCode() + mt60.m62800g(this.f97780b, Integer.hashCode(this.f97779a) * 31, 31);
    }

    public i291(int i, vr11 vr11Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 1, (i2 & 4) != 0 ? new tm4(29) : vr11Var);
    }
}
