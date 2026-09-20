package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rl80 {

    /* JADX INFO: renamed from: a */
    public final int f200234a;

    /* JADX INFO: renamed from: b */
    public final int f200235b;

    public rl80(int i, int i2) {
        this.f200234a = i;
        this.f200235b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl80)) {
            return false;
        }
        rl80 rl80Var = (rl80) obj;
        return this.f200234a == rl80Var.f200234a && this.f200235b == rl80Var.f200235b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200235b) + (Integer.hashCode(this.f200234a) * 31);
    }
}
