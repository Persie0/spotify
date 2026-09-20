package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o441 implements q441 {

    /* JADX INFO: renamed from: a */
    public final int f161550a;

    public o441(int i) {
        this.f161550a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o441) && this.f161550a == ((o441) obj).f161550a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161550a);
    }
}
