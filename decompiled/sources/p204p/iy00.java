package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iy00 extends ly00 {

    /* JADX INFO: renamed from: a */
    public final Exception f106814a;

    public iy00(Exception exc) {
        this.f106814a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy00) && this.f106814a.equals(((iy00) obj).f106814a);
    }

    public final int hashCode() {
        return this.f106814a.hashCode();
    }
}
