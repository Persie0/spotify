package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g571 {

    /* JADX INFO: renamed from: a */
    public final int f76606a;

    /* JADX INFO: renamed from: b */
    public final int f76607b;

    public g571(int i, int i2) {
        this.f76606a = i;
        this.f76607b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g571)) {
            return false;
        }
        g571 g571Var = (g571) obj;
        return this.f76606a == g571Var.f76606a && this.f76607b == g571Var.f76607b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76607b) + (Integer.hashCode(this.f76606a) * 31);
    }
}
