package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wzv0 extends b0w0 {

    /* JADX INFO: renamed from: a */
    public final int f256692a;

    /* JADX INFO: renamed from: b */
    public final String f256693b;

    /* JADX INFO: renamed from: c */
    public final String f256694c;

    /* JADX INFO: renamed from: d */
    public final vzv0 f256695d;

    public wzv0(int i, String str, String str2, vzv0 vzv0Var) {
        this.f256692a = i;
        this.f256693b = str;
        this.f256694c = str2;
        this.f256695d = vzv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzv0)) {
            return false;
        }
        wzv0 wzv0Var = (wzv0) obj;
        return this.f256692a == wzv0Var.f256692a && wj50.m88271j(this.f256693b, wzv0Var.f256693b) && wj50.m88271j(this.f256694c, wzv0Var.f256694c) && this.f256695d == wzv0Var.f256695d;
    }

    public final int hashCode() {
        return this.f256695d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f256692a) * 31, 31, this.f256693b), 31, this.f256694c);
    }
}
