package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ne8 implements re8 {

    /* JADX INFO: renamed from: a */
    public final int f152955a;

    public ne8(int i) {
        this.f152955a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne8) && this.f152955a == ((ne8) obj).f152955a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152955a);
    }
}
