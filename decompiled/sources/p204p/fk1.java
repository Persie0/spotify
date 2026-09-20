package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fk1 {

    /* JADX INFO: renamed from: a */
    public final String f70433a;

    /* JADX INFO: renamed from: b */
    public final Boolean f70434b;

    public fk1(String str, Boolean bool) {
        this.f70433a = str;
        this.f70434b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        return wj50.m88271j(this.f70433a, fk1Var.f70433a) && wj50.m88271j(this.f70434b, fk1Var.f70434b);
    }

    public final int hashCode() {
        String str = this.f70433a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f70434b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
