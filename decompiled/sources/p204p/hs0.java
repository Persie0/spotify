package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class hs0 {
    public static final gs0 Companion = new gs0();

    /* JADX INFO: renamed from: a */
    public final String f94571a;

    /* JADX INFO: renamed from: b */
    public final String f94572b;

    public /* synthetic */ hs0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, fs0.f72718a.getDescriptor());
            throw null;
        }
        this.f94571a = str;
        this.f94572b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs0)) {
            return false;
        }
        hs0 hs0Var = (hs0) obj;
        return wj50.m88271j(this.f94571a, hs0Var.f94571a) && wj50.m88271j(this.f94572b, hs0Var.f94572b);
    }

    public final int hashCode() {
        return this.f94572b.hashCode() + (this.f94571a.hashCode() * 31);
    }

    public hs0(String str, String str2) {
        this.f94571a = str;
        this.f94572b = str2;
    }
}
