package p204p;

import android.graphics.Bitmap;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class qr8 implements dre0, l591, cz61, g4l0 {

    /* JADX INFO: renamed from: a */
    public int f191759a;

    /* JADX INFO: renamed from: b */
    public int f191760b;

    public /* synthetic */ qr8() {
        this.f191759a = 0;
    }

    /* JADX INFO: renamed from: q */
    public static int m73596q(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: r */
    public static long m73597r(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: a */
    public int mo30296a() {
        return this.f191760b;
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: b */
    public int mo30297b() {
        return this.f191759a;
    }

    @Override // p204p.cz61
    /* JADX INFO: renamed from: c */
    public az61 mo34411c(az61 az61Var) {
        int i = this.f191760b;
        int iMo30952h = az61Var.mo30952h(dce.DAY_OF_WEEK);
        int i2 = this.f191759a;
        if (i2 < 2 && iMo30952h == i) {
            return az61Var;
        }
        if ((i2 & 1) == 0) {
            int i3 = iMo30952h - i;
            return az61Var.mo27574i(i3 >= 0 ? 7 - i3 : -i3, gce.DAYS);
        }
        int i4 = i - iMo30952h;
        return az61Var.mo27573e(i4 >= 0 ? 7 - i4 : -i4, gce.DAYS);
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: d */
    public boolean mo30298d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int m73598e() {
        int i = this.f191760b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int i = this.f191759a;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, (int) (((double) i) * (((double) bitmap.getHeight()) / ((double) bitmap.getWidth()))), true);
        int height = bitmapCreateScaledBitmap.getHeight();
        int i2 = this.f191760b;
        if (height <= i2) {
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, bitmapCreateScaledBitmap.getWidth(), i2);
        if (bitmapCreateScaledBitmap != bitmap && bitmapCreateBitmap != bitmapCreateScaledBitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public int m73599g() {
        return this.f191759a | this.f191760b;
    }

    @Override // p204p.g4l0
    /* JADX INFO: renamed from: h */
    public int mo43538h(int i) {
        if (i >= 0 && i <= this.f191760b) {
            ceg1.m32583v(i, this.f191759a, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public void m73600i(int i) {
        this.f191759a = i;
    }

    /* JADX INFO: renamed from: j */
    public void m73601j(int i, int i2) {
        if (i2 == 1) {
            this.f191760b = i;
        } else {
            this.f191759a = i;
        }
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        return s571.m77247f(this.f191759a, "scale-crop-transformation-", this.f191760b, "x");
    }

    @Override // p204p.g4l0
    /* JADX INFO: renamed from: l */
    public int mo43539l(int i) {
        if (i >= 0 && i <= this.f191759a) {
            ceg1.m32582u(i, this.f191760b, i);
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public void m73602m() {
        this.f191759a = 0;
    }

    /* JADX INFO: renamed from: n */
    public void m73603n(int i) {
        if (i == 1) {
            this.f191760b = 0;
        } else {
            this.f191759a = 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m73604o(dkv0 dkv0Var) {
        View view = dkv0Var.f50039a;
        this.f191759a = view.getLeft();
        this.f191760b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    /* JADX INFO: renamed from: p */
    public void m73605p() {
        int i = this.f191759a + this.f191760b;
        this.f191759a = i;
        if (i <= 0) {
            this.f191760b = 0;
        } else {
            this.f191760b = i;
            this.f191759a = 0;
        }
    }

    public /* synthetic */ qr8(int i, int i2) {
        this.f191759a = i;
        this.f191760b = i2;
    }

    public /* synthetic */ qr8(boolean z) {
    }

    public qr8(int i, int i2, int i3) {
        this.f191759a = (-i2) + i3;
        this.f191760b = i + 1;
    }

    public qr8(int i, ioo iooVar) {
        jlg1.m53716z(iooVar, "dayOfWeek");
        this.f191759a = i;
        this.f191760b = iooVar.m51215f();
    }
}
