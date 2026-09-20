package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q881 {

    /* JADX INFO: renamed from: a */
    public final int f186262a;

    /* JADX INFO: renamed from: b */
    public final int f186263b;

    public q881(int i, int i2) {
        this.f186262a = i;
        this.f186263b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q881)) {
            return false;
        }
        q881 q881Var = (q881) obj;
        return this.f186262a == q881Var.f186262a && this.f186263b == q881Var.f186263b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f186263b) + (Integer.hashCode(this.f186262a) * 31);
    }
}
