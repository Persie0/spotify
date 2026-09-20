package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uzl0 implements gs20 {

    /* JADX INFO: renamed from: a */
    public final fs20 f235606a;

    /* JADX INFO: renamed from: b */
    public final fs20 f235607b;

    public uzl0(fs20 fs20Var, fs20 fs20Var2) {
        this.f235606a = fs20Var;
        this.f235607b = fs20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzl0)) {
            return false;
        }
        uzl0 uzl0Var = (uzl0) obj;
        return wj50.m88271j(this.f235606a, uzl0Var.f235606a) && wj50.m88271j(this.f235607b, uzl0Var.f235607b);
    }

    public final int hashCode() {
        return this.f235607b.hashCode() + (this.f235606a.hashCode() * 31);
    }
}
