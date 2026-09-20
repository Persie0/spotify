package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zke0 {

    /* JADX INFO: renamed from: a */
    public final qle0 f283727a;

    /* JADX INFO: renamed from: b */
    public final String f283728b;

    /* JADX INFO: renamed from: c */
    public final String f283729c;

    /* JADX INFO: renamed from: d */
    public final pke0 f283730d;

    /* JADX INFO: renamed from: e */
    public final int f283731e;

    /* JADX INFO: renamed from: f */
    public final boolean f283732f;

    public zke0(qle0 qle0Var, String str, String str2, pke0 pke0Var, int i) {
        pke0Var = (i & 8) != 0 ? fby.f67920M0 : pke0Var;
        int i2 = (i & 16) != 0 ? 1 : 3;
        boolean z = (i & 32) != 0;
        this.f283727a = qle0Var;
        this.f283728b = str;
        this.f283729c = str2;
        this.f283730d = pke0Var;
        this.f283731e = i2;
        this.f283732f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zke0)) {
            return false;
        }
        zke0 zke0Var = (zke0) obj;
        return this.f283727a == zke0Var.f283727a && wj50.m88271j(this.f283728b, zke0Var.f283728b) && wj50.m88271j(this.f283729c, zke0Var.f283729c) && wj50.m88271j(this.f283730d, zke0Var.f283730d) && this.f283731e == zke0Var.f283731e && this.f283732f == zke0Var.f283732f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283732f) + f710.m40938f(this.f283731e, (this.f283730d.hashCode() + s571.m77243b(s571.m77243b(this.f283727a.hashCode() * 31, 31, this.f283728b), 31, this.f283729c)) * 31, 31);
    }
}
