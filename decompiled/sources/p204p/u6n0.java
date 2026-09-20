package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class u6n0 implements v6n0 {

    /* JADX INFO: renamed from: a */
    public final List f227388a;

    /* JADX INFO: renamed from: b */
    public final long f227389b;

    /* JADX INFO: renamed from: c */
    public final long f227390c;

    /* JADX INFO: renamed from: d */
    public final String f227391d;

    public u6n0(List list, long j, long j2, String str) {
        this.f227388a = list;
        this.f227389b = j;
        this.f227390c = j2;
        this.f227391d = str;
    }

    @Override // p204p.v6n0
    /* JADX INFO: renamed from: a */
    public final long mo74867a() {
        return this.f227390c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6n0)) {
            return false;
        }
        u6n0 u6n0Var = (u6n0) obj;
        return wj50.m88271j(this.f227388a, u6n0Var.f227388a) && this.f227389b == u6n0Var.f227389b && this.f227390c == u6n0Var.f227390c && wj50.m88271j(this.f227391d, u6n0Var.f227391d);
    }

    @Override // p204p.v6n0
    public final String getEventId() {
        return this.f227391d;
    }

    public final int hashCode() {
        return this.f227391d.hashCode() + dq60.m36605e(dq60.m36605e(this.f227388a.hashCode() * 31, this.f227389b, 31), this.f227390c, 31);
    }
}
