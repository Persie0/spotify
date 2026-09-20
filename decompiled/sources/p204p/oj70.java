package p204p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class oj70 implements l591 {

    /* JADX INFO: renamed from: a */
    public final int f165987a;

    /* JADX INFO: renamed from: b */
    public final float f165988b;

    /* JADX INFO: renamed from: c */
    public final int f165989c;

    public oj70(Resources resources) {
        int iM72083N = q3d0.m72083N(resources.getDimension(R.dimen.shortcut_adaptiveicon_size));
        this.f165987a = iM72083N;
        float dimension = resources.getDimension(R.dimen.shortcut_adaptiveicon_padding);
        this.f165988b = dimension;
        this.f165989c = q3d0.m72083N(iM72083N - (dimension * 2));
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public final Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        float fMin = this.f165989c / Math.min(bitmap.getWidth(), bitmap.getHeight());
        float width = ((bitmap.getWidth() - bitmap.getHeight()) * fMin) / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        float f = width < 0.0f ? 0.0f : width;
        float f2 = this.f165988b;
        float f3 = -width;
        matrix.postTranslate(f2 - f, f2 - (f3 >= 0.0f ? f3 : 0.0f));
        int i = this.f165987a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(bitmap, matrix, null);
        return bitmapCreateBitmap;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public final String mo33244k() {
        return "AdaptiveIconTransformation:" + this.f165987a + ":" + this.f165988b;
    }
}
