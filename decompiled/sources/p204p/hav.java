package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hav implements iav {

    /* JADX INFO: renamed from: a */
    public final xz71 f89284a;

    public hav(xz71 xz71Var) {
        this.f89284a = xz71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hav) && this.f89284a == ((hav) obj).f89284a;
    }

    public final int hashCode() {
        return this.f89284a.hashCode();
    }
}
