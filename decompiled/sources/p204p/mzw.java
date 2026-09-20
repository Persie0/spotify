package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mzw implements x2x {

    /* JADX INFO: renamed from: a */
    public final String f148801a;

    /* JADX INFO: renamed from: b */
    public final n3x0 f148802b;

    public mzw(String str, n3x0 n3x0Var) {
        this.f148801a = str;
        this.f148802b = n3x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzw)) {
            return false;
        }
        mzw mzwVar = (mzw) obj;
        return wj50.m88271j(this.f148801a, mzwVar.f148801a) && wj50.m88271j(this.f148802b, mzwVar.f148802b);
    }

    public final int hashCode() {
        return this.f148802b.hashCode() + (this.f148801a.hashCode() * 31);
    }
}
