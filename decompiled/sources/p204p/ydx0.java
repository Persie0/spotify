package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ydx0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final jex0 f271876a;

    /* JADX INFO: renamed from: b */
    public final String f271877b;

    public ydx0(jex0 jex0Var, String str) {
        this.f271876a = jex0Var;
        this.f271877b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydx0)) {
            return false;
        }
        ydx0 ydx0Var = (ydx0) obj;
        return this.f271876a.equals(ydx0Var.f271876a) && this.f271877b.equals(ydx0Var.f271877b);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f271877b;
    }

    public final int hashCode() {
        return s571.m77243b(this.f271876a.hashCode() * 31, 31, this.f271877b);
    }
}
