package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class r780 {
    public static final q780 Companion = new q780();

    /* JADX INFO: renamed from: a */
    public final String f196463a;

    /* JADX INFO: renamed from: b */
    public final String f196464b;

    public /* synthetic */ r780(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, p780.f174619a.getDescriptor());
            throw null;
        }
        this.f196463a = str;
        this.f196464b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r780)) {
            return false;
        }
        r780 r780Var = (r780) obj;
        return wj50.m88271j(this.f196463a, r780Var.f196463a) && wj50.m88271j(this.f196464b, r780Var.f196464b);
    }

    public final int hashCode() {
        return this.f196464b.hashCode() + (this.f196463a.hashCode() * 31);
    }
}
