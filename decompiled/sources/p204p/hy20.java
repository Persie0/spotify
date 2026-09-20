package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hy20 implements ky20 {

    /* JADX INFO: renamed from: a */
    public final Exception f96436a;

    public hy20(Exception exc) {
        this.f96436a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy20) && this.f96436a.equals(((hy20) obj).f96436a);
    }

    public final int hashCode() {
        return this.f96436a.hashCode();
    }
}
