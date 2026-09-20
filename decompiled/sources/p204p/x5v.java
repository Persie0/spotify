package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class x5v {

    /* JADX INFO: renamed from: a */
    public final Set f258521a;

    /* JADX INFO: renamed from: b */
    public final r0s f258522b;

    /* JADX INFO: renamed from: c */
    public final r0s f258523c;

    /* JADX INFO: renamed from: d */
    public final boolean f258524d;

    /* JADX INFO: renamed from: e */
    public final int f258525e;

    /* JADX INFO: renamed from: f */
    public final boolean f258526f;

    /* JADX INFO: renamed from: g */
    public final z650 f258527g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x5v() {
        gbu gbuVar = gbu.f78413a;
        r0s r0sVar = r0s.f194553j;
        this(gbuVar, r0sVar, r0sVar, false, 1, true, null);
    }

    /* JADX INFO: renamed from: a */
    public static x5v m90048a(x5v x5vVar, Set set, r0s r0sVar, r0s r0sVar2, boolean z, int i, z650 z650Var, int i2) {
        if ((i2 & 1) != 0) {
            set = x5vVar.f258521a;
        }
        Set set2 = set;
        if ((i2 & 2) != 0) {
            r0sVar = x5vVar.f258522b;
        }
        r0s r0sVar3 = r0sVar;
        if ((i2 & 4) != 0) {
            r0sVar2 = x5vVar.f258523c;
        }
        r0s r0sVar4 = r0sVar2;
        if ((i2 & 8) != 0) {
            z = x5vVar.f258524d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = x5vVar.f258525e;
        }
        int i3 = i;
        boolean z3 = (i2 & 32) != 0 ? x5vVar.f258526f : false;
        if ((i2 & 64) != 0) {
            z650Var = x5vVar.f258527g;
        }
        x5vVar.getClass();
        return new x5v(set2, r0sVar3, r0sVar4, z2, i3, z3, z650Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5v)) {
            return false;
        }
        x5v x5vVar = (x5v) obj;
        return wj50.m88271j(this.f258521a, x5vVar.f258521a) && wj50.m88271j(this.f258522b, x5vVar.f258522b) && wj50.m88271j(this.f258523c, x5vVar.f258523c) && this.f258524d == x5vVar.f258524d && this.f258525e == x5vVar.f258525e && this.f258526f == x5vVar.f258526f && wj50.m88271j(this.f258527g, x5vVar.f258527g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f258525e, s571.m77245d((this.f258523c.hashCode() + ((this.f258522b.hashCode() + (this.f258521a.hashCode() * 31)) * 31)) * 31, 31, this.f258524d), 31), 31, this.f258526f);
        z650 z650Var = this.f258527g;
        return iM77245d + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }

    public x5v(Set set, r0s r0sVar, r0s r0sVar2, boolean z, int i, boolean z2, z650 z650Var) {
        this.f258521a = set;
        this.f258522b = r0sVar;
        this.f258523c = r0sVar2;
        this.f258524d = z;
        this.f258525e = i;
        this.f258526f = z2;
        this.f258527g = z650Var;
    }
}
