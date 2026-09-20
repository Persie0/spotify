package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class avl {

    /* JADX INFO: renamed from: a */
    public final int f20209a;

    public avl(int i) {
        this.f20209a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avl) && this.f20209a == ((avl) obj).f20209a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20209a);
    }
}
