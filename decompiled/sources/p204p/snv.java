package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class snv implements tnv {

    /* JADX INFO: renamed from: a */
    public final String f211030a;

    /* JADX INFO: renamed from: b */
    public final bso0 f211031b;

    /* JADX INFO: renamed from: c */
    public final ctj f211032c;

    /* JADX INFO: renamed from: d */
    public final pv00 f211033d;

    /* JADX INFO: renamed from: e */
    public final d850 f211034e;

    public snv(String str, bso0 bso0Var, ctj ctjVar, pv00 pv00Var, d850 d850Var) {
        this.f211030a = str;
        this.f211031b = bso0Var;
        this.f211032c = ctjVar;
        this.f211033d = pv00Var;
        this.f211034e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snv)) {
            return false;
        }
        snv snvVar = (snv) obj;
        return wj50.m88271j(this.f211030a, snvVar.f211030a) && this.f211031b == snvVar.f211031b && wj50.m88271j(this.f211032c, snvVar.f211032c) && wj50.m88271j(this.f211033d, snvVar.f211033d) && wj50.m88271j(this.f211034e, snvVar.f211034e);
    }

    public final int hashCode() {
        return this.f211034e.hashCode() + ((this.f211033d.hashCode() + ((this.f211032c.hashCode() + ((this.f211031b.hashCode() + (this.f211030a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
