package p204p;

import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;

/* JADX INFO: loaded from: classes7.dex */
public final class ai10 {

    /* JADX INFO: renamed from: a */
    public final yh10 f15848a;

    /* JADX INFO: renamed from: b */
    public zh10 f15849b;

    /* JADX INFO: renamed from: c */
    public GlueToolbar f15850c;

    /* JADX INFO: renamed from: d */
    public final uh10 f15851d;

    public ai10(yh10 yh10Var, uh10 uh10Var) {
        this.f15848a = yh10Var;
        this.f15851d = uh10Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m26048a(float f, ji10 ji10Var) {
        xh10 xh10Var;
        dj0 dj0Var;
        if (ji10Var == null || (xh10Var = (xh10) ji10Var.getView().getLayoutParams()) == null || (dj0Var = xh10Var.f261417c) == null) {
            return;
        }
        dj0Var.getClass();
        float fMax = Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f;
        if (Math.abs(dj0Var.f49515a - fMax) < 0.01f) {
            return;
        }
        dj0Var.f49515a = fMax;
        ((GlueToolbar) dj0Var.f49516b).setTitleAlpha(fMax);
    }
}
