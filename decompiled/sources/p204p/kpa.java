package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kpa {

    /* JADX INFO: renamed from: a */
    public final int f125014a;

    /* JADX INFO: renamed from: b */
    public final int f125015b;

    public kpa(int i, int i2) {
        this.f125014a = i;
        this.f125015b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpa)) {
            return false;
        }
        kpa kpaVar = (kpa) obj;
        return this.f125014a == kpaVar.f125014a && this.f125015b == kpaVar.f125015b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125015b) + (Integer.hashCode(this.f125014a) * 31);
    }
}
