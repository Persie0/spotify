package p204p;

import android.graphics.Bitmap;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class s4i0 implements l591 {

    /* JADX INFO: renamed from: a */
    public int f205598a;

    /* JADX INFO: renamed from: b */
    public int f205599b;

    /* JADX INFO: renamed from: c */
    public int f205600c;

    /* JADX INFO: renamed from: d */
    public int f205601d;

    /* JADX INFO: renamed from: e */
    public int f205602e;

    /* JADX INFO: renamed from: f */
    public int f205603f;

    /* JADX INFO: renamed from: g */
    public Serializable f205604g;

    public /* synthetic */ s4i0(int i, int i2, int i3, int i4, int i5, int i6, Serializable serializable) {
        this.f205598a = i;
        this.f205599b = i2;
        this.f205600c = i3;
        this.f205601d = i4;
        this.f205602e = i5;
        this.f205603f = i6;
        this.f205604g = serializable;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77199a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f205598a = i2;
        this.f205604g = ckf1.f38985a[3 - i3];
        int i6 = ckf1.f38986b[i5];
        this.f205600c = i6;
        if (i2 == 2) {
            this.f205600c = i6 / 2;
        } else if (i2 == 0) {
            this.f205600c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f205603f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? ckf1.f38987c[i4 - 1] : ckf1.f38988d[i4 - 1];
            this.f205602e = i9;
            this.f205599b = (((i9 * 12) / this.f205600c) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? ckf1.f38989e[i4 - 1] : ckf1.f38990f[i4 - 1];
                this.f205602e = i10;
                this.f205599b = ((i10 * 144) / this.f205600c) + i7;
            } else {
                int i11 = ckf1.f38991g[i4 - 1];
                this.f205602e = i11;
                this.f205599b = (((i3 == 1 ? 72 : 144) * i11) / this.f205600c) + i7;
            }
        }
        this.f205601d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int i = this.f205602e;
        int i2 = this.f205600c;
        int i3 = this.f205603f;
        int i4 = this.f205601d;
        return Bitmap.createBitmap(bitmap, i * i2, i3 * i4, i2, i4);
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        int i = this.f205598a;
        int i2 = this.f205599b;
        int i3 = this.f205602e;
        int i4 = this.f205603f;
        String str = (String) this.f205604g;
        StringBuilder sbM36619s = dq60.m36619s(i, i2, "SpritemapTransformation(columns=", ",rows=", ",x=");
        sbM36619s.append(i3);
        sbM36619s.append(",y=");
        sbM36619s.append(i4);
        sbM36619s.append(",sourceUri=");
        return dq60.m36616p(str, ")", sbM36619s);
    }
}
