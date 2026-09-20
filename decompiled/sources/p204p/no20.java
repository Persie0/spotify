package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class no20 implements moa {

    /* JADX INFO: renamed from: a */
    public final String f156555a;

    /* JADX INFO: renamed from: b */
    public final ro20 f156556b;

    public no20(String str, ro20 ro20Var) {
        this.f156555a = str;
        this.f156556b = ro20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no20)) {
            return false;
        }
        no20 no20Var = (no20) obj;
        return wj50.m88271j(this.f156555a, no20Var.f156555a) && this.f156556b.equals(no20Var.f156556b);
    }

    @Override // p204p.moa
    public final String getId() {
        return this.f156555a;
    }

    public final int hashCode() {
        return this.f156556b.hashCode() + (this.f156555a.hashCode() * 961);
    }
}
