package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u6o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f227393a;

    public u6o0(boolean z) {
        this.f227393a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6o0) && this.f227393a == ((u6o0) obj).f227393a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227393a);
    }
}
