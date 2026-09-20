package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kv1 {

    /* JADX INFO: renamed from: a */
    public final String f126752a;

    /* JADX INFO: renamed from: b */
    public final qf40 f126753b;

    public kv1(String str, qf40 qf40Var) {
        this.f126752a = str;
        this.f126753b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        return wj50.m88271j(this.f126752a, kv1Var.f126752a) && wj50.m88271j(this.f126753b, kv1Var.f126753b);
    }

    public final int hashCode() {
        return this.f126753b.hashCode() + (this.f126752a.hashCode() * 31);
    }
}
