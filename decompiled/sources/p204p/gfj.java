package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gfj {

    /* JADX INFO: renamed from: a */
    public final String f79364a;

    /* JADX INFO: renamed from: b */
    public final String f79365b;

    /* JADX INFO: renamed from: c */
    public final ro3 f79366c;

    public gfj(String str, String str2, ro3 ro3Var) {
        this.f79364a = str;
        this.f79365b = str2;
        this.f79366c = ro3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfj)) {
            return false;
        }
        gfj gfjVar = (gfj) obj;
        return wj50.m88271j(this.f79364a, gfjVar.f79364a) && wj50.m88271j(this.f79365b, gfjVar.f79365b) && wj50.m88271j(this.f79366c, gfjVar.f79366c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f79364a.hashCode() * 31, 31, this.f79365b);
        ro3 ro3Var = this.f79366c;
        return iM77243b + (ro3Var == null ? 0 : ro3Var.hashCode());
    }
}
