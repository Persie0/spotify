package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o0w0 {

    /* JADX INFO: renamed from: a */
    public final long f160522a;

    /* JADX INFO: renamed from: b */
    public final long f160523b;

    /* JADX INFO: renamed from: c */
    public final long f160524c;

    /* JADX INFO: renamed from: d */
    public final long f160525d;

    /* JADX INFO: renamed from: e */
    public final long f160526e;

    /* JADX INFO: renamed from: f */
    public final float[] f160527f;

    /* JADX INFO: renamed from: g */
    public final exh0 f160528g;

    public o0w0(long j, long j2, long j3, long j4, long j5, exh0 exh0Var, float[] fArr) {
        this.f160522a = j;
        this.f160523b = j2;
        this.f160524c = j3;
        this.f160525d = j4;
        this.f160526e = j5;
        this.f160527f = fArr;
        this.f160528g = exh0Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m66026a(int i, int i2, int i3, int i4) {
        long j = this.f160522a;
        int i5 = (int) (j >> 32);
        int iMin = Math.min(Math.max(i5, i), i3);
        int i6 = (int) j;
        int iMin2 = Math.min(Math.max(i6, i2), i4);
        long j2 = this.f160523b;
        int i7 = (int) (j2 >> 32);
        int iMax = Math.max(Math.min(i7, i3), i);
        int i8 = (int) j2;
        return Math.max((Math.max(Math.min(i8, i4), i2) - iMin2) * (iMax - iMin), 0) / Math.min((i4 - i2) * (i3 - i), (i8 - i6) * (i7 - i5));
    }

    /* JADX INFO: renamed from: b */
    public final c450 m66027b() {
        long j = this.f160522a;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.f160523b;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.f160527f;
        if (fArr != null) {
            return xtm0.m92059F(r3d0.m74630c(fArr, new tiv0(i, i2, i3, i4)));
        }
        long j3 = this.f160525d;
        long j4 = this.f160524c;
        int i5 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
        int i6 = ((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L));
        return new c450(i + i5, i2 + i6, i3 + i5, i4 + i6);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && o0w0.class == obj.getClass()) {
                o0w0 o0w0Var = (o0w0) obj;
                if (this.f160522a == o0w0Var.f160522a && this.f160523b == o0w0Var.f160523b && this.f160526e == o0w0Var.f160526e && y350.m92729b(this.f160524c, o0w0Var.f160524c) && y350.m92729b(this.f160525d, o0w0Var.f160525d)) {
                    float[] fArr = o0w0Var.f160527f;
                    float[] fArr2 = this.f160527f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.f160528g.equals(o0w0Var.f160528g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(Long.hashCode(this.f160522a) * 31, this.f160523b, 31), this.f160526e, 31), this.f160524c, 31), this.f160525d, 31);
        float[] fArr = this.f160527f;
        return this.f160528g.hashCode() + ((iM36605e + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
