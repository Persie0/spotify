package p204p;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;

/* JADX INFO: loaded from: classes.dex */
public abstract class ug01 extends Brush {

    /* JADX INFO: renamed from: a */
    public ae41 f229940a;

    /* JADX INFO: renamed from: b */
    public long f229941b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public float[] f229942c;

    @Override // androidx.compose.p002ui.graphics.Brush
    /* JADX INFO: renamed from: a */
    public final void mo268a(float f, long j, lk4 lk4Var) {
        ae41 ae41Var = this.f229940a;
        if (ae41Var == null || !Size.m262c(this.f229941b, j)) {
            if (Size.m266g(j)) {
                this.f229940a = null;
                this.f229941b = 9205357640488583168L;
                ae41Var = null;
            } else {
                ae41Var = this.f229940a;
                if (ae41Var == null) {
                    ae41Var = new ae41(13);
                    this.f229940a = ae41Var;
                }
                float[] fArr = this.f229942c;
                if (fArr != null) {
                    ae41Var.m25657B(fArr);
                }
                ae41Var.m25682y(mo43315c(j));
                this.f229940a = ae41Var;
                this.f229941b = j;
            }
        }
        Paint paint = lk4Var.f134233a;
        long jM77451y = s800.m77451y(paint);
        int i = n6f.f150872l;
        if (!as91.m27074b(jM77451y, ly5.m60218h())) {
            lk4Var.m59208c(ly5.m60218h());
        }
        if (!wj50.m88271j(lk4Var.f134235c, ae41Var != null ? ae41Var.m25677s() : null)) {
            lk4Var.m59210e(ae41Var != null ? ae41Var.m25677s() : null);
        }
        if (s800.m77450x(paint) == f) {
            return;
        }
        lk4Var.m59206a(f);
    }

    /* JADX INFO: renamed from: c */
    public abstract Shader mo43315c(long j);
}
