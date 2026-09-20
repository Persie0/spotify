package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rg31 implements vg31 {

    /* JADX INFO: renamed from: a */
    public final String f198819a;

    /* JADX INFO: renamed from: b */
    public final String f198820b;

    public rg31(String str, String str2) {
        this.f198819a = str;
        this.f198820b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg31)) {
            return false;
        }
        rg31 rg31Var = (rg31) obj;
        return wj50.m88271j(this.f198819a, rg31Var.f198819a) && wj50.m88271j(this.f198820b, rg31Var.f198820b);
    }

    public final int hashCode() {
        return this.f198820b.hashCode() + (this.f198819a.hashCode() * 31);
    }
}
