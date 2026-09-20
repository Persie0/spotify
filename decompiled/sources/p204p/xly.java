package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xly implements hmy {

    /* JADX INFO: renamed from: a */
    public final koy f263248a;

    /* JADX INFO: renamed from: b */
    public final boolean f263249b;

    public xly(koy koyVar, boolean z) {
        this.f263248a = koyVar;
        this.f263249b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xly)) {
            return false;
        }
        xly xlyVar = (xly) obj;
        return wj50.m88271j(this.f263248a, xlyVar.f263248a) && this.f263249b == xlyVar.f263249b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263249b) + (this.f263248a.hashCode() * 31);
    }
}
