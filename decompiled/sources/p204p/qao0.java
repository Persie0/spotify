package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qao0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final int f186909a;

    public qao0(int i) {
        this.f186909a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qao0) && this.f186909a == ((qao0) obj).f186909a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f186909a);
    }
}
