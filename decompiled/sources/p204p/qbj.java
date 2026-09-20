package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qbj {

    /* JADX INFO: renamed from: a */
    public final int f187099a;

    public qbj(int i) {
        this.f187099a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbj) && this.f187099a == ((qbj) obj).f187099a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187099a);
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("ContainerInfo(layoutId="), this.f187099a, ')');
    }
}
