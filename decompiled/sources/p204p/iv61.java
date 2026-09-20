package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iv61 {

    /* JADX INFO: renamed from: a */
    public final int f106155a;

    /* JADX INFO: renamed from: b */
    public final int f106156b;

    public iv61(int i, int i2) {
        this.f106155a = i;
        this.f106156b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv61)) {
            return false;
        }
        iv61 iv61Var = (iv61) obj;
        return this.f106155a == iv61Var.f106155a && this.f106156b == iv61Var.f106156b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106156b) + (Integer.hashCode(this.f106155a) * 31);
    }
}
