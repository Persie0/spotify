package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class om70 implements ojb1 {

    /* JADX INFO: renamed from: a */
    public final hlb1 f166986a;

    /* JADX INFO: renamed from: b */
    public final String f166987b;

    public om70(hlb1 hlb1Var, String str) {
        this.f166986a = hlb1Var;
        this.f166987b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om70)) {
            return false;
        }
        om70 om70Var = (om70) obj;
        return this.f166986a.equals(om70Var.f166986a) && this.f166987b.equals(om70Var.f166987b);
    }

    public final int hashCode() {
        return this.f166987b.hashCode() + (this.f166986a.hashCode() * 31);
    }
}
