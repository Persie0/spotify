package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uk70 implements al70 {

    /* JADX INFO: renamed from: a */
    public final String f231251a;

    /* JADX INFO: renamed from: b */
    public final String f231252b;

    public uk70(String str, String str2) {
        this.f231251a = str;
        this.f231252b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk70)) {
            return false;
        }
        uk70 uk70Var = (uk70) obj;
        return wj50.m88271j(this.f231251a, uk70Var.f231251a) && wj50.m88271j(this.f231252b, uk70Var.f231252b);
    }

    public final int hashCode() {
        int iHashCode = this.f231251a.hashCode() * 31;
        String str = this.f231252b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
