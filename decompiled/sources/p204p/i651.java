package p204p;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes7.dex */
public final class i651 extends gba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f99103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f99104b;

    public i651(BottomSheetBehavior bottomSheetBehavior, kqi0 kqi0Var) {
        this.f99103a = bottomSheetBehavior;
        this.f99104b = kqi0Var;
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: a */
    public final void mo33380a(View view, float f) {
        boolean z;
        if (this.f99103a != null) {
            kqi0 kqi0Var = this.f99104b;
            int height = view.getHeight();
            BottomSheetBehavior bottomSheetBehavior = this.f99103a;
            kqi0Var.setValue(new j651(height, bottomSheetBehavior.f2032e ? -1 : bottomSheetBehavior.f2031d, f));
            synchronized (ua31.f228351c) {
                dqi0 dqi0Var = ua31.f228358j.f104790h;
                z = false;
                if (dqi0Var != null && dqi0Var.m36649h()) {
                    z = true;
                }
            }
            if (z) {
                ua31.m82665a();
            }
        }
    }

    @Override // p204p.gba
    /* JADX INFO: renamed from: b */
    public final void mo33381b(View view, int i) {
        boolean z;
        if (i != 4 || this.f99103a == null) {
            return;
        }
        kqi0 kqi0Var = this.f99104b;
        int height = view.getHeight();
        BottomSheetBehavior bottomSheetBehavior = this.f99103a;
        kqi0Var.setValue(new j651(height, bottomSheetBehavior.f2032e ? -1 : bottomSheetBehavior.f2031d, 0.0f));
        synchronized (ua31.f228351c) {
            dqi0 dqi0Var = ua31.f228358j.f104790h;
            z = false;
            if (dqi0Var != null && dqi0Var.m36649h()) {
                z = true;
            }
        }
        if (z) {
            ua31.m82665a();
        }
    }
}
