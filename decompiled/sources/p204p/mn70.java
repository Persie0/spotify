package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mn70 implements pjb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f145328a;

    /* JADX INFO: renamed from: b */
    public final String f145329b;

    /* JADX INFO: renamed from: c */
    public final String f145330c;

    public mn70(ilb1 ilb1Var, String str, String str2) {
        this.f145328a = ilb1Var;
        this.f145329b = str;
        this.f145330c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn70)) {
            return false;
        }
        mn70 mn70Var = (mn70) obj;
        return wj50.m88271j(this.f145328a, mn70Var.f145328a) && wj50.m88271j(this.f145329b, mn70Var.f145329b) && wj50.m88271j(this.f145330c, mn70Var.f145330c);
    }

    public final int hashCode() {
        int iHashCode = this.f145328a.hashCode() * 31;
        String str = this.f145329b;
        return this.f145330c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
