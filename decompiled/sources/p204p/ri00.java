package p204p;

/* JADX INFO: loaded from: classes2.dex */
public class ri00 extends gab implements hi00, oq60 {

    /* JADX INFO: renamed from: g */
    public final int f199406g;

    public ri00(int i, Class cls, String str, String str2, int i2) {
        this(i, fab.f67502a, cls, str, str2, i2, 0);
    }

    @Override // p204p.gab
    /* JADX INFO: renamed from: A */
    public final rp60 mo44149A() {
        return qpv0.f191387a.mo54111a(this);
    }

    @Override // p204p.gab
    /* JADX INFO: renamed from: I */
    public final rp60 mo44151I() {
        return (oq60) super.mo44151I();
    }

    @Override // p204p.oq60
    /* JADX INFO: renamed from: d */
    public final boolean mo32220d() {
        return ((oq60) super.mo44151I()).mo32220d();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ri00) {
            ri00 ri00Var = (ri00) obj;
            return this.f78016d.equals(ri00Var.f78016d) && this.f78017e.equals(ri00Var.f78017e) && wj50.m88271j(this.f78014b, ri00Var.f78014b) && wj50.m88271j(m44150G(), ri00Var.m44150G());
        }
        if (obj instanceof oq60) {
            return obj.equals(mo44152g());
        }
        return false;
    }

    @Override // p204p.hi00
    public final int getArity() {
        return this.f199406g;
    }

    @Override // p204p.gab, p204p.rp60
    /* JADX INFO: renamed from: h */
    public final boolean mo25529h() {
        return ((oq60) super.mo44151I()).mo25529h();
    }

    public final int hashCode() {
        return this.f78017e.hashCode() + s571.m77243b(m44150G() == null ? 0 : m44150G().hashCode() * 31, 31, this.f78016d);
    }

    @Override // p204p.oq60
    /* JADX INFO: renamed from: s */
    public final boolean mo32222s() {
        return ((oq60) super.mo44151I()).mo32222s();
    }

    public final String toString() {
        rp60 rp60VarMo44152g = mo44152g();
        if (rp60VarMo44152g != this) {
            return rp60VarMo44152g.toString();
        }
        String str = this.f78016d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : s571.m77251j("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p204p.oq60
    /* JADX INFO: renamed from: v */
    public final boolean mo32223v() {
        return ((oq60) super.mo44151I()).mo32223v();
    }

    @Override // p204p.oq60
    /* JADX INFO: renamed from: w */
    public final boolean mo32224w() {
        return ((oq60) super.mo44151I()).mo32224w();
    }

    public ri00(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f199406g = i;
    }
}
