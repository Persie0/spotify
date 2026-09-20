package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class dh71 {

    /* JADX INFO: renamed from: a */
    public final float f49006a;

    /* JADX INFO: renamed from: b */
    public final float f49007b;

    /* JADX INFO: renamed from: c */
    public final float f49008c;

    /* JADX INFO: renamed from: d */
    public final boolean f49009d;

    /* JADX INFO: renamed from: e */
    public final boolean f49010e;

    /* JADX INFO: renamed from: f */
    public final int f49011f;

    public dh71(float f, float f2, float f3, boolean z, boolean z2, int i) {
        this.f49006a = f;
        this.f49007b = f2;
        this.f49008c = f3;
        this.f49009d = z;
        this.f49010e = z2;
        this.f49011f = i;
    }

    /* JADX INFO: renamed from: a */
    public static dh71 m35997a(dh71 dh71Var, int i) {
        float f = dh71Var.f49006a;
        float f2 = dh71Var.f49007b;
        float f3 = dh71Var.f49008c;
        boolean z = (i & 16) != 0 ? dh71Var.f49010e : true;
        int i2 = dh71Var.f49011f;
        dh71Var.getClass();
        return new dh71(f, f2, f3, true, z, i2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35998b() {
        return this.f49009d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh71)) {
            return false;
        }
        dh71 dh71Var = (dh71) obj;
        return Float.compare(this.f49006a, dh71Var.f49006a) == 0 && Float.compare(this.f49007b, dh71Var.f49007b) == 0 && Float.compare(this.f49008c, dh71Var.f49008c) == 0 && this.f49009d == dh71Var.f49009d && this.f49010e == dh71Var.f49010e && this.f49011f == dh71Var.f49011f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49011f) + s571.m77245d(s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f49006a) * 31, 31, this.f49007b), 31, this.f49008c), 31, this.f49009d), 31, this.f49010e);
    }
}
