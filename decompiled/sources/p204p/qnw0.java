package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qnw0 implements rnw0 {

    /* JADX INFO: renamed from: a */
    public final String f190713a;

    /* JADX INFO: renamed from: b */
    public final String f190714b;

    /* JADX INFO: renamed from: c */
    public final String f190715c;

    public qnw0(String str, String str2, String str3) {
        this.f190713a = str;
        this.f190714b = str2;
        this.f190715c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnw0)) {
            return false;
        }
        qnw0 qnw0Var = (qnw0) obj;
        return wj50.m88271j(this.f190713a, qnw0Var.f190713a) && wj50.m88271j(this.f190714b, qnw0Var.f190714b) && wj50.m88271j(this.f190715c, qnw0Var.f190715c);
    }

    public final int hashCode() {
        return this.f190715c.hashCode() + s571.m77243b(this.f190713a.hashCode() * 31, 31, this.f190714b);
    }
}
