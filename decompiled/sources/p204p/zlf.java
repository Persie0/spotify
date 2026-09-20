package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final int f283999a;

    public zlf(int i) {
        this.f283999a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlf) && this.f283999a == ((zlf) obj).f283999a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283999a);
    }
}
