package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b410 implements d410 {

    /* JADX INFO: renamed from: a */
    public final long f23167a;

    /* JADX INFO: renamed from: b */
    public final boolean f23168b;

    public b410(long j, boolean z) {
        this.f23167a = j;
        this.f23168b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b410)) {
            return false;
        }
        b410 b410Var = (b410) obj;
        return this.f23167a == b410Var.f23167a && this.f23168b == b410Var.f23168b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23168b) + (Long.hashCode(this.f23167a) * 31);
    }
}
