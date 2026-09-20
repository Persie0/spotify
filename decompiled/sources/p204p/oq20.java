package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oq20 {

    /* JADX INFO: renamed from: a */
    public final int f168056a;

    /* JADX INFO: renamed from: b */
    public final int f168057b;

    public oq20(int i, int i2) {
        this.f168056a = i;
        this.f168057b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq20)) {
            return false;
        }
        oq20 oq20Var = (oq20) obj;
        return this.f168056a == oq20Var.f168056a && this.f168057b == oq20Var.f168057b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168057b) + (Integer.hashCode(this.f168056a) * 31);
    }
}
