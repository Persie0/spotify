package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f153072a;

    /* JADX INFO: renamed from: b */
    public final String f153073b;

    public nes0(String str, String str2) {
        this.f153072a = str;
        this.f153073b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nes0)) {
            return false;
        }
        nes0 nes0Var = (nes0) obj;
        return wj50.m88271j(this.f153072a, nes0Var.f153072a) && wj50.m88271j(this.f153073b, nes0Var.f153073b);
    }

    public final int hashCode() {
        int iHashCode = this.f153072a.hashCode() * 31;
        String str = this.f153073b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
