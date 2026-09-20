package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final int f195947a;

    public r530(int i) {
        this.f195947a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r530) && this.f195947a == ((r530) obj).f195947a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f195947a);
    }
}
