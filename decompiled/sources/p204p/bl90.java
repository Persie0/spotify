package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class bl90 implements l630 {

    /* JADX INFO: renamed from: a */
    public final String f28131a;

    /* JADX INFO: renamed from: b */
    public final b250 f28132b;

    /* JADX INFO: renamed from: c */
    public final ggi f28133c;

    public bl90(String str, b250 b250Var, ggi ggiVar) {
        this.f28131a = str;
        this.f28132b = b250Var;
        this.f28133c = ggiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl90)) {
            return false;
        }
        bl90 bl90Var = (bl90) obj;
        return wj50.m88271j(this.f28131a, bl90Var.f28131a) && wj50.m88271j(this.f28132b, bl90Var.f28132b) && wj50.m88271j(this.f28133c, bl90Var.f28133c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f28131a;
    }

    public final int hashCode() {
        return this.f28133c.hashCode() + AbstractC0000a.m10i(this.f28132b, this.f28131a.hashCode() * 31, 31);
    }
}
