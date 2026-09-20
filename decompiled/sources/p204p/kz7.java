package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kz7 extends o3l {

    /* JADX INFO: renamed from: a */
    public final int f128024a;

    /* JADX INFO: renamed from: b */
    public final String f128025b;

    /* JADX INFO: renamed from: c */
    public final int f128026c;

    /* JADX INFO: renamed from: d */
    public final long f128027d;

    /* JADX INFO: renamed from: e */
    public final long f128028e;

    /* JADX INFO: renamed from: f */
    public final boolean f128029f;

    /* JADX INFO: renamed from: g */
    public final int f128030g;

    /* JADX INFO: renamed from: h */
    public final String f128031h;

    /* JADX INFO: renamed from: i */
    public final String f128032i;

    public kz7(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f128024a = i;
        this.f128025b = str;
        this.f128026c = i2;
        this.f128027d = j;
        this.f128028e = j2;
        this.f128029f = z;
        this.f128030g = i3;
        this.f128031h = str2;
        this.f128032i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3l) {
            kz7 kz7Var = (kz7) ((o3l) obj);
            if (this.f128024a == kz7Var.f128024a && this.f128025b.equals(kz7Var.f128025b) && this.f128026c == kz7Var.f128026c && this.f128027d == kz7Var.f128027d && this.f128028e == kz7Var.f128028e && this.f128029f == kz7Var.f128029f && this.f128030g == kz7Var.f128030g && this.f128031h.equals(kz7Var.f128031h) && this.f128032i.equals(kz7Var.f128032i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f128024a ^ 1000003) * 1000003) ^ this.f128025b.hashCode()) * 1000003) ^ this.f128026c) * 1000003;
        long j = this.f128027d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f128028e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f128029f ? 1231 : 1237)) * 1000003) ^ this.f128030g) * 1000003) ^ this.f128031h.hashCode()) * 1000003) ^ this.f128032i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f128024a);
        sb.append(", model=");
        sb.append(this.f128025b);
        sb.append(", cores=");
        sb.append(this.f128026c);
        sb.append(", ram=");
        sb.append(this.f128027d);
        sb.append(", diskSpace=");
        sb.append(this.f128028e);
        sb.append(", simulator=");
        sb.append(this.f128029f);
        sb.append(", state=");
        sb.append(this.f128030g);
        sb.append(", manufacturer=");
        sb.append(this.f128031h);
        sb.append(", modelClass=");
        return dq60.m36616p(this.f128032i, "}", sb);
    }
}
