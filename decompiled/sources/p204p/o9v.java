package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o9v {

    /* JADX INFO: renamed from: a */
    public final List f163136a;

    /* JADX INFO: renamed from: b */
    public final m9v f163137b;

    /* JADX INFO: renamed from: c */
    public final int f163138c;

    /* JADX INFO: renamed from: d */
    public final udb0 f163139d;

    /* JADX INFO: renamed from: e */
    public final int f163140e;

    /* JADX INFO: renamed from: f */
    public final boolean f163141f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f163142g;

    public o9v(List list, m9v m9vVar, int i, udb0 udb0Var, int i2, boolean z, ArrayList arrayList) {
        this.f163136a = list;
        this.f163137b = m9vVar;
        this.f163138c = i;
        this.f163139d = udb0Var;
        this.f163140e = i2;
        this.f163141f = z;
        this.f163142g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9v)) {
            return false;
        }
        o9v o9vVar = (o9v) obj;
        return this.f163136a.equals(o9vVar.f163136a) && this.f163137b.equals(o9vVar.f163137b) && this.f163138c == o9vVar.f163138c && this.f163139d == o9vVar.f163139d && this.f163140e == o9vVar.f163140e && this.f163141f == o9vVar.f163141f && this.f163142g.equals(o9vVar.f163142g);
    }

    public final int hashCode() {
        return this.f163142g.hashCode() + s571.m77245d(f710.m40938f(this.f163140e, (this.f163139d.hashCode() + mt60.m62800g(this.f163138c, (this.f163137b.hashCode() + (this.f163136a.hashCode() * 31)) * 31, 31)) * 31, 31), 31, this.f163141f);
    }
}
