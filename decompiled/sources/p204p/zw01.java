package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zw01 implements ax01 {

    /* JADX INFO: renamed from: a */
    public final jf11 f286873a;

    /* JADX INFO: renamed from: b */
    public final String f286874b;

    public zw01(jf11 jf11Var, String str) {
        this.f286873a = jf11Var;
        this.f286874b = str;
    }

    @Override // p204p.ax01
    /* JADX INFO: renamed from: a */
    public final String mo27354a() {
        return this.f286874b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw01)) {
            return false;
        }
        zw01 zw01Var = (zw01) obj;
        return wj50.m88271j(this.f286873a, zw01Var.f286873a) && wj50.m88271j(this.f286874b, zw01Var.f286874b);
    }

    public final int hashCode() {
        return this.f286874b.hashCode() + (this.f286873a.hashCode() * 31);
    }
}
