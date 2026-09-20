package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jln0 extends a7u0 {

    /* JADX INFO: renamed from: c */
    public static final String f113653c;

    /* JADX INFO: renamed from: b */
    public final float f113654b;

    static {
        String str = h0b1.f86200a;
        f113653c = Integer.toString(1, 36);
    }

    public jln0() {
        this.f113654b = -1.0f;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: b */
    public final boolean mo24999b() {
        return this.f113654b != -1.0f;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: c */
    public final Bundle mo25000c() {
        Bundle bundle = new Bundle();
        bundle.putInt(a7u0.f13140a, 1);
        bundle.putFloat(f113653c, this.f113654b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jln0) {
            return this.f113654b == ((jln0) obj).f113654b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f113654b));
    }

    public jln0(float f) {
        c95.m31844j(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f113654b = f;
    }
}
