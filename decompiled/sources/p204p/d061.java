package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d061 {

    /* JADX INFO: renamed from: a */
    public final qcr f43793a;

    /* JADX INFO: renamed from: b */
    public final Map f43794b;

    /* JADX INFO: renamed from: c */
    public final f261 f43795c;

    public d061(qcr qcrVar, Map map, f261 f261Var) {
        this.f43793a = qcrVar;
        this.f43794b = map;
        this.f43795c = f261Var;
    }

    /* JADX INFO: renamed from: a */
    public final qcr m34525a() {
        return this.f43793a;
    }

    /* JADX INFO: renamed from: b */
    public final f261 m34526b() {
        return this.f43795c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d061)) {
            return false;
        }
        d061 d061Var = (d061) obj;
        return wj50.m88271j(this.f43793a, d061Var.f43793a) && wj50.m88271j(this.f43794b, d061Var.f43794b) && wj50.m88271j(this.f43795c, d061Var.f43795c);
    }

    public final int hashCode() {
        return this.f43795c.hashCode() + edb.m38557f(this.f43793a.hashCode() * 31, 31, this.f43794b);
    }
}
