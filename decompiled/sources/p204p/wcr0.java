package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class wcr0 {

    /* JADX INFO: renamed from: a */
    public Size f250088a;

    /* JADX INFO: renamed from: b */
    public Rect f250089b;

    /* JADX INFO: renamed from: c */
    public int f250090c;

    /* JADX INFO: renamed from: d */
    public Matrix f250091d;

    /* JADX INFO: renamed from: e */
    public int f250092e;

    /* JADX INFO: renamed from: f */
    public boolean f250093f;

    /* JADX INFO: renamed from: g */
    public boolean f250094g;

    /* JADX INFO: renamed from: h */
    public cdr0 f250095h;

    /* JADX INFO: renamed from: a */
    public final void m87752a(Size size, int i, Rect rect) {
        Matrix matrix;
        if (m87757f()) {
            Matrix matrix2 = new Matrix();
            if (m87757f()) {
                Matrix matrix3 = new Matrix(this.f250091d);
                matrix3.postConcat(m87754c(size, i));
                matrix = matrix3;
            } else {
                matrix = null;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Size m87753b() {
        return j591.m52447b(this.f250090c) ? new Size(this.f250089b.height(), this.f250089b.width()) : new Size(this.f250089b.width(), this.f250089b.height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX INFO: renamed from: c */
    public final Matrix m87754c(Size size, int i) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        wj50.m88281r(null, m87757f());
        if (j591.m52448c(size, true, m87753b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeM87753b = m87753b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeM87753b.getWidth(), sizeM87753b.getHeight());
            Matrix matrix = new Matrix();
            cdr0 cdr0Var = this.f250095h;
            int iOrdinal = cdr0Var.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                cdr0Var.toString();
                vie1.m85626h("PreviewTransform");
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (cdr0Var == cdr0.FIT_CENTER || cdr0Var == cdr0.FIT_START || cdr0Var == cdr0.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixM52446a = j591.m52446a(new RectF(this.f250089b), rectF, this.f250090c, false);
        if (this.f250093f && this.f250094g) {
            if (j591.m52447b(this.f250090c)) {
                matrixM52446a.preScale(1.0f, -1.0f, this.f250089b.centerX(), this.f250089b.centerY());
                return matrixM52446a;
            }
            matrixM52446a.preScale(-1.0f, 1.0f, this.f250089b.centerX(), this.f250089b.centerY());
        }
        return matrixM52446a;
    }

    /* JADX INFO: renamed from: d */
    public final Matrix m87755d() {
        wj50.m88281r(null, m87757f());
        RectF rectF = new RectF(0.0f, 0.0f, this.f250088a.getWidth(), this.f250088a.getHeight());
        return j591.m52446a(rectF, rectF, !this.f250094g ? this.f250090c : -tg1.m80726p(this.f250092e), false);
    }

    /* JADX INFO: renamed from: e */
    public final RectF m87756e(Size size, int i) {
        wj50.m88281r(null, m87757f());
        Matrix matrixM87754c = m87754c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f250088a.getWidth(), this.f250088a.getHeight());
        matrixM87754c.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87757f() {
        return (this.f250089b == null || this.f250088a == null || !(!this.f250094g || this.f250092e != -1)) ? false : true;
    }
}
