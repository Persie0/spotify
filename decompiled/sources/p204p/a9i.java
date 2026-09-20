package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a9i {

    /* JADX INFO: renamed from: a */
    public final x8i f13572a;

    /* JADX INFO: renamed from: b */
    public final List f13573b;

    /* JADX INFO: renamed from: c */
    public final y8i f13574c;

    /* JADX INFO: renamed from: d */
    public final muj0 f13575d;

    /* JADX INFO: renamed from: e */
    public final sy5 f13576e;

    /* JADX INFO: renamed from: f */
    public final v16 f13577f;

    public a9i(x8i x8iVar, List list, y8i y8iVar, muj0 muj0Var, sy5 sy5Var, v16 v16Var) {
        this.f13572a = x8iVar;
        this.f13573b = list;
        this.f13574c = y8iVar;
        this.f13575d = muj0Var;
        this.f13576e = sy5Var;
        this.f13577f = v16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9i)) {
            return false;
        }
        a9i a9iVar = (a9i) obj;
        return wj50.m88271j(this.f13572a, a9iVar.f13572a) && wj50.m88271j(this.f13573b, a9iVar.f13573b) && wj50.m88271j(this.f13574c, a9iVar.f13574c) && wj50.m88271j(this.f13575d, a9iVar.f13575d) && wj50.m88271j(this.f13576e, a9iVar.f13576e) && wj50.m88271j(this.f13577f, a9iVar.f13577f);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f13572a.f259161a.hashCode() * 31, 31, this.f13573b);
        y8i y8iVar = this.f13574c;
        int iHashCode = (iM77244c + (y8iVar == null ? 0 : y8iVar.f270304a.hashCode())) * 31;
        muj0 muj0Var = this.f13575d;
        int iHashCode2 = (iHashCode + (muj0Var == null ? 0 : muj0Var.hashCode())) * 31;
        sy5 sy5Var = this.f13576e;
        int iHashCode3 = (iHashCode2 + (sy5Var == null ? 0 : sy5Var.hashCode())) * 31;
        v16 v16Var = this.f13577f;
        return iHashCode3 + (v16Var != null ? v16Var.hashCode() : 0);
    }
}
