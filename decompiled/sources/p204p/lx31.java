package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lx31 {

    /* JADX INFO: renamed from: a */
    public final String f137711a;

    /* JADX INFO: renamed from: b */
    public final qti0 f137712b;

    /* JADX INFO: renamed from: c */
    public final String f137713c;

    /* JADX INFO: renamed from: d */
    public final String f137714d;

    /* JADX INFO: renamed from: e */
    public final String f137715e;

    public lx31(String str, qti0 qti0Var, String str2, String str3) {
        this.f137711a = str;
        this.f137712b = qti0Var;
        this.f137713c = str2;
        this.f137714d = str3;
        this.f137715e = str + '.' + (qti0Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx31)) {
            return false;
        }
        lx31 lx31Var = (lx31) obj;
        return wj50.m88271j(this.f137711a, lx31Var.f137711a) && wj50.m88271j(this.f137712b, lx31Var.f137712b) && wj50.m88271j(this.f137713c, lx31Var.f137713c) && wj50.m88271j(this.f137714d, lx31Var.f137714d);
    }

    public final int hashCode() {
        return this.f137714d.hashCode() + s571.m77243b((this.f137712b.hashCode() + (this.f137711a.hashCode() * 31)) * 31, 31, this.f137713c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f137711a);
        sb.append(", name=");
        sb.append(this.f137712b);
        sb.append(", parameters=");
        sb.append(this.f137713c);
        sb.append(", returnType=");
        return dq60.m36617q(sb, this.f137714d, ')');
    }
}
