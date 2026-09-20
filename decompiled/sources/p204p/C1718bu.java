package p204p;

/* JADX INFO: renamed from: p.bu */
/* JADX INFO: loaded from: classes4.dex */
public final class C1718bu {

    /* JADX INFO: renamed from: a */
    public final C1681av f30959a;

    /* JADX INFO: renamed from: b */
    public final boolean f30960b;

    public C1718bu(C1681av c1681av, boolean z) {
        this.f30959a = c1681av;
        this.f30960b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718bu)) {
            return false;
        }
        C1718bu c1718bu = (C1718bu) obj;
        return wj50.m88271j(this.f30959a, c1718bu.f30959a) && this.f30960b == c1718bu.f30960b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30960b) + (this.f30959a.hashCode() * 31);
    }
}
