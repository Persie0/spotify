package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h08 extends z3l {

    /* JADX INFO: renamed from: a */
    public final String f86168a;

    /* JADX INFO: renamed from: b */
    public final String f86169b;

    public h08(String str, String str2) {
        this.f86168a = str;
        this.f86169b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z3l) {
            h08 h08Var = (h08) ((z3l) obj);
            if (this.f86168a.equals(h08Var.f86168a) && this.f86169b.equals(h08Var.f86169b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f86168a.hashCode() ^ 1000003) * 1000003) ^ this.f86169b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f86168a);
        sb.append(", variantId=");
        return dq60.m36616p(this.f86169b, "}", sb);
    }
}
