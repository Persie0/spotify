package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class hm9 {
    public static final fm9 Companion = new fm9();

    /* JADX INFO: renamed from: a */
    public final String f92861a;

    public /* synthetic */ hm9(int i, String str) {
        if (1 == (i & 1)) {
            this.f92861a = str;
        } else {
            edo.m38617p(i, 1, dm9.f50477a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm9) && wj50.m88271j(this.f92861a, ((hm9) obj).f92861a);
    }

    public final int hashCode() {
        return this.f92861a.hashCode();
    }

    public hm9(String str) {
        this.f92861a = str;
    }
}
