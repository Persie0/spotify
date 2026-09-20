package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class wj80 {

    /* JADX INFO: renamed from: a */
    public final qf40 f251899a;

    /* JADX INFO: renamed from: b */
    public final float f251900b;

    /* JADX INFO: renamed from: c */
    public final long f251901c;

    /* JADX INFO: renamed from: d */
    public final p68 f251902d;

    /* JADX INFO: renamed from: e */
    public final vh00 f251903e;

    /* JADX INFO: renamed from: f */
    public final c9m f251904f;

    public wj80(qf40 qf40Var, float f, long j, p68 p68Var, vh00 vh00Var, c9m c9mVar) {
        this.f251899a = qf40Var;
        this.f251900b = f;
        this.f251901c = j;
        this.f251902d = p68Var;
        this.f251903e = vh00Var;
        this.f251904f = c9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj80)) {
            return false;
        }
        wj80 wj80Var = (wj80) obj;
        if (!wj50.m88271j(this.f251899a, wj80Var.f251899a) || Float.compare(this.f251900b, wj80Var.f251900b) != 0) {
            return false;
        }
        long j = wj80Var.f251901c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f251901c, j) && wj50.m88271j(this.f251902d, wj80Var.f251902d) && wj50.m88271j(this.f251903e, wj80Var.f251903e) && this.f251904f == wj80Var.f251904f;
    }

    public final int hashCode() {
        qf40 qf40Var = this.f251899a;
        int iM8g = AbstractC0000a.m8g((qf40Var == null ? 0 : qf40Var.hashCode()) * 31, 31, this.f251900b);
        int i = n6f.f150872l;
        int iM36605e = dq60.m36605e(iM8g, this.f251901c, 31);
        p68 p68Var = this.f251902d;
        return this.f251904f.hashCode() + ((this.f251903e.hashCode() + ((iM36605e + (p68Var != null ? p68Var.hashCode() : 0)) * 31)) * 31);
    }
}
