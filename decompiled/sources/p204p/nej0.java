package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nej0 {

    /* JADX INFO: renamed from: a */
    public final gmr0 f152999a;

    /* JADX INFO: renamed from: b */
    public final String f153000b;

    public nej0(gmr0 gmr0Var, String str) {
        this.f152999a = gmr0Var;
        this.f153000b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nej0)) {
            return false;
        }
        nej0 nej0Var = (nej0) obj;
        return wj50.m88271j(this.f152999a, nej0Var.f152999a) && wj50.m88271j(this.f153000b, nej0Var.f153000b);
    }

    public final int hashCode() {
        gmr0 gmr0Var = this.f152999a;
        return this.f153000b.hashCode() + ((gmr0Var == null ? 0 : gmr0Var.hashCode()) * 31);
    }
}
