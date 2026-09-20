package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fk91 implements hk91 {

    /* JADX INFO: renamed from: a */
    public final Exception f70511a;

    public fk91(Exception exc) {
        this.f70511a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk91) && this.f70511a.equals(((fk91) obj).f70511a);
    }

    public final int hashCode() {
        return this.f70511a.hashCode();
    }
}
