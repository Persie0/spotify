package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class njr implements tjr {

    /* JADX INFO: renamed from: a */
    public final int f154650a;

    public /* synthetic */ njr(int i) {
        this.f154650a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof njr) {
            return this.f154650a == ((njr) obj).f154650a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154650a);
    }

    public final String toString() {
        return dq60.m36613m("Pixels(px=", this.f154650a, ')');
    }
}
