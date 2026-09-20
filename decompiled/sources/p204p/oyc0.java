package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oyc0 implements uyc0 {

    /* JADX INFO: renamed from: a */
    public final String f171727a;

    /* JADX INFO: renamed from: b */
    public final qf40 f171728b;

    public oyc0(String str, qf40 qf40Var) {
        this.f171727a = str;
        this.f171728b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyc0)) {
            return false;
        }
        oyc0 oyc0Var = (oyc0) obj;
        return wj50.m88271j(this.f171727a, oyc0Var.f171727a) && wj50.m88271j(this.f171728b, oyc0Var.f171728b);
    }

    public final int hashCode() {
        return this.f171728b.hashCode() + (this.f171727a.hashCode() * 31);
    }
}
