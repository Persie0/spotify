package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oio0 implements mzs0 {

    /* JADX INFO: renamed from: a */
    public final String f165848a;

    /* JADX INFO: renamed from: b */
    public final String f165849b;

    /* JADX INFO: renamed from: c */
    public final vq50 f165850c;

    /* JADX INFO: renamed from: d */
    public final int f165851d;

    public oio0(String str, String str2, vq50 vq50Var, int i) {
        this.f165848a = str;
        this.f165849b = str2;
        this.f165850c = vq50Var;
        this.f165851d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oio0)) {
            return false;
        }
        oio0 oio0Var = (oio0) obj;
        return wj50.m88271j(this.f165848a, oio0Var.f165848a) && wj50.m88271j(this.f165849b, oio0Var.f165849b) && wj50.m88271j(this.f165850c, oio0Var.f165850c) && this.f165851d == oio0Var.f165851d;
    }

    public final int hashCode() {
        int iHashCode = (this.f165850c.hashCode() + s571.m77243b(this.f165848a.hashCode() * 31, 31, this.f165849b)) * 31;
        int i = this.f165851d;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }

    public oio0(String str, String str2, gq50 gq50Var, int i) {
        this(str, str2, (i & 4) != 0 ? new uq50() : gq50Var, 0);
    }
}
