package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xje0 {

    /* JADX INFO: renamed from: a */
    public final String f262112a;

    /* JADX INFO: renamed from: b */
    public final String f262113b;

    /* JADX INFO: renamed from: c */
    public final String f262114c;

    /* JADX INFO: renamed from: d */
    public final String f262115d;

    /* JADX INFO: renamed from: e */
    public final String f262116e;

    public xje0(String str, String str2, String str3, String str4, String str5) {
        this.f262112a = str;
        this.f262113b = str2;
        this.f262114c = str3;
        this.f262115d = str4;
        this.f262116e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xje0)) {
            return false;
        }
        xje0 xje0Var = (xje0) obj;
        return wj50.m88271j(this.f262112a, xje0Var.f262112a) && wj50.m88271j(this.f262113b, xje0Var.f262113b) && wj50.m88271j(this.f262114c, xje0Var.f262114c) && wj50.m88271j(this.f262115d, xje0Var.f262115d) && wj50.m88271j(this.f262116e, xje0Var.f262116e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f262112a.hashCode() * 31, 31, this.f262113b);
        String str = this.f262114c;
        return this.f262116e.hashCode() + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262115d);
    }
}
