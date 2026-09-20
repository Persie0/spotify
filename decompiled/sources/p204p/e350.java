package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e350 {

    /* JADX INFO: renamed from: a */
    public final int f55618a;

    /* JADX INFO: renamed from: b */
    public final int f55619b;

    public e350(int i, int i2) {
        this.f55618a = i;
        this.f55619b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e350)) {
            return false;
        }
        e350 e350Var = (e350) obj;
        return this.f55618a == e350Var.f55618a && this.f55619b == e350Var.f55619b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f55619b) + (edb.m38547C(this.f55618a) * 31);
    }
}
