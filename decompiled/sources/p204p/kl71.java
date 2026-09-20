package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kl71 {

    /* JADX INFO: renamed from: a */
    public final String f123815a;

    /* JADX INFO: renamed from: b */
    public final String f123816b;

    /* JADX INFO: renamed from: c */
    public final String f123817c;

    /* JADX INFO: renamed from: d */
    public final String f123818d;

    /* JADX INFO: renamed from: e */
    public final eh00 f123819e;

    public kl71(String str, String str2, String str3, String str4, eh00 eh00Var) {
        this.f123815a = str;
        this.f123816b = str2;
        this.f123817c = str3;
        this.f123818d = str4;
        this.f123819e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl71)) {
            return false;
        }
        kl71 kl71Var = (kl71) obj;
        return wj50.m88271j(this.f123815a, kl71Var.f123815a) && wj50.m88271j(this.f123816b, kl71Var.f123816b) && wj50.m88271j(this.f123817c, kl71Var.f123817c) && wj50.m88271j(this.f123818d, kl71Var.f123818d) && wj50.m88271j(this.f123819e, kl71Var.f123819e);
    }

    public final int hashCode() {
        return this.f123819e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f123815a.hashCode() * 31, 31, this.f123816b), 31, this.f123817c), 31, this.f123818d);
    }
}
