package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iti0 {

    /* JADX INFO: renamed from: a */
    public final int f105601a;

    /* JADX INFO: renamed from: b */
    public boolean f105602b;

    /* JADX INFO: renamed from: c */
    public boolean f105603c;

    /* JADX INFO: renamed from: d */
    public byte[] f105604d;

    /* JADX INFO: renamed from: e */
    public int f105605e;

    public iti0(int i) {
        this.f105601a = i;
        byte[] bArr = new byte[131];
        this.f105604d = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m51632a(int i, byte[] bArr, int i2) {
        if (this.f105602b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f105604d;
            int length = bArr2.length;
            int i4 = this.f105605e;
            if (length < i4 + i3) {
                this.f105604d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f105604d, this.f105605e, i3);
            this.f105605e += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51633b(int i) {
        if (!this.f105602b) {
            return false;
        }
        this.f105605e -= i;
        this.f105602b = false;
        this.f105603c = true;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m51634c() {
        this.f105602b = false;
        this.f105603c = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m51635d(int i) {
        c95.m31855u(!this.f105602b);
        boolean z = i == this.f105601a;
        this.f105602b = z;
        if (z) {
            this.f105605e = 3;
            this.f105603c = false;
        }
    }
}
