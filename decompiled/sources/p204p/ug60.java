package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ug60 implements wg60 {

    /* JADX INFO: renamed from: a */
    public final String f229992a;

    /* JADX INFO: renamed from: b */
    public final List f229993b;

    /* JADX INFO: renamed from: c */
    public final ax50 f229994c;

    /* JADX INFO: renamed from: d */
    public final ax50 f229995d;

    /* JADX INFO: renamed from: e */
    public final boolean f229996e;

    /* JADX INFO: renamed from: f */
    public final m3y f229997f;

    /* JADX INFO: renamed from: g */
    public final wj60 f229998g;

    /* JADX INFO: renamed from: h */
    public final boolean f229999h;

    /* JADX INFO: renamed from: i */
    public final boolean f230000i;

    public ug60(String str, ro80 ro80Var, ax50 ax50Var, ax50 ax50Var2, boolean z, m3y m3yVar, wj60 wj60Var, boolean z2, boolean z3) {
        this.f229992a = str;
        this.f229993b = ro80Var;
        this.f229994c = ax50Var;
        this.f229995d = ax50Var2;
        this.f229996e = z;
        this.f229997f = m3yVar;
        this.f229998g = wj60Var;
        this.f229999h = z2;
        this.f230000i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug60)) {
            return false;
        }
        ug60 ug60Var = (ug60) obj;
        return wj50.m88271j(this.f229992a, ug60Var.f229992a) && wj50.m88271j(this.f229993b, ug60Var.f229993b) && wj50.m88271j(this.f229994c, ug60Var.f229994c) && wj50.m88271j(this.f229995d, ug60Var.f229995d) && this.f229996e == ug60Var.f229996e && wj50.m88271j(this.f229997f, ug60Var.f229997f) && this.f229998g == ug60Var.f229998g && this.f229999h == ug60Var.f229999h && this.f230000i == ug60Var.f230000i;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f229995d.hashCode() + ((this.f229994c.hashCode() + s571.m77244c(this.f229992a.hashCode() * 31, 31, this.f229993b)) * 31)) * 31, 31, this.f229996e);
        m3y m3yVar = this.f229997f;
        return Boolean.hashCode(this.f230000i) + s571.m77245d((this.f229998g.hashCode() + ((iM77245d + (m3yVar == null ? 0 : m3yVar.hashCode())) * 31)) * 31, 31, this.f229999h);
    }
}
