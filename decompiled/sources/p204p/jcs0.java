package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jcs0 {

    /* JADX INFO: renamed from: a */
    public final String f111183a;

    /* JADX INFO: renamed from: b */
    public final String f111184b;

    /* JADX INFO: renamed from: c */
    public final un20 f111185c;

    /* JADX INFO: renamed from: d */
    public final f5u f111186d;

    public jcs0(String str, String str2, un20 un20Var, f5u f5uVar) {
        this.f111183a = str;
        this.f111184b = str2;
        this.f111185c = un20Var;
        this.f111186d = f5uVar;
    }

    /* JADX INFO: renamed from: a */
    public final f5u m53011a() {
        return this.f111186d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcs0)) {
            return false;
        }
        jcs0 jcs0Var = (jcs0) obj;
        return wj50.m88271j(this.f111183a, jcs0Var.f111183a) && wj50.m88271j(this.f111184b, jcs0Var.f111184b) && wj50.m88271j(this.f111185c, jcs0Var.f111185c) && wj50.m88271j(this.f111186d, jcs0Var.f111186d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f111183a.hashCode() * 31, 31, this.f111184b);
        un20 un20Var = this.f111185c;
        return this.f111186d.hashCode() + ((iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
