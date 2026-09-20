package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f38304a;

    /* JADX INFO: renamed from: b */
    public final String f38305b;

    public cif(int i, String str) {
        this.f38304a = i;
        this.f38305b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cif)) {
            return false;
        }
        cif cifVar = (cif) obj;
        return this.f38304a == cifVar.f38304a && wj50.m88271j(this.f38305b, cifVar.f38305b);
    }

    public final int hashCode() {
        return this.f38305b.hashCode() + s571.m77245d(Integer.hashCode(this.f38304a) * 31, 31, false);
    }
}
