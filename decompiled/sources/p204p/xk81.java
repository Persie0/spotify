package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xk81 {

    /* JADX INFO: renamed from: a */
    public final String f262308a;

    /* JADX INFO: renamed from: b */
    public final wl81 f262309b;

    /* JADX INFO: renamed from: c */
    public final String f262310c;

    /* JADX INFO: renamed from: d */
    public final String f262311d;

    public xk81(String str, wl81 wl81Var, String str2, String str3) {
        this.f262308a = str;
        this.f262309b = wl81Var;
        this.f262310c = str2;
        this.f262311d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk81)) {
            return false;
        }
        xk81 xk81Var = (xk81) obj;
        return wj50.m88271j(this.f262308a, xk81Var.f262308a) && wj50.m88271j(this.f262309b, xk81Var.f262309b) && wj50.m88271j(this.f262310c, xk81Var.f262310c) && wj50.m88271j(this.f262311d, xk81Var.f262311d);
    }

    public final int hashCode() {
        int iHashCode = this.f262308a.hashCode() * 31;
        this.f262309b.getClass();
        int iM77243b = s571.m77243b((iHashCode + 1396393329) * 31, 31, this.f262310c);
        String str = this.f262311d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
