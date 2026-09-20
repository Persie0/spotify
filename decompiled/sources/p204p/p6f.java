package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p6f implements r6f {

    /* JADX INFO: renamed from: a */
    public final int f174355a;

    public p6f(int i) {
        this.f174355a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6f) && this.f174355a == ((p6f) obj).f174355a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174355a);
    }
}
