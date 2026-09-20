package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final int f109926a;

    public j8e1(int i) {
        this.f109926a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8e1) && this.f109926a == ((j8e1) obj).f109926a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109926a);
    }
}
