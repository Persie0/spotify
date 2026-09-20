package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ns71 implements rs71 {

    /* JADX INFO: renamed from: a */
    public final float f157713a;

    public ns71(float f) {
        this.f157713a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns71) && Float.compare(this.f157713a, ((ns71) obj).f157713a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157713a);
    }
}
