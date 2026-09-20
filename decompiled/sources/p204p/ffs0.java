package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ffs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f69083a;

    /* JADX INFO: renamed from: b */
    public final String f69084b;

    public ffs0(String str, String str2) {
        this.f69083a = str;
        this.f69084b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffs0)) {
            return false;
        }
        ffs0 ffs0Var = (ffs0) obj;
        return wj50.m88271j(this.f69083a, ffs0Var.f69083a) && wj50.m88271j(this.f69084b, ffs0Var.f69084b);
    }

    public final int hashCode() {
        return this.f69084b.hashCode() + (this.f69083a.hashCode() * 31);
    }
}
