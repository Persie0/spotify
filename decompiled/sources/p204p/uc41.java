package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes7.dex */
public final class uc41 extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final int f228939a;

    /* JADX INFO: renamed from: b */
    public final boolean f228940b;

    /* JADX WARN: Illegal instructions before constructor call */
    public uc41(int i, tc41 tc41Var, boolean z) {
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else if (i != 3 && i != 4) {
                throw null;
            }
        }
        super(tc41Var, i2);
        this.f228939a = i;
        this.f228940b = z;
    }

    /* JADX INFO: renamed from: a */
    public static void m82733a(uc41 uc41Var, char c, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint) {
        tc41 tc41Var = (tc41) uc41Var.getDrawable();
        if (uc41Var.f228940b) {
            tc41Var.m80417b(paint.getColor());
        }
        Rect rect = new Rect();
        paint.getTextBounds(new char[]{c}, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (tc41Var.f219021n.mo57071h() / 2) + (i4 - (rect.height() / 2)), paint);
    }

    /* JADX INFO: renamed from: b */
    public static void m82734b(uc41 uc41Var, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (uc41Var.f228940b) {
            ((tc41) uc41Var.getDrawable()).m80417b(paint.getColor());
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.f228939a;
        if (i6 == 1) {
            m82734b(this, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            return;
        }
        if (i6 == 2) {
            m82734b(this, canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        } else if (i6 != 3) {
            m82733a(this, 'e', canvas, charSequence, i, i2, f, i3, i4, paint);
        } else {
            m82733a(this, 'E', canvas, charSequence, i, i2, f, i3, i4, paint);
        }
    }
}
