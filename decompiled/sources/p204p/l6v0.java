package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l6v0 extends o6v0 {

    /* JADX INFO: renamed from: a */
    public final int f130485a;

    /* JADX INFO: renamed from: b */
    public final pxj f130486b;

    public l6v0(int i, pxj pxjVar) {
        this.f130485a = i;
        this.f130486b = pxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6v0)) {
            return false;
        }
        l6v0 l6v0Var = (l6v0) obj;
        return this.f130485a == l6v0Var.f130485a && this.f130486b == l6v0Var.f130486b;
    }

    public final int hashCode() {
        return this.f130486b.hashCode() + (Integer.hashCode(this.f130485a) * 31);
    }
}
