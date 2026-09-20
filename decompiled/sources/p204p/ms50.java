package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ms50 {

    /* JADX INFO: renamed from: a */
    public final Boolean f146700a;

    /* JADX INFO: renamed from: b */
    public final Boolean f146701b;

    /* JADX INFO: renamed from: c */
    public final boolean f146702c;

    public ms50(Boolean bool, boolean z, int i) {
        Boolean bool2 = (i & 1) != 0 ? null : Boolean.FALSE;
        bool = (i & 2) != 0 ? null : bool;
        z = (i & 4) != 0 ? false : z;
        this.f146700a = bool2;
        this.f146701b = bool;
        this.f146702c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms50)) {
            return false;
        }
        ms50 ms50Var = (ms50) obj;
        return wj50.m88271j(this.f146700a, ms50Var.f146700a) && wj50.m88271j(this.f146701b, ms50Var.f146701b) && this.f146702c == ms50Var.f146702c;
    }

    public final int hashCode() {
        Boolean bool = this.f146700a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f146701b;
        return Boolean.hashCode(this.f146702c) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
