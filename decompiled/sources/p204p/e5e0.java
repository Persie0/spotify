package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class e5e0 extends g5e0 {

    /* JADX INFO: renamed from: a */
    public final String f56386a;

    /* JADX INFO: renamed from: b */
    public final b250 f56387b;

    /* JADX INFO: renamed from: c */
    public final n5e0 f56388c;

    public e5e0(String str, b250 b250Var, n5e0 n5e0Var) {
        this.f56386a = str;
        this.f56387b = b250Var;
        this.f56388c = n5e0Var;
    }

    @Override // p204p.g5e0
    /* JADX INFO: renamed from: a */
    public final n5e0 mo37810a() {
        return this.f56388c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5e0)) {
            return false;
        }
        e5e0 e5e0Var = (e5e0) obj;
        return wj50.m88271j(this.f56386a, e5e0Var.f56386a) && wj50.m88271j(this.f56387b, e5e0Var.f56387b) && wj50.m88271j(this.f56388c, e5e0Var.f56388c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f56386a;
    }

    public final int hashCode() {
        return this.f56388c.hashCode() + AbstractC0000a.m10i(this.f56387b, this.f56386a.hashCode() * 31, 31);
    }
}
