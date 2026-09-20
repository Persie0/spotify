package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yx20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final Exception f277116a;

    public yx20(Exception exc) {
        this.f277116a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx20) && this.f277116a.equals(((yx20) obj).f277116a);
    }

    public final int hashCode() {
        return this.f277116a.hashCode();
    }
}
