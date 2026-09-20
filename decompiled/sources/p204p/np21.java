package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class np21 {

    /* JADX INFO: renamed from: a */
    public final mq21 f156855a;

    /* JADX INFO: renamed from: b */
    public final String f156856b;

    /* JADX INFO: renamed from: c */
    public final gh00 f156857c;

    public np21(mq21 mq21Var, String str, gh00 gh00Var) {
        this.f156855a = mq21Var;
        this.f156856b = str;
        this.f156857c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np21)) {
            return false;
        }
        np21 np21Var = (np21) obj;
        return wj50.m88271j(this.f156855a, np21Var.f156855a) && wj50.m88271j(this.f156856b, np21Var.f156856b) && wj50.m88271j(this.f156857c, np21Var.f156857c);
    }

    public final int hashCode() {
        return this.f156857c.hashCode() + s571.m77243b(this.f156855a.f146149a.hashCode() * 31, 31, this.f156856b);
    }
}
