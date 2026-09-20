package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class h28 {

    /* JADX INFO: renamed from: a */
    public final int f86924a;

    /* JADX INFO: renamed from: b */
    public final int f86925b;

    /* JADX INFO: renamed from: c */
    public final long f86926c;

    /* JADX INFO: renamed from: d */
    public final long f86927d;

    /* JADX INFO: renamed from: e */
    public final boolean f86928e;

    /* JADX INFO: renamed from: f */
    public final int f86929f;

    public h28(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f86924a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f86925b = i2;
        this.f86926c = j;
        this.f86927d = j2;
        this.f86928e = z;
        this.f86929f = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h28)) {
            return false;
        }
        h28 h28Var = (h28) obj;
        if (this.f86924a != h28Var.f86924a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f86925b != h28Var.f86925b || this.f86926c != h28Var.f86926c || this.f86927d != h28Var.f86927d || this.f86928e != h28Var.f86928e || this.f86929f != h28Var.f86929f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f86924a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f86925b) * 1000003;
        long j = this.f86926c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f86927d;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f86928e ? 1231 : 1237)) * 1000003) ^ this.f86929f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f86924a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f86925b);
        sb.append(", totalRam=");
        sb.append(this.f86926c);
        sb.append(", diskSpace=");
        sb.append(this.f86927d);
        sb.append(", isEmulator=");
        sb.append(this.f86928e);
        sb.append(", state=");
        sb.append(this.f86929f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return dq60.m36616p(Build.PRODUCT, "}", sb);
    }
}
