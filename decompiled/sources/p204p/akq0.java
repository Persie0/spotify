package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class akq0 implements gkq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16625a;

    public akq0(boolean z) {
        this.f16625a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akq0) && this.f16625a == ((akq0) obj).f16625a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16625a);
    }
}
