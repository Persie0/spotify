package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gt21 implements jt21 {

    /* JADX INFO: renamed from: a */
    public final Throwable f84079a;

    public gt21(Throwable th) {
        this.f84079a = th;
    }

    @Override // p204p.jt21
    public final String breadcrumb() {
        return "Failed(error=" + this.f84079a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt21) && wj50.m88271j(this.f84079a, ((gt21) obj).f84079a);
    }

    public final int hashCode() {
        return this.f84079a.hashCode();
    }
}
