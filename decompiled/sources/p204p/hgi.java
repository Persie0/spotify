package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hgi {

    /* JADX INFO: renamed from: a */
    public final String f91166a;

    /* JADX INFO: renamed from: b */
    public final un20 f91167b;

    /* JADX INFO: renamed from: c */
    public final qf40 f91168c;

    public hgi(String str, un20 un20Var, qf40 qf40Var) {
        this.f91166a = str;
        this.f91167b = un20Var;
        this.f91168c = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final un20 m47447a() {
        return this.f91167b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgi)) {
            return false;
        }
        hgi hgiVar = (hgi) obj;
        return wj50.m88271j(this.f91166a, hgiVar.f91166a) && wj50.m88271j(this.f91167b, hgiVar.f91167b) && wj50.m88271j(this.f91168c, hgiVar.f91168c);
    }

    public final int hashCode() {
        int iHashCode = this.f91166a.hashCode() * 31;
        un20 un20Var = this.f91167b;
        return this.f91168c.hashCode() + ((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
