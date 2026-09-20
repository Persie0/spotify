package p204p;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public final class sie1 extends kb8 {

    /* JADX INFO: renamed from: G */
    public final int f209480G;

    /* JADX INFO: renamed from: B */
    public final boolean f209475B = true;

    /* JADX INFO: renamed from: C */
    public final boolean f209476C = true;

    /* JADX INFO: renamed from: D */
    public final float f209477D = 10.0f;

    /* JADX INFO: renamed from: E */
    public final float f209478E = 10.0f;

    /* JADX INFO: renamed from: F */
    public int f209479F = 1;

    /* JADX INFO: renamed from: H */
    public final float f209481H = Float.POSITIVE_INFINITY;

    public sie1(int i) {
        this.f209480G = i;
        this.f63528b = 0.0f;
    }

    @Override // p204p.kb8
    /* JADX INFO: renamed from: a */
    public final void mo55935a(float f, float f2) {
        if (this.f121126w) {
            f = this.f121129z;
        }
        if (this.f121127x) {
            f2 = this.f121128y;
        }
        float fAbs = Math.abs(f2 - f);
        if (fAbs == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        if (!this.f121126w) {
            this.f121129z = f - ((fAbs / 100.0f) * this.f209478E);
        }
        if (!this.f121127x) {
            this.f121128y = ((fAbs / 100.0f) * this.f209477D) + f2;
        }
        this.f121107A = Math.abs(this.f121128y - this.f121129z);
    }

    /* JADX INFO: renamed from: d */
    public final float m78189d(Paint paint) {
        paint.setTextSize(this.f63529c);
        String strM55936b = m55936b();
        DisplayMetrics displayMetrics = u0b1.f225435a;
        float fMeasureText = (this.f63527a * 2.0f) + ((int) paint.measureText(strM55936b));
        float fM82122c = this.f209481H;
        if (fM82122c > 0.0f && fM82122c != Float.POSITIVE_INFINITY) {
            fM82122c = u0b1.m82122c(fM82122c);
        }
        if (fM82122c <= 0.0d) {
            fM82122c = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fM82122c));
    }
}
