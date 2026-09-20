package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bh91 {

    /* JADX INFO: renamed from: a */
    public final vg91 f27120a;

    /* JADX INFO: renamed from: b */
    public final wg91 f27121b;

    /* JADX INFO: renamed from: c */
    public final ah91 f27122c;

    /* JADX INFO: renamed from: d */
    public final ug91 f27123d;

    public bh91(vg91 vg91Var, wg91 wg91Var, ah91 ah91Var, ug91 ug91Var) {
        this.f27120a = vg91Var;
        this.f27121b = wg91Var;
        this.f27122c = ah91Var;
        this.f27123d = ug91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh91)) {
            return false;
        }
        bh91 bh91Var = (bh91) obj;
        return wj50.m88271j(this.f27120a, bh91Var.f27120a) && wj50.m88271j(this.f27121b, bh91Var.f27121b) && wj50.m88271j(this.f27122c, bh91Var.f27122c) && wj50.m88271j(this.f27123d, bh91Var.f27123d);
    }

    public final int hashCode() {
        return this.f27123d.hashCode() + ((this.f27122c.hashCode() + ((this.f27121b.hashCode() + (this.f27120a.hashCode() * 31)) * 31)) * 31);
    }
}
