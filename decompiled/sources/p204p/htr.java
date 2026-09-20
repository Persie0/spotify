package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class htr implements jtr {

    /* JADX INFO: renamed from: a */
    public final Exception f95112a;

    public htr(Exception exc) {
        this.f95112a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htr) && wj50.m88271j(this.f95112a, ((htr) obj).f95112a);
    }

    public final int hashCode() {
        Exception exc = this.f95112a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }
}
