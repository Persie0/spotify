package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ind1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f103955a;

    public ind1(Throwable th) {
        this.f103955a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ind1) && wj50.m88271j(this.f103955a, ((ind1) obj).f103955a);
    }

    public final int hashCode() {
        return this.f103955a.hashCode();
    }
}
