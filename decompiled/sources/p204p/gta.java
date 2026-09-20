package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class gta {

    /* JADX INFO: renamed from: a */
    public final float f84118a;

    /* JADX INFO: renamed from: b */
    public final float f84119b;

    /* JADX INFO: renamed from: c */
    public final float f84120c;

    /* JADX INFO: renamed from: d */
    public final float f84121d;

    /* JADX INFO: renamed from: e */
    public final float f84122e;

    public gta(float f, float f2, float f3, float f4, float f5) {
        this.f84118a = f;
        this.f84119b = f2;
        this.f84120c = f3;
        this.f84121d = f4;
        this.f84122e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gta)) {
            return false;
        }
        gta gtaVar = (gta) obj;
        return ybs.m93301b(this.f84118a, gtaVar.f84118a) && ybs.m93301b(this.f84119b, gtaVar.f84119b) && ybs.m93301b(this.f84120c, gtaVar.f84120c) && ybs.m93301b(this.f84121d, gtaVar.f84121d) && ybs.m93301b(this.f84122e, gtaVar.f84122e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f84122e) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f84118a) * 31, 31, this.f84119b), 31, this.f84120c), 31, this.f84121d);
    }
}
