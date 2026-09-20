package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nw51 extends pw51 {

    /* JADX INFO: renamed from: a */
    public final String f159027a;

    /* JADX INFO: renamed from: b */
    public final String f159028b;

    public nw51(String str, String str2) {
        this.f159027a = str;
        this.f159028b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw51)) {
            return false;
        }
        nw51 nw51Var = (nw51) obj;
        return wj50.m88271j(this.f159027a, nw51Var.f159027a) && wj50.m88271j(this.f159028b, nw51Var.f159028b);
    }

    public final int hashCode() {
        return this.f159028b.hashCode() + (this.f159027a.hashCode() * 31);
    }
}
