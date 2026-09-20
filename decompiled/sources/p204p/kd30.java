package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final fd30 f121595a;

    public kd30(fd30 fd30Var) {
        this.f121595a = fd30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd30) && this.f121595a.equals(((kd30) obj).f121595a);
    }

    public final int hashCode() {
        return this.f121595a.hashCode();
    }
}
