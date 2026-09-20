package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f208091a;

    /* JADX INFO: renamed from: b */
    public final String f208092b;

    /* JADX INFO: renamed from: c */
    public final String f208093c;

    /* JADX INFO: renamed from: d */
    public final qcr0 f208094d;

    public sdv0(String str, String str2, String str3, qcr0 qcr0Var) {
        this.f208091a = str;
        this.f208092b = str2;
        this.f208093c = str3;
        this.f208094d = qcr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdv0)) {
            return false;
        }
        sdv0 sdv0Var = (sdv0) obj;
        return wj50.m88271j(this.f208091a, sdv0Var.f208091a) && wj50.m88271j(this.f208092b, sdv0Var.f208092b) && wj50.m88271j(this.f208093c, sdv0Var.f208093c) && wj50.m88271j(this.f208094d, sdv0Var.f208094d);
    }

    public final int hashCode() {
        return this.f208094d.hashCode() + s571.m77243b(s571.m77243b(this.f208091a.hashCode() * 31, 31, this.f208092b), 31, this.f208093c);
    }
}
