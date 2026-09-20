package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class sp3 implements eie0 {

    /* JADX INFO: renamed from: a */
    public final ub9 f212719a;

    /* JADX INFO: renamed from: b */
    public final ub9 f212720b;

    /* JADX INFO: renamed from: c */
    public final int f212721c;

    public sp3(ub9 ub9Var, ub9 ub9Var2, int i) {
        this.f212719a = ub9Var;
        this.f212720b = ub9Var2;
        this.f212721c = i;
    }

    @Override // p204p.eie0
    /* JADX INFO: renamed from: a */
    public final int mo39096a(c450 c450Var, long j, int i, ko70 ko70Var) {
        int iMo52864a = this.f212720b.mo52864a(0, c450Var.m31426d(), ko70Var);
        int i2 = -this.f212719a.mo52864a(0, i, ko70Var);
        ko70 ko70Var2 = ko70.f124556a;
        int i3 = this.f212721c;
        if (ko70Var != ko70Var2) {
            i3 = -i3;
        }
        return c450Var.f33848a + iMo52864a + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp3)) {
            return false;
        }
        sp3 sp3Var = (sp3) obj;
        return this.f212719a.equals(sp3Var.f212719a) && this.f212720b.equals(sp3Var.f212720b) && this.f212721c == sp3Var.f212721c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212721c) + AbstractC0000a.m8g(Float.hashCode(this.f212719a.f228656a) * 31, 31, this.f212720b.f228656a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f212719a);
        sb.append(", anchorAlignment=");
        sb.append(this.f212720b);
        sb.append(", offset=");
        return edb.m38567p(sb, this.f212721c, ')');
    }
}
