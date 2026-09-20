package p204p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class gt91 implements Serializable {
    public static final ft91 Companion = new ft91();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f84113c = {q3d0.m72078I(2, c781.f34794N0), q3d0.m72078I(2, c781.f34795O0)};

    /* JADX INFO: renamed from: d */
    public static final gt91 f84114d;

    /* JADX INFO: renamed from: e */
    public static final gt91 f84115e;

    /* JADX INFO: renamed from: a */
    public final List f84116a;

    /* JADX INFO: renamed from: b */
    public final wu31 f84117b;

    static {
        tu31 tu31Var = tu31.INSTANCE;
        lau lauVar = lau.f131415a;
        f84114d = new gt91(lauVar, tu31Var);
        f84115e = new gt91(lauVar, uu31.INSTANCE);
        new gt91(lauVar, vu31.INSTANCE);
    }

    public /* synthetic */ gt91(int i, List list, wu31 wu31Var) {
        if (1 != (i & 1)) {
            edo.m38617p(i, 1, et91.f62670a.getDescriptor());
            throw null;
        }
        this.f84116a = list;
        if ((i & 2) == 0) {
            this.f84117b = null;
        } else {
            this.f84117b = wu31Var;
        }
        if (!list.isEmpty() && this.f84117b != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final wu31 m45683a() {
        if (!this.f84116a.isEmpty()) {
            return null;
        }
        wu31 wu31Var = this.f84117b;
        return wu31Var == null ? uu31.INSTANCE : wu31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt91)) {
            return false;
        }
        gt91 gt91Var = (gt91) obj;
        return wj50.m88271j(this.f84116a, gt91Var.f84116a) && wj50.m88271j(this.f84117b, gt91Var.f84117b);
    }

    public final int hashCode() {
        int iHashCode = this.f84116a.hashCode() * 31;
        wu31 wu31Var = this.f84117b;
        return iHashCode + (wu31Var == null ? 0 : wu31Var.hashCode());
    }

    public gt91(List list, wu31 wu31Var) {
        this.f84116a = list;
        this.f84117b = wu31Var;
        if (!list.isEmpty() && wu31Var != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
