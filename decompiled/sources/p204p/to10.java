package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class to10 implements vo10 {

    /* JADX INFO: renamed from: a */
    public final int f222132a;

    public to10(int i) {
        this.f222132a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to10) && this.f222132a == ((to10) obj).f222132a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222132a);
    }
}
