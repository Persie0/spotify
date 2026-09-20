package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f41019a;

    public cqx0(int i) {
        this.f41019a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqx0) && this.f41019a == ((cqx0) obj).f41019a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41019a);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f41019a;
    }
}
