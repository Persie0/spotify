package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ebf {

    /* JADX INFO: renamed from: a */
    public final qho f57919a;

    /* JADX INFO: renamed from: b */
    public final vt5 f57920b;

    public ebf(qho qhoVar, vt5 vt5Var) {
        this.f57919a = qhoVar;
        this.f57920b = vt5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebf)) {
            return false;
        }
        ebf ebfVar = (ebf) obj;
        return wj50.m88271j(this.f57919a, ebfVar.f57919a) && wj50.m88271j(this.f57920b, ebfVar.f57920b);
    }

    public final int hashCode() {
        return this.f57920b.hashCode() + (this.f57919a.hashCode() * 31);
    }
}
