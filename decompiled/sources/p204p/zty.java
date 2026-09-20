package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zty {

    /* JADX INFO: renamed from: a */
    public final String f286284a;

    /* JADX INFO: renamed from: b */
    public final kr8 f286285b;

    /* JADX INFO: renamed from: c */
    public final cd00 f286286c;

    /* JADX INFO: renamed from: d */
    public final Object f286287d;

    public zty(String str, kr8 kr8Var, cd00 cd00Var, List list) {
        this.f286284a = str;
        this.f286285b = kr8Var;
        this.f286286c = cd00Var;
        this.f286287d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zty)) {
            return false;
        }
        zty ztyVar = (zty) obj;
        return this.f286284a.equals(ztyVar.f286284a) && this.f286285b.equals(ztyVar.f286285b) && wj50.m88271j(this.f286286c, ztyVar.f286286c) && this.f286287d.equals(ztyVar.f286287d);
    }

    public final int hashCode() {
        int iHashCode = (this.f286285b.hashCode() + (this.f286284a.hashCode() * 31)) * 31;
        cd00 cd00Var = this.f286286c;
        return this.f286287d.hashCode() + ((iHashCode + (cd00Var == null ? 0 : cd00Var.f36700a.hashCode())) * 31);
    }
}
