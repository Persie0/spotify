package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final int f227589a;

    public u7e(int i) {
        this.f227589a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7e) && this.f227589a == ((u7e) obj).f227589a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f227589a);
    }
}
