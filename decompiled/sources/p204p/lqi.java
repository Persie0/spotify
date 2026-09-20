package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class lqi {

    /* JADX INFO: renamed from: a */
    public final float f136066a;

    /* JADX INFO: renamed from: b */
    public final float f136067b;

    /* JADX INFO: renamed from: c */
    public final boolean f136068c;

    /* JADX INFO: renamed from: d */
    public final boolean f136069d;

    /* JADX INFO: renamed from: e */
    public final boolean f136070e;

    public lqi(float f, float f2) {
        this(f, f2, true, false, true);
    }

    /* JADX INFO: renamed from: a */
    public final float m59765a() {
        return this.f136066a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59766b() {
        return this.f136070e;
    }

    /* JADX INFO: renamed from: c */
    public final float m59767c() {
        return this.f136067b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m59768d() {
        return this.f136069d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqi)) {
            return false;
        }
        lqi lqiVar = (lqi) obj;
        return ybs.m93301b(this.f136066a, lqiVar.f136066a) && ybs.m93301b(this.f136067b, lqiVar.f136067b) && this.f136068c == lqiVar.f136068c && this.f136069d == lqiVar.f136069d && this.f136070e == lqiVar.f136070e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136070e) + s571.m77245d(s571.m77245d(AbstractC0000a.m8g(Float.hashCode(this.f136066a) * 31, 31, this.f136067b), 31, this.f136068c), 31, this.f136069d);
    }

    public lqi(float f, float f2, boolean z, boolean z2, boolean z3) {
        this.f136066a = f;
        this.f136067b = f2;
        this.f136068c = z;
        this.f136069d = z2;
        this.f136070e = z3;
    }
}
