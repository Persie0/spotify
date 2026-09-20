package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class yz30 {
    public static final xz30 Companion = new xz30();

    /* JADX INFO: renamed from: a */
    public final String f277677a;

    public /* synthetic */ yz30(int i, String str) {
        if (1 == (i & 1)) {
            this.f277677a = str;
        } else {
            edo.m38617p(i, 1, wz30.f256458a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz30) && wj50.m88271j(this.f277677a, ((yz30) obj).f277677a);
    }

    public final int hashCode() {
        return this.f277677a.hashCode();
    }
}
