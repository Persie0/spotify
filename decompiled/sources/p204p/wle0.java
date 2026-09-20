package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wle0 implements zle0 {

    /* JADX INFO: renamed from: a */
    public final boolean f252532a;

    public wle0(boolean z) {
        this.f252532a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wle0) && this.f252532a == ((wle0) obj).f252532a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252532a);
    }
}
