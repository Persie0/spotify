package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jiv implements miv {

    /* JADX INFO: renamed from: a */
    public final int f112827a;

    public jiv(int i) {
        this.f112827a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jiv) && this.f112827a == ((jiv) obj).f112827a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f112827a);
    }
}
