package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class okr {

    /* JADX INFO: renamed from: d */
    public static final okr f166656d = new okr(20, 10, 0.1f);

    /* JADX INFO: renamed from: a */
    public final int f166657a;

    /* JADX INFO: renamed from: b */
    public final float f166658b;

    /* JADX INFO: renamed from: c */
    public final int f166659c;

    static {
        new okr(10, 5, 0.2f);
    }

    public okr(int i, int i2, float f) {
        this.f166657a = i;
        this.f166658b = f;
        this.f166659c = i2;
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

    /* JADX INFO: renamed from: a */
    public final tr21 m67260a() {
        float f = this.f166658b;
        return new tr21(this.f166657a, this.f166659c, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okr)) {
            return false;
        }
        okr okrVar = (okr) obj;
        return this.f166657a == okrVar.f166657a && Float.compare(this.f166658b, okrVar.f166658b) == 0 && this.f166659c == okrVar.f166659c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166659c) + AbstractC0000a.m8g(Integer.hashCode(this.f166657a) * 31, 31, this.f166658b);
    }
}
