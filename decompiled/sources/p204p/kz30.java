package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class kz30 {

    /* JADX INFO: renamed from: a */
    public final float f128004a = 32;

    /* JADX INFO: renamed from: b */
    public final float f128005b = 40;

    /* JADX INFO: renamed from: c */
    public final float f128006c = 48;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz30)) {
            return false;
        }
        kz30 kz30Var = (kz30) obj;
        return ybs.m93301b(this.f128004a, kz30Var.f128004a) && ybs.m93301b(this.f128005b, kz30Var.f128005b) && ybs.m93301b(this.f128006c, kz30Var.f128006c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128006c) + AbstractC0000a.m8g(Float.hashCode(this.f128004a) * 31, 31, this.f128005b);
    }

    public final String toString() {
        return dq60.m36616p(ybs.m93302c(this.f128006c), ")", edb.m38573v("IconSizes(small=", ybs.m93302c(this.f128004a), ", medium=", ybs.m93302c(this.f128005b), ", large="));
    }
}
