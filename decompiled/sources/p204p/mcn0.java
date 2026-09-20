package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f142209c;

    public mcn0(float f) {
        super(3);
        this.f142209c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcn0) && Float.compare(this.f142209c, ((mcn0) obj).f142209c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f142209c);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("RelativeHorizontalTo(dx="), this.f142209c, ')');
    }
}
