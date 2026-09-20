package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cc40 implements dc40 {

    /* JADX INFO: renamed from: a */
    public final t790 f36305a;

    public cc40(t790 t790Var) {
        this.f36305a = t790Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc40) && this.f36305a.equals(((cc40) obj).f36305a);
    }

    public final int hashCode() {
        return this.f36305a.hashCode();
    }
}
