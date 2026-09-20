package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f8a1 implements j8a1 {

    /* JADX INFO: renamed from: a */
    public final int f66932a;

    /* JADX INFO: renamed from: b */
    public final String f66933b;

    public f8a1(int i, String str) {
        this.f66932a = i;
        this.f66933b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8a1)) {
            return false;
        }
        f8a1 f8a1Var = (f8a1) obj;
        return this.f66932a == f8a1Var.f66932a && wj50.m88271j(this.f66933b, f8a1Var.f66933b);
    }

    public final int hashCode() {
        return this.f66933b.hashCode() + (edb.m38547C(this.f66932a) * 31);
    }
}
