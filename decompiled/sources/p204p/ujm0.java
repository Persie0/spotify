package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ujm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final int f231068a;

    public ujm0(int i) {
        this.f231068a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujm0) && this.f231068a == ((ujm0) obj).f231068a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f231068a);
    }
}
