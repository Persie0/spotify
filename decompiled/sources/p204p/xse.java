package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class xse {

    /* JADX INFO: renamed from: a */
    public final float f265570a;

    /* JADX INFO: renamed from: b */
    public final float f265571b;

    /* JADX INFO: renamed from: c */
    public final float f265572c;

    /* JADX INFO: renamed from: d */
    public final float f265573d;

    /* JADX INFO: renamed from: e */
    public final float f265574e;

    /* JADX INFO: renamed from: f */
    public final float f265575f;

    /* JADX INFO: renamed from: g */
    public final float f265576g;

    public xse(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f265570a = f;
        this.f265571b = f2;
        this.f265572c = f3;
        this.f265573d = f4;
        this.f265574e = f5;
        this.f265575f = f6;
        this.f265576g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xse)) {
            return false;
        }
        xse xseVar = (xse) obj;
        return ybs.m93301b(this.f265570a, xseVar.f265570a) && Float.compare(this.f265571b, xseVar.f265571b) == 0 && Float.compare(this.f265572c, xseVar.f265572c) == 0 && Float.compare(this.f265573d, xseVar.f265573d) == 0 && Float.compare(this.f265574e, xseVar.f265574e) == 0 && ybs.m93301b(this.f265575f, xseVar.f265575f) && ybs.m93301b(this.f265576g, xseVar.f265576g);
    }

    public final int hashCode() {
        return Float.hashCode(this.f265576g) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f265570a) * 31, 31, this.f265571b), 31, this.f265572c), 31, this.f265573d), 31, this.f265574e), 31, this.f265575f);
    }
}
