package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bw01 extends dw01 {

    /* JADX INFO: renamed from: a */
    public final int f31492a;

    public bw01(int i) {
        this.f31492a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw01) && this.f31492a == ((bw01) obj).f31492a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31492a);
    }
}
