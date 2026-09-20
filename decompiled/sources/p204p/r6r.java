package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class r6r {

    /* JADX INFO: renamed from: a */
    public final float f196343a;

    /* JADX INFO: renamed from: b */
    public final float f196344b;

    /* JADX INFO: renamed from: c */
    public final float f196345c;

    /* JADX INFO: renamed from: d */
    public final float f196346d;

    /* JADX INFO: renamed from: e */
    public final float f196347e;

    public r6r(float f, float f2, float f3, float f4, float f5) {
        this.f196343a = f;
        this.f196344b = f2;
        this.f196345c = f3;
        this.f196346d = f4;
        this.f196347e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6r)) {
            return false;
        }
        r6r r6rVar = (r6r) obj;
        return ybs.m93301b(this.f196343a, r6rVar.f196343a) && ybs.m93301b(this.f196344b, r6rVar.f196344b) && ybs.m93301b(this.f196345c, r6rVar.f196345c) && ybs.m93301b(this.f196346d, r6rVar.f196346d) && ybs.m93301b(this.f196347e, r6rVar.f196347e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f196347e) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f196343a) * 31, 31, this.f196344b), 31, this.f196345c), 31, this.f196346d);
    }
}
