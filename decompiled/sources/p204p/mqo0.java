package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class mqo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f146324a;

    /* JADX INFO: renamed from: b */
    public final boolean f146325b;

    /* JADX INFO: renamed from: c */
    public final float f146326c;

    /* JADX INFO: renamed from: d */
    public final int f146327d;

    /* JADX INFO: renamed from: e */
    public final ov50 f146328e;

    /* JADX INFO: renamed from: f */
    public final boolean f146329f;

    public mqo0(boolean z, boolean z2, float f, int i, ov50 ov50Var, boolean z3) {
        this.f146324a = z;
        this.f146325b = z2;
        this.f146326c = f;
        this.f146327d = i;
        this.f146328e = ov50Var;
        this.f146329f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqo0)) {
            return false;
        }
        mqo0 mqo0Var = (mqo0) obj;
        return this.f146324a == mqo0Var.f146324a && this.f146325b == mqo0Var.f146325b && Float.compare(this.f146326c, mqo0Var.f146326c) == 0 && this.f146327d == mqo0Var.f146327d && wj50.m88271j(this.f146328e, mqo0Var.f146328e) && this.f146329f == mqo0Var.f146329f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146329f) + ((this.f146328e.hashCode() + f710.m40938f(this.f146327d, AbstractC0000a.m8g(s571.m77245d(Boolean.hashCode(this.f146324a) * 31, 31, this.f146325b), 31, this.f146326c), 31)) * 31);
    }

    public /* synthetic */ mqo0(boolean z, boolean z2, float f, int i, ov50 ov50Var, boolean z3, int i2) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0.0f : f, i, (i2 & 16) != 0 ? lqo0.f136098f : ov50Var, (i2 & 32) != 0 ? true : z3);
    }
}
