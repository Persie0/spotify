package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b1t implements f1t {

    /* JADX INFO: renamed from: a */
    public final int f22403a;

    public b1t(int i) {
        this.f22403a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1t) && this.f22403a == ((b1t) obj).f22403a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f22403a);
    }
}
