package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cpu0 implements epu0 {

    /* JADX INFO: renamed from: a */
    public final String f40646a;

    /* JADX INFO: renamed from: b */
    public final String f40647b;

    /* JADX INFO: renamed from: c */
    public final String f40648c;

    public cpu0(String str, String str2, String str3) {
        this.f40646a = str;
        this.f40647b = str2;
        this.f40648c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpu0)) {
            return false;
        }
        cpu0 cpu0Var = (cpu0) obj;
        return wj50.m88271j(this.f40646a, cpu0Var.f40646a) && wj50.m88271j(this.f40647b, cpu0Var.f40647b) && wj50.m88271j(this.f40648c, cpu0Var.f40648c);
    }

    public final int hashCode() {
        return this.f40648c.hashCode() + s571.m77243b(this.f40646a.hashCode() * 31, 31, this.f40647b);
    }
}
