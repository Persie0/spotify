package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class tpv0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final String f222607a;

    /* JADX INFO: renamed from: b */
    public final b250 f222608b;

    /* JADX INFO: renamed from: c */
    public final aqv0 f222609c;

    /* JADX INFO: renamed from: d */
    public final un20 f222610d;

    public tpv0(String str, b250 b250Var, aqv0 aqv0Var, un20 un20Var) {
        this.f222607a = str;
        this.f222608b = b250Var;
        this.f222609c = aqv0Var;
        this.f222610d = un20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpv0)) {
            return false;
        }
        tpv0 tpv0Var = (tpv0) obj;
        return wj50.m88271j(this.f222607a, tpv0Var.f222607a) && wj50.m88271j(this.f222608b, tpv0Var.f222608b) && wj50.m88271j(this.f222609c, tpv0Var.f222609c) && wj50.m88271j(this.f222610d, tpv0Var.f222610d);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f222607a;
    }

    public final int hashCode() {
        int iHashCode = (this.f222609c.hashCode() + AbstractC0000a.m10i(this.f222608b, this.f222607a.hashCode() * 31, 31)) * 31;
        un20 un20Var = this.f222610d;
        return iHashCode + (un20Var == null ? 0 : un20Var.hashCode());
    }
}
