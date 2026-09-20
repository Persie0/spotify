package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eaq0 {

    /* JADX INFO: renamed from: a */
    public final String f57714a;

    /* JADX INFO: renamed from: b */
    public final int f57715b;

    /* JADX INFO: renamed from: c */
    public final String f57716c;

    public eaq0(String str, int i, String str2) {
        this.f57714a = str;
        this.f57715b = i;
        this.f57716c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaq0)) {
            return false;
        }
        eaq0 eaq0Var = (eaq0) obj;
        return wj50.m88271j(this.f57714a, eaq0Var.f57714a) && this.f57715b == eaq0Var.f57715b && wj50.m88271j(this.f57716c, eaq0Var.f57716c);
    }

    public final int hashCode() {
        return this.f57716c.hashCode() + mt60.m62800g(this.f57715b, this.f57714a.hashCode() * 31, 31);
    }
}
