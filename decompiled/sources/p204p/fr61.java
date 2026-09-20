package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fr61 extends hpg1 {

    /* JADX INFO: renamed from: c */
    public final int f72381c;

    public fr61(int i) {
        this.f72381c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr61) && this.f72381c == ((fr61) obj).f72381c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72381c);
    }
}
