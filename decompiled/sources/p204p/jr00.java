package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jr00 {

    /* JADX INFO: renamed from: a */
    public final String f115046a;

    /* JADX INFO: renamed from: b */
    public final boolean f115047b;

    public jr00(String str, boolean z) {
        this.f115046a = str;
        this.f115047b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr00)) {
            return false;
        }
        jr00 jr00Var = (jr00) obj;
        return wj50.m88271j(this.f115046a, jr00Var.f115046a) && this.f115047b == jr00Var.f115047b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f115046a.hashCode() * 31;
        boolean z = this.f115047b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.f115046a);
        sb.append(", value=");
        return s571.m77253l(sb, this.f115047b, ')');
    }
}
