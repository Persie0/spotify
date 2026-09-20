package p204p;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class th01 extends uh01 {

    /* JADX INFO: renamed from: b */
    public float f220298b;

    /* JADX INFO: renamed from: c */
    public float f220299c;

    @Override // p204p.uh01
    /* JADX INFO: renamed from: a */
    public final void mo78123a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f230306a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f220298b, this.f220299c);
        path.transform(matrix);
    }
}
