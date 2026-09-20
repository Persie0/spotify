package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sp00 implements tp00 {

    /* JADX INFO: renamed from: a */
    public final int f212704a;

    public sp00(int i) {
        this.f212704a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp00) && this.f212704a == ((sp00) obj).f212704a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212704a);
    }
}
