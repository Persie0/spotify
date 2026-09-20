package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hln0 implements dmb1 {

    /* JADX INFO: renamed from: a */
    public final int f92712a;

    public hln0(int i) {
        this.f92712a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hln0) && this.f92712a == ((hln0) obj).f92712a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92712a);
    }
}
