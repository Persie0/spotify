package p204p;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class h571 extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f87765a;

    /* JADX INFO: renamed from: b */
    public final boolean f87766b;

    public h571(boolean z, boolean z2) {
        this.f87765a = z;
        this.f87766b = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f87765a);
        textPaint.setStrikeThruText(this.f87766b);
    }
}
