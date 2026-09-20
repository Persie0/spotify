package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hz10 {

    /* JADX INFO: renamed from: a */
    public final int f96763a;

    public hz10(int i) {
        this.f96763a = i;
        if (i > 0) {
            return;
        }
        pt40.m70891a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hz10) {
            return this.f96763a == ((hz10) obj).f96763a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f96763a;
    }
}
