package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class hxf {

    /* JADX INFO: renamed from: a */
    public final float f96209a = 6;

    /* JADX INFO: renamed from: b */
    public final float f96210b = 8;

    /* JADX INFO: renamed from: c */
    public final float f96211c = 12;

    /* JADX INFO: renamed from: d */
    public final float f96212d = 16;

    /* JADX INFO: renamed from: e */
    public final float f96213e = 20;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxf)) {
            return false;
        }
        hxf hxfVar = (hxf) obj;
        return ybs.m93301b(this.f96209a, hxfVar.f96209a) && ybs.m93301b(this.f96210b, hxfVar.f96210b) && ybs.m93301b(this.f96211c, hxfVar.f96211c) && ybs.m93301b(this.f96212d, hxfVar.f96212d) && ybs.m93301b(this.f96213e, hxfVar.f96213e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f96213e) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f96209a) * 31, 31, this.f96210b), 31, this.f96211c), 31, this.f96212d);
    }

    public final String toString() {
        String strM93302c = ybs.m93302c(this.f96209a);
        String strM93302c2 = ybs.m93302c(this.f96210b);
        String strM93302c3 = ybs.m93302c(this.f96211c);
        String strM93302c4 = ybs.m93302c(this.f96212d);
        String strM93302c5 = ybs.m93302c(this.f96213e);
        StringBuilder sbM38573v = edb.m38573v("ComponentSpacingValues(extraSmall=", strM93302c, ", small=", strM93302c2, ", medium=");
        klh.m56844p(sbM38573v, strM93302c3, ", large=", strM93302c4, ", extraLarge=");
        return dq60.m36616p(strM93302c5, ")", sbM38573v);
    }
}
