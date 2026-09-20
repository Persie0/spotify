package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qo41 {

    /* JADX INFO: renamed from: a */
    public final String f190781a;

    /* JADX INFO: renamed from: b */
    public final String f190782b;

    /* JADX INFO: renamed from: c */
    public final String f190783c;

    /* JADX INFO: renamed from: d */
    public final String f190784d;

    /* JADX INFO: renamed from: e */
    public final boolean f190785e;

    /* JADX INFO: renamed from: f */
    public final String f190786f;

    public /* synthetic */ qo41(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo41)) {
            return false;
        }
        qo41 qo41Var = (qo41) obj;
        return wj50.m88271j(this.f190781a, qo41Var.f190781a) && wj50.m88271j(this.f190782b, qo41Var.f190782b) && wj50.m88271j(this.f190783c, qo41Var.f190783c) && wj50.m88271j(this.f190784d, qo41Var.f190784d) && this.f190785e == qo41Var.f190785e && wj50.m88271j(this.f190786f, qo41Var.f190786f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f190781a.hashCode() * 31, 31, this.f190782b), 31, this.f190783c);
        String str = this.f190784d;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f190785e);
        String str2 = this.f190786f;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }

    public qo41(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f190781a = str;
        this.f190782b = str2;
        this.f190783c = str3;
        this.f190784d = str4;
        this.f190785e = z;
        this.f190786f = str5;
    }
}
