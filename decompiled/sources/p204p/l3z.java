package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l3z extends n3z {

    /* JADX INFO: renamed from: a */
    public final int f129461a;

    public l3z(int i) {
        this.f129461a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3z) && this.f129461a == ((l3z) obj).f129461a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f129461a);
    }
}
