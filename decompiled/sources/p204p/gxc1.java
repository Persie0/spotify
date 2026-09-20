package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final int f85257a;

    public gxc1(int i) {
        this.f85257a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxc1) && this.f85257a == ((gxc1) obj).f85257a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f85257a);
    }
}
