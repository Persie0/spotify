package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ssw0 implements qh0 {

    /* JADX INFO: renamed from: a */
    public final int f213723a;

    /* JADX INFO: renamed from: b */
    public final String f213724b;

    public ssw0(int i, String str) {
        this.f213723a = i;
        this.f213724b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssw0)) {
            return false;
        }
        ssw0 ssw0Var = (ssw0) obj;
        return this.f213723a == ssw0Var.f213723a && wj50.m88271j(this.f213724b, ssw0Var.f213724b);
    }

    public final int hashCode() {
        return this.f213724b.hashCode() + (edb.m38547C(this.f213723a) * 31);
    }
}
