package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class w8v {
    public static final v8v Companion = new v8v();

    /* JADX INFO: renamed from: a */
    public final String f249016a;

    public /* synthetic */ w8v(int i, String str) {
        if (1 == (i & 1)) {
            this.f249016a = str;
        } else {
            edo.m38617p(i, 1, u8v.f228019a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8v) && wj50.m88271j(this.f249016a, ((w8v) obj).f249016a);
    }

    public final int hashCode() {
        return this.f249016a.hashCode();
    }
}
