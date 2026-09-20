package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tvv extends wvv {

    /* JADX INFO: renamed from: a */
    public final ou31 f224245a;

    /* JADX INFO: renamed from: b */
    public final sr01 f224246b;

    /* JADX INFO: renamed from: c */
    public final int f224247c;

    public tvv(ou31 ou31Var, sr01 sr01Var, int i) {
        this.f224245a = ou31Var;
        this.f224246b = sr01Var;
        this.f224247c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvv)) {
            return false;
        }
        tvv tvvVar = (tvv) obj;
        return wj50.m88271j(this.f224245a, tvvVar.f224245a) && wj50.m88271j(this.f224246b, tvvVar.f224246b) && this.f224247c == tvvVar.f224247c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f224247c) + rkh0.m75733g(this.f224246b, this.f224245a.hashCode() * 31, 31);
    }
}
