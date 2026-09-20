package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p002ui.geometry.Size;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class w9m implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final float f249196a;

    /* JADX INFO: renamed from: b */
    public final float f249197b;

    /* JADX INFO: renamed from: c */
    public final int f249198c;

    /* JADX INFO: renamed from: d */
    public final int f249199d;

    public w9m(float f, float f2, float f3, yqq yqqVar, float f4) {
        this.f249196a = f;
        this.f249197b = f2;
        int iM72083N = q3d0.m72083N(f + f3);
        this.f249198c = iM72083N;
        this.f249199d = q3d0.m72083N(f4) - iM72083N;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.f249198c;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Object obj = qxy.f193763a;
        Integer numValueOf = null;
        if (!obj.equals(obj)) {
            throw new NoWhenBranchMatchedException();
        }
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f249196a)) << 32) | (((long) Float.floatToRawIntBits(this.f249197b)) & 4294967295L);
        eh00 eh00Var = new eh00(this) { // from class: p.v9m
            @Override // p204p.eh00
            public final Object invoke() {
                long j = jFloatToRawIntBits;
                float fM264e = Size.m264e(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM264e)) << 32) | (((long) Float.floatToRawIntBits(fM264e)) & 4294967295L);
                zlx0 zlx0VarM72097g = q3d0.m72097g(q0f1.m71836j(0L, j), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new myl0(zlx0VarM72097g);
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (q3d0.m72077H(zlx0VarM72097g)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (zlx0VarM72097g.f284099e >> 32));
                    canvas2.drawRoundRect(f2, f3 - (zlx0VarM72097g.m96392a() / 2.0f), (zlx0VarM72097g.m96393b() * i2) + f2, (zlx0VarM72097g.m96392a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    uk4 uk4VarM91259a = xk4.m91259a();
                    uk4VarM91259a.m83300e(zlx0VarM72097g, 1);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (zlx0VarM72097g.m96392a() / 2.0f));
                    canvas2.drawPath(uk4VarM91259a.f231212a, paint2);
                    canvas2.restore();
                }
                return w2a1.f247311a;
            }
        };
        if (!Float.isNaN(Float.NaN)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Float.NaN));
        }
        eh00Var.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.f249199d;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
