package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a9z0 {

    /* JADX INFO: renamed from: a */
    public final String f13694a;

    /* JADX INFO: renamed from: b */
    public final int f13695b;

    public a9z0(String str, int i) {
        this.f13694a = str;
        this.f13695b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9z0)) {
            return false;
        }
        a9z0 a9z0Var = (a9z0) obj;
        return wj50.m88271j(this.f13694a, a9z0Var.f13694a) && this.f13695b == a9z0Var.f13695b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f13695b) + (this.f13694a.hashCode() * 31);
    }
}
