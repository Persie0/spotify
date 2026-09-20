package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d840 {

    /* JADX INFO: renamed from: a */
    public final String f46359a;

    /* JADX INFO: renamed from: b */
    public final un20 f46360b;

    /* JADX INFO: renamed from: c */
    public final List f46361c;

    /* JADX INFO: renamed from: d */
    public final boolean f46362d;

    /* JADX INFO: renamed from: e */
    public final f5u f46363e;

    public d840(String str, un20 un20Var, List list, boolean z, f5u f5uVar, int i) {
        z = (i & 32) != 0 ? false : z;
        f5uVar = (i & 64) != 0 ? null : f5uVar;
        this.f46359a = str;
        this.f46360b = un20Var;
        this.f46361c = list;
        this.f46362d = z;
        this.f46363e = f5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d840)) {
            return false;
        }
        d840 d840Var = (d840) obj;
        return wj50.m88271j(this.f46359a, d840Var.f46359a) && wj50.m88271j(this.f46360b, d840Var.f46360b) && wj50.m88271j(this.f46361c, d840Var.f46361c) && this.f46362d == d840Var.f46362d && wj50.m88271j(this.f46363e, d840Var.f46363e);
    }

    public final int hashCode() {
        int iHashCode = this.f46359a.hashCode() * 31;
        un20 un20Var = this.f46360b;
        int iM77245d = s571.m77245d(f710.m40938f(1, s571.m77244c((iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f46361c), 961), 31, this.f46362d);
        f5u f5uVar = this.f46363e;
        return iM77245d + (f5uVar != null ? f5uVar.hashCode() : 0);
    }
}
