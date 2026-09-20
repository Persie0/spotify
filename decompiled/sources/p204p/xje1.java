package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xje1 implements cke1 {

    /* JADX INFO: renamed from: a */
    public final String f262117a;

    /* JADX INFO: renamed from: b */
    public final String f262118b;

    /* JADX INFO: renamed from: c */
    public final bke1 f262119c;

    /* JADX INFO: renamed from: d */
    public final boolean f262120d;

    public xje1(String str, String str2, bke1 bke1Var, boolean z) {
        this.f262117a = str;
        this.f262118b = str2;
        this.f262119c = bke1Var;
        this.f262120d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xje1)) {
            return false;
        }
        xje1 xje1Var = (xje1) obj;
        return wj50.m88271j(this.f262117a, xje1Var.f262117a) && wj50.m88271j(this.f262118b, xje1Var.f262118b) && wj50.m88271j(this.f262119c, xje1Var.f262119c) && this.f262120d == xje1Var.f262120d;
    }

    public final int hashCode() {
        int iHashCode = this.f262117a.hashCode() * 31;
        String str = this.f262118b;
        return Boolean.hashCode(this.f262120d) + ((this.f262119c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
