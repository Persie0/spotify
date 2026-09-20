package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f8g0 extends sz30 {

    /* JADX INFO: renamed from: b */
    public final int f66983b;

    /* JADX INFO: renamed from: c */
    public final int f66984c;

    /* JADX INFO: renamed from: d */
    public final int f66985d;

    /* JADX INFO: renamed from: e */
    public final int[] f66986e;

    /* JADX INFO: renamed from: f */
    public final int[] f66987f;

    public f8g0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f66983b = i;
        this.f66984c = i2;
        this.f66985d = i3;
        this.f66986e = iArr;
        this.f66987f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f8g0.class == obj.getClass()) {
            f8g0 f8g0Var = (f8g0) obj;
            if (this.f66983b == f8g0Var.f66983b && this.f66984c == f8g0Var.f66984c && this.f66985d == f8g0Var.f66985d && Arrays.equals(this.f66986e, f8g0Var.f66986e) && Arrays.equals(this.f66987f, f8g0Var.f66987f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66987f) + ((Arrays.hashCode(this.f66986e) + ((((((527 + this.f66983b) * 31) + this.f66984c) * 31) + this.f66985d) * 31)) * 31);
    }
}
