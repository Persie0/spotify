package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class llp0 {

    /* JADX INFO: renamed from: a */
    public final String f134680a;

    /* JADX INFO: renamed from: b */
    public final String f134681b;

    /* JADX INFO: renamed from: c */
    public final String f134682c;

    /* JADX INFO: renamed from: d */
    public final boolean f134683d;

    /* JADX INFO: renamed from: e */
    public final String f134684e;

    public llp0(String str, String str2, String str3, String str4, boolean z) {
        this.f134680a = str;
        this.f134681b = str2;
        this.f134682c = str3;
        this.f134683d = z;
        this.f134684e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llp0)) {
            return false;
        }
        llp0 llp0Var = (llp0) obj;
        return wj50.m88271j(this.f134680a, llp0Var.f134680a) && wj50.m88271j(this.f134681b, llp0Var.f134681b) && wj50.m88271j(this.f134682c, llp0Var.f134682c) && this.f134683d == llp0Var.f134683d && wj50.m88271j(this.f134684e, llp0Var.f134684e);
    }

    public final int hashCode() {
        return this.f134684e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f134680a.hashCode() * 31, 31, this.f134681b), 31, this.f134682c), 31, this.f134683d);
    }
}
