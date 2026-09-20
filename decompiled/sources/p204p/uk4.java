package p204p;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class uk4 implements vbn0 {

    /* JADX INFO: renamed from: a */
    public final Path f231212a;

    /* JADX INFO: renamed from: b */
    public RectF f231213b;

    /* JADX INFO: renamed from: c */
    public float[] f231214c;

    /* JADX INFO: renamed from: d */
    public Matrix f231215d;

    public uk4(Path path) {
        this.f231212a = path;
    }

    /* JADX INFO: renamed from: d */
    public final void m83299d(vbn0 vbn0Var, long j) {
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f231212a.addPath(((uk4) vbn0Var).f231212a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: e */
    public final void m83300e(zlx0 zlx0Var, int i) {
        if (this.f231213b == null) {
            this.f231213b = new RectF();
        }
        RectF rectF = this.f231213b;
        wj50.m88279p(rectF);
        float f = zlx0Var.f284095a;
        long j = zlx0Var.f284102h;
        long j2 = zlx0Var.f284101g;
        long j3 = zlx0Var.f284100f;
        long j4 = zlx0Var.f284099e;
        rectF.set(f, zlx0Var.f284096b, zlx0Var.f284097c, zlx0Var.f284098d);
        if (this.f231214c == null) {
            this.f231214c = new float[8];
        }
        float[] fArr = this.f231214c;
        wj50.m88279p(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.f231213b;
        wj50.m88279p(rectF2);
        float[] fArr2 = this.f231214c;
        wj50.m88279p(fArr2);
        this.f231212a.addRoundRect(rectF2, fArr2, xk4.m91260b(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m83301f() {
        this.f231212a.close();
    }

    /* JADX INFO: renamed from: g */
    public final void m83302g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f231212a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: h */
    public final tiv0 m83303h() {
        if (this.f231213b == null) {
            this.f231213b = new RectF();
        }
        RectF rectF = this.f231213b;
        wj50.m88279p(rectF);
        this.f231212a.computeBounds(rectF, true);
        return new tiv0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: i */
    public final void m83304i(float f, float f2) {
        this.f231212a.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: j */
    public final void m83305j(float f, float f2) {
        this.f231212a.moveTo(f, f2);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m83306k(vbn0 vbn0Var, vbn0 vbn0Var2, int i) {
        Path.Op op;
        if (iug1.m51688q(i, 0)) {
            op = Path.Op.DIFFERENCE;
        } else if (iug1.m51688q(i, 1)) {
            op = Path.Op.INTERSECT;
        } else if (iug1.m51688q(i, 4)) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = iug1.m51688q(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((uk4) vbn0Var).f231212a;
        if (vbn0Var2 instanceof uk4) {
            return this.f231212a.op(path, ((uk4) vbn0Var2).f231212a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: l */
    public final void m83307l(float f, float f2, float f3, float f4) {
        this.f231212a.quadTo(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: m */
    public final void m83308m() {
        this.f231212a.reset();
    }

    /* JADX INFO: renamed from: n */
    public final void m83309n() {
        this.f231212a.rewind();
    }

    /* JADX INFO: renamed from: o */
    public final void m83310o(int i) {
        this.f231212a.setFillType(eug1.m40066g(i, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    /* JADX INFO: renamed from: p */
    public final void m83311p(long j) {
        Matrix matrix = this.f231215d;
        if (matrix == null) {
            this.f231215d = new Matrix();
        } else {
            wj50.m88279p(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f231215d;
        wj50.m88279p(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.f231215d;
        wj50.m88279p(matrix3);
        this.f231212a.transform(matrix3);
    }
}
