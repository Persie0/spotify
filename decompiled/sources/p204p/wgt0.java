package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class wgt0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f251146a;

    /* JADX INFO: renamed from: b */
    public final int f251147b;

    /* JADX INFO: renamed from: c */
    public final Paint f251148c;

    /* JADX INFO: renamed from: d */
    public final Paint f251149d;

    public wgt0(int i, Bitmap bitmap) {
        this.f251146a = bitmap;
        this.f251147b = i;
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f251148c = paint;
        Paint paint2 = new Paint();
        paint2.setFilterBitmap(false);
        this.f251149d = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.f251148c);
        int iWidth = getBounds().width();
        Bitmap bitmap = this.f251146a;
        int iMin = Math.min(iWidth / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
        if (iMin < 1) {
            return;
        }
        int width = bitmap.getWidth() * iMin;
        int height = bitmap.getHeight() * iMin;
        int iWidth2 = ((getBounds().width() - width) / 2) + getBounds().left;
        int iHeight = ((getBounds().height() - height) / 2) + getBounds().top;
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(iWidth2, iHeight, width + iWidth2, height + iHeight), this.f251149d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f251147b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f251147b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f251148c.setAlpha(i);
        this.f251149d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f251148c.setColorFilter(colorFilter);
        this.f251149d.setColorFilter(colorFilter);
    }
}
