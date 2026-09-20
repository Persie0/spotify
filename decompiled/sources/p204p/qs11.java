package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qs11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f191951a;

    /* JADX INFO: renamed from: b */
    public final String f191952b;

    /* JADX INFO: renamed from: c */
    public final String f191953c;

    /* JADX INFO: renamed from: d */
    public final js11 f191954d;

    public qs11(String str, String str2, String str3, js11 js11Var) {
        this.f191951a = str;
        this.f191952b = str2;
        this.f191953c = str3;
        this.f191954d = js11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs11)) {
            return false;
        }
        qs11 qs11Var = (qs11) obj;
        return wj50.m88271j(this.f191951a, qs11Var.f191951a) && wj50.m88271j(this.f191952b, qs11Var.f191952b) && wj50.m88271j(this.f191953c, qs11Var.f191953c) && wj50.m88271j(this.f191954d, qs11Var.f191954d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f191951a.hashCode() * 31, 31, this.f191952b), 31, this.f191953c);
        js11 js11Var = this.f191954d;
        return iM77243b + (js11Var == null ? 0 : js11Var.hashCode());
    }
}
