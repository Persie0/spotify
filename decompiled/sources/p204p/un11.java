package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class un11 {

    /* JADX INFO: renamed from: a */
    public final String f232010a;

    /* JADX INFO: renamed from: b */
    public final String f232011b;

    /* JADX INFO: renamed from: c */
    public final String f232012c;

    /* JADX INFO: renamed from: d */
    public final String f232013d;

    /* JADX INFO: renamed from: e */
    public final String f232014e;

    public un11(String str, String str2, String str3, String str4, String str5) {
        this.f232010a = str;
        this.f232011b = str2;
        this.f232012c = str3;
        this.f232013d = str4;
        this.f232014e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un11)) {
            return false;
        }
        un11 un11Var = (un11) obj;
        return wj50.m88271j(this.f232010a, un11Var.f232010a) && wj50.m88271j(this.f232011b, un11Var.f232011b) && wj50.m88271j(this.f232012c, un11Var.f232012c) && wj50.m88271j(this.f232013d, un11Var.f232013d) && wj50.m88271j(this.f232014e, un11Var.f232014e);
    }

    public final int hashCode() {
        return this.f232014e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f232010a.hashCode() * 31, 31, this.f232011b), 31, this.f232012c), 31, this.f232013d);
    }
}
