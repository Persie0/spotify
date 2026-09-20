package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class two0 {

    /* JADX INFO: renamed from: a */
    public final int f224459a;

    /* JADX INFO: renamed from: b */
    public final Object f224460b;

    public two0(int i, Object obj) {
        this.f224459a = i;
        this.f224460b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof two0)) {
            return false;
        }
        two0 two0Var = (two0) obj;
        return this.f224459a == two0Var.f224459a && wj50.m88271j(this.f224460b, two0Var.f224460b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f224459a) * 31;
        Object obj = this.f224460b;
        return iM38547C + (obj == null ? 0 : obj.hashCode());
    }
}
