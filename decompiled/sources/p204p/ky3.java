package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class ky3 implements wqb {

    /* JADX INFO: renamed from: a */
    public Canvas f127640a = ly3.f137948a;

    /* JADX INFO: renamed from: b */
    public Rect f127641b;

    /* JADX INFO: renamed from: c */
    public Rect f127642c;

    @Override // p204p.wqb
    /* JADX INFO: renamed from: b */
    public final void mo25273b(float f, float f2) {
        this.f127640a.scale(f, f2);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: c */
    public final void mo25274c(float f, float f2, float f3, float f4, lk4 lk4Var) {
        this.f127640a.drawRect(f, f2, f3, f4, s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: d */
    public final void mo25275d(q94 q94Var, long j, long j2, long j3, long j4, lk4 lk4Var) {
        if (this.f127641b == null) {
            this.f127641b = new Rect();
            this.f127642c = new Rect();
        }
        Canvas canvas = this.f127640a;
        Bitmap bitmapM43159o = fz6.m43159o(q94Var);
        Rect rect = this.f127641b;
        wj50.m88279p(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f127642c;
        wj50.m88279p(rect2);
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapM43159o, rect, rect2, s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: e */
    public final void mo25276e(float f, float f2, float f3, float f4, float f5, float f6, lk4 lk4Var) {
        this.f127640a.drawArc(f, f2, f3, f4, f5, f6, false, s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: f */
    public final void mo25277f(float f, float f2, float f3, float f4, int i) {
        this.f127640a.clipRect(f, f2, f3, f4, z9g1.m95661k(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: g */
    public final void mo25278g(float f, float f2) {
        this.f127640a.translate(f, f2);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: h */
    public final void mo25279h() {
        this.f127640a.restore();
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: i */
    public final void mo25280i(tiv0 tiv0Var, lk4 lk4Var) {
        this.f127640a.saveLayer(tiv0Var.f220751a, tiv0Var.f220752b, tiv0Var.f220753c, tiv0Var.f220754d, s800.m77400A(lk4Var), 31);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: j */
    public final void mo25281j(long j, long j2, lk4 lk4Var) {
        this.f127640a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: k */
    public final void mo25282k(float f, float f2, float f3, float f4, float f5, float f6, lk4 lk4Var) {
        this.f127640a.drawRoundRect(f, f2, f3, f4, f5, f6, s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: l */
    public final void mo25283l() {
        gue.m45746h(this.f127640a, true);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: m */
    public final void mo25284m(float f) {
        this.f127640a.rotate(f);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: n */
    public final void mo25285n(float f, long j, lk4 lk4Var) {
        this.f127640a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: o */
    public final void mo25286o(q94 q94Var, long j, lk4 lk4Var) {
        this.f127640a.drawBitmap(fz6.m43159o(q94Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), s800.m77400A(lk4Var));
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: p */
    public final void mo25287p() {
        this.f127640a.save();
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: q */
    public final void mo25288q() {
        gue.m45746h(this.f127640a, false);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: r */
    public final void mo25289r(float[] fArr) {
        if (gug1.m45755A(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        dyu.m37357B(matrix, fArr);
        this.f127640a.concat(matrix);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: s */
    public final void mo25290s(vbn0 vbn0Var, int i) {
        Canvas canvas = this.f127640a;
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((uk4) vbn0Var).f231212a, z9g1.m95661k(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p204p.wqb
    /* JADX INFO: renamed from: t */
    public final void mo25291t(vbn0 vbn0Var, lk4 lk4Var) {
        Canvas canvas = this.f127640a;
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((uk4) vbn0Var).f231212a, s800.m77400A(lk4Var));
    }
}
