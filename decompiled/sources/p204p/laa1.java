package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class laa1 {

    /* JADX INFO: renamed from: a */
    public final xam f131321a;

    /* JADX INFO: renamed from: b */
    public final String f131322b;

    /* JADX INFO: renamed from: c */
    public final tdu f131323c;

    public laa1(xam xamVar, String str, tdu tduVar) {
        this.f131321a = xamVar;
        this.f131322b = str;
        this.f131323c = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laa1)) {
            return false;
        }
        laa1 laa1Var = (laa1) obj;
        return wj50.m88271j(this.f131321a, laa1Var.f131321a) && wj50.m88271j(this.f131322b, laa1Var.f131322b) && wj50.m88271j(this.f131323c, laa1Var.f131323c);
    }

    public final int hashCode() {
        int iHashCode = this.f131321a.hashCode() * 31;
        String str = this.f131322b;
        return this.f131323c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
