package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a6u0 {

    /* JADX INFO: renamed from: a */
    public final String f12870a;

    /* JADX INFO: renamed from: b */
    public final List f12871b;

    /* JADX INFO: renamed from: c */
    public final String f12872c;

    /* JADX INFO: renamed from: d */
    public final gp8 f12873d;

    /* JADX INFO: renamed from: e */
    public final th00 f12874e;

    public a6u0(String str, List list, String str2, gp8 gp8Var, th00 th00Var) {
        this.f12870a = str;
        this.f12871b = list;
        this.f12872c = str2;
        this.f12873d = gp8Var;
        this.f12874e = th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6u0)) {
            return false;
        }
        a6u0 a6u0Var = (a6u0) obj;
        return wj50.m88271j(this.f12870a, a6u0Var.f12870a) && wj50.m88271j(this.f12871b, a6u0Var.f12871b) && wj50.m88271j(this.f12872c, a6u0Var.f12872c) && wj50.m88271j(this.f12873d, a6u0Var.f12873d) && wj50.m88271j(this.f12874e, a6u0Var.f12874e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f12870a.hashCode() * 31, 31, this.f12871b);
        String str = this.f12872c;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        gp8 gp8Var = this.f12873d;
        return this.f12874e.hashCode() + ((iHashCode + (gp8Var != null ? gp8Var.hashCode() : 0)) * 31);
    }
}
