package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final boolean f261239a;

    public xg8(boolean z) {
        this.f261239a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg8) && this.f261239a == ((xg8) obj).f261239a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261239a);
    }
}
