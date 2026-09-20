package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jyj implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f117424a;

    public jyj(int i) {
        this.f117424a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyj) && this.f117424a == ((jyj) obj).f117424a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f117424a);
    }
}
