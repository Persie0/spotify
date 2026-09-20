package p204p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w4b1 {

    /* JADX INFO: renamed from: p */
    public static final Matrix f247770p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f247771a;

    /* JADX INFO: renamed from: b */
    public final Path f247772b;

    /* JADX INFO: renamed from: c */
    public final Matrix f247773c;

    /* JADX INFO: renamed from: d */
    public Paint f247774d;

    /* JADX INFO: renamed from: e */
    public Paint f247775e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f247776f;

    /* JADX INFO: renamed from: g */
    public final t4b1 f247777g;

    /* JADX INFO: renamed from: h */
    public float f247778h;

    /* JADX INFO: renamed from: i */
    public float f247779i;

    /* JADX INFO: renamed from: j */
    public float f247780j;

    /* JADX INFO: renamed from: k */
    public float f247781k;

    /* JADX INFO: renamed from: l */
    public int f247782l;

    /* JADX INFO: renamed from: m */
    public String f247783m;

    /* JADX INFO: renamed from: n */
    public Boolean f247784n;

    /* JADX INFO: renamed from: o */
    public final uj5 f247785o;

    public w4b1() {
        this.f247773c = new Matrix();
        this.f247778h = 0.0f;
        this.f247779i = 0.0f;
        this.f247780j = 0.0f;
        this.f247781k = 0.0f;
        this.f247782l = 255;
        this.f247783m = null;
        this.f247784n = null;
        this.f247785o = new uj5(0);
        this.f247777g = new t4b1();
        this.f247771a = new Path();
        this.f247772b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m87189a(t4b1 t4b1Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = t4b1Var.f216961a;
        ArrayList arrayList = t4b1Var.f216962b;
        matrix2.set(matrix);
        Matrix matrix3 = t4b1Var.f216961a;
        matrix3.preConcat(t4b1Var.f216970j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            u4b1 u4b1Var = (u4b1) arrayList.get(i5);
            if (u4b1Var instanceof t4b1) {
                m87189a((t4b1) u4b1Var, matrix3, canvas, i, i2);
            } else {
                if (u4b1Var instanceof v4b1) {
                    v4b1 v4b1Var = (v4b1) u4b1Var;
                    float f2 = i / this.f247780j;
                    float f3 = i2 / this.f247781k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.f247773c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f247771a;
                        v4b1Var.m84650d(path);
                        Path path2 = this.f247772b;
                        path2.reset();
                        if (v4b1Var.m84649c()) {
                            path2.setFillType(v4b1Var.f237112c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            s4b1 s4b1Var = (s4b1) v4b1Var;
                            float f5 = s4b1Var.f205550i;
                            if (f5 != 0.0f || s4b1Var.f205551j != 1.0f) {
                                float f6 = s4b1Var.f205552k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (s4b1Var.f205551j + f6) % 1.0f;
                                if (this.f247776f == null) {
                                    this.f247776f = new PathMeasure();
                                }
                                this.f247776f.setPath(path, z);
                                float length = this.f247776f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                if (f9 > f10) {
                                    this.f247776f.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f247776f.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f247776f.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            float f11 = 255.0f;
                            if (s4b1Var.f205547f.m96275S()) {
                                zk1 zk1Var = s4b1Var.f205547f;
                                if (this.f247775e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f247775e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.f247775e;
                                if (zk1Var.m96259B()) {
                                    Shader shaderM96297y = zk1Var.m96297y();
                                    shaderM96297y.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM96297y);
                                    paint2.setAlpha(Math.round(s4b1Var.f205549h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM96292t = zk1Var.m96292t();
                                    float f12 = s4b1Var.f205549h;
                                    PorterDuff.Mode mode = z4b1.f279193j;
                                    paint2.setColor((iM96292t & i4) | (((int) (Color.alpha(iM96292t) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(s4b1Var.f237112c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i4 = 16777215;
                            }
                            if (s4b1Var.f205545d.m96275S()) {
                                zk1 zk1Var2 = s4b1Var.f205545d;
                                if (this.f247774d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f247774d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f247774d;
                                Paint.Join join = s4b1Var.f205554m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = s4b1Var.f205553l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(s4b1Var.f205555n);
                                if (zk1Var2.m96259B()) {
                                    Shader shaderM96297y2 = zk1Var2.m96297y();
                                    shaderM96297y2.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM96297y2);
                                    paint4.setAlpha(Math.round(s4b1Var.f205548g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM96292t2 = zk1Var2.m96292t();
                                    float f13 = s4b1Var.f205548g;
                                    PorterDuff.Mode mode2 = z4b1.f279193j;
                                    paint4.setColor((iM96292t2 & i4) | (((int) (Color.alpha(iM96292t2) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(s4b1Var.f205546e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f247782l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f247782l = i;
    }

    public w4b1(w4b1 w4b1Var) {
        this.f247773c = new Matrix();
        this.f247778h = 0.0f;
        this.f247779i = 0.0f;
        this.f247780j = 0.0f;
        this.f247781k = 0.0f;
        this.f247782l = 255;
        this.f247783m = null;
        this.f247784n = null;
        uj5 uj5Var = new uj5(0);
        this.f247785o = uj5Var;
        this.f247777g = new t4b1(w4b1Var.f247777g, uj5Var);
        this.f247771a = new Path(w4b1Var.f247771a);
        this.f247772b = new Path(w4b1Var.f247772b);
        this.f247778h = w4b1Var.f247778h;
        this.f247779i = w4b1Var.f247779i;
        this.f247780j = w4b1Var.f247780j;
        this.f247781k = w4b1Var.f247781k;
        this.f247782l = w4b1Var.f247782l;
        this.f247783m = w4b1Var.f247783m;
        String str = w4b1Var.f247783m;
        if (str != null) {
            uj5Var.put(str, this);
        }
        this.f247784n = w4b1Var.f247784n;
    }
}
