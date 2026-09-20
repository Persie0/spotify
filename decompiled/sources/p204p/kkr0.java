package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kkr0 {

    /* JADX INFO: renamed from: a */
    public final onc f123693a;

    public kkr0(onc oncVar) {
        this.f123693a = oncVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkr0) && this.f123693a.equals(((kkr0) obj).f123693a);
    }

    public final int hashCode() {
        return this.f123693a.hashCode();
    }
}
