package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fj90 {

    /* JADX INFO: renamed from: a */
    public final String f70124a;

    /* JADX INFO: renamed from: b */
    public final String f70125b;

    /* JADX INFO: renamed from: c */
    public final String f70126c;

    /* JADX INFO: renamed from: d */
    public final long f70127d;

    /* JADX INFO: renamed from: e */
    public final String f70128e;

    /* JADX INFO: renamed from: f */
    public final String f70129f;

    public fj90(String str, String str2, String str3, long j, String str4, String str5) {
        this.f70124a = str;
        this.f70125b = str2;
        this.f70126c = str3;
        this.f70127d = j;
        this.f70128e = str4;
        this.f70129f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj90)) {
            return false;
        }
        fj90 fj90Var = (fj90) obj;
        return wj50.m88271j(this.f70124a, fj90Var.f70124a) && wj50.m88271j(this.f70125b, fj90Var.f70125b) && wj50.m88271j(this.f70126c, fj90Var.f70126c) && this.f70127d == fj90Var.f70127d && wj50.m88271j(this.f70128e, fj90Var.f70128e) && wj50.m88271j(this.f70129f, fj90Var.f70129f);
    }

    public final int hashCode() {
        return this.f70129f.hashCode() + s571.m77243b(dq60.m36605e(s571.m77243b(s571.m77243b(this.f70124a.hashCode() * 31, 31, this.f70125b), 31, this.f70126c), this.f70127d, 31), 31, this.f70128e);
    }
}
