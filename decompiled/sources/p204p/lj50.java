package p204p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class lj50 {

    /* JADX INFO: renamed from: a */
    public final di41 f133988a;

    /* JADX INFO: renamed from: b */
    public final Set f133989b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f133990c;

    public lj50(di41 di41Var, Set set, LinkedHashMap linkedHashMap) {
        this.f133988a = di41Var;
        this.f133989b = set;
        this.f133990c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj50)) {
            return false;
        }
        lj50 lj50Var = (lj50) obj;
        return this.f133988a.equals(lj50Var.f133988a) && this.f133989b.equals(lj50Var.f133989b) && this.f133990c.equals(lj50Var.f133990c);
    }

    public final int hashCode() {
        return this.f133990c.hashCode() + klh.m56830b(this.f133988a.hashCode() * 31, 31, this.f133989b);
    }
}
