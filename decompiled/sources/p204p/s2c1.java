package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s2c1 implements b3c1 {

    /* JADX INFO: renamed from: a */
    public final Exception f204981a;

    public s2c1(Exception exc) {
        this.f204981a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2c1) && this.f204981a.equals(((s2c1) obj).f204981a);
    }

    public final int hashCode() {
        return this.f204981a.hashCode();
    }
}
