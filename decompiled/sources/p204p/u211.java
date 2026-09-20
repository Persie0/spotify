package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final int f225957a;

    public u211(int i) {
        this.f225957a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u211) && this.f225957a == ((u211) obj).f225957a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f225957a);
    }
}
