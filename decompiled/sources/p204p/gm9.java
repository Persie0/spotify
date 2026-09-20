package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class gm9 {
    public static final em9 Companion = new em9();

    /* JADX INFO: renamed from: a */
    public final String f81333a;

    public /* synthetic */ gm9(int i, String str) {
        if (1 == (i & 1)) {
            this.f81333a = str;
        } else {
            edo.m38617p(i, 1, cm9.f39615a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm9) && wj50.m88271j(this.f81333a, ((gm9) obj).f81333a);
    }

    public final int hashCode() {
        return this.f81333a.hashCode();
    }

    public gm9(String str) {
        this.f81333a = str;
    }
}
