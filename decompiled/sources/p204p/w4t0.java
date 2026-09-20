package p204p;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class w4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247880a;

    /* JADX INFO: renamed from: b */
    public final qu71 f247881b;

    /* JADX INFO: renamed from: c */
    public final l2n0 f247882c;

    /* JADX INFO: renamed from: d */
    public boolean f247883d;

    /* JADX INFO: renamed from: e */
    public boolean f247884e;

    /* JADX INFO: renamed from: f */
    public boolean f247885f;

    /* JADX INFO: renamed from: g */
    public long f247886g;

    /* JADX INFO: renamed from: h */
    public long f247887h;

    /* JADX INFO: renamed from: i */
    public long f247888i;

    public w4t0(int i) {
        this.f247880a = i;
        switch (i) {
            case 1:
                this.f247881b = new qu71(0L);
                this.f247886g = -9223372036854775807L;
                this.f247887h = -9223372036854775807L;
                this.f247888i = -9223372036854775807L;
                this.f247882c = new l2n0();
                break;
            default:
                this.f247881b = new qu71(0L);
                this.f247886g = -9223372036854775807L;
                this.f247887h = -9223372036854775807L;
                this.f247888i = -9223372036854775807L;
                this.f247882c = new l2n0();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m87205b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m87206c(l2n0 l2n0Var) {
        int i = l2n0Var.f129055b;
        if (l2n0Var.m57932a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        l2n0Var.m57943o(0, bArr, 9);
        l2n0Var.m57930R(i);
        byte b = bArr[0];
        if ((b & MessagePack.Code.BIN8) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m87207a(d5y d5yVar) {
        switch (this.f247880a) {
            case 0:
                byte[] bArr = h0b1.f86201b;
                l2n0 l2n0Var = this.f247882c;
                l2n0Var.getClass();
                l2n0Var.m57928P(bArr, bArr.length);
                this.f247883d = true;
                d5yVar.mo35037g();
                break;
            default:
                byte[] bArr2 = h0b1.f86201b;
                l2n0 l2n0Var2 = this.f247882c;
                l2n0Var2.getClass();
                l2n0Var2.m57928P(bArr2, bArr2.length);
                this.f247883d = true;
                d5yVar.mo35037g();
                break;
        }
    }
}
