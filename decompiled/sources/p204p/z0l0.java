package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class z0l0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final b250 f278134a;

    /* JADX INFO: renamed from: b */
    public final b1l0 f278135b;

    public z0l0(b250 b250Var, b1l0 b1l0Var) {
        this.f278134a = b250Var;
        this.f278135b = b1l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0l0)) {
            return false;
        }
        z0l0 z0l0Var = (z0l0) obj;
        return this.f278134a.equals(z0l0Var.f278134a) && this.f278135b.equals(z0l0Var.f278135b);
    }

    @Override // p204p.l630
    public final String getId() {
        return "offline-ready-shelf";
    }

    public final int hashCode() {
        return this.f278135b.hashCode() + AbstractC0000a.m10i(this.f278134a, -1150326230, 31);
    }
}
