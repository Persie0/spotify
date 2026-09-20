package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class z4e implements b5e {

    /* JADX INFO: renamed from: a */
    public final boolean f279211a;

    /* JADX INFO: renamed from: b */
    public final boolean f279212b;

    /* JADX INFO: renamed from: c */
    public final boolean f279213c;

    /* JADX INFO: renamed from: d */
    public final int f279214d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f279215e;

    /* JADX INFO: renamed from: f */
    public final gh00 f279216f;

    /* JADX INFO: renamed from: g */
    public final eh00 f279217g;

    /* JADX INFO: renamed from: h */
    public final yhu f279218h;

    public z4e(boolean z, boolean z2, ArrayList arrayList, gh00 gh00Var, eh00 eh00Var, int i) {
        z2 = (i & 2) != 0 ? false : z2;
        boolean z3 = (i & 4) == 0;
        yhu yhuVar = new yhu(8);
        this.f279211a = z;
        this.f279212b = z2;
        this.f279213c = z3;
        this.f279214d = 2;
        this.f279215e = arrayList;
        this.f279216f = gh00Var;
        this.f279217g = eh00Var;
        this.f279218h = yhuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4e)) {
            return false;
        }
        z4e z4eVar = (z4e) obj;
        return this.f279211a == z4eVar.f279211a && this.f279212b == z4eVar.f279212b && this.f279213c == z4eVar.f279213c && this.f279214d == z4eVar.f279214d && wj50.m88271j(this.f279215e, z4eVar.f279215e) && wj50.m88271j(this.f279216f, z4eVar.f279216f) && wj50.m88271j(this.f279217g, z4eVar.f279217g) && wj50.m88271j(this.f279218h, z4eVar.f279218h);
    }

    public final int hashCode() {
        return this.f279218h.hashCode() + p1v.m68853j(m6b.m60989d(this.f279216f, lq51.m59700f(this.f279215e, mt60.m62800g(this.f279214d, s571.m77245d(s571.m77245d(Boolean.hashCode(this.f279211a) * 31, 31, this.f279212b), 31, this.f279213c), 31), 31), 31), this.f279217g, 31);
    }
}
