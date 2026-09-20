package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class si50 {

    /* JADX INFO: renamed from: a */
    public final ln40 f209359a;

    /* JADX INFO: renamed from: b */
    public final String f209360b;

    public si50(ln40 ln40Var, String str) {
        this.f209359a = ln40Var;
        this.f209360b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si50)) {
            return false;
        }
        si50 si50Var = (si50) obj;
        return wj50.m88271j(this.f209359a, si50Var.f209359a) && wj50.m88271j(this.f209360b, si50Var.f209360b);
    }

    public final int hashCode() {
        return this.f209360b.hashCode() + (this.f209359a.hashCode() * 31);
    }
}
