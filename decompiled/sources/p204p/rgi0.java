package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rgi0 {

    /* JADX INFO: renamed from: a */
    public final String f198965a;

    /* JADX INFO: renamed from: b */
    public final int f198966b;

    public rgi0(String str, int i) {
        this.f198965a = str;
        this.f198966b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgi0)) {
            return false;
        }
        rgi0 rgi0Var = (rgi0) obj;
        return wj50.m88271j(this.f198965a, rgi0Var.f198965a) && this.f198966b == rgi0Var.f198966b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f198966b) + (this.f198965a.hashCode() * 31);
    }
}
