package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y430 {

    /* JADX INFO: renamed from: a */
    public final boolean f269064a;

    /* JADX INFO: renamed from: b */
    public final boolean f269065b;

    /* JADX INFO: renamed from: c */
    public final x9c f269066c;

    /* JADX INFO: renamed from: d */
    public final kaa0 f269067d;

    public y430(boolean z, boolean z2, x9c x9cVar, kaa0 kaa0Var) {
        this.f269064a = z;
        this.f269065b = z2;
        this.f269066c = x9cVar;
        this.f269067d = kaa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y430)) {
            return false;
        }
        y430 y430Var = (y430) obj;
        return this.f269064a == y430Var.f269064a && this.f269065b == y430Var.f269065b && wj50.m88271j(this.f269066c, y430Var.f269066c) && this.f269067d == y430Var.f269067d;
    }

    public final int hashCode() {
        return this.f269067d.hashCode() + ((this.f269066c.hashCode() + s571.m77245d(Boolean.hashCode(this.f269064a) * 31, 31, this.f269065b)) * 31);
    }
}
