package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gbs0 {

    /* JADX INFO: renamed from: a */
    public final un20 f78376a;

    /* JADX INFO: renamed from: b */
    public final String f78377b;

    /* JADX INFO: renamed from: c */
    public final String f78378c;

    /* JADX INFO: renamed from: d */
    public final f5u f78379d;

    /* JADX INFO: renamed from: e */
    public final int f78380e;

    public gbs0(un20 un20Var, String str, String str2, f5u f5uVar, int i) {
        this.f78376a = un20Var;
        this.f78377b = str;
        this.f78378c = str2;
        this.f78379d = f5uVar;
        this.f78380e = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m44267a() {
        return this.f78380e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbs0)) {
            return false;
        }
        gbs0 gbs0Var = (gbs0) obj;
        return wj50.m88271j(this.f78376a, gbs0Var.f78376a) && wj50.m88271j(this.f78377b, gbs0Var.f78377b) && wj50.m88271j(this.f78378c, gbs0Var.f78378c) && this.f78379d.equals(gbs0Var.f78379d) && this.f78380e == gbs0Var.f78380e;
    }

    public final int hashCode() {
        un20 un20Var = this.f78376a;
        return edb.m38547C(this.f78380e) + ((this.f78379d.hashCode() + s571.m77243b(s571.m77243b((un20Var == null ? 0 : un20Var.hashCode()) * 31, 31, this.f78377b), 31, this.f78378c)) * 31);
    }
}
