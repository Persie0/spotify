package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final f1f f216258a;

    /* JADX INFO: renamed from: b */
    public final z650 f216259b;

    public t1f(f1f f1fVar, z650 z650Var) {
        this.f216258a = f1fVar;
        this.f216259b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1f)) {
            return false;
        }
        t1f t1fVar = (t1f) obj;
        return wj50.m88271j(this.f216258a, t1fVar.f216258a) && wj50.m88271j(this.f216259b, t1fVar.f216259b);
    }

    public final int hashCode() {
        return this.f216259b.f279709a.hashCode() + (this.f216258a.hashCode() * 31);
    }
}
