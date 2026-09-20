package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final int f140773a;

    /* JADX INFO: renamed from: b */
    public final int f140774b;

    public m7g0(int i, int i2) {
        this.f140773a = i;
        this.f140774b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7g0)) {
            return false;
        }
        m7g0 m7g0Var = (m7g0) obj;
        return this.f140773a == m7g0Var.f140773a && this.f140774b == m7g0Var.f140774b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140774b) + (Integer.hashCode(this.f140773a) * 31);
    }
}
