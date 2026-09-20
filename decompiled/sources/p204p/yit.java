package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yit implements vmt {

    /* JADX INFO: renamed from: a */
    public final float f273199a;

    public yit(float f) {
        this.f273199a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yit) && Float.compare(this.f273199a, ((yit) obj).f273199a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f273199a);
    }
}
