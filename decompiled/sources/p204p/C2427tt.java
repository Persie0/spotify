package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.tt */
/* JADX INFO: loaded from: classes4.dex */
public final class C2427tt {

    /* JADX INFO: renamed from: a */
    public final C1681av f223466a;

    /* JADX INFO: renamed from: b */
    public final List f223467b;

    /* JADX INFO: renamed from: c */
    public final int f223468c;

    /* JADX INFO: renamed from: d */
    public final boolean f223469d;

    /* JADX INFO: renamed from: e */
    public final boolean f223470e;

    public C2427tt(C1681av c1681av, List list, int i, boolean z, boolean z2) {
        this.f223466a = c1681av;
        this.f223467b = list;
        this.f223468c = i;
        this.f223469d = z;
        this.f223470e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2427tt)) {
            return false;
        }
        C2427tt c2427tt = (C2427tt) obj;
        return wj50.m88271j(this.f223466a, c2427tt.f223466a) && wj50.m88271j(this.f223467b, c2427tt.f223467b) && this.f223468c == c2427tt.f223468c && this.f223469d == c2427tt.f223469d && this.f223470e == c2427tt.f223470e;
    }

    public final int hashCode() {
        C1681av c1681av = this.f223466a;
        int iHashCode = (c1681av == null ? 0 : c1681av.hashCode()) * 31;
        List list = this.f223467b;
        return Boolean.hashCode(this.f223470e) + s571.m77245d(mt60.m62800g(this.f223468c, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31, this.f223469d);
    }
}
