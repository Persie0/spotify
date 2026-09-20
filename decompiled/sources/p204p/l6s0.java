package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class l6s0 {
    public static final k6s0 Companion = new k6s0();

    /* JADX INFO: renamed from: a */
    public final String f130472a;

    /* JADX INFO: renamed from: b */
    public final String f130473b;

    public /* synthetic */ l6s0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, j6s0.f109397a.getDescriptor());
            throw null;
        }
        this.f130472a = str;
        this.f130473b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6s0)) {
            return false;
        }
        l6s0 l6s0Var = (l6s0) obj;
        return wj50.m88271j(this.f130472a, l6s0Var.f130472a) && wj50.m88271j(this.f130473b, l6s0Var.f130473b);
    }

    public final int hashCode() {
        return this.f130473b.hashCode() + (this.f130472a.hashCode() * 31);
    }
}
