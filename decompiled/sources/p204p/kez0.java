package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kez0 {

    /* JADX INFO: renamed from: a */
    public final long f121996a;

    /* JADX INFO: renamed from: b */
    public final long f121997b;

    public kez0(long j, long j2) {
        this.f121996a = j;
        this.f121997b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kez0)) {
            return false;
        }
        kez0 kez0Var = (kez0) obj;
        return this.f121996a == kez0Var.f121996a && this.f121997b == kez0Var.f121997b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f121997b) + (Long.hashCode(this.f121996a) * 31);
    }
}
