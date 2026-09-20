package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mzc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f148672a;

    /* JADX INFO: renamed from: b */
    public final String f148673b;

    /* JADX INFO: renamed from: c */
    public final tyc0 f148674c;

    public mzc0(String str, String str2, tyc0 tyc0Var) {
        this.f148672a = str;
        this.f148673b = str2;
        this.f148674c = tyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzc0)) {
            return false;
        }
        mzc0 mzc0Var = (mzc0) obj;
        return wj50.m88271j(this.f148672a, mzc0Var.f148672a) && this.f148673b.equals(mzc0Var.f148673b) && this.f148674c.equals(mzc0Var.f148674c);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f148672a;
    }

    public final int hashCode() {
        return this.f148674c.hashCode() + s571.m77243b(this.f148672a.hashCode() * 961, 31, this.f148673b);
    }
}
