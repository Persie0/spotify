package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a7b implements c7b {

    /* JADX INFO: renamed from: a */
    public final Integer f13011a;

    /* JADX INFO: renamed from: b */
    public final String f13012b;

    /* JADX INFO: renamed from: c */
    public final pqm0 f13013c;

    /* JADX INFO: renamed from: d */
    public final Integer f13014d;

    public a7b(Integer num, String str, pqm0 pqm0Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        pqm0Var = (i & 4) != 0 ? null : pqm0Var;
        Integer num2 = (i & 8) != 0 ? null : 4;
        this.f13011a = num;
        this.f13012b = str;
        this.f13013c = pqm0Var;
        this.f13014d = num2;
        if (num == null && str == null) {
            throw new IllegalArgumentException("Either resourceId or resourceUri must be provided");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7b)) {
            return false;
        }
        a7b a7bVar = (a7b) obj;
        return wj50.m88271j(this.f13011a, a7bVar.f13011a) && wj50.m88271j(this.f13012b, a7bVar.f13012b) && wj50.m88271j(this.f13013c, a7bVar.f13013c) && wj50.m88271j(this.f13014d, a7bVar.f13014d);
    }

    public final int hashCode() {
        Integer num = this.f13011a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f13012b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        pqm0 pqm0Var = this.f13013c;
        int iHashCode3 = (iHashCode2 + (pqm0Var == null ? 0 : pqm0Var.hashCode())) * 31;
        Integer num2 = this.f13014d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }
}
