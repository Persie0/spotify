package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final int f86514a;

    public h141(int i) {
        this.f86514a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h141) && this.f86514a == ((h141) obj).f86514a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86514a);
    }
}
