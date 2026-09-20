package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class um90 {

    /* JADX INFO: renamed from: a */
    public final long f231780a;

    /* JADX INFO: renamed from: b */
    public final boolean f231781b;

    public /* synthetic */ um90() {
        this(0L, true);
    }

    /* JADX INFO: renamed from: a */
    public static um90 m83424a(um90 um90Var, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            j = um90Var.f231780a;
        }
        if ((i & 2) != 0) {
            z = um90Var.f231781b;
        }
        um90Var.getClass();
        return new um90(j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um90)) {
            return false;
        }
        um90 um90Var = (um90) obj;
        return this.f231780a == um90Var.f231780a && this.f231781b == um90Var.f231781b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231781b) + (Long.hashCode(this.f231780a) * 31);
    }

    public um90(long j, boolean z) {
        this.f231780a = j;
        this.f231781b = z;
    }
}
