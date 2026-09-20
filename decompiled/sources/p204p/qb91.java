package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qb91 {

    /* JADX INFO: renamed from: a */
    public static final boolean f187046a;

    static {
        f187046a = Build.VERSION.SDK_INT >= 28;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ee  */
    /* JADX INFO: renamed from: a */
    public static ImageView m72488a(ViewGroup viewGroup, View view, View view2) {
        int iIndexOfChild;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        dpc1 dpc1Var = bpc1.f29411a;
        dpc1Var.mo36568m0(view, matrix);
        dpc1Var.mo36569n0(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (!zIsAttachedToWindow) {
            if (z) {
                viewGroup2 = (ViewGroup) view.getParent();
                iIndexOfChild = viewGroup2.indexOfChild(view);
                mec1.m61550b(view, viewGroup);
            }
            if (bitmapCreateBitmap != null) {
                imageView.setImageBitmap(bitmapCreateBitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
            imageView.layout(iRound, iRound2, iRound3, iRound4);
            return imageView;
        }
        iIndexOfChild = 0;
        viewGroup2 = null;
        int iRound5 = Math.round(rectF.width());
        int iRound6 = Math.round(rectF.height());
        if (iRound5 > 0 && iRound6 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
            int iRound7 = Math.round(iRound5 * fMin);
            int iRound8 = Math.round(iRound6 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f187046a) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = r35.m74601i(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        if (bitmapCreateBitmap != null) {
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }
}
