package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.cr */
/* JADX INFO: loaded from: classes4.dex */
public final class C1751cr {

    /* JADX INFO: renamed from: a */
    public final List f41128a;

    /* JADX INFO: renamed from: b */
    public final boolean f41129b;

    /* JADX INFO: renamed from: c */
    public final os01 f41130c;

    public C1751cr(List list, boolean z, os01 os01Var) {
        this.f41128a = list;
        this.f41129b = z;
        this.f41130c = os01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1751cr)) {
            return false;
        }
        C1751cr c1751cr = (C1751cr) obj;
        return this.f41128a.equals(c1751cr.f41128a) && this.f41129b == c1751cr.f41129b && this.f41130c.equals(c1751cr.f41130c);
    }

    public final int hashCode() {
        return this.f41130c.hashCode() + s571.m77245d(this.f41128a.hashCode() * 31, 31, this.f41129b);
    }
}
