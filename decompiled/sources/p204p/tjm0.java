package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f220964a;

    /* JADX INFO: renamed from: b */
    public final String f220965b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f220966c;

    public tjm0(String str, String str2, gkm0 gkm0Var) {
        this.f220964a = str;
        this.f220965b = str2;
        this.f220966c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjm0)) {
            return false;
        }
        tjm0 tjm0Var = (tjm0) obj;
        return wj50.m88271j(this.f220964a, tjm0Var.f220964a) && wj50.m88271j(this.f220965b, tjm0Var.f220965b) && wj50.m88271j(this.f220966c, tjm0Var.f220966c);
    }

    public final int hashCode() {
        return this.f220966c.hashCode() + s571.m77243b(this.f220964a.hashCode() * 31, 31, this.f220965b);
    }
}
