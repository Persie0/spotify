package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j591 {

    /* JADX INFO: renamed from: a */
    public static final RectF f108921a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static Matrix m52446a(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f108921a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m52447b(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(s571.m77246e(i, "Invalid rotation degrees: "));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m52448c(Size size, boolean z, Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    /* JADX INFO: renamed from: d */
    public static Size m52449d(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* JADX INFO: renamed from: e */
    public static Size m52450e(Size size, int i) {
        wj50.m88275l("Invalid rotation degrees: " + i, i % 90 == 0);
        return m52447b(m52451f(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* JADX INFO: renamed from: f */
    public static int m52451f(int i) {
        return ((i % 360) + 360) % 360;
    }
}
