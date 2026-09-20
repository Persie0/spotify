package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v9k0 extends y9k0 {

    /* JADX INFO: renamed from: a */
    public final float f238976a;

    public v9k0(float f) {
        this.f238976a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9k0) && Float.compare(this.f238976a, ((v9k0) obj).f238976a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f238976a);
    }
}
