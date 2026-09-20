package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tcn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f219118c;

    public tcn0(float f) {
        super(3);
        this.f219118c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcn0) && Float.compare(this.f219118c, ((tcn0) obj).f219118c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f219118c);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("VerticalTo(y="), this.f219118c, ')');
    }
}
