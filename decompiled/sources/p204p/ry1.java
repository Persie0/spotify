package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ry1 implements ty1 {

    /* JADX INFO: renamed from: a */
    public final String f203781a;

    /* JADX INFO: renamed from: b */
    public final ky1 f203782b;

    /* JADX INFO: renamed from: c */
    public final List f203783c;

    /* JADX INFO: renamed from: d */
    public final hy1 f203784d;

    public ry1(String str, ky1 ky1Var, List list, hy1 hy1Var) {
        this.f203781a = str;
        this.f203782b = ky1Var;
        this.f203783c = list;
        this.f203784d = hy1Var;
    }

    @Override // p204p.ty1
    /* JADX INFO: renamed from: c */
    public final ky1 mo74151c() {
        return this.f203782b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1Var = (ry1) obj;
        return wj50.m88271j(this.f203781a, ry1Var.f203781a) && wj50.m88271j(this.f203782b, ry1Var.f203782b) && wj50.m88271j(this.f203783c, ry1Var.f203783c) && wj50.m88271j(this.f203784d, ry1Var.f203784d);
    }

    @Override // p204p.ty1
    public final String getId() {
        return this.f203781a;
    }

    public final int hashCode() {
        int iHashCode = this.f203781a.hashCode() * 31;
        ky1 ky1Var = this.f203782b;
        int iM77244c = s571.m77244c((iHashCode + (ky1Var == null ? 0 : ky1Var.hashCode())) * 31, 31, this.f203783c);
        hy1 hy1Var = this.f203784d;
        return iM77244c + (hy1Var != null ? hy1Var.hashCode() : 0);
    }
}
