package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class fby0 {

    /* JADX INFO: renamed from: a */
    public final float f67949a;

    /* JADX INFO: renamed from: b */
    public final float f67950b;

    /* JADX INFO: renamed from: c */
    public final float f67951c;

    /* JADX INFO: renamed from: d */
    public final float f67952d;

    /* JADX INFO: renamed from: e */
    public final float f67953e;

    /* JADX INFO: renamed from: f */
    public final float f67954f;

    /* JADX INFO: renamed from: g */
    public final float f67955g;

    /* JADX INFO: renamed from: h */
    public final float f67956h;

    /* JADX INFO: renamed from: i */
    public final float f67957i;

    /* JADX INFO: renamed from: j */
    public final float f67958j;

    public fby0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f67949a = f;
        this.f67950b = f2;
        this.f67951c = f3;
        this.f67952d = f4;
        this.f67953e = f5;
        this.f67954f = f6;
        this.f67955g = f7;
        this.f67956h = f8;
        this.f67957i = f9;
        this.f67958j = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fby0)) {
            return false;
        }
        fby0 fby0Var = (fby0) obj;
        return ybs.m93301b(this.f67949a, fby0Var.f67949a) && ybs.m93301b(this.f67950b, fby0Var.f67950b) && ybs.m93301b(this.f67951c, fby0Var.f67951c) && ybs.m93301b(this.f67952d, fby0Var.f67952d) && ybs.m93301b(this.f67953e, fby0Var.f67953e) && ybs.m93301b(this.f67954f, fby0Var.f67954f) && ybs.m93301b(this.f67955g, fby0Var.f67955g) && ybs.m93301b(this.f67956h, fby0Var.f67956h) && ybs.m93301b(this.f67957i, fby0Var.f67957i) && ybs.m93301b(this.f67958j, fby0Var.f67958j);
    }

    public final int hashCode() {
        return Float.hashCode(this.f67958j) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f67949a) * 31, 31, this.f67950b), 31, this.f67951c), 31, this.f67952d), 31, this.f67953e), 31, this.f67954f), 31, this.f67955g), 31, this.f67956h), 31, this.f67957i);
    }
}
