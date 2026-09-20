package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oa80 {

    /* JADX INFO: renamed from: a */
    public final int f163262a;

    /* JADX INFO: renamed from: b */
    public final int f163263b;

    public oa80(int i, int i2) {
        this.f163262a = i;
        this.f163263b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa80)) {
            return false;
        }
        oa80 oa80Var = (oa80) obj;
        return this.f163262a == oa80Var.f163262a && this.f163263b == oa80Var.f163263b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163263b) + (Integer.hashCode(this.f163262a) * 31);
    }
}
