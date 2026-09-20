package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ro10 implements vo10 {

    /* JADX INFO: renamed from: a */
    public final int f201038a;

    public ro10(int i) {
        this.f201038a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro10) && this.f201038a == ((ro10) obj).f201038a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201038a);
    }
}
