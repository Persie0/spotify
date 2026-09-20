package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class f5e0 extends g5e0 {

    /* JADX INFO: renamed from: a */
    public final String f66031a;

    /* JADX INFO: renamed from: b */
    public final b250 f66032b;

    /* JADX INFO: renamed from: c */
    public final n5e0 f66033c;

    public f5e0(String str, b250 b250Var, n5e0 n5e0Var) {
        this.f66031a = str;
        this.f66032b = b250Var;
        this.f66033c = n5e0Var;
    }

    @Override // p204p.g5e0
    /* JADX INFO: renamed from: a */
    public final n5e0 mo37810a() {
        return this.f66033c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5e0)) {
            return false;
        }
        f5e0 f5e0Var = (f5e0) obj;
        return wj50.m88271j(this.f66031a, f5e0Var.f66031a) && wj50.m88271j(this.f66032b, f5e0Var.f66032b) && wj50.m88271j(this.f66033c, f5e0Var.f66033c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f66031a;
    }

    public final int hashCode() {
        return this.f66033c.hashCode() + AbstractC0000a.m10i(this.f66032b, this.f66031a.hashCode() * 31, 31);
    }
}
