package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iel implements jel {

    /* JADX INFO: renamed from: a */
    public final int f101433a;

    public iel(int i) {
        this.f101433a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iel) && this.f101433a == ((iel) obj).f101433a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101433a);
    }
}
