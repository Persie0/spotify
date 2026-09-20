package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class qvp extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f193078a;

    /* JADX INFO: renamed from: b */
    public final Object f193079b;

    /* JADX INFO: renamed from: c */
    public final Object f193080c;

    public /* synthetic */ qvp(Drawable drawable, Object obj, int i) {
        this.f193078a = i;
        this.f193079b = drawable;
        this.f193080c = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f193078a) {
            case 0:
                Drawable drawable = (Drawable) this.f193079b;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                canvas.drawColor(((svp) this.f193080c).f214485a.getColor(R.color.gray_20));
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int iSave = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth, intrinsicHeight);
                canvas.scale(fMin, fMin);
                canvas.scale(0.33f, 0.33f);
                canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            case 1:
                canvas.save();
                canvas.scale(canvas.getWidth(), canvas.getHeight());
                Paint paint = (Paint) this.f193079b;
                paint.setShader((LinearGradient) this.f193080c);
                canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, paint);
                canvas.restore();
                break;
            case 2:
                Drawable drawable2 = (Drawable) this.f193079b;
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                canvas.drawColor(((Context) this.f193080c).getColor(R.color.gray_20));
                float intrinsicWidth2 = drawable2.getIntrinsicWidth();
                float intrinsicHeight2 = drawable2.getIntrinsicHeight();
                int iSave2 = canvas.save();
                canvas.translate(getBounds().exactCenterX(), getBounds().exactCenterY());
                float fMin2 = Math.min(getBounds().width(), getBounds().height()) / Math.max(intrinsicWidth2, intrinsicHeight2);
                canvas.scale(fMin2, fMin2);
                canvas.scale(0.5f, 0.5f);
                canvas.translate((-intrinsicWidth2) / 2.0f, (-intrinsicHeight2) / 2.0f);
                drawable2.draw(canvas);
                canvas.restoreToCount(iSave2);
                break;
            default:
                Drawable drawable3 = (Drawable) this.f193080c;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
                ((Drawable) this.f193079b).draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f193078a) {
            case 0:
                return -1;
            case 1:
                return -3;
            case 2:
                return -1;
            default:
                return ((Drawable) this.f193079b).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.f193078a) {
            case 0:
                ((Drawable) this.f193079b).setAlpha(i);
                break;
            case 1:
                ((Paint) this.f193079b).setAlpha(i);
                break;
            case 2:
                ((Drawable) this.f193079b).setAlpha(i);
                break;
            default:
                Drawable drawable = (Drawable) this.f193080c;
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                ((Drawable) this.f193079b).setAlpha(255 - i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        switch (this.f193078a) {
            case 3:
                super.setBounds(i, i2, i3, i4);
                Drawable drawable = (Drawable) this.f193080c;
                if (drawable != null) {
                    drawable.setBounds(i, i2, i3, i4);
                }
                ((Drawable) this.f193079b).setBounds(i, i2, i3, i4);
                break;
            default:
                super.setBounds(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f193078a) {
            case 0:
                ((Drawable) this.f193079b).setColorFilter(colorFilter);
                break;
            case 1:
                ((Paint) this.f193079b).setColorFilter(colorFilter);
                break;
            case 2:
                ((Drawable) this.f193079b).setColorFilter(colorFilter);
                break;
            default:
                Drawable drawable = (Drawable) this.f193080c;
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                ((Drawable) this.f193079b).setColorFilter(colorFilter);
                break;
        }
    }

    public qvp(Drawable drawable, Drawable drawable2) {
        this.f193078a = 3;
        this.f193079b = drawable;
        this.f193080c = drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.f193078a) {
            case 3:
                super.setBounds(rect);
                Drawable drawable = (Drawable) this.f193080c;
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                ((Drawable) this.f193079b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    public qvp(Context context) {
        this.f193078a = 1;
        this.f193079b = new Paint(1);
        this.f193080c = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, bug1.m30532u(context, R.attr.pasteColorBackground), Shader.TileMode.CLAMP);
    }
}
