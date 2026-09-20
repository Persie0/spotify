package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l5f {

    /* JADX INFO: renamed from: a */
    public final float f129887a;

    /* JADX INFO: renamed from: b */
    public final float f129888b;

    public l5f(float f, float f2) {
        this.f129887a = f;
        this.f129888b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5f)) {
            return false;
        }
        l5f l5fVar = (l5f) obj;
        return Float.compare(this.f129887a, l5fVar.f129887a) == 0 && Float.compare(this.f129888b, l5fVar.f129888b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f129888b) + (Float.hashCode(this.f129887a) * 31);
    }
}
