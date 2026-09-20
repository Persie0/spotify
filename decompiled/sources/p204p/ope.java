package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ope extends rpe {

    /* JADX INFO: renamed from: a */
    public final int f167886a;

    public ope(int i) {
        this.f167886a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ope) && this.f167886a == ((ope) obj).f167886a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167886a);
    }
}
