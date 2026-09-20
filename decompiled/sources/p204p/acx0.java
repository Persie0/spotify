package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class acx0 {

    /* JADX INFO: renamed from: a */
    public final int f14472a;

    public acx0(int i) {
        this.f14472a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acx0) && this.f14472a == ((acx0) obj).f14472a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.f14472a) * 31);
    }
}
