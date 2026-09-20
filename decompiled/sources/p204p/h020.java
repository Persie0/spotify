package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class h020 {

    /* JADX INFO: renamed from: a */
    public final int f86109a;

    /* JADX INFO: renamed from: b */
    public final float f86110b;

    /* JADX INFO: renamed from: c */
    public final int f86111c;

    /* JADX INFO: renamed from: d */
    public final boolean f86112d;

    /* JADX INFO: renamed from: e */
    public final int f86113e;

    public h020(int i, float f, int i2, boolean z, int i3) {
        this.f86109a = i;
        this.f86110b = f;
        this.f86111c = i2;
        this.f86112d = z;
        this.f86113e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h020)) {
            return false;
        }
        h020 h020Var = (h020) obj;
        return this.f86109a == h020Var.f86109a && Float.compare(this.f86110b, h020Var.f86110b) == 0 && this.f86111c == h020Var.f86111c && this.f86112d == h020Var.f86112d && this.f86113e == h020Var.f86113e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86113e) + s571.m77245d(mt60.m62800g(this.f86111c, AbstractC0000a.m8g(Integer.hashCode(this.f86109a) * 31, 31, this.f86110b), 31), 31, this.f86112d);
    }
}
