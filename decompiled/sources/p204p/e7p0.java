package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e7p0 {

    /* JADX INFO: renamed from: j */
    public static final String f56971j;

    /* JADX INFO: renamed from: k */
    public static final String f56972k;

    /* JADX INFO: renamed from: l */
    public static final String f56973l;

    /* JADX INFO: renamed from: m */
    public static final String f56974m;

    /* JADX INFO: renamed from: n */
    public static final String f56975n;

    /* JADX INFO: renamed from: o */
    public static final String f56976o;

    /* JADX INFO: renamed from: p */
    public static final String f56977p;

    /* JADX INFO: renamed from: a */
    public final Object f56978a;

    /* JADX INFO: renamed from: b */
    public final int f56979b;

    /* JADX INFO: renamed from: c */
    public final ufd0 f56980c;

    /* JADX INFO: renamed from: d */
    public final Object f56981d;

    /* JADX INFO: renamed from: e */
    public final int f56982e;

    /* JADX INFO: renamed from: f */
    public final long f56983f;

    /* JADX INFO: renamed from: g */
    public final long f56984g;

    /* JADX INFO: renamed from: h */
    public final int f56985h;

    /* JADX INFO: renamed from: i */
    public final int f56986i;

    static {
        String str = h0b1.f86200a;
        f56971j = Integer.toString(0, 36);
        f56972k = Integer.toString(1, 36);
        f56973l = Integer.toString(2, 36);
        f56974m = Integer.toString(3, 36);
        f56975n = Integer.toString(4, 36);
        f56976o = Integer.toString(5, 36);
        f56977p = Integer.toString(6, 36);
    }

    public e7p0(Object obj, int i, ufd0 ufd0Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        c95.m31843i(i >= 0);
        c95.m31843i(i2 >= 0);
        this.f56978a = obj;
        this.f56979b = i;
        this.f56980c = ufd0Var;
        this.f56981d = obj2;
        this.f56982e = i2;
        this.f56983f = j;
        this.f56984g = j2;
        this.f56985h = i3;
        this.f56986i = i4;
    }

    /* JADX INFO: renamed from: c */
    public static e7p0 m38066c(int i, Bundle bundle) {
        int iMax = Math.max(0, bundle.getInt(f56971j, 0));
        Bundle bundle2 = bundle.getBundle(f56972k);
        return new e7p0(null, iMax, bundle2 == null ? null : ufd0.m82981b(i, bundle2), null, Math.max(0, bundle.getInt(f56973l, 0)), bundle.getLong(f56974m, 0L), bundle.getLong(f56975n, 0L), bundle.getInt(f56976o, -1), bundle.getInt(f56977p, -1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38067a(e7p0 e7p0Var) {
        return this.f56979b == e7p0Var.f56979b && this.f56982e == e7p0Var.f56982e && this.f56983f == e7p0Var.f56983f && this.f56984g == e7p0Var.f56984g && this.f56985h == e7p0Var.f56985h && this.f56986i == e7p0Var.f56986i && Objects.equals(this.f56980c, e7p0Var.f56980c);
    }

    /* JADX INFO: renamed from: b */
    public final e7p0 m38068b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new e7p0(this.f56978a, z2 ? this.f56979b : 0, z ? this.f56980c : null, this.f56981d, z2 ? this.f56982e : 0, z ? this.f56983f : 0L, z ? this.f56984g : 0L, z ? this.f56985h : -1, z ? this.f56986i : -1);
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m38069d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.f56979b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(f56971j, i2);
        }
        ufd0 ufd0Var = this.f56980c;
        if (ufd0Var != null) {
            bundle.putBundle(f56972k, ufd0Var.m82985e(i, false));
        }
        int i3 = this.f56982e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(f56973l, i3);
        }
        long j = this.f56983f;
        if (i < 3 || j != 0) {
            bundle.putLong(f56974m, j);
        }
        long j2 = this.f56984g;
        if (i < 3 || j2 != 0) {
            bundle.putLong(f56975n, j2);
        }
        int i4 = this.f56985h;
        if (i4 != -1) {
            bundle.putInt(f56976o, i4);
        }
        int i5 = this.f56986i;
        if (i5 != -1) {
            bundle.putInt(f56977p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e7p0.class == obj.getClass()) {
            e7p0 e7p0Var = (e7p0) obj;
            if (m38067a(e7p0Var) && Objects.equals(this.f56978a, e7p0Var.f56978a) && Objects.equals(this.f56981d, e7p0Var.f56981d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56978a, Integer.valueOf(this.f56979b), this.f56980c, this.f56981d, Integer.valueOf(this.f56982e), Long.valueOf(this.f56983f), Long.valueOf(this.f56984g), Integer.valueOf(this.f56985h), Integer.valueOf(this.f56986i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f56979b + ", period=" + this.f56982e + ", pos=" + this.f56983f;
        int i = this.f56985h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM75191i = rbz.m75191i(str, ", contentPos=");
        sbM75191i.append(this.f56984g);
        sbM75191i.append(", adGroup=");
        sbM75191i.append(i);
        sbM75191i.append(", ad=");
        sbM75191i.append(this.f56986i);
        return sbM75191i.toString();
    }
}
