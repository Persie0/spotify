package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wf1 {

    /* JADX INFO: renamed from: a */
    public final String f250654a;

    /* JADX INFO: renamed from: b */
    public final String f250655b;

    /* JADX INFO: renamed from: c */
    public final String f250656c;

    /* JADX INFO: renamed from: d */
    public final String f250657d;

    /* JADX INFO: renamed from: e */
    public final w00 f250658e;

    /* JADX INFO: renamed from: f */
    public final boolean f250659f;

    public wf1(String str, String str2, String str3, String str4, w00 w00Var, boolean z) {
        this.f250654a = str;
        this.f250655b = str2;
        this.f250656c = str3;
        this.f250657d = str4;
        this.f250658e = w00Var;
        this.f250659f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return wj50.m88271j(this.f250654a, wf1Var.f250654a) && wj50.m88271j(this.f250655b, wf1Var.f250655b) && wj50.m88271j(this.f250656c, wf1Var.f250656c) && wj50.m88271j(this.f250657d, wf1Var.f250657d) && wj50.m88271j(this.f250658e, wf1Var.f250658e) && this.f250659f == wf1Var.f250659f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250659f) + ((this.f250658e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f250654a.hashCode() * 31, 31, this.f250655b), 31, this.f250656c), 31, this.f250657d)) * 31);
    }
}
