package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qgu0 implements rgu0 {

    /* JADX INFO: renamed from: a */
    public final pgu0 f188571a;

    /* JADX INFO: renamed from: b */
    public final String f188572b;

    /* JADX INFO: renamed from: c */
    public final Throwable f188573c;

    public qgu0(pgu0 pgu0Var, String str, Throwable th) {
        this.f188571a = pgu0Var;
        this.f188572b = str;
        this.f188573c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgu0)) {
            return false;
        }
        qgu0 qgu0Var = (qgu0) obj;
        return wj50.m88271j(this.f188571a, qgu0Var.f188571a) && wj50.m88271j(this.f188572b, qgu0Var.f188572b) && wj50.m88271j(this.f188573c, qgu0Var.f188573c);
    }

    public final int hashCode() {
        return this.f188573c.hashCode() + s571.m77243b(this.f188571a.hashCode() * 31, 31, this.f188572b);
    }
}
