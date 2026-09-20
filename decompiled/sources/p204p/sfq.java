package p204p;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class sfq extends y5q0 {

    /* JADX INFO: renamed from: a */
    public final nka1 f208625a;

    public sfq(nka1 nka1Var, String str) {
        super(str);
        this.f208625a = nka1Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        super.onClick(view);
        this.f208625a.mo40487b(getURL());
        view.invalidate();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
