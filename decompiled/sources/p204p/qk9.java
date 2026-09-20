package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class qk9 {
    public static final pk9 Companion = new pk9();

    /* JADX INFO: renamed from: a */
    public final String f189496a;

    public /* synthetic */ qk9(int i, String str) {
        if (1 == (i & 1)) {
            this.f189496a = str;
        } else {
            edo.m38617p(i, 1, ok9.f166303a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk9) && wj50.m88271j(this.f189496a, ((qk9) obj).f189496a);
    }

    public final int hashCode() {
        return this.f189496a.hashCode();
    }

    public qk9(String str) {
        this.f189496a = str;
    }
}
