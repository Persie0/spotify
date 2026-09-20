package p204p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class j940 implements l591 {

    /* JADX INFO: renamed from: a */
    public final Activity f110088a;

    /* JADX INFO: renamed from: b */
    public final boolean f110089b;

    public /* synthetic */ j940(Activity activity, boolean z) {
        this.f110088a = activity;
        this.f110089b = z;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: f */
    public Bitmap mo33239f(Bitmap bitmap, Integer num, Integer num2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        wj50.m88279p(config);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Drawable drawable = this.f110088a.getDrawable(R.drawable.collection_station_ripple);
        if (drawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Rect clipBounds = canvas.getClipBounds();
        float fCenterX = clipBounds.centerX();
        float fCenterY = clipBounds.centerY();
        int iMin = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;
        matrix.postTranslate(-fCenterX, -fCenterY);
        bitmapShader.setLocalMatrix(matrix);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        int i = -iMin;
        drawable.setBounds(i, i, iMin, iMin);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(fCenterX, fCenterY);
        canvas.scale(0.63f, 0.63f);
        if (this.f110089b) {
            canvas.drawCircle(0.0f, 0.0f, iMin, paint);
        } else {
            float f = iMin;
            float f2 = -f;
            canvas.drawRect(f2, f2, f, f, paint);
        }
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @Override // p204p.l591
    /* JADX INFO: renamed from: k */
    public String mo33244k() {
        return dq60.m36612l("RippleListItemTransformation", this.f110089b ? '1' : '0');
    }
}
