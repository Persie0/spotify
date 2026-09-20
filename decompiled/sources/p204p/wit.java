package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wit implements vmt {

    /* JADX INFO: renamed from: a */
    public final float f251744a;

    public wit(float f) {
        this.f251744a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wit) && Float.compare(this.f251744a, ((wit) obj).f251744a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f251744a);
    }
}
