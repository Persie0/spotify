package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class iu21 implements l630 {

    /* JADX INFO: renamed from: a */
    public final String f105845a;

    /* JADX INFO: renamed from: b */
    public final b250 f105846b;

    /* JADX INFO: renamed from: c */
    public final tu21 f105847c;

    public iu21(String str, b250 b250Var, tu21 tu21Var) {
        this.f105845a = str;
        this.f105846b = b250Var;
        this.f105847c = tu21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu21)) {
            return false;
        }
        iu21 iu21Var = (iu21) obj;
        return wj50.m88271j(this.f105845a, iu21Var.f105845a) && wj50.m88271j(this.f105846b, iu21Var.f105846b) && this.f105847c == iu21Var.f105847c;
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f105845a;
    }

    public final int hashCode() {
        return this.f105847c.hashCode() + AbstractC0000a.m10i(this.f105846b, this.f105845a.hashCode() * 31, 31);
    }
}
