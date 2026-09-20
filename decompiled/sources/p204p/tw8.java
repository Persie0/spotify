package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tw8 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f224353a;

    /* JADX INFO: renamed from: b */
    public final String f224354b;

    /* JADX INFO: renamed from: c */
    public final String f224355c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f224356d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f224357e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f224358f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f224359g;

    /* JADX INFO: renamed from: h */
    public final String f224360h;

    /* JADX INFO: renamed from: i */
    public final String f224361i;

    /* JADX INFO: renamed from: j */
    public final String f224362j;

    /* JADX INFO: renamed from: k */
    public final String f224363k;

    /* JADX INFO: renamed from: l */
    public final String f224364l;

    public tw8(String str, String str2, String str3, ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, String str4, String str5, String str6, String str7, String str8) {
        this.f224353a = str;
        this.f224354b = str2;
        this.f224355c = str3;
        this.f224356d = ehx0Var;
        this.f224357e = ehx0Var2;
        this.f224358f = ehx0Var3;
        this.f224359g = ehx0Var4;
        this.f224360h = str4;
        this.f224361i = str5;
        this.f224362j = str6;
        this.f224363k = str7;
        this.f224364l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw8)) {
            return false;
        }
        tw8 tw8Var = (tw8) obj;
        return wj50.m88271j(this.f224353a, tw8Var.f224353a) && wj50.m88271j(this.f224354b, tw8Var.f224354b) && wj50.m88271j(this.f224355c, tw8Var.f224355c) && wj50.m88271j(this.f224356d, tw8Var.f224356d) && wj50.m88271j(this.f224357e, tw8Var.f224357e) && wj50.m88271j(this.f224358f, tw8Var.f224358f) && wj50.m88271j(this.f224359g, tw8Var.f224359g) && wj50.m88271j(this.f224360h, tw8Var.f224360h) && wj50.m88271j(this.f224361i, tw8Var.f224361i) && wj50.m88271j(this.f224362j, tw8Var.f224362j) && wj50.m88271j(this.f224363k, tw8Var.f224363k) && wj50.m88271j(this.f224364l, tw8Var.f224364l);
    }

    public final int hashCode() {
        int iHashCode = (this.f224357e.hashCode() + ((this.f224356d.hashCode() + s571.m77243b(s571.m77243b(this.f224353a.hashCode() * 31, 31, this.f224354b), 31, this.f224355c)) * 31)) * 31;
        ehx0 ehx0Var = this.f224358f;
        int iHashCode2 = (iHashCode + (ehx0Var == null ? 0 : ehx0Var.hashCode())) * 31;
        ehx0 ehx0Var2 = this.f224359g;
        return this.f224364l.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode2 + (ehx0Var2 != null ? ehx0Var2.hashCode() : 0)) * 31, 31, this.f224360h), 31, this.f224361i), 31, this.f224362j), 31, this.f224363k);
    }
}
