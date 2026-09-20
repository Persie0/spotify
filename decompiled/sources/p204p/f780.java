package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class f780 {
    public static final e780 Companion = new e780();

    /* JADX INFO: renamed from: a */
    public final String f66590a;

    public /* synthetic */ f780(int i, String str) {
        if (1 == (i & 1)) {
            this.f66590a = str;
        } else {
            edo.m38617p(i, 1, d780.f46030a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f780) && wj50.m88271j(this.f66590a, ((f780) obj).f66590a);
    }

    public final int hashCode() {
        return this.f66590a.hashCode();
    }
}
