package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y03 implements a13 {

    /* JADX INFO: renamed from: a */
    public final int f267877a;

    public y03(int i) {
        this.f267877a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y03) && this.f267877a == ((y03) obj).f267877a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267877a);
    }
}
