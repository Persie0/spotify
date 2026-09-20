package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class be20 {

    /* JADX INFO: renamed from: a */
    public final String f26257a;

    /* JADX INFO: renamed from: b */
    public final String f26258b;

    /* JADX INFO: renamed from: c */
    public final String f26259c;

    /* JADX INFO: renamed from: d */
    public final String f26260d;

    /* JADX INFO: renamed from: e */
    public final String f26261e;

    /* JADX INFO: renamed from: f */
    public final qf40 f26262f;

    public be20(String str, String str2, String str3, String str4, String str5, qf40 qf40Var) {
        this.f26257a = str;
        this.f26258b = str2;
        this.f26259c = str3;
        this.f26260d = str4;
        this.f26261e = str5;
        this.f26262f = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be20)) {
            return false;
        }
        be20 be20Var = (be20) obj;
        return wj50.m88271j(this.f26257a, be20Var.f26257a) && wj50.m88271j(this.f26258b, be20Var.f26258b) && wj50.m88271j(this.f26259c, be20Var.f26259c) && wj50.m88271j(this.f26260d, be20Var.f26260d) && wj50.m88271j(this.f26261e, be20Var.f26261e) && wj50.m88271j(this.f26262f, be20Var.f26262f);
    }

    public final int hashCode() {
        return this.f26262f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f26257a.hashCode() * 31, 31, this.f26258b), 31, this.f26259c), 31, this.f26260d), 31, this.f26261e);
    }
}
