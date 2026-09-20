package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yys0 extends gab implements qr60 {

    /* JADX INFO: renamed from: g */
    public final boolean f277579g;

    public yys0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f277579g = (i & 2) == 2;
    }

    @Override // p204p.gab
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final qr60 mo44151I() {
        if (this.f277579g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (qr60) super.mo44151I();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yys0) {
            yys0 yys0Var = (yys0) obj;
            return m44150G().equals(yys0Var.m44150G()) && this.f78016d.equals(yys0Var.f78016d) && this.f78017e.equals(yys0Var.f78017e) && wj50.m88271j(this.f78014b, yys0Var.f78014b);
        }
        if (obj instanceof qr60) {
            return obj.equals(mo44152g());
        }
        return false;
    }

    @Override // p204p.gab
    /* JADX INFO: renamed from: g */
    public final rp60 mo44152g() {
        return this.f277579g ? this : super.mo44152g();
    }

    public final int hashCode() {
        return this.f78017e.hashCode() + s571.m77243b(m44150G().hashCode() * 31, 31, this.f78016d);
    }

    public final String toString() {
        rp60 rp60VarMo44152g = mo44152g();
        if (rp60VarMo44152g != this) {
            return rp60VarMo44152g.toString();
        }
        return dq60.m36616p(this.f78016d, " (Kotlin reflection is not available)", new StringBuilder("property "));
    }
}
