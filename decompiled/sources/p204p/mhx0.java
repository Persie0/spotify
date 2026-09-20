package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mhx0 implements phx0 {

    /* JADX INFO: renamed from: a */
    public final Exception f143886a;

    public mhx0(Exception exc) {
        this.f143886a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhx0) && this.f143886a.equals(((mhx0) obj).f143886a);
    }

    public final int hashCode() {
        return this.f143886a.hashCode();
    }
}
