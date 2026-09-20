package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t90 implements u90 {

    /* JADX INFO: renamed from: a */
    public final c3e1 f218164a;

    public t90(c3e1 c3e1Var) {
        this.f218164a = c3e1Var;
    }

    @Override // p204p.u90
    /* JADX INFO: renamed from: a */
    public final c3e1 mo77540a() {
        return this.f218164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t90) && wj50.m88271j(this.f218164a, ((t90) obj).f218164a);
    }

    public final int hashCode() {
        return this.f218164a.hashCode();
    }
}
