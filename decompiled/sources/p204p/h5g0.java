package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h5g0 {

    /* JADX INFO: renamed from: a */
    public final Double f87835a;

    /* JADX INFO: renamed from: b */
    public final String f87836b;

    public h5g0(Double d, String str) {
        this.f87835a = d;
        this.f87836b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5g0)) {
            return false;
        }
        h5g0 h5g0Var = (h5g0) obj;
        return wj50.m88271j(this.f87835a, h5g0Var.f87835a) && wj50.m88271j(this.f87836b, h5g0Var.f87836b);
    }

    public final int hashCode() {
        Double d = this.f87835a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f87836b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
