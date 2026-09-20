package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fuy {

    /* JADX INFO: renamed from: a */
    public final Double f73601a;

    /* JADX INFO: renamed from: b */
    public final Double f73602b;

    /* JADX INFO: renamed from: c */
    public final Double f73603c;

    public fuy(Double d, Double d2, Double d3) {
        this.f73601a = d;
        this.f73602b = d2;
        this.f73603c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuy)) {
            return false;
        }
        fuy fuyVar = (fuy) obj;
        return wj50.m88271j(this.f73601a, fuyVar.f73601a) && wj50.m88271j(this.f73602b, fuyVar.f73602b) && wj50.m88271j(this.f73603c, fuyVar.f73603c);
    }

    public final int hashCode() {
        Double d = this.f73601a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f73602b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f73603c;
        return iHashCode2 + (d3 != null ? d3.hashCode() : 0);
    }
}
