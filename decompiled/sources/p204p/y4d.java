package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final int f269123a;

    public y4d(int i) {
        this.f269123a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4d) && this.f269123a == ((y4d) obj).f269123a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f269123a);
    }
}
