package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b211 extends d211 {

    /* JADX INFO: renamed from: a */
    public final d211 f22469a;

    /* JADX INFO: renamed from: b */
    public final c211 f22470b;

    public b211(d211 d211Var, c211 c211Var) {
        this.f22469a = d211Var;
        this.f22470b = c211Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b211)) {
            return false;
        }
        b211 b211Var = (b211) obj;
        return this.f22469a.equals(b211Var.f22469a) && this.f22470b.equals(b211Var.f22470b);
    }

    public final int hashCode() {
        return this.f22470b.f33268a.hashCode() + (this.f22469a.hashCode() * 31);
    }
}
