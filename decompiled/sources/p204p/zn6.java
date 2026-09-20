package p204p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class zn6 implements pb31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284419a = 1;

    /* JADX INFO: renamed from: b */
    public int f284420b;

    /* JADX INFO: renamed from: c */
    public long f284421c;

    /* JADX INFO: renamed from: d */
    public int f284422d;

    public /* synthetic */ zn6() {
    }

    public String toString() {
        switch (this.f284419a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                int i = this.f284420b;
                String str = h0b1.f86200a;
                sb.append(new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII));
                sb.append(", size=");
                sb.append(this.f284421c);
                sb.append(", minHeaderSize=");
                return klh.m56832d(this.f284422d, "}", sb);
            default:
                return super.toString();
        }
    }

    public zn6(int i, long j, int i2) {
        this.f284420b = i;
        this.f284421c = j;
        this.f284422d = i2;
    }
}
