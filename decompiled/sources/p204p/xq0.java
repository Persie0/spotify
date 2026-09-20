package p204p;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class xq0 {
    public static final wq0 Companion = new wq0();

    /* JADX INFO: renamed from: a */
    public final uq0 f264789a;

    public /* synthetic */ xq0(int i, uq0 uq0Var) {
        if (1 == (i & 1)) {
            this.f264789a = uq0Var;
        } else {
            edo.m38617p(i, 1, vq0.f243819a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq0) && wj50.m88271j(this.f264789a, ((xq0) obj).f264789a);
    }

    public final int hashCode() {
        return this.f264789a.hashCode();
    }
}
