package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class bi70 {
    public static final ai70 Companion = new ai70();

    /* JADX INFO: renamed from: a */
    public final String f27348a;

    /* JADX INFO: renamed from: b */
    public final fi70 f27349b;

    public /* synthetic */ bi70(int i, String str, fi70 fi70Var) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, zh70.f282823a.getDescriptor());
            throw null;
        }
        this.f27348a = str;
        this.f27349b = fi70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi70)) {
            return false;
        }
        bi70 bi70Var = (bi70) obj;
        return wj50.m88271j(this.f27348a, bi70Var.f27348a) && wj50.m88271j(this.f27349b, bi70Var.f27349b);
    }

    public final int hashCode() {
        return this.f27349b.f69800a.hashCode() + (this.f27348a.hashCode() * 31);
    }

    public bi70(fi70 fi70Var) {
        this.f27348a = "selected-language";
        this.f27349b = fi70Var;
    }
}
