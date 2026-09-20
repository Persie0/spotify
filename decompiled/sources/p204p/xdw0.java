package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class xdw0 {
    public static final wdw0 Companion = new wdw0();

    /* JADX INFO: renamed from: a */
    public final String f260561a;

    /* JADX INFO: renamed from: b */
    public final String f260562b;

    /* JADX INFO: renamed from: c */
    public final String f260563c;

    public /* synthetic */ xdw0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, vdw0.f240520a.getDescriptor());
            throw null;
        }
        this.f260561a = str;
        this.f260562b = str2;
        this.f260563c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdw0)) {
            return false;
        }
        xdw0 xdw0Var = (xdw0) obj;
        return wj50.m88271j(this.f260561a, xdw0Var.f260561a) && wj50.m88271j(this.f260562b, xdw0Var.f260562b) && wj50.m88271j(this.f260563c, xdw0Var.f260563c);
    }

    public final int hashCode() {
        return this.f260563c.hashCode() + s571.m77243b(this.f260561a.hashCode() * 31, 31, this.f260562b);
    }
}
