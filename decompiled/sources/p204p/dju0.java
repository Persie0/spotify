package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dju0 implements gju0 {

    /* JADX INFO: renamed from: a */
    public final String f49745a;

    /* JADX INFO: renamed from: b */
    public final String f49746b;

    /* JADX INFO: renamed from: c */
    public final String f49747c;

    /* JADX INFO: renamed from: d */
    public final Throwable f49748d;

    public dju0(String str, String str2, String str3, Throwable th) {
        this.f49745a = str;
        this.f49746b = str2;
        this.f49747c = str3;
        this.f49748d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dju0)) {
            return false;
        }
        dju0 dju0Var = (dju0) obj;
        return wj50.m88271j(this.f49745a, dju0Var.f49745a) && wj50.m88271j(this.f49746b, dju0Var.f49746b) && wj50.m88271j(this.f49747c, dju0Var.f49747c) && wj50.m88271j(this.f49748d, dju0Var.f49748d);
    }

    public final int hashCode() {
        return this.f49748d.hashCode() + s571.m77243b(s571.m77243b(this.f49745a.hashCode() * 31, 31, this.f49746b), 31, this.f49747c);
    }
}
