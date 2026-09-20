package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z800 implements qh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f280305b;

    public /* synthetic */ z800(Object obj, int i) {
        this.f280304a = i;
        this.f280305b = obj;
    }

    @Override // p204p.qh00
    public final Object apply(Object obj) {
        switch (this.f280304a) {
            case 0:
                ob81 ob81Var = (ob81) obj;
                ((d900) this.f280305b).getClass();
                return ob81Var;
            case 1:
                lrd0.m59790i((lrd0) this.f280305b, (Throwable) obj);
                return Boolean.FALSE;
            case 2:
                xvx0 xvx0Var = (xvx0) this.f280305b;
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                if40 if40Var = (if40) xvx0Var.f266533c;
                if (!if40Var.m50416a(Math.max(height, width))) {
                    return bitmap;
                }
                if (if40Var.m50416a(height)) {
                    height--;
                }
                if (if40Var.m50416a(width)) {
                    width--;
                }
                return k04.m54924u(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                t9w0 t9w0Var = (t9w0) this.f280305b;
                Bitmap bitmapCreateScaledBitmap = (Bitmap) obj;
                int width2 = bitmapCreateScaledBitmap.getWidth();
                int i = t9w0Var.f218381b;
                if (width2 > i || bitmapCreateScaledBitmap.getHeight() > i) {
                    float f = i;
                    float width3 = bitmapCreateScaledBitmap.getWidth();
                    float height2 = bitmapCreateScaledBitmap.getHeight();
                    float fMin = Math.min(f / width3, f / height2);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (width3 * fMin), (int) (height2 * fMin), true);
                }
                return k04.m54924u(bitmapCreateScaledBitmap);
        }
    }
}
