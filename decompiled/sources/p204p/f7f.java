package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f7f implements a180 {

    /* JADX INFO: renamed from: a */
    public final int f66669a;

    public f7f(int i) {
        this.f66669a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7f) && this.f66669a == ((f7f) obj).f66669a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66669a);
    }
}
