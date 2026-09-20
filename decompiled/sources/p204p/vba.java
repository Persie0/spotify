package p204p;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class vba extends gba {

    /* JADX INFO: renamed from: a */
    public final boolean f239446a;

    /* JADX INFO: renamed from: b */
    public final boolean f239447b;

    /* JADX INFO: renamed from: c */
    public final swd1 f239448c;

    public vba(View view, swd1 swd1Var) {
        ColorStateList colorStateListM32539c;
        this.f239448c = swd1Var;
        boolean z = false;
        boolean z2 = (view.getSystemUiVisibility() & 8192) != 0;
        this.f239447b = z2;
        n3d0 n3d0Var = BottomSheetBehavior.m1567z(view).f2036i;
        if (n3d0Var != null) {
            colorStateListM32539c = n3d0Var.f150021a.f139595c;
        } else {
            WeakHashMap weakHashMap = mec1.f142677a;
            colorStateListM32539c = cec1.m32539c(view);
        }
        if (colorStateListM32539c != null) {
            int defaultColor = colorStateListM32539c.getDefaultColor();
            if (defaultColor != 0 && m9f.m61218f(defaultColor) > 0.5d) {
                z = true;
            }
            this.f239446a = z;
            return;
        }
        if (!(view.getBackground() instanceof ColorDrawable)) {
            this.f239446a = z2;
            return;
        }
        int color = ((ColorDrawable) view.getBackground()).getColor();
        if (color != 0 && m9f.m61218f(color) > 0.5d) {
            z = true;
        }
        this.f239446a = z;
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: a */
    public final void mo33380a(View view, float f) {
        m85125c(view);
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: b */
    public final void mo33381b(View view, int i) {
        m85125c(view);
    }

    /* JADX INFO: renamed from: c */
    public final void m85125c(View view) {
        int top = view.getTop();
        swd1 swd1Var = this.f239448c;
        if (top < swd1Var.m79540d()) {
            int i = wba.f249715N0;
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.f239446a ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            view.setPadding(view.getPaddingLeft(), swd1Var.m79540d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            int i2 = wba.f249715N0;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.f239447b ? systemUiVisibility2 | 8192 : systemUiVisibility2 & (-8193));
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
