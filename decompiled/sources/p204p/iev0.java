package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class iev0 {

    /* JADX INFO: renamed from: a */
    public final List f101560a;

    /* JADX INFO: renamed from: b */
    public final int f101561b;

    /* JADX INFO: renamed from: c */
    public final boolean f101562c;

    /* JADX INFO: renamed from: d */
    public final int f101563d;

    /* JADX INFO: renamed from: e */
    public final int f101564e;

    /* JADX INFO: renamed from: f */
    public final boolean f101565f;

    /* JADX INFO: renamed from: g */
    public final Map f101566g;

    public iev0(List list, int i, boolean z, int i2, int i3, boolean z2, Map map) {
        this.f101560a = list;
        this.f101561b = i;
        this.f101562c = z;
        this.f101563d = i2;
        this.f101564e = i3;
        this.f101565f = z2;
        this.f101566g = map;
    }

    /* JADX INFO: renamed from: a */
    public static iev0 m50400a(iev0 iev0Var, List list, boolean z, Map map, int i) {
        if ((i & 1) != 0) {
            list = iev0Var.f101560a;
        }
        List list2 = list;
        int i2 = (i & 2) != 0 ? iev0Var.f101561b : 0;
        if ((i & 4) != 0) {
            z = iev0Var.f101562c;
        }
        boolean z2 = z;
        int i3 = (i & 8) != 0 ? iev0Var.f101563d : 0;
        int i4 = (i & 16) != 0 ? iev0Var.f101564e : 0;
        boolean z3 = iev0Var.f101565f;
        if ((i & 64) != 0) {
            map = iev0Var.f101566g;
        }
        iev0Var.getClass();
        return new iev0(list2, i2, z2, i3, i4, z3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iev0)) {
            return false;
        }
        iev0 iev0Var = (iev0) obj;
        return wj50.m88271j(this.f101560a, iev0Var.f101560a) && this.f101561b == iev0Var.f101561b && this.f101562c == iev0Var.f101562c && this.f101563d == iev0Var.f101563d && this.f101564e == iev0Var.f101564e && this.f101565f == iev0Var.f101565f && wj50.m88271j(this.f101566g, iev0Var.f101566g);
    }

    public final int hashCode() {
        return this.f101566g.hashCode() + s571.m77245d(mt60.m62800g(this.f101564e, mt60.m62800g(this.f101563d, s571.m77245d(mt60.m62800g(this.f101561b, this.f101560a.hashCode() * 31, 31), 31, this.f101562c), 31), 31), 31, this.f101565f);
    }

    public /* synthetic */ iev0(int i, int i2, int i3) {
        this(lau.f131415a, 0, false, i, i2, (i3 & 32) == 0, nau.f152117a);
    }
}
