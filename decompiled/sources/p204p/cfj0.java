package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cfj0 extends dfj0 {

    /* JADX INFO: renamed from: a */
    public final String f37394a;

    /* JADX INFO: renamed from: b */
    public final String f37395b;

    /* JADX INFO: renamed from: c */
    public final String f37396c;

    public cfj0(String str, String str2, String str3) {
        this.f37394a = str;
        this.f37395b = str2;
        this.f37396c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfj0)) {
            return false;
        }
        cfj0 cfj0Var = (cfj0) obj;
        return wj50.m88271j(this.f37394a, cfj0Var.f37394a) && wj50.m88271j(this.f37395b, cfj0Var.f37395b) && wj50.m88271j(this.f37396c, cfj0Var.f37396c);
    }

    public final int hashCode() {
        return this.f37396c.hashCode() + s571.m77243b(this.f37394a.hashCode() * 31, 31, this.f37395b);
    }
}
