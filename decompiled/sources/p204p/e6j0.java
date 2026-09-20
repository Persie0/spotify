package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e6j0 extends h6j0 {

    /* JADX INFO: renamed from: a */
    public final int f56648a;

    /* JADX INFO: renamed from: b */
    public final b3j0 f56649b;

    public e6j0(int i, b3j0 b3j0Var) {
        this.f56648a = i;
        this.f56649b = b3j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6j0)) {
            return false;
        }
        e6j0 e6j0Var = (e6j0) obj;
        return this.f56648a == e6j0Var.f56648a && wj50.m88271j(this.f56649b, e6j0Var.f56649b);
    }

    public final int hashCode() {
        return this.f56649b.hashCode() + (edb.m38547C(this.f56648a) * 31);
    }
}
