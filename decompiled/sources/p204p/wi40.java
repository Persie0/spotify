package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wi40 extends phf1 {

    /* JADX INFO: renamed from: b */
    public final int f251494b;

    public wi40(int i) {
        this.f251494b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi40) && this.f251494b == ((wi40) obj).f251494b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251494b);
    }
}
