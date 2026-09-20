package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pf51 extends sf51 {

    /* JADX INFO: renamed from: a */
    public final int f176970a;

    public pf51(int i) {
        this.f176970a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf51) && this.f176970a == ((pf51) obj).f176970a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f176970a);
    }
}
