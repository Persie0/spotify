package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s721 implements t721 {

    /* JADX INFO: renamed from: a */
    public final String f206263a;

    /* JADX INFO: renamed from: b */
    public final int f206264b;

    public s721(String str, int i) {
        this.f206263a = str;
        this.f206264b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s721)) {
            return false;
        }
        s721 s721Var = (s721) obj;
        return wj50.m88271j(this.f206263a, s721Var.f206263a) && this.f206264b == s721Var.f206264b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f206264b) + (this.f206263a.hashCode() * 31);
    }
}
