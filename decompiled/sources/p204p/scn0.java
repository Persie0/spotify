package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class scn0 extends ucn0 {

    /* JADX INFO: renamed from: c */
    public final float f207771c;

    public scn0(float f) {
        super(3);
        this.f207771c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scn0) && Float.compare(this.f207771c, ((scn0) obj).f207771c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f207771c);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("RelativeVerticalTo(dy="), this.f207771c, ')');
    }
}
