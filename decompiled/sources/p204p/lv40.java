package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lv40 implements mv40 {

    /* JADX INFO: renamed from: a */
    public final boolean f137219a;

    public lv40(boolean z) {
        this.f137219a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv40) && this.f137219a == ((lv40) obj).f137219a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137219a);
    }
}
