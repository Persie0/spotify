package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hgz0 {

    /* JADX INFO: renamed from: a */
    public final int f91239a;

    /* JADX INFO: renamed from: b */
    public final int f91240b;

    public hgz0(int i, int i2) {
        this.f91239a = i;
        this.f91240b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m47484a() {
        return this.f91239a;
    }

    /* JADX INFO: renamed from: b */
    public final int m47485b() {
        return this.f91240b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgz0)) {
            return false;
        }
        hgz0 hgz0Var = (hgz0) obj;
        return this.f91239a == hgz0Var.f91239a && this.f91240b == hgz0Var.f91240b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91240b) + (Integer.hashCode(this.f91239a) * 31);
    }
}
