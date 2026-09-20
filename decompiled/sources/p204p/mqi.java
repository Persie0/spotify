package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class mqi {

    /* JADX INFO: renamed from: a */
    public final rqi f146289a;

    /* JADX INFO: renamed from: b */
    public final boolean f146290b;

    /* JADX INFO: renamed from: c */
    public final float f146291c;

    /* JADX INFO: renamed from: d */
    public final float f146292d;

    /* JADX INFO: renamed from: e */
    public final boolean f146293e;

    /* JADX INFO: renamed from: f */
    public final boolean f146294f;

    /* JADX INFO: renamed from: g */
    public final int f146295g;

    public mqi(rqi rqiVar, boolean z, float f, float f2, boolean z2, boolean z3, int i) {
        this.f146289a = rqiVar;
        this.f146290b = z;
        this.f146291c = f;
        this.f146292d = f2;
        this.f146293e = z2;
        this.f146294f = z3;
        this.f146295g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqi)) {
            return false;
        }
        mqi mqiVar = (mqi) obj;
        return wj50.m88271j(this.f146289a, mqiVar.f146289a) && this.f146290b == mqiVar.f146290b && ybs.m93301b(this.f146291c, mqiVar.f146291c) && ybs.m93301b(this.f146292d, mqiVar.f146292d) && this.f146293e == mqiVar.f146293e && this.f146294f == mqiVar.f146294f && this.f146295g == mqiVar.f146295g;
    }

    public final int hashCode() {
        return edb.m38547C(this.f146295g) + s571.m77245d(s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77245d(this.f146289a.hashCode() * 31, 31, this.f146290b), 31, this.f146291c), 31, this.f146292d), 31, this.f146293e), 31, this.f146294f);
    }
}
