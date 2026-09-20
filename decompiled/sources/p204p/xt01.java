package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class xt01 extends yt01 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2206o9 f265721a;

    /* JADX INFO: renamed from: b */
    public final int f265722b;

    public xt01(AbstractC2206o9 abstractC2206o9, int i) {
        this.f265721a = abstractC2206o9;
        this.f265722b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt01)) {
            return false;
        }
        xt01 xt01Var = (xt01) obj;
        return this.f265721a.equals(xt01Var.f265721a) && Float.compare(0.0f, 0.0f) == 0 && this.f265722b == xt01Var.f265722b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f265722b) + AbstractC0000a.m8g(s571.m77245d(this.f265721a.hashCode() * 31, 31, false), 29791, 0.0f);
    }
}
