package p204p;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zyn0 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final int f287631a;

    /* JADX INFO: renamed from: b */
    public final String f287632b;

    /* JADX INFO: renamed from: c */
    public final String f287633c;

    /* JADX INFO: renamed from: d */
    public final int f287634d;

    /* JADX INFO: renamed from: e */
    public final int f287635e;

    /* JADX INFO: renamed from: f */
    public final int f287636f;

    /* JADX INFO: renamed from: g */
    public final int f287637g;

    /* JADX INFO: renamed from: h */
    public final byte[] f287638h;

    public zyn0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f287631a = i;
        this.f287632b = str;
        this.f287633c = str2;
        this.f287634d = i2;
        this.f287635e = i3;
        this.f287636f = i4;
        this.f287637g = i5;
        this.f287638h = bArr;
    }

    /* JADX INFO: renamed from: d */
    public static zyn0 m97236d(l2n0 l2n0Var) {
        int iM57945q = l2n0Var.m57945q();
        String strM35799p = def0.m35799p(l2n0Var.m57915C(l2n0Var.m57945q(), StandardCharsets.US_ASCII));
        String strM57915C = l2n0Var.m57915C(l2n0Var.m57945q(), StandardCharsets.UTF_8);
        int iM57945q2 = l2n0Var.m57945q();
        int iM57945q3 = l2n0Var.m57945q();
        int iM57945q4 = l2n0Var.m57945q();
        int iM57945q5 = l2n0Var.m57945q();
        int iM57945q6 = l2n0Var.m57945q();
        byte[] bArr = new byte[iM57945q6];
        l2n0Var.m57943o(0, bArr, iM57945q6);
        return new zyn0(iM57945q, strM35799p, strM57915C, iM57945q2, iM57945q3, iM57945q4, iM57945q5, bArr);
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: b */
    public final void mo35404b(nhd0 nhd0Var) {
        nhd0Var.m64470a(this.f287638h, this.f287631a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zyn0.class == obj.getClass()) {
            zyn0 zyn0Var = (zyn0) obj;
            if (this.f287631a == zyn0Var.f287631a && this.f287632b.equals(zyn0Var.f287632b) && this.f287633c.equals(zyn0Var.f287633c) && this.f287634d == zyn0Var.f287634d && this.f287635e == zyn0Var.f287635e && this.f287636f == zyn0Var.f287636f && this.f287637g == zyn0Var.f287637g && Arrays.equals(this.f287638h, zyn0Var.f287638h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f287638h) + ((((((((s571.m77243b(s571.m77243b((527 + this.f287631a) * 31, 31, this.f287632b), 31, this.f287633c) + this.f287634d) * 31) + this.f287635e) * 31) + this.f287636f) * 31) + this.f287637g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f287632b + ", description=" + this.f287633c;
    }
}
