package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yxj0 implements zxj0 {

    /* JADX INFO: renamed from: a */
    public final String f277261a;

    /* JADX INFO: renamed from: b */
    public final String f277262b;

    /* JADX INFO: renamed from: c */
    public final String f277263c;

    public yxj0(String str, String str2, String str3) {
        this.f277261a = str;
        this.f277262b = str2;
        this.f277263c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxj0)) {
            return false;
        }
        yxj0 yxj0Var = (yxj0) obj;
        return wj50.m88271j(this.f277261a, yxj0Var.f277261a) && wj50.m88271j(this.f277262b, yxj0Var.f277262b) && wj50.m88271j(this.f277263c, yxj0Var.f277263c);
    }

    public final int hashCode() {
        return this.f277263c.hashCode() + s571.m77243b(this.f277261a.hashCode() * 31, 31, this.f277262b);
    }
}
