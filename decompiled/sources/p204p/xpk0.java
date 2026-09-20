package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class xpk0 {
    public static final wpk0 Companion = new wpk0();

    /* JADX INFO: renamed from: a */
    public final String f264678a;

    /* JADX INFO: renamed from: b */
    public final String f264679b;

    /* JADX INFO: renamed from: c */
    public final String f264680c;

    public /* synthetic */ xpk0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, vpk0.f243721a.getDescriptor());
            throw null;
        }
        this.f264678a = str;
        this.f264679b = str2;
        this.f264680c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpk0)) {
            return false;
        }
        xpk0 xpk0Var = (xpk0) obj;
        return wj50.m88271j(this.f264678a, xpk0Var.f264678a) && wj50.m88271j(this.f264679b, xpk0Var.f264679b) && wj50.m88271j(this.f264680c, xpk0Var.f264680c);
    }

    public final int hashCode() {
        return this.f264680c.hashCode() + s571.m77243b(this.f264678a.hashCode() * 31, 31, this.f264679b);
    }

    public xpk0(String str, String str2, String str3) {
        this.f264678a = str;
        this.f264679b = str2;
        this.f264680c = str3;
    }
}
