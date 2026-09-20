package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vdf implements zdf {

    /* JADX INFO: renamed from: a */
    public final Throwable f240403a;

    public vdf(Throwable th) {
        this.f240403a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdf) && wj50.m88271j(this.f240403a, ((vdf) obj).f240403a);
    }

    public final int hashCode() {
        return this.f240403a.hashCode();
    }
}
