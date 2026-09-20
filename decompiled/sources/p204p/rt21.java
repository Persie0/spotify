package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class rt21 implements l630 {

    /* JADX INFO: renamed from: a */
    public final String f202478a;

    /* JADX INFO: renamed from: b */
    public final b250 f202479b;

    /* JADX INFO: renamed from: c */
    public final tu21 f202480c;

    /* JADX INFO: renamed from: d */
    public final String f202481d;

    public rt21(String str, b250 b250Var, tu21 tu21Var, String str2) {
        this.f202478a = str;
        this.f202479b = b250Var;
        this.f202480c = tu21Var;
        this.f202481d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt21)) {
            return false;
        }
        rt21 rt21Var = (rt21) obj;
        return wj50.m88271j(this.f202478a, rt21Var.f202478a) && wj50.m88271j(this.f202479b, rt21Var.f202479b) && this.f202480c == rt21Var.f202480c && wj50.m88271j(this.f202481d, rt21Var.f202481d);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f202478a;
    }

    public final int hashCode() {
        int iHashCode = (this.f202480c.hashCode() + AbstractC0000a.m10i(this.f202479b, this.f202478a.hashCode() * 31, 31)) * 31;
        String str = this.f202481d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
