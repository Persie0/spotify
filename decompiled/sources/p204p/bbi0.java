package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bbi0 implements dbi0 {

    /* JADX INFO: renamed from: a */
    public final int f25569a;

    public bbi0(int i) {
        this.f25569a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbi0) && this.f25569a == ((bbi0) obj).f25569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25569a);
    }
}
