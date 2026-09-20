package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ipf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f104491a;

    /* JADX INFO: renamed from: b */
    public final hpf0 f104492b;

    /* JADX INFO: renamed from: c */
    public final String f104493c;

    /* JADX INFO: renamed from: d */
    public final String f104494d;

    public ipf0(b791 b791Var, hpf0 hpf0Var, String str, String str2) {
        this.f104491a = b791Var;
        this.f104492b = hpf0Var;
        this.f104493c = str;
        this.f104494d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipf0)) {
            return false;
        }
        ipf0 ipf0Var = (ipf0) obj;
        return wj50.m88271j(this.f104491a, ipf0Var.f104491a) && wj50.m88271j(this.f104492b, ipf0Var.f104492b) && wj50.m88271j(this.f104493c, ipf0Var.f104493c) && wj50.m88271j(this.f104494d, ipf0Var.f104494d);
    }

    public final int hashCode() {
        b791 b791Var = this.f104491a;
        int iHashCode = (this.f104492b.hashCode() + ((b791Var == null ? 0 : b791Var.hashCode()) * 31)) * 31;
        String str = this.f104493c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104494d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        b791 b791Var = this.f104491a;
        return "OnTransitionSaved(transition=" + (b791Var != null ? b791Var.m28367g() : null) + ", destination=" + this.f104492b + ")";
    }
}
