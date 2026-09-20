package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cql {

    /* JADX INFO: renamed from: a */
    public final List f40917a;

    /* JADX INFO: renamed from: b */
    public final String f40918b;

    /* JADX INFO: renamed from: c */
    public final List f40919c;

    /* JADX INFO: renamed from: d */
    public final boolean f40920d;

    /* JADX INFO: renamed from: e */
    public final boolean f40921e;

    /* JADX INFO: renamed from: f */
    public final boolean f40922f;

    public cql(List list, String str, List list2, boolean z, boolean z2, boolean z3) {
        this.f40917a = list;
        this.f40918b = str;
        this.f40919c = list2;
        this.f40920d = z;
        this.f40921e = z2;
        this.f40922f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cql)) {
            return false;
        }
        cql cqlVar = (cql) obj;
        return wj50.m88271j(this.f40917a, cqlVar.f40917a) && wj50.m88271j(this.f40918b, cqlVar.f40918b) && wj50.m88271j(this.f40919c, cqlVar.f40919c) && this.f40920d == cqlVar.f40920d && this.f40921e == cqlVar.f40921e && this.f40922f == cqlVar.f40922f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40922f) + s571.m77245d(s571.m77245d(s571.m77244c(s571.m77243b(this.f40917a.hashCode() * 31, 31, this.f40918b), 31, this.f40919c), 31, this.f40920d), 31, this.f40921e);
    }
}
