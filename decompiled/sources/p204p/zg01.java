package p204p;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class zg01 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f282454a;

    /* JADX INFO: renamed from: b */
    public final float f282455b;

    /* JADX INFO: renamed from: c */
    public final float f282456c;

    /* JADX INFO: renamed from: d */
    public final float f282457d;

    public zg01(float f, float f2, float f3, int i) {
        this.f282454a = i;
        this.f282455b = f;
        this.f282456c = f2;
        this.f282457d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f282457d, this.f282455b, this.f282456c, this.f282454a);
    }
}
