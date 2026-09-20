package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f195733a;

    /* JADX INFO: renamed from: b */
    public final String f195734b;

    /* JADX INFO: renamed from: c */
    public final String f195735c;

    public r4e1(String str, String str2, String str3) {
        this.f195733a = str;
        this.f195734b = str2;
        this.f195735c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4e1)) {
            return false;
        }
        r4e1 r4e1Var = (r4e1) obj;
        return wj50.m88271j(this.f195733a, r4e1Var.f195733a) && wj50.m88271j(this.f195734b, r4e1Var.f195734b) && wj50.m88271j(this.f195735c, r4e1Var.f195735c);
    }

    public final int hashCode() {
        return this.f195735c.hashCode() + s571.m77243b(this.f195733a.hashCode() * 31, 31, this.f195734b);
    }
}
