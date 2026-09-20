package p204p;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class jlc1 extends mlc1 {

    /* JADX INFO: renamed from: f */
    public SparseArray f113581f;

    /* JADX INFO: renamed from: g */
    public float[] f113582g;

    @Override // p204p.mlc1
    /* JADX INFO: renamed from: b */
    public final void mo53671b(float f, int i) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // p204p.mlc1
    /* JADX INFO: renamed from: c */
    public final void mo51010c(View view, float f) {
        this.f144811a.mo25152s(f, this.f113582g);
        alf1.m26342y((d6j) this.f113581f.valueAt(0), view, this.f113582g);
    }

    @Override // p204p.mlc1
    /* JADX INFO: renamed from: d */
    public final void mo53672d(int i) {
        SparseArray sparseArray = this.f113581f;
        int size = sparseArray.size();
        int iM35120d = ((d6j) sparseArray.valueAt(0)).m35120d();
        double[] dArr = new double[size];
        this.f113582g = new float[iM35120d];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM35120d);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            d6j d6jVar = (d6j) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            d6jVar.m35119c(this.f113582g);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f113582g;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f144811a = hkf1.m47806n(i, dArr, dArr2);
    }
}
