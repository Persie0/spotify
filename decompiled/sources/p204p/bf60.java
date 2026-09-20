package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class bf60 {

    /* JADX INFO: renamed from: a */
    public final xe60 f26582a;

    /* JADX INFO: renamed from: b */
    public final kf60 f26583b;

    /* JADX INFO: renamed from: c */
    public final jf60 f26584c;

    /* JADX INFO: renamed from: d */
    public final float f26585d;

    /* JADX INFO: renamed from: e */
    public final boolean f26586e;

    public bf60(xe60 xe60Var, kf60 kf60Var, jf60 jf60Var, float f, boolean z) {
        this.f26582a = xe60Var;
        this.f26583b = kf60Var;
        this.f26584c = jf60Var;
        this.f26585d = f;
        this.f26586e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf60)) {
            return false;
        }
        bf60 bf60Var = (bf60) obj;
        return wj50.m88271j(this.f26582a, bf60Var.f26582a) && wj50.m88271j(this.f26583b, bf60Var.f26583b) && wj50.m88271j(this.f26584c, bf60Var.f26584c) && Float.compare(this.f26585d, bf60Var.f26585d) == 0 && this.f26586e == bf60Var.f26586e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26586e) + AbstractC0000a.m8g((this.f26584c.hashCode() + ((this.f26583b.hashCode() + (this.f26582a.hashCode() * 31)) * 31)) * 31, 31, this.f26585d);
    }
}
