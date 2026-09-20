package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z8d implements lad {

    /* JADX INFO: renamed from: a */
    public final int f280446a;

    public z8d(int i) {
        this.f280446a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8d) && this.f280446a == ((z8d) obj).f280446a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f280446a);
    }
}
