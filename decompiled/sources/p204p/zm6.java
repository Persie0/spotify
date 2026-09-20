package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zm6 {

    /* JADX INFO: renamed from: a */
    public final Object f284165a;

    /* JADX INFO: renamed from: b */
    public final mm6 f284166b;

    /* JADX INFO: renamed from: c */
    public final f940 f284167c;

    public zm6(Object obj, mm6 mm6Var, f940 f940Var) {
        this.f284165a = obj;
        this.f284166b = mm6Var;
        this.f284167c = f940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm6)) {
            return false;
        }
        zm6 zm6Var = (zm6) obj;
        mm6 mm6Var = zm6Var.f284166b;
        mm6 mm6Var2 = this.f284166b;
        return wj50.m88271j(mm6Var2, mm6Var) && mm6Var2.m62266a(this.f284165a, zm6Var.f284165a) && wj50.m88271j(this.f284167c, zm6Var.f284167c);
    }

    public final int hashCode() {
        mm6 mm6Var = this.f284166b;
        return this.f284167c.hashCode() + ((mm6Var.m62267b(this.f284165a) + (mm6Var.hashCode() * 31)) * 31);
    }
}
