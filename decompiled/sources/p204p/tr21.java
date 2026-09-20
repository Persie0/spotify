package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class tr21 {

    /* JADX INFO: renamed from: a */
    public final int f222950a;

    /* JADX INFO: renamed from: b */
    public final float f222951b;

    /* JADX INFO: renamed from: c */
    public final int f222952c;

    public tr21(int i, int i2, float f) {
        this.f222950a = i;
        this.f222951b = f;
        this.f222952c = i2;
        if (i <= 0) {
            throw new IllegalArgumentException("windowSize must be positive");
        }
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException("slideThreshold must be in [0, 1]");
        }
        if (1 > i2 || i2 > i) {
            throw new IllegalArgumentException("slideStep must be in [1, windowSize]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr21)) {
            return false;
        }
        tr21 tr21Var = (tr21) obj;
        return this.f222950a == tr21Var.f222950a && Float.compare(this.f222951b, tr21Var.f222951b) == 0 && this.f222952c == tr21Var.f222952c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222952c) + AbstractC0000a.m8g(Integer.hashCode(this.f222950a) * 31, 31, this.f222951b);
    }
}
