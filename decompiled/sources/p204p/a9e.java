package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a9e implements c9e {

    /* JADX INFO: renamed from: a */
    public final Throwable f13557a;

    public a9e(Throwable th) {
        this.f13557a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9e) && wj50.m88271j(this.f13557a, ((a9e) obj).f13557a);
    }

    public final int hashCode() {
        return this.f13557a.hashCode();
    }
}
