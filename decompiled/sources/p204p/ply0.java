package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ply0 {

    /* JADX INFO: renamed from: a */
    public final int f178829a;

    /* JADX INFO: renamed from: b */
    public final int f178830b;

    public ply0(int i, int i2) {
        this.f178829a = i;
        this.f178830b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m70272a() {
        return this.f178829a;
    }

    /* JADX INFO: renamed from: b */
    public final int m70273b() {
        return this.f178830b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ply0)) {
            return false;
        }
        ply0 ply0Var = (ply0) obj;
        return this.f178829a == ply0Var.f178829a && this.f178830b == ply0Var.f178830b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178830b) + (Integer.hashCode(this.f178829a) * 31);
    }
}
