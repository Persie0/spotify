package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class knb implements nnb {

    /* JADX INFO: renamed from: a */
    public final Throwable f124372a;

    public knb(Throwable th) {
        this.f124372a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knb) && wj50.m88271j(this.f124372a, ((knb) obj).f124372a);
    }

    public final int hashCode() {
        return this.f124372a.hashCode();
    }
}
