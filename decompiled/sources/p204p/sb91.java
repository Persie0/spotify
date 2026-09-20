package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class sb91 {

    /* JADX INFO: renamed from: a */
    public final float f207388a;

    /* JADX INFO: renamed from: b */
    public final float f207389b;

    /* JADX INFO: renamed from: c */
    public final float f207390c;

    /* JADX INFO: renamed from: d */
    public final float f207391d;

    /* JADX INFO: renamed from: e */
    public final float f207392e;

    /* JADX INFO: renamed from: f */
    public final float f207393f;

    /* JADX INFO: renamed from: g */
    public final float f207394g;

    /* JADX INFO: renamed from: h */
    public final float f207395h;

    /* JADX INFO: renamed from: i */
    public final float f207396i;

    public sb91(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f207388a = f;
        this.f207389b = f2;
        this.f207390c = f3;
        this.f207391d = f4;
        this.f207392e = f5;
        this.f207393f = f6;
        this.f207394g = f4 * f2;
        float f7 = (f - f2) / 2.0f;
        f7 = f7 < 0.0f ? 0.0f : f7;
        this.f207395h = f7;
        this.f207396i = f7 - f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb91)) {
            return false;
        }
        sb91 sb91Var = (sb91) obj;
        return Float.compare(this.f207388a, sb91Var.f207388a) == 0 && Float.compare(this.f207389b, sb91Var.f207389b) == 0 && Float.compare(this.f207390c, sb91Var.f207390c) == 0 && Float.compare(this.f207391d, sb91Var.f207391d) == 0 && Float.compare(this.f207392e, sb91Var.f207392e) == 0 && Float.compare(this.f207393f, sb91Var.f207393f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f207393f) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f207388a) * 31, 31, this.f207389b), 31, this.f207390c), 31, this.f207391d), 31, this.f207392e);
    }
}
