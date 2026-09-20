package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final hvo0 f151540a;

    public n8i(hvo0 hvo0Var) {
        this.f151540a = hvo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8i) && wj50.m88271j(this.f151540a, ((n8i) obj).f151540a);
    }

    public final int hashCode() {
        return this.f151540a.hashCode();
    }
}
