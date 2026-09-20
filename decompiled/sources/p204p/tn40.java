package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class tn40 extends egs {

    /* JADX INFO: renamed from: Y */
    public final tgs f221881Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC2440u5 f221882Z;

    public tn40(Context context, j09 j09Var, tgs tgsVar, AbstractC2440u5 abstractC2440u5) {
        super(context, j09Var);
        this.f221881Y = tgsVar;
        tgsVar.f220244b = this;
        this.f221882Z = abstractC2440u5;
        abstractC2440u5.f226861b = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        float fM38876b = m38876b();
        tgs tgsVar = this.f221881Y;
        tgsVar.f220243a.mo44471a();
        tgsVar.mo80775a(canvas, fM38876b);
        tgs tgsVar2 = this.f221881Y;
        Paint paint = this.f59397i;
        tgsVar2.mo80777c(canvas, paint);
        int i = 0;
        while (true) {
            AbstractC2440u5 abstractC2440u5 = this.f221882Z;
            int[] iArr = (int[]) abstractC2440u5.f226863d;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            float[] fArr = (float[]) abstractC2440u5.f226862c;
            int i2 = i * 2;
            this.f221881Y.mo80776b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // p204p.egs
    /* JADX INFO: renamed from: f */
    public final boolean mo38880f(boolean z, boolean z2, boolean z3) {
        boolean zMo38880f = super.mo38880f(z, z2, z3);
        if (!isRunning()) {
            this.f221882Z.mo29747d();
        }
        b15 b15Var = this.f59391c;
        ContentResolver contentResolver = this.f59389a.getContentResolver();
        b15Var.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.f221882Z.mo29745Q();
        }
        return zMo38880f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f221881Y.mo80778d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f221881Y.mo80779e();
    }
}
