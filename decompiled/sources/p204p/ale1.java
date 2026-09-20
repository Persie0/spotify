package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ale1 {

    /* JADX INFO: renamed from: a */
    public final int f16870a;

    public ale1(int i) {
        this.f16870a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ale1) && this.f16870a == ((ale1) obj).f16870a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16870a);
    }
}
