package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fsl extends isl {

    /* JADX INFO: renamed from: a */
    public final int f72897a;

    public fsl(int i) {
        this.f72897a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsl) && this.f72897a == ((fsl) obj).f72897a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f72897a);
    }
}
