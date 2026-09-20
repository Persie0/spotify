package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class z980 {

    /* JADX INFO: renamed from: a */
    public final int f280707a;

    /* JADX INFO: renamed from: b */
    public final int f280708b;

    /* JADX INFO: renamed from: c */
    public final oe70 f280709c;

    /* JADX INFO: renamed from: d */
    public final boolean f280710d;

    /* JADX INFO: renamed from: e */
    public final boolean f280711e;

    /* JADX INFO: renamed from: f */
    public final wr31 f280712f;

    /* JADX INFO: renamed from: g */
    public final boolean f280713g;

    /* JADX INFO: renamed from: h */
    public final boolean f280714h;

    /* JADX INFO: renamed from: i */
    public final boolean f280715i;

    /* JADX INFO: renamed from: j */
    public final ibj f280716j;

    /* JADX INFO: renamed from: k */
    public final List f280717k;

    /* JADX INFO: renamed from: l */
    public final List f280718l;

    public z980(int i, int i2, oe70 oe70Var, boolean z, boolean z2, wr31 wr31Var, boolean z3, boolean z4, boolean z5, ibj ibjVar, List list, List list2) {
        this.f280707a = i;
        this.f280708b = i2;
        this.f280709c = oe70Var;
        this.f280710d = z;
        this.f280711e = z2;
        this.f280712f = wr31Var;
        this.f280713g = z3;
        this.f280714h = z4;
        this.f280715i = z5;
        this.f280716j = ibjVar;
        this.f280717k = list;
        this.f280718l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z980)) {
            return false;
        }
        z980 z980Var = (z980) obj;
        return this.f280707a == z980Var.f280707a && this.f280708b == z980Var.f280708b && wj50.m88271j(this.f280709c, z980Var.f280709c) && this.f280710d == z980Var.f280710d && this.f280711e == z980Var.f280711e && this.f280712f == z980Var.f280712f && this.f280713g == z980Var.f280713g && this.f280714h == z980Var.f280714h && this.f280715i == z980Var.f280715i && wj50.m88271j(this.f280716j, z980Var.f280716j) && wj50.m88271j(this.f280717k, z980Var.f280717k) && wj50.m88271j(this.f280718l, z980Var.f280718l);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f280709c.hashCode() + mt60.m62800g(this.f280708b, Integer.hashCode(this.f280707a) * 31, 31)) * 31, 31, this.f280710d), 31, this.f280711e);
        wr31 wr31Var = this.f280712f;
        return this.f280718l.hashCode() + s571.m77244c((this.f280716j.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (wr31Var == null ? 0 : wr31Var.hashCode())) * 31, 31, this.f280713g), 31, this.f280714h), 31, this.f280715i)) * 31, 31, this.f280717k);
    }

    public /* synthetic */ z980(int i, int i2, oe70 oe70Var, boolean z, boolean z2, wr31 wr31Var, boolean z3, boolean z4, ibj ibjVar, List list, List list2, int i3) {
        this(i, i2, oe70Var, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, wr31Var, z3, z4, false, (i3 & 512) != 0 ? fbj.f67843a : ibjVar, list, list2);
    }
}
