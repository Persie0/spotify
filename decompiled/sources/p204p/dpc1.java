package p204p;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class dpc1 extends wj50 {

    /* JADX INFO: renamed from: f */
    public static boolean f51271f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f51272g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f51273h = true;

    /* JADX INFO: renamed from: i */
    public static boolean f51274i = true;

    @Override // p204p.wj50
    /* JADX INFO: renamed from: Y */
    public void mo36566Y(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo36566Y(view, i);
        } else if (f51274i) {
            try {
                b0b1.m27759f(view, i);
            } catch (NoSuchMethodError unused) {
                f51274i = false;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void mo36567l0(View view, int i, int i2, int i3, int i4) {
        if (f51273h) {
            try {
                b0b1.m27757d(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f51273h = false;
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void mo36568m0(View view, Matrix matrix) {
        if (f51271f) {
            try {
                b0b1.m27762i(view, matrix);
            } catch (NoSuchMethodError unused) {
                f51271f = false;
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void mo36569n0(ViewGroup viewGroup, Matrix matrix) {
        if (f51272g) {
            try {
                b0b1.m27763j(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                f51272g = false;
            }
        }
    }
}
