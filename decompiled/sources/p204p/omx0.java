package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class omx0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Bitmap f167109a;

    /* JADX INFO: renamed from: b */
    public final float f167110b;

    /* JADX INFO: renamed from: c */
    public int f167111c;

    /* JADX INFO: renamed from: d */
    public final BitmapShader f167112d;

    /* JADX INFO: renamed from: e */
    public final Paint f167113e;

    public omx0(Bitmap bitmap, float f) {
        this.f167109a = bitmap;
        this.f167110b = f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f167112d = bitmapShader;
        Paint paint = new Paint(3);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.f167113e = paint;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f167111c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new pmx0(this.f167109a, this.f167110b);
    }
}
