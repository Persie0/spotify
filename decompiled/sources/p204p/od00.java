package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class od00 {

    /* JADX INFO: renamed from: a */
    public final String f164057a;

    /* JADX INFO: renamed from: b */
    public final String f164058b;

    /* JADX INFO: renamed from: c */
    public final String f164059c;

    /* JADX INFO: renamed from: d */
    public final Integer f164060d;

    /* JADX INFO: renamed from: e */
    public final eh00 f164061e;

    public od00(String str, String str2, String str3, Integer num, eh00 eh00Var) {
        this.f164057a = str;
        this.f164058b = str2;
        this.f164059c = str3;
        this.f164060d = num;
        this.f164061e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od00)) {
            return false;
        }
        od00 od00Var = (od00) obj;
        return wj50.m88271j(this.f164057a, od00Var.f164057a) && wj50.m88271j(this.f164058b, od00Var.f164058b) && wj50.m88271j(this.f164059c, od00Var.f164059c) && wj50.m88271j(this.f164060d, od00Var.f164060d) && wj50.m88271j(this.f164061e, od00Var.f164061e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f164057a.hashCode() * 31, 31, this.f164058b);
        String str = this.f164059c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f164060d;
        return this.f164061e.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
