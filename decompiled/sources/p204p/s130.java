package p204p;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class s130 {

    /* JADX INFO: renamed from: a */
    public final int f204581a;

    /* JADX INFO: renamed from: b */
    public final int f204582b;

    /* JADX INFO: renamed from: c */
    public final String f204583c;

    /* JADX INFO: renamed from: d */
    public final String f204584d;

    /* JADX INFO: renamed from: e */
    public final String f204585e;

    /* JADX INFO: renamed from: f */
    public final String f204586f;

    public s130(int i, int i2, String str, String str2, String str3, String str4) {
        this.f204581a = i;
        this.f204582b = i2;
        this.f204583c = str;
        this.f204584d = str2;
        this.f204585e = str3;
        this.f204586f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s130.class == obj.getClass()) {
            s130 s130Var = (s130) obj;
            if (this.f204581a == s130Var.f204581a && this.f204582b == s130Var.f204582b && TextUtils.equals(this.f204583c, s130Var.f204583c) && TextUtils.equals(this.f204584d, s130Var.f204584d) && TextUtils.equals(this.f204585e, s130Var.f204585e) && TextUtils.equals(this.f204586f, s130Var.f204586f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f204581a * 31) + this.f204582b) * 31;
        String str = this.f204583c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f204584d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f204585e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f204586f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
