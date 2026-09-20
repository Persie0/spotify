package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class as60 implements sr60 {

    /* JADX INFO: renamed from: a */
    public final sr60 f19314a;

    public as60(sr60 sr60Var) {
        this.f19314a = sr60Var;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: K */
    public final List mo27065K() {
        return this.f19314a.mo27065K();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        as60 as60Var = obj instanceof as60 ? (as60) obj : null;
        sr60 sr60Var = as60Var != null ? as60Var.f19314a : null;
        sr60 sr60Var2 = this.f19314a;
        if (!wj50.m88271j(sr60Var2, sr60Var)) {
            return false;
        }
        kq60 kq60VarMo27067y = sr60Var2.mo27067y();
        if (kq60VarMo27067y instanceof up60) {
            sr60 sr60Var3 = obj instanceof sr60 ? (sr60) obj : null;
            kq60 kq60VarMo27067y2 = sr60Var3 != null ? sr60Var3.mo27067y() : null;
            if (kq60VarMo27067y2 != null && (kq60VarMo27067y2 instanceof up60)) {
                return ((ife) ((up60) kq60VarMo27067y)).mo28587A().equals(((ife) ((up60) kq60VarMo27067y2)).mo28587A());
            }
        }
        return false;
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        return this.f19314a.getAnnotations();
    }

    public final int hashCode() {
        return this.f19314a.hashCode();
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: q */
    public final boolean mo27066q() {
        return this.f19314a.mo27066q();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f19314a;
    }

    @Override // p204p.sr60
    /* JADX INFO: renamed from: y */
    public final kq60 mo27067y() {
        return this.f19314a.mo27067y();
    }
}
