package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class v9t {

    /* JADX INFO: renamed from: a */
    public final String f239030a;

    /* JADX INFO: renamed from: b */
    public final List f239031b;

    /* JADX INFO: renamed from: c */
    public final qla1 f239032c;

    public v9t(String str, List list, qla1 qla1Var) {
        this.f239030a = str;
        this.f239031b = list;
        this.f239032c = qla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9t)) {
            return false;
        }
        v9t v9tVar = (v9t) obj;
        return wj50.m88271j(this.f239030a, v9tVar.f239030a) && wj50.m88271j(this.f239031b, v9tVar.f239031b) && wj50.m88271j(this.f239032c, v9tVar.f239032c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f239030a.hashCode() * 31, 31, this.f239031b);
        qla1 qla1Var = this.f239032c;
        return iM77244c + (qla1Var == null ? 0 : qla1Var.hashCode());
    }
}
