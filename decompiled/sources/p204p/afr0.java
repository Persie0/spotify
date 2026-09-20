package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class afr0 implements dfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15202a;

    public afr0(boolean z) {
        this.f15202a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afr0) && this.f15202a == ((afr0) obj).f15202a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15202a);
    }
}
