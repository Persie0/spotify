package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f82 {

    /* JADX INFO: renamed from: a */
    public final xam f66834a;

    /* JADX INFO: renamed from: b */
    public final Integer f66835b;

    /* JADX INFO: renamed from: c */
    public final b62 f66836c;

    /* JADX INFO: renamed from: d */
    public final tdu f66837d;

    public f82(xam xamVar, Integer num, b62 b62Var, tdu tduVar) {
        this.f66834a = xamVar;
        this.f66835b = num;
        this.f66836c = b62Var;
        this.f66837d = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f82)) {
            return false;
        }
        f82 f82Var = (f82) obj;
        return wj50.m88271j(this.f66834a, f82Var.f66834a) && wj50.m88271j(this.f66835b, f82Var.f66835b) && this.f66836c == f82Var.f66836c && wj50.m88271j(this.f66837d, f82Var.f66837d);
    }

    public final int hashCode() {
        int iHashCode = this.f66834a.hashCode() * 31;
        Integer num = this.f66835b;
        return this.f66837d.hashCode() + ((this.f66836c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }
}
