package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ko01 {

    /* JADX INFO: renamed from: a */
    public final jo01 f124496a;

    /* JADX INFO: renamed from: b */
    public final String f124497b;

    public ko01(jo01 jo01Var, String str) {
        this.f124496a = jo01Var;
        this.f124497b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko01)) {
            return false;
        }
        ko01 ko01Var = (ko01) obj;
        return wj50.m88271j(this.f124496a, ko01Var.f124496a) && wj50.m88271j(this.f124497b, ko01Var.f124497b);
    }

    public final int hashCode() {
        int iHashCode = this.f124496a.hashCode() * 31;
        String str = this.f124497b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
