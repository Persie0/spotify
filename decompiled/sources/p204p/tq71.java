package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tq71 extends wq71 {

    /* JADX INFO: renamed from: a */
    public final int f222748a;

    public tq71(int i) {
        this.f222748a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq71) && this.f222748a == ((tq71) obj).f222748a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222748a);
    }
}
