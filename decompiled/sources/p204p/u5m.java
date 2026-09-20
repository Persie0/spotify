package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u5m {

    /* JADX INFO: renamed from: a */
    public final boolean f227068a;

    public u5m(boolean z) {
        this.f227068a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5m) && this.f227068a == ((u5m) obj).f227068a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227068a);
    }
}
