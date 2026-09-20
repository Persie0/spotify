package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qh11 {

    /* JADX INFO: renamed from: a */
    public final String f188595a;

    /* JADX INFO: renamed from: b */
    public final String f188596b;

    /* JADX INFO: renamed from: c */
    public final String f188597c;

    /* JADX INFO: renamed from: d */
    public final String f188598d;

    /* JADX INFO: renamed from: e */
    public final boolean f188599e;

    /* JADX INFO: renamed from: f */
    public final int f188600f;

    public qh11(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f188595a = str;
        this.f188596b = str2;
        this.f188597c = str3;
        this.f188598d = str4;
        this.f188599e = z;
        this.f188600f = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m72780a() {
        return this.f188598d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh11)) {
            return false;
        }
        qh11 qh11Var = (qh11) obj;
        return wj50.m88271j(this.f188595a, qh11Var.f188595a) && wj50.m88271j(this.f188596b, qh11Var.f188596b) && wj50.m88271j(this.f188597c, qh11Var.f188597c) && wj50.m88271j(this.f188598d, qh11Var.f188598d) && this.f188599e == qh11Var.f188599e && this.f188600f == qh11Var.f188600f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f188595a.hashCode() * 31, 31, this.f188596b), 31, this.f188597c), 31, this.f188598d), 31, this.f188599e);
        int i = this.f188600f;
        return iM77245d + (i == 0 ? 0 : edb.m38547C(i));
    }
}
