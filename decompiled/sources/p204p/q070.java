package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q070 extends t070 {

    /* JADX INFO: renamed from: a */
    public final String f183921a;

    /* JADX INFO: renamed from: b */
    public final String f183922b;

    /* JADX INFO: renamed from: c */
    public final String f183923c;

    public q070(String str, String str2, String str3) {
        this.f183921a = str;
        this.f183922b = str2;
        this.f183923c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q070)) {
            return false;
        }
        q070 q070Var = (q070) obj;
        return wj50.m88271j(this.f183921a, q070Var.f183921a) && wj50.m88271j(this.f183922b, q070Var.f183922b) && wj50.m88271j(this.f183923c, q070Var.f183923c);
    }

    public final int hashCode() {
        return this.f183923c.hashCode() + s571.m77243b(this.f183921a.hashCode() * 31, 31, this.f183922b);
    }
}
