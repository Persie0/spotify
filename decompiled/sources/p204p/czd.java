package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class czd {
    public static final bzd Companion = new bzd();

    /* JADX INFO: renamed from: a */
    public final String f43533a;

    public /* synthetic */ czd(int i, String str) {
        if (1 == (i & 1)) {
            this.f43533a = str;
        } else {
            edo.m38617p(i, 1, azd.f21481a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czd) && wj50.m88271j(this.f43533a, ((czd) obj).f43533a);
    }

    public final int hashCode() {
        return this.f43533a.hashCode();
    }
}
