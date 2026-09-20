package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t540 implements w540 {

    /* JADX INFO: renamed from: a */
    public final int f217209a;

    public t540(int i) {
        this.f217209a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t540) && this.f217209a == ((t540) obj).f217209a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217209a);
    }
}
