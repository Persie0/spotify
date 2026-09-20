package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mxc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final sg5 f148024a;

    public mxc1(sg5 sg5Var) {
        this.f148024a = sg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxc1) && this.f148024a == ((mxc1) obj).f148024a;
    }

    public final int hashCode() {
        return this.f148024a.hashCode();
    }
}
