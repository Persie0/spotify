package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ua20 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f228336f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f228337a;

    /* JADX INFO: renamed from: b */
    public int f228338b;

    /* JADX INFO: renamed from: c */
    public int f228339c;

    /* JADX INFO: renamed from: d */
    public int f228340d;

    /* JADX INFO: renamed from: e */
    public byte[] f228341e;

    /* JADX INFO: renamed from: a */
    public final void m82664a(int i, byte[] bArr, int i2) {
        if (this.f228337a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f228341e;
            int length = bArr2.length;
            int i4 = this.f228339c + i3;
            if (length < i4) {
                this.f228341e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f228341e, this.f228339c, i3);
            this.f228339c += i3;
        }
    }
}
