package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tnq {

    /* JADX INFO: renamed from: a */
    public final String f222019a;

    /* JADX INFO: renamed from: b */
    public final int f222020b;

    /* JADX INFO: renamed from: c */
    public final cpq f222021c;

    public tnq(String str, int i, cpq cpqVar) {
        this.f222019a = str;
        this.f222020b = i;
        this.f222021c = cpqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnq)) {
            return false;
        }
        tnq tnqVar = (tnq) obj;
        return wj50.m88271j(this.f222019a, tnqVar.f222019a) && this.f222020b == tnqVar.f222020b && wj50.m88271j(this.f222021c, tnqVar.f222021c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f222020b, this.f222019a.hashCode() * 31, 31);
        cpq cpqVar = this.f222021c;
        return iM40938f + (cpqVar == null ? 0 : cpqVar.hashCode());
    }
}
