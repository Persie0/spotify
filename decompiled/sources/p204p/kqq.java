package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kqq extends lqq {

    /* JADX INFO: renamed from: a */
    public final int f125379a;

    public kqq(int i) {
        this.f125379a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqq) && this.f125379a == ((kqq) obj).f125379a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125379a);
    }
}
