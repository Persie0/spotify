package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class w9b0 {

    /* JADX INFO: renamed from: a */
    public final int f249138a;

    /* JADX INFO: renamed from: b */
    public final int f249139b;

    /* JADX INFO: renamed from: c */
    public final String f249140c;

    /* JADX INFO: renamed from: d */
    public final String f249141d;

    /* JADX INFO: renamed from: e */
    public final String f249142e;

    /* JADX INFO: renamed from: f */
    public Bitmap f249143f;

    public w9b0(int i, int i2, String str, String str2, String str3) {
        this.f249138a = i;
        this.f249139b = i2;
        this.f249140c = str;
        this.f249141d = str2;
        this.f249142e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final w9b0 m87488a(float f) {
        int i = (int) (this.f249138a * f);
        int i2 = (int) (this.f249139b * f);
        w9b0 w9b0Var = new w9b0(i, i2, this.f249140c, this.f249141d, this.f249142e);
        Bitmap bitmap = this.f249143f;
        if (bitmap != null) {
            w9b0Var.f249143f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return w9b0Var;
    }

    /* JADX INFO: renamed from: b */
    public final String m87489b() {
        return this.f249141d;
    }

    /* JADX INFO: renamed from: c */
    public final int m87490c() {
        return this.f249139b;
    }

    /* JADX INFO: renamed from: d */
    public final String m87491d() {
        return this.f249140c;
    }

    /* JADX INFO: renamed from: e */
    public final int m87492e() {
        return this.f249138a;
    }

    /* JADX INFO: renamed from: f */
    public final void m87493f(Bitmap bitmap) {
        this.f249143f = bitmap;
    }
}
