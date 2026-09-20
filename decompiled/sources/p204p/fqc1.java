package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fqc1 implements pmb1 {

    /* JADX INFO: renamed from: a */
    public final int f72149a;

    public fqc1(int i) {
        this.f72149a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqc1) && this.f72149a == ((fqc1) obj).f72149a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72149a);
    }
}
