package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t2d1 {

    /* JADX INFO: renamed from: a */
    public final String f216493a;

    /* JADX INFO: renamed from: b */
    public final String f216494b;

    /* JADX INFO: renamed from: c */
    public final String f216495c;

    public t2d1(String str, String str2, String str3) {
        this.f216493a = str;
        this.f216494b = str2;
        this.f216495c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2d1)) {
            return false;
        }
        t2d1 t2d1Var = (t2d1) obj;
        return wj50.m88271j(this.f216493a, t2d1Var.f216493a) && wj50.m88271j(this.f216494b, t2d1Var.f216494b) && wj50.m88271j(this.f216495c, t2d1Var.f216495c);
    }

    public final int hashCode() {
        return this.f216495c.hashCode() + s571.m77243b(this.f216493a.hashCode() * 31, 31, this.f216494b);
    }
}
