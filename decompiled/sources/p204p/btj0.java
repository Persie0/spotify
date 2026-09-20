package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class btj0 {

    /* JADX INFO: renamed from: a */
    public final int f30878a;

    /* JADX INFO: renamed from: b */
    public final int f30879b;

    public btj0(int i, int i2) {
        this.f30878a = i;
        this.f30879b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btj0)) {
            return false;
        }
        btj0 btj0Var = (btj0) obj;
        return this.f30878a == btj0Var.f30878a && this.f30879b == btj0Var.f30879b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30879b) + (Integer.hashCode(this.f30878a) * 31);
    }
}
