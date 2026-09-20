package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vo41 extends a7u0 {

    /* JADX INFO: renamed from: d */
    public static final String f243365d;

    /* JADX INFO: renamed from: e */
    public static final String f243366e;

    /* JADX INFO: renamed from: b */
    public final int f243367b;

    /* JADX INFO: renamed from: c */
    public final float f243368c;

    static {
        String str = h0b1.f86200a;
        f243365d = Integer.toString(1, 36);
        f243366e = Integer.toString(2, 36);
    }

    public vo41(int i) {
        c95.m31844j(i > 0, "maxStars must be a positive integer");
        this.f243367b = i;
        this.f243368c = -1.0f;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: b */
    public final boolean mo24999b() {
        return this.f243368c != -1.0f;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: c */
    public final Bundle mo25000c() {
        Bundle bundle = new Bundle();
        bundle.putInt(a7u0.f13140a, 2);
        bundle.putInt(f243365d, this.f243367b);
        bundle.putFloat(f243366e, this.f243368c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vo41)) {
            return false;
        }
        vo41 vo41Var = (vo41) obj;
        return this.f243367b == vo41Var.f243367b && this.f243368c == vo41Var.f243368c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f243367b), Float.valueOf(this.f243368c));
    }

    public vo41(int i, float f) {
        boolean z = false;
        c95.m31844j(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        c95.m31844j(z, "starRating is out of range [0, maxStars]");
        this.f243367b = i;
        this.f243368c = f;
    }
}
