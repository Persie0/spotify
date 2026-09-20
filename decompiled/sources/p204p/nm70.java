package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nm70 implements pjb1 {

    /* JADX INFO: renamed from: a */
    public final hlb1 f155314a;

    /* JADX INFO: renamed from: b */
    public final String f155315b;

    public nm70(hlb1 hlb1Var, String str) {
        this.f155314a = hlb1Var;
        this.f155315b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm70)) {
            return false;
        }
        nm70 nm70Var = (nm70) obj;
        return this.f155314a.equals(nm70Var.f155314a) && this.f155315b.equals(nm70Var.f155315b);
    }

    public final int hashCode() {
        return this.f155315b.hashCode() + (this.f155314a.hashCode() * 31);
    }
}
