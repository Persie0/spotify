package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f29604a;

    public bpt0(int i) {
        this.f29604a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpt0) && this.f29604a == ((bpt0) obj).f29604a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29604a);
    }
}
