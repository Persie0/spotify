package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lzd1 {

    /* JADX INFO: renamed from: a */
    public final Object f138351a;

    /* JADX INFO: renamed from: b */
    public final boolean f138352b;

    public lzd1(Object obj, boolean z) {
        this.f138351a = obj;
        this.f138352b = z;
    }

    /* JADX INFO: renamed from: a */
    public static lzd1 m60300a(lzd1 lzd1Var, klk0 klk0Var, boolean z, int i) {
        Object obj = klk0Var;
        if ((i & 1) != 0) {
            obj = lzd1Var.f138351a;
        }
        if ((i & 2) != 0) {
            z = lzd1Var.f138352b;
        }
        lzd1Var.getClass();
        return new lzd1(obj, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd1)) {
            return false;
        }
        lzd1 lzd1Var = (lzd1) obj;
        return wj50.m88271j(this.f138351a, lzd1Var.f138351a) && this.f138352b == lzd1Var.f138352b;
    }

    public final int hashCode() {
        Object obj = this.f138351a;
        return Boolean.hashCode(this.f138352b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithMigrationStatus(qualifier=");
        sb.append(this.f138351a);
        sb.append(", isForWarningOnly=");
        return s571.m77253l(sb, this.f138352b, ')');
    }
}
