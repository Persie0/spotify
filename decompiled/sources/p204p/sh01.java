package p204p;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class sh01 extends uh01 {

    /* JADX INFO: renamed from: h */
    public static final RectF f208968h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f208969b;

    /* JADX INFO: renamed from: c */
    public final float f208970c;

    /* JADX INFO: renamed from: d */
    public final float f208971d;

    /* JADX INFO: renamed from: e */
    public final float f208972e;

    /* JADX INFO: renamed from: f */
    public float f208973f;

    /* JADX INFO: renamed from: g */
    public float f208974g;

    public sh01(float f, float f2, float f3, float f4) {
        this.f208969b = f;
        this.f208970c = f2;
        this.f208971d = f3;
        this.f208972e = f4;
    }

    @Override // p204p.uh01
    /* JADX INFO: renamed from: a */
    public final void mo78123a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f230306a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f208971d;
        float f2 = this.f208972e;
        RectF rectF = f208968h;
        rectF.set(this.f208969b, this.f208970c, f, f2);
        path.arcTo(rectF, this.f208973f, this.f208974g, false);
        path.transform(matrix);
    }
}
