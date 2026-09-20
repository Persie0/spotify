package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class b0c extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f21822a;

    /* JADX INFO: renamed from: b */
    public final a0c f21823b;

    /* JADX INFO: renamed from: c */
    public final vc41 f21824c;

    /* JADX INFO: renamed from: d */
    public final float f21825d;

    /* JADX INFO: renamed from: e */
    public final Paint f21826e;

    /* JADX INFO: renamed from: f */
    public final float f21827f;

    /* JADX INFO: renamed from: g */
    public final float f21828g;

    /* JADX INFO: renamed from: h */
    public final float f21829h;

    /* JADX INFO: renamed from: i */
    public final tc41 f21830i;

    /* JADX INFO: renamed from: j */
    public final int f21831j;

    /* JADX INFO: renamed from: k */
    public final int f21832k;

    public b0c(Context context, int i, a0c a0cVar, vc41 vc41Var) {
        int i2 = a0cVar.f11047a;
        this.f21822a = i;
        this.f21823b = a0cVar;
        this.f21824c = vc41Var;
        this.f21825d = vc41Var == vc41.STAR_ALT ? 0.95f : 1.0f;
        this.f21826e = new Paint(1);
        this.f21827f = wqg1.m88767v(i2, context.getResources());
        float fM88767v = wqg1.m88767v(i2 + 1, context.getResources());
        this.f21828g = fM88767v;
        int iM88767v = wqg1.m88767v(a0cVar.f11048b, context.getResources());
        float f = iM88767v % 2 != 0 ? iM88767v + 1.0f : iM88767v;
        this.f21829h = f;
        tc41 tc41Var = new tc41(context, vc41Var, f);
        tc41Var.m80417b(-1);
        tc41Var.setBounds(0, 0, tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
        this.f21830i = tc41Var;
        int i3 = (int) (fM88767v * 2);
        this.f21831j = i3;
        this.f21832k = wqg1.m88767v(7.0f, context.getResources());
        setBounds(0, 0, i3, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f21826e;
        paint.setColor(855638016);
        float f = this.f21828g;
        canvas.drawCircle(f, f, f, paint);
        paint.setColor(this.f21822a);
        canvas.drawCircle(f, f, this.f21827f, paint);
        float f2 = (this.f21831j - this.f21829h) / 2;
        float f3 = this.f21825d * f2;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            this.f21830i.f219021n.mo57069c(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0c)) {
            return false;
        }
        b0c b0cVar = (b0c) obj;
        return this.f21822a == b0cVar.f21822a && this.f21824c == b0cVar.f21824c && this.f21823b == b0cVar.f21823b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21831j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21831j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.f21823b.hashCode() + ((this.f21824c.hashCode() + (this.f21822a * 31)) * 31);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
