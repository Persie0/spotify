package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tao0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final int f218644a;

    public tao0(int i) {
        this.f218644a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tao0) && this.f218644a == ((tao0) obj).f218644a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218644a);
    }
}
