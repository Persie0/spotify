package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fdy0 implements gdy0 {

    /* JADX INFO: renamed from: a */
    public final Exception f68617a;

    public fdy0(Exception exc) {
        this.f68617a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdy0) && wj50.m88271j(this.f68617a, ((fdy0) obj).f68617a);
    }

    public final int hashCode() {
        return this.f68617a.hashCode();
    }
}
