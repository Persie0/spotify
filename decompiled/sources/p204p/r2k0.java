package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r2k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final o3k0 f195165a;

    public r2k0(o3k0 o3k0Var) {
        this.f195165a = o3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2k0) && this.f195165a.equals(((r2k0) obj).f195165a);
    }

    public final int hashCode() {
        return Long.hashCode(1000L) + (this.f195165a.hashCode() * 31);
    }
}
