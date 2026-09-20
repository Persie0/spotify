package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xh71 extends a7u0 {

    /* JADX INFO: renamed from: d */
    public static final String f261462d;

    /* JADX INFO: renamed from: e */
    public static final String f261463e;

    /* JADX INFO: renamed from: b */
    public final boolean f261464b;

    /* JADX INFO: renamed from: c */
    public final boolean f261465c;

    static {
        String str = h0b1.f86200a;
        f261462d = Integer.toString(1, 36);
        f261463e = Integer.toString(2, 36);
    }

    public xh71() {
        this.f261464b = false;
        this.f261465c = false;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: b */
    public final boolean mo24999b() {
        return this.f261464b;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: c */
    public final Bundle mo25000c() {
        Bundle bundle = new Bundle();
        bundle.putInt(a7u0.f13140a, 3);
        bundle.putBoolean(f261462d, this.f261464b);
        bundle.putBoolean(f261463e, this.f261465c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xh71)) {
            return false;
        }
        xh71 xh71Var = (xh71) obj;
        return this.f261465c == xh71Var.f261465c && this.f261464b == xh71Var.f261464b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f261464b), Boolean.valueOf(this.f261465c));
    }

    public xh71(boolean z) {
        this.f261464b = true;
        this.f261465c = z;
    }
}
