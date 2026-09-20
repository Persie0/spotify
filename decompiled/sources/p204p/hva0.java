package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hva0 {

    /* JADX INFO: renamed from: a */
    public final tyv f95638a;

    /* JADX INFO: renamed from: b */
    public final String f95639b;

    /* JADX INFO: renamed from: c */
    public final String f95640c;

    public hva0(tyv tyvVar, String str, String str2) {
        this.f95638a = tyvVar;
        this.f95639b = str;
        this.f95640c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hva0)) {
            return false;
        }
        hva0 hva0Var = (hva0) obj;
        return wj50.m88271j(this.f95638a, hva0Var.f95638a) && wj50.m88271j(this.f95639b, hva0Var.f95639b) && wj50.m88271j(this.f95640c, hva0Var.f95640c);
    }

    public final int hashCode() {
        return this.f95640c.hashCode() + s571.m77243b(this.f95638a.hashCode() * 31, 31, this.f95639b);
    }
}
