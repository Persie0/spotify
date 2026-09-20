package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qpw0 implements tpw0 {

    /* JADX INFO: renamed from: a */
    public final Exception f191388a;

    public qpw0(Exception exc) {
        this.f191388a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpw0) && this.f191388a.equals(((qpw0) obj).f191388a);
    }

    public final int hashCode() {
        return this.f191388a.hashCode();
    }
}
