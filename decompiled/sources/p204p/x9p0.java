package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class x9p0 {

    /* JADX INFO: renamed from: c */
    public static final x9p0 f259415c = new x9p0(false, false);

    /* JADX INFO: renamed from: d */
    public static final String f259416d;

    /* JADX INFO: renamed from: e */
    public static final String f259417e;

    /* JADX INFO: renamed from: a */
    public final boolean f259418a;

    /* JADX INFO: renamed from: b */
    public final boolean f259419b;

    static {
        String str = h0b1.f86200a;
        f259416d = Integer.toString(0, 36);
        f259417e = Integer.toString(1, 36);
    }

    public x9p0(boolean z, boolean z2) {
        this.f259418a = z;
        this.f259419b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9p0)) {
            return false;
        }
        x9p0 x9p0Var = (x9p0) obj;
        return this.f259418a == x9p0Var.f259418a && this.f259419b == x9p0Var.f259419b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f259418a), Boolean.valueOf(this.f259419b));
    }
}
