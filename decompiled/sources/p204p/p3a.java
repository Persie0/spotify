package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p3a {

    /* JADX INFO: renamed from: a */
    public final int f173594a;

    /* JADX INFO: renamed from: b */
    public final float f173595b;

    public p3a(int i, float f) {
        this.f173594a = i;
        this.f173595b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3a)) {
            return false;
        }
        p3a p3aVar = (p3a) obj;
        return this.f173594a == p3aVar.f173594a && Float.compare(this.f173595b, p3aVar.f173595b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f173595b) + (Integer.hashCode(this.f173594a) * 31);
    }
}
