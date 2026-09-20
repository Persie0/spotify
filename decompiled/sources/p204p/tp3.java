package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class tp3 implements fie0 {

    /* JADX INFO: renamed from: a */
    public final vb9 f222419a;

    /* JADX INFO: renamed from: b */
    public final vb9 f222420b;

    /* JADX INFO: renamed from: c */
    public final int f222421c;

    public tp3(vb9 vb9Var, vb9 vb9Var2, int i) {
        this.f222419a = vb9Var;
        this.f222420b = vb9Var2;
        this.f222421c = i;
    }

    @Override // p204p.fie0
    /* JADX INFO: renamed from: a */
    public final int mo41716a(c450 c450Var, long j, int i) {
        int iM85124a = this.f222420b.m85124a(0, c450Var.m31424b());
        return c450Var.f33849b + iM85124a + (-this.f222419a.m85124a(0, i)) + this.f222421c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp3)) {
            return false;
        }
        tp3 tp3Var = (tp3) obj;
        return this.f222419a.equals(tp3Var.f222419a) && this.f222420b.equals(tp3Var.f222420b) && this.f222421c == tp3Var.f222421c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222421c) + AbstractC0000a.m8g(Float.hashCode(this.f222419a.f239440a) * 31, 31, this.f222420b.f239440a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f222419a);
        sb.append(", anchorAlignment=");
        sb.append(this.f222420b);
        sb.append(", offset=");
        return edb.m38567p(sb, this.f222421c, ')');
    }
}
