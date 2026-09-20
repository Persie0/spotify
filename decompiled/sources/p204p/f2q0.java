package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f2q0 extends h2q0 {

    /* JADX INFO: renamed from: a */
    public final String f65253a;

    /* JADX INFO: renamed from: b */
    public final String f65254b;

    /* JADX INFO: renamed from: c */
    public final z650 f65255c;

    /* JADX INFO: renamed from: d */
    public final fqo0 f65256d;

    public f2q0(String str, String str2, z650 z650Var, fqo0 fqo0Var) {
        this.f65253a = str;
        this.f65254b = str2;
        this.f65255c = z650Var;
        this.f65256d = fqo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2q0)) {
            return false;
        }
        f2q0 f2q0Var = (f2q0) obj;
        return wj50.m88271j(this.f65253a, f2q0Var.f65253a) && wj50.m88271j(this.f65254b, f2q0Var.f65254b) && wj50.m88271j(this.f65255c, f2q0Var.f65255c) && wj50.m88271j(this.f65256d, f2q0Var.f65256d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f65253a.hashCode() * 31, 31, this.f65254b);
        z650 z650Var = this.f65255c;
        return this.f65256d.hashCode() + ((iM77243b + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31);
    }
}
