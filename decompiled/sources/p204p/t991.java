package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t991 {

    /* JADX INFO: renamed from: a */
    public final String f218220a;

    /* JADX INFO: renamed from: b */
    public final String f218221b;

    /* JADX INFO: renamed from: c */
    public final eh00 f218222c;

    public t991(String str, String str2, eh00 eh00Var) {
        this.f218220a = str;
        this.f218221b = str2;
        this.f218222c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t991)) {
            return false;
        }
        t991 t991Var = (t991) obj;
        return wj50.m88271j(this.f218220a, t991Var.f218220a) && wj50.m88271j(this.f218221b, t991Var.f218221b) && wj50.m88271j(this.f218222c, t991Var.f218222c);
    }

    public final int hashCode() {
        return this.f218222c.hashCode() + s571.m77243b(this.f218220a.hashCode() * 31, 31, this.f218221b);
    }
}
