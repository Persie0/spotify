package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cs6 implements is6 {

    /* JADX INFO: renamed from: a */
    public final Exception f41479a;

    public cs6(Exception exc) {
        this.f41479a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs6) && this.f41479a.equals(((cs6) obj).f41479a);
    }

    public final int hashCode() {
        return this.f41479a.hashCode();
    }
}
