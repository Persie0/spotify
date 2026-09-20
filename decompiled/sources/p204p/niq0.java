package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class niq0 {

    /* JADX INFO: renamed from: a */
    public final String f154310a;

    /* JADX INFO: renamed from: b */
    public final String f154311b;

    public niq0(String str, String str2) {
        this.f154310a = str;
        this.f154311b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niq0)) {
            return false;
        }
        niq0 niq0Var = (niq0) obj;
        return wj50.m88271j(this.f154310a, niq0Var.f154310a) && wj50.m88271j(this.f154311b, niq0Var.f154311b);
    }

    public final int hashCode() {
        return this.f154311b.hashCode() + (this.f154310a.hashCode() * 31);
    }
}
