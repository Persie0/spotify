package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class opb1 {

    /* JADX INFO: renamed from: a */
    public final mpb1 f167857a;

    /* JADX INFO: renamed from: b */
    public final String f167858b;

    /* JADX INFO: renamed from: c */
    public final xzb1 f167859c;

    /* JADX INFO: renamed from: d */
    public final String f167860d;

    /* JADX INFO: renamed from: e */
    public final Float f167861e;

    /* JADX INFO: renamed from: f */
    public final String f167862f;

    public opb1(mpb1 mpb1Var, String str, xzb1 xzb1Var, String str2, Float f, String str3) {
        this.f167857a = mpb1Var;
        this.f167858b = str;
        this.f167859c = xzb1Var;
        this.f167860d = str2;
        this.f167861e = f;
        this.f167862f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opb1)) {
            return false;
        }
        opb1 opb1Var = (opb1) obj;
        return wj50.m88271j(this.f167857a, opb1Var.f167857a) && wj50.m88271j(this.f167858b, opb1Var.f167858b) && wj50.m88271j(this.f167859c, opb1Var.f167859c) && wj50.m88271j(this.f167860d, opb1Var.f167860d) && wj50.m88271j(this.f167861e, opb1Var.f167861e) && wj50.m88271j(this.f167862f, opb1Var.f167862f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f167857a.hashCode() * 31, 31, this.f167858b);
        xzb1 xzb1Var = this.f167859c;
        int iHashCode = (iM77243b + (xzb1Var == null ? 0 : xzb1Var.hashCode())) * 31;
        String str = this.f167860d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.f167861e;
        return this.f167862f.hashCode() + ((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31);
    }

    public /* synthetic */ opb1(mpb1 mpb1Var) {
        this(mpb1Var, "", null, null, null, "");
    }
}
