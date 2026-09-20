package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oi9 {

    /* JADX INFO: renamed from: a */
    public final int f165733a;

    /* JADX INFO: renamed from: b */
    public final int f165734b;

    public oi9(int i, int i2) {
        this.f165733a = i;
        this.f165734b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m67004a() {
        return this.f165733a;
    }

    /* JADX INFO: renamed from: b */
    public final int m67005b() {
        return this.f165734b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi9)) {
            return false;
        }
        oi9 oi9Var = (oi9) obj;
        return this.f165733a == oi9Var.f165733a && this.f165734b == oi9Var.f165734b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f165734b) + (Integer.hashCode(this.f165733a) * 31);
    }
}
