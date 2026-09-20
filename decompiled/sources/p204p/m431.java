package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m431 {

    /* JADX INFO: renamed from: a */
    public final Boolean f139803a;

    /* JADX INFO: renamed from: b */
    public final Boolean f139804b;

    public m431(Boolean bool, Boolean bool2) {
        this.f139803a = bool;
        this.f139804b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m431)) {
            return false;
        }
        m431 m431Var = (m431) obj;
        return wj50.m88271j(this.f139803a, m431Var.f139803a) && wj50.m88271j(this.f139804b, m431Var.f139804b);
    }

    public final int hashCode() {
        Boolean bool = this.f139803a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f139804b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
