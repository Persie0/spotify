package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class shf extends uhf {

    /* JADX INFO: renamed from: b */
    public final int f209197b;

    public shf(int i) {
        super(khf.f122645i);
        this.f209197b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof shf) && this.f209197b == ((shf) obj).f209197b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f209197b);
    }
}
