package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nfj implements pfj {

    /* JADX INFO: renamed from: a */
    public final qf40 f153385a;

    /* JADX INFO: renamed from: b */
    public final String f153386b;

    /* JADX INFO: renamed from: c */
    public final String f153387c;

    /* JADX INFO: renamed from: d */
    public final String f153388d;

    public nfj(String str, String str2, String str3, qf40 qf40Var) {
        this.f153385a = qf40Var;
        this.f153386b = str;
        this.f153387c = str2;
        this.f153388d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfj)) {
            return false;
        }
        nfj nfjVar = (nfj) obj;
        return wj50.m88271j(this.f153385a, nfjVar.f153385a) && wj50.m88271j(this.f153386b, nfjVar.f153386b) && wj50.m88271j(this.f153387c, nfjVar.f153387c) && wj50.m88271j(this.f153388d, nfjVar.f153388d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f153385a.hashCode() * 31, 31, this.f153386b), 31, this.f153387c);
        String str = this.f153388d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
