package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j820 extends k820 {

    /* JADX INFO: renamed from: a */
    public final int f109779a;

    public j820(int i) {
        this.f109779a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j820) && this.f109779a == ((j820) obj).f109779a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109779a);
    }
}
