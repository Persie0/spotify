package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bif implements mif {

    /* JADX INFO: renamed from: a */
    public final uhf f27423a;

    /* JADX INFO: renamed from: b */
    public final int f27424b;

    /* JADX INFO: renamed from: c */
    public final boolean f27425c;

    public bif(int i, uhf uhfVar, boolean z) {
        this.f27423a = uhfVar;
        this.f27424b = i;
        this.f27425c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bif)) {
            return false;
        }
        bif bifVar = (bif) obj;
        return wj50.m88271j(this.f27423a, bifVar.f27423a) && this.f27424b == bifVar.f27424b && this.f27425c == bifVar.f27425c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27425c) + mt60.m62800g(this.f27424b, this.f27423a.hashCode() * 31, 31);
    }
}
