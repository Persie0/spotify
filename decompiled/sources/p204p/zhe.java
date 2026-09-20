package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zhe {

    /* JADX INFO: renamed from: a */
    public final int f282900a;

    public zhe(int i) {
        this.f282900a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhe) && this.f282900a == ((zhe) obj).f282900a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282900a);
    }
}
