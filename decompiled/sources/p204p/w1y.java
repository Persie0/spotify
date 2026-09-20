package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w1y {

    /* JADX INFO: renamed from: a */
    public final boolean f247196a;

    public w1y(boolean z) {
        this.f247196a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1y) && this.f247196a == ((w1y) obj).f247196a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247196a);
    }
}
