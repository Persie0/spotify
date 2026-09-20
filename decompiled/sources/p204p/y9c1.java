package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y9c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f270568a;

    /* JADX INFO: renamed from: b */
    public final fv51 f270569b;

    /* JADX INFO: renamed from: c */
    public final List f270570c;

    /* JADX INFO: renamed from: d */
    public final boolean f270571d;

    public y9c1(boolean z, fv51 fv51Var, List list, boolean z2) {
        this.f270568a = z;
        this.f270569b = fv51Var;
        this.f270570c = list;
        this.f270571d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9c1)) {
            return false;
        }
        y9c1 y9c1Var = (y9c1) obj;
        return this.f270568a == y9c1Var.f270568a && wj50.m88271j(this.f270569b, y9c1Var.f270569b) && wj50.m88271j(this.f270570c, y9c1Var.f270570c) && this.f270571d == y9c1Var.f270571d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f270568a) * 31;
        fv51 fv51Var = this.f270569b;
        return Boolean.hashCode(this.f270571d) + s571.m77244c((iHashCode + (fv51Var == null ? 0 : fv51Var.hashCode())) * 31, 31, this.f270570c);
    }
}
