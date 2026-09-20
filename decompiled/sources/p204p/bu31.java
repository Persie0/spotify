package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bu31 {

    /* JADX INFO: renamed from: a */
    public final qf40 f31008a;

    /* JADX INFO: renamed from: b */
    public final String f31009b;

    public bu31(String str, qf40 qf40Var) {
        this.f31008a = qf40Var;
        this.f31009b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu31)) {
            return false;
        }
        bu31 bu31Var = (bu31) obj;
        return wj50.m88271j(this.f31008a, bu31Var.f31008a) && wj50.m88271j(this.f31009b, bu31Var.f31009b);
    }

    public final int hashCode() {
        return this.f31009b.hashCode() + (this.f31008a.hashCode() * 31);
    }
}
