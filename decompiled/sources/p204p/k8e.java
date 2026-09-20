package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k8e implements c9e {

    /* JADX INFO: renamed from: a */
    public final int f120311a;

    public k8e(int i) {
        this.f120311a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8e) && this.f120311a == ((k8e) obj).f120311a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f120311a);
    }
}
