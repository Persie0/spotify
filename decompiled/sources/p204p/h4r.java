package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class h4r extends egs {

    /* JADX INFO: renamed from: O0 */
    public static final g4r f87628O0 = new g4r();

    /* JADX INFO: renamed from: L0 */
    public final mg41 f87629L0;

    /* JADX INFO: renamed from: M0 */
    public float f87630M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f87631N0;

    /* JADX INFO: renamed from: Y */
    public final vk80 f87632Y;

    /* JADX INFO: renamed from: Z */
    public final ng41 f87633Z;

    public h4r(Context context, gl80 gl80Var, vk80 vk80Var) {
        super(context, gl80Var);
        this.f87631N0 = false;
        this.f87632Y = vk80Var;
        vk80Var.f220244b = this;
        ng41 ng41Var = new ng41();
        this.f87633Z = ng41Var;
        ng41Var.m64377a();
        ng41Var.m64378b(50.0f);
        mg41 mg41Var = new mg41(this);
        this.f87629L0 = mg41Var;
        mg41Var.f143328m = ng41Var;
        if (this.f59396h != 1.0f) {
            this.f59396h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            float fM38876b = m38876b();
            vk80 vk80Var = this.f87632Y;
            vk80Var.f220243a.mo44471a();
            vk80Var.mo80775a(canvas, fM38876b);
            vk80 vk80Var2 = this.f87632Y;
            Paint paint = this.f59397i;
            vk80Var2.mo80777c(canvas, paint);
            int iM86385l = vtg1.m86385l(this.f59390b.f107387c[0], this.f59398t);
            this.f87632Y.mo80776b(canvas, paint, 0.0f, this.f87630M0, iM86385l);
            canvas.restore();
        }
    }

    @Override // p204p.egs
    /* JADX INFO: renamed from: f */
    public final boolean mo38880f(boolean z, boolean z2, boolean z3) {
        boolean zMo38880f = super.mo38880f(z, z2, z3);
        b15 b15Var = this.f59391c;
        ContentResolver contentResolver = this.f59389a.getContentResolver();
        b15Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f87631N0 = true;
            return zMo38880f;
        }
        this.f87631N0 = false;
        this.f87633Z.m64378b(50.0f / f);
        return zMo38880f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f87632Y.mo80778d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f87632Y.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f87629L0.m61691d();
        this.f87630M0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f87631N0;
        mg41 mg41Var = this.f87629L0;
        if (z) {
            mg41Var.m61691d();
            this.f87630M0 = i / 10000.0f;
            invalidateSelf();
        } else {
            mg41Var.f143317b = this.f87630M0 * 10000.0f;
            mg41Var.f143318c = true;
            mg41Var.m61688a(i);
        }
        return true;
    }
}
