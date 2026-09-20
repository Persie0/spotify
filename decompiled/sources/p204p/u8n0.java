package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u8n0 {

    /* JADX INFO: renamed from: a */
    public final boolean f227984a;

    /* JADX INFO: renamed from: b */
    public final int f227985b;

    public u8n0(boolean z, int i) {
        this.f227984a = z;
        this.f227985b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8n0)) {
            return false;
        }
        u8n0 u8n0Var = (u8n0) obj;
        return this.f227984a == u8n0Var.f227984a && this.f227985b == u8n0Var.f227985b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f227985b) + (Boolean.hashCode(this.f227984a) * 31);
    }
}
