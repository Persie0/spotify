package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cns0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final pns0 f40084a;

    /* JADX INFO: renamed from: b */
    public final String f40085b;

    /* JADX INFO: renamed from: c */
    public final b250 f40086c;

    public cns0(pns0 pns0Var, String str, b250 b250Var) {
        this.f40084a = pns0Var;
        this.f40085b = str;
        this.f40086c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cns0)) {
            return false;
        }
        cns0 cns0Var = (cns0) obj;
        return wj50.m88271j(this.f40084a, cns0Var.f40084a) && wj50.m88271j(this.f40085b, cns0Var.f40085b) && wj50.m88271j(this.f40086c, cns0Var.f40086c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f40085b;
    }

    public final int hashCode() {
        return this.f40086c.hashCode() + s571.m77243b(this.f40084a.hashCode() * 31, 31, this.f40085b);
    }
}
