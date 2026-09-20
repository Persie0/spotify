package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j6u0 {

    /* JADX INFO: renamed from: a */
    public final int f109398a;

    /* JADX INFO: renamed from: b */
    public final int f109399b;

    public j6u0(int i, int i2) {
        this.f109398a = i;
        this.f109399b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6u0)) {
            return false;
        }
        j6u0 j6u0Var = (j6u0) obj;
        return this.f109398a == j6u0Var.f109398a && this.f109399b == j6u0Var.f109399b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109399b) + (Integer.hashCode(this.f109398a) * 31);
    }
}
