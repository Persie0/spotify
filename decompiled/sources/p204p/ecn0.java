package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ecn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f58361c;

    public ecn0(float f) {
        super(3);
        this.f58361c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecn0) && Float.compare(this.f58361c, ((ecn0) obj).f58361c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58361c);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("HorizontalTo(x="), this.f58361c, ')');
    }
}
