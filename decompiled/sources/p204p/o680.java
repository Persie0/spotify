package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o680 extends v680 {

    /* JADX INFO: renamed from: a */
    public final boolean f162272a;

    /* JADX INFO: renamed from: b */
    public final boolean f162273b;

    /* JADX INFO: renamed from: c */
    public final boolean f162274c;

    public o680(boolean z, boolean z2, boolean z3) {
        this.f162272a = z;
        this.f162273b = z2;
        this.f162274c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o680)) {
            return false;
        }
        o680 o680Var = (o680) obj;
        return this.f162272a == o680Var.f162272a && this.f162273b == o680Var.f162273b && this.f162274c == o680Var.f162274c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162274c) + s571.m77245d(Boolean.hashCode(this.f162272a) * 31, 31, this.f162273b);
    }
}
