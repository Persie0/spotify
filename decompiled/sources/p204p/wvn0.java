package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class wvn0 {

    /* JADX INFO: renamed from: a */
    public final float f255530a;

    /* JADX INFO: renamed from: b */
    public final float f255531b;

    /* JADX INFO: renamed from: c */
    public final float f255532c;

    /* JADX INFO: renamed from: d */
    public final float f255533d;

    /* JADX INFO: renamed from: e */
    public final float f255534e;

    /* JADX INFO: renamed from: f */
    public final float f255535f;

    public wvn0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f255530a = f;
        this.f255531b = f2;
        this.f255532c = f3;
        this.f255533d = f4;
        this.f255534e = f5;
        this.f255535f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvn0)) {
            return false;
        }
        wvn0 wvn0Var = (wvn0) obj;
        return Float.compare(this.f255530a, wvn0Var.f255530a) == 0 && Float.compare(this.f255531b, wvn0Var.f255531b) == 0 && Float.compare(this.f255532c, wvn0Var.f255532c) == 0 && Float.compare(this.f255533d, wvn0Var.f255533d) == 0 && Float.compare(this.f255534e, wvn0Var.f255534e) == 0 && Float.compare(this.f255535f, wvn0Var.f255535f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f255535f) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f255530a) * 31, 31, this.f255531b), 31, this.f255532c), 31, this.f255533d), 31, this.f255534e);
    }
}
