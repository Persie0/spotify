package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bt61 {

    /* JADX INFO: renamed from: a */
    public final String f30522a;

    /* JADX INFO: renamed from: b */
    public final int f30523b;

    /* JADX INFO: renamed from: c */
    public final String f30524c;

    /* JADX INFO: renamed from: d */
    public final String f30525d;

    public bt61(String str, String str2, int i, String str3) {
        this.f30522a = str;
        this.f30523b = i;
        this.f30524c = str2;
        this.f30525d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt61)) {
            return false;
        }
        bt61 bt61Var = (bt61) obj;
        return this.f30522a.equals(bt61Var.f30522a) && this.f30523b == bt61Var.f30523b && this.f30524c.equals(bt61Var.f30524c) && wj50.m88271j(this.f30525d, bt61Var.f30525d);
    }

    public final int hashCode() {
        return this.f30525d.hashCode() + s571.m77243b(f710.m40938f(this.f30523b, this.f30522a.hashCode() * 31, 31), 31, this.f30524c);
    }
}
