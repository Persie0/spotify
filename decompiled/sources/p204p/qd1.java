package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qd1 {

    /* JADX INFO: renamed from: a */
    public final String f187453a;

    /* JADX INFO: renamed from: b */
    public final String f187454b;

    /* JADX INFO: renamed from: c */
    public final String f187455c;

    public qd1(String str, String str2, String str3) {
        this.f187453a = str;
        this.f187454b = str2;
        this.f187455c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd1)) {
            return false;
        }
        qd1 qd1Var = (qd1) obj;
        return wj50.m88271j(this.f187453a, qd1Var.f187453a) && wj50.m88271j(this.f187454b, qd1Var.f187454b) && wj50.m88271j(this.f187455c, qd1Var.f187455c);
    }

    public final int hashCode() {
        return this.f187455c.hashCode() + s571.m77243b(this.f187453a.hashCode() * 31, 31, this.f187454b);
    }
}
