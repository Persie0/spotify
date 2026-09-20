package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x291 {

    /* JADX INFO: renamed from: a */
    public final String f257399a;

    /* JADX INFO: renamed from: b */
    public final int f257400b;

    public x291(String str, int i) {
        this.f257399a = str;
        this.f257400b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x291)) {
            return false;
        }
        x291 x291Var = (x291) obj;
        return wj50.m88271j(this.f257399a, x291Var.f257399a) && this.f257400b == x291Var.f257400b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f257400b) + f710.m40938f(1, this.f257399a.hashCode() * 31, 31);
    }
}
