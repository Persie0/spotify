package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qvw0 {

    /* JADX INFO: renamed from: a */
    public final nk2 f193128a;

    /* JADX INFO: renamed from: b */
    public final String f193129b;

    /* JADX INFO: renamed from: c */
    public final j741 f193130c;

    /* JADX INFO: renamed from: d */
    public final d850 f193131d;

    /* JADX INFO: renamed from: e */
    public final String f193132e;

    /* JADX INFO: renamed from: f */
    public final String f193133f;

    public qvw0(nk2 nk2Var, String str, j741 j741Var, d850 d850Var, String str2, String str3) {
        this.f193128a = nk2Var;
        this.f193129b = str;
        this.f193130c = j741Var;
        this.f193131d = d850Var;
        this.f193132e = str2;
        this.f193133f = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m74033a() {
        return this.f193132e;
    }

    /* JADX INFO: renamed from: b */
    public final nk2 m74034b() {
        return this.f193128a;
    }

    /* JADX INFO: renamed from: c */
    public final d850 m74035c() {
        return this.f193131d;
    }

    /* JADX INFO: renamed from: d */
    public final String m74036d() {
        return this.f193129b;
    }

    /* JADX INFO: renamed from: e */
    public final String m74037e() {
        return this.f193133f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvw0)) {
            return false;
        }
        qvw0 qvw0Var = (qvw0) obj;
        return this.f193128a == qvw0Var.f193128a && wj50.m88271j(this.f193129b, qvw0Var.f193129b) && wj50.m88271j(this.f193130c, qvw0Var.f193130c) && wj50.m88271j(this.f193131d, qvw0Var.f193131d) && wj50.m88271j(this.f193132e, qvw0Var.f193132e) && wj50.m88271j(this.f193133f, qvw0Var.f193133f);
    }

    public final int hashCode() {
        int iHashCode = this.f193128a.hashCode() * 31;
        String str = this.f193129b;
        int iHashCode2 = (this.f193130c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        d850 d850Var = this.f193131d;
        int iHashCode3 = (iHashCode2 + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
        String str2 = this.f193132e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f193133f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ qvw0(nk2 nk2Var, String str, j741 j741Var, String str2, String str3, int i) {
        this((i & 1) != 0 ? nk2.HOME_DJ : nk2Var, (i & 2) != 0 ? null : str, j741Var, (d850) null, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
