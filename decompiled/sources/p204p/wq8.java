package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wq8 {

    /* JADX INFO: renamed from: a */
    public final int f253948a;

    /* JADX INFO: renamed from: b */
    public final fq8 f253949b;

    public wq8(int i, fq8 fq8Var) {
        this.f253948a = i;
        this.f253949b = fq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq8)) {
            return false;
        }
        wq8 wq8Var = (wq8) obj;
        return this.f253948a == wq8Var.f253948a && wj50.m88271j(this.f253949b, wq8Var.f253949b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f253948a) * 31;
        fq8 fq8Var = this.f253949b;
        return iM38547C + (fq8Var == null ? 0 : fq8Var.hashCode());
    }
}
