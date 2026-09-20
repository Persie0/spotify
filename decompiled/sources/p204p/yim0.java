package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yim0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f273166a;

    /* JADX INFO: renamed from: b */
    public final String f273167b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f273168c;

    public yim0(String str, String str2, gkm0 gkm0Var) {
        this.f273166a = str;
        this.f273167b = str2;
        this.f273168c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yim0)) {
            return false;
        }
        yim0 yim0Var = (yim0) obj;
        return wj50.m88271j(this.f273166a, yim0Var.f273166a) && wj50.m88271j(this.f273167b, yim0Var.f273167b) && wj50.m88271j(this.f273168c, yim0Var.f273168c);
    }

    public final int hashCode() {
        return this.f273168c.hashCode() + s571.m77243b(this.f273166a.hashCode() * 31, 31, this.f273167b);
    }
}
