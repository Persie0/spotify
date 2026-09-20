package p204p;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class ek80 implements LineHeightSpan {

    /* JADX INFO: renamed from: X */
    public int f60397X;

    /* JADX INFO: renamed from: Y */
    public int f60398Y;

    /* JADX INFO: renamed from: a */
    public final float f60399a;

    /* JADX INFO: renamed from: b */
    public final int f60400b;

    /* JADX INFO: renamed from: c */
    public final boolean f60401c;

    /* JADX INFO: renamed from: d */
    public final boolean f60402d;

    /* JADX INFO: renamed from: e */
    public final float f60403e;

    /* JADX INFO: renamed from: f */
    public final int f60404f;

    /* JADX INFO: renamed from: g */
    public int f60405g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h */
    public int f60406h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public int f60407i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t */
    public int f60408t = Integer.MIN_VALUE;

    public ek80(boolean z, int i, int i2, boolean z2, float f, float f2) {
        this.f60399a = f;
        this.f60400b = i;
        this.f60401c = z;
        this.f60402d = z2;
        this.f60403e = f2;
        this.f60404f = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            nt40.m65599c("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: a */
    public final ek80 m39269a(int i, boolean z) {
        return new ek80(z, i, this.f60404f, this.f60402d, this.f60399a, this.f60403e);
    }

    /* JADX INFO: renamed from: b */
    public final int m39270b() {
        return this.f60397X;
    }

    /* JADX INFO: renamed from: c */
    public final int m39271c() {
        return this.f60398Y;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f60400b;
        int i7 = this.f60404f;
        boolean z3 = this.f60402d;
        boolean z4 = this.f60401c;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.f60405g == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f60399a);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.f60403e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.f60407i = i12;
                int i13 = i12 - iCeil;
                this.f60406h = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.f60405g = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.f60408t = i12;
                    this.f60397X = fontMetricsInt.ascent - i13;
                    this.f60398Y = i12 - i11;
                } else if (i7 == 2) {
                    this.f60405g = z4 ? Math.max(fontMetricsInt.ascent, i13) : Math.min(fontMetricsInt.ascent, i13);
                    this.f60408t = z3 ? Math.min(fontMetricsInt.descent, this.f60407i) : Math.max(fontMetricsInt.descent, this.f60407i);
                    this.f60397X = 0;
                    this.f60398Y = 0;
                }
            } else {
                int i14 = fontMetricsInt.ascent;
                this.f60406h = i14;
                int i15 = fontMetricsInt.descent;
                this.f60407i = i15;
                this.f60405g = i14;
                this.f60408t = i15;
                this.f60397X = 0;
                this.f60398Y = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.f60405g : this.f60406h;
        fontMetricsInt.descent = z2 ? this.f60408t : this.f60407i;
    }

    /* JADX INFO: renamed from: d */
    public final int m39272d() {
        return this.f60404f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m39273e() {
        return this.f60401c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m39274f() {
        return this.f60402d;
    }
}
