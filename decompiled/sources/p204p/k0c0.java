package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k0c0 implements m0c0 {

    /* JADX INFO: renamed from: a */
    public final int f117965a;

    public k0c0(int i) {
        this.f117965a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0c0) && this.f117965a == ((k0c0) obj).f117965a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117965a);
    }
}
