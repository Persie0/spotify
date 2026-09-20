package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class irq {
    public static final hrq Companion = new hrq();

    /* JADX INFO: renamed from: a */
    public final q14 f105039a;

    public /* synthetic */ irq(int i, q14 q14Var) {
        if (1 == (i & 1)) {
            this.f105039a = q14Var;
        } else {
            edo.m38617p(i, 1, grq.f83816a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irq) && wj50.m88271j(this.f105039a, ((irq) obj).f105039a);
    }

    public final int hashCode() {
        return this.f105039a.hashCode();
    }
}
