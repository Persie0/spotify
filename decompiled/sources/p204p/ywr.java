package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ywr {

    /* JADX INFO: renamed from: a */
    public final int f277030a;

    public ywr(int i) {
        this.f277030a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywr) && this.f277030a == ((ywr) obj).f277030a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f277030a) + mt60.m62800g(0, Integer.hashCode(50) * 31, 31);
    }
}
