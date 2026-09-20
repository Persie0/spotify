package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jfc0 implements kfc0 {

    /* JADX INFO: renamed from: a */
    public final int f111876a;

    public jfc0(int i) {
        this.f111876a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfc0) && this.f111876a == ((jfc0) obj).f111876a;
    }

    @Override // p204p.kfc0
    public final int getCount() {
        return this.f111876a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111876a);
    }
}
