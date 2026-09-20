package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gm01 {

    /* JADX INFO: renamed from: a */
    public final fm01 f81243a;

    /* JADX INFO: renamed from: b */
    public final boolean f81244b;

    /* JADX INFO: renamed from: c */
    public final hm01 f81245c;

    public gm01(fm01 fm01Var, boolean z, hm01 hm01Var) {
        this.f81243a = fm01Var;
        this.f81244b = z;
        this.f81245c = hm01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm01)) {
            return false;
        }
        gm01 gm01Var = (gm01) obj;
        return wj50.m88271j(this.f81243a, gm01Var.f81243a) && this.f81244b == gm01Var.f81244b && wj50.m88271j(this.f81245c, gm01Var.f81245c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f81243a.hashCode() * 31, 31, this.f81244b);
        hm01 hm01Var = this.f81245c;
        return iM77245d + (hm01Var == null ? 0 : hm01Var.hashCode());
    }
}
