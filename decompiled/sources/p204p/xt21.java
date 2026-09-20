package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xt21 implements au21 {

    /* JADX INFO: renamed from: a */
    public final Throwable f265738a;

    public xt21(Throwable th) {
        this.f265738a = th;
    }

    @Override // p204p.au21
    public final String breadcrumb() {
        return ei6.m39073j("LayoutFailed: ", this.f265738a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt21) && wj50.m88271j(this.f265738a, ((xt21) obj).f265738a);
    }

    public final int hashCode() {
        return this.f265738a.hashCode();
    }
}
